import java.util.*;
/*
 * @author:Saawan
 * @created:[10/19/2020],Monday
 * Time:9:05 PM
 */
public class StudentMain {
 private List<Student>student;
    
    public StudentMain(){
        student=new LinkedList<Student>();
    }
    public void add(Student student1){
        student.add(student1);
    }
    public static void main(String[] args) {
        
        Student person;
        person = new Student("rayan ", 5);
        person=new Student("max ",21);

        List<Student>students=new ArrayList<Student>();
        
        var s = person.getAge();
        var k = person.getName();
        System.out.print(k);
        System.out.print(s);
    }

}
