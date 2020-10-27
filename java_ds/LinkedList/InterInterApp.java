package LinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InterInterApp {
    public static void main(String[] args) throws IOException {
        InterIteratorLinkList theList=new InterIteratorLinkList();
        ListInterator ite1=theList.getIterator();
        double value;
        ite1.insertAfter(20);
        ite1.insertAfter(40);
        ite1.insertAfter(80);
        ite1.insertAfter(60);
        while (true){
            System.out.print("enter first letter of show,reset,");
            System.out.print("next,get,before,after,delete:");
            System.out.flush();
            int choice=getChar();
            switch (choice){
                case 's':
                    if (!theList.isEmpty())
                        theList.displayList();
                    else
                        System.out.println("List is empty");
                    break;
                case 'r':
                    ite1.reset();
                    break;
                case 'n':
                    if (!theList.isEmpty()&&ite1.atEnd())
                        ite1.nextLink();
                    else
                        System.out.print("cant go to next link");
                    break;
                case 'g':
                    if (!theList.isEmpty()){
                        value=ite1.getCurrent().dData;
                        System.out.println("Returned "+value);
                    }
                    else
                        System.out.println("List is Empty");
                    break;
                case 'b':
                    System.out.println("enter value to insert:");
                    System.out.flush();
                    value=getInt();
                    ite1.insertBefore(value);
                    break;
                case 'a':
                    System.out.println("enter value to insert:");
                    System.out.flush();
                    value=getInt();
                    ite1.insertAfter(value);
                    break;
                case 'd':
                    if (!theList.isEmpty()){
                        value=ite1.deleteCurrent();
                        System.out.println("Delete "+value);
                    }
                    else
                        System.out.println("can`t delete");
                    break;
                default:
                    System.out.println("invalid entry");
            }
        }
    }
    public static String getString()throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String s= br.readLine();
        return s;
    }
    public static int getChar() throws IOException{
        String s=getString();
        return s.charAt(0);
    }
    public static int getInt() throws IOException{
        String s=getString();
        return Integer.parseInt(s);
    }
}
