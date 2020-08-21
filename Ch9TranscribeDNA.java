/*
* transcribe dna into rna*/
import java.util.Scanner;

public class Ch9TranscribeDNA {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String dna;
        StringBuffer rna;
        int size;
        char base;

        while (true){
            System.out.println("Next DNA sequence: ");
            dna=scanner.next();

            if (dna.equalsIgnoreCase("STOP")){
                break;
            }
            size=dna.length();
            rna=new StringBuffer();
            for (int i = 0; i < size; i++) {
                base=dna.charAt(i);
                if (base=='T'){
                    base='U';
                }
                rna.append(base);
            }
            System.out.println("RNA: "+rna.toString());

            rna.reverse();//reverse of dna
            System.out.println(""+rna.toString());
        }
    }
}
