/*
 * @author:Saawan
 * @created:[10/19/2020],Monday
 * Time:9:05 PM
 */
public class Student {
    public String  name;
    public int age;


    public String getName() {
        return name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
