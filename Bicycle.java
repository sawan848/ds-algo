public class Bicycle {

    private String ownerName;//data member

    public Bicycle() {//constructor:initialzes the data member
        ownerName = "Unknown";
    }

    //return the name of this bicycle`s owners
    public void setOwnerName(String name) {


        ownerName = name;
    }


    public String getOwnerName() {
        while (true) {
            if (ownerName.length() == 0) {
                break;
            }
            System.out.println("Invalid entry");
        }
        return ownerName;
    }
}