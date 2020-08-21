import java.io.*;

public class  Ch8Resident implements Serializable {
    private String name;
    private String room;
    private String password;

    public Ch8Resident(){
        this("unassigned ","000","XY12$ab");
    }

    public Ch8Resident(String name, String room, String pwd)
      throws IllegalArgumentException{
        setName(name);
        setRoom(room);
        setPassword(pwd);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String pwd) {
        int length=pwd.length();
        if (length<8){
            throw  new IllegalArgumentException();
        }else
        this.password = pwd;
    }
}



