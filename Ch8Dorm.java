import java.io.*;
import java.util.*;

public class Ch8Dorm {

    private Map<String,Ch8Resident> residentTable;
    public  Ch8Dorm(){
        residentTable=new HashMap<String, Ch8Resident>();
    }
    public Ch8Dorm(String filename) throws FileNotFoundException,IOException {

        openFile(filename);
    }
    public String getResidentList() {
        StringBuffer result=new StringBuffer("");
        String tab="\t";
        String lineSeprator=System.getProperty("line.seprator");

        for (Ch8Resident res:residentTable.values()){
            result.append(res.getName()+tab+
                    res.getRoom()+tab+
                    res.getPassword()+tab+
                    lineSeprator
                    );
        }
        return result.toString();

    }

    public void openFile(String filename)
            throws FileNotFoundException,IOException {
        File inFile=new File(filename);
        FileInputStream inFileStream=new FileInputStream(inFile);
        ObjectInputStream inObjectStream=new ObjectInputStream(inFileStream);

        try {
            residentTable=(Map<String, Ch8Resident>)(inObjectStream.readObject());
        }catch (ClassNotFoundException e){
            throw new IOException("Unrecognised data in the designated file:");
        }
        inObjectStream.close();
    }

    public void add(Ch8Resident res) throws  IllegalArgumentException{
        if (residentTable.containsKey(res.getName())){
            throw new IllegalArgumentException(
                    "Resident with the same name already exists"
            );
        }else {
            residentTable.put(res.getName(),res);
        }
    }

    public void delete(String name){
        residentTable.remove(name);
    }

    public void saveFile(String filename) throws IOException {
        File outFile=new File(filename);
        FileOutputStream outFileStream=new FileOutputStream(outFile);
        ObjectOutputStream outObjectStream=new ObjectOutputStream(outFileStream);
        outObjectStream.writeObject(residentTable);
        outObjectStream.close();
    }

    public Ch8Resident getResident(String name) {
        return residentTable.get(name);
    }
}
