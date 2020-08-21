
import Arrays.WordList;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Ch9WordConCordanceMain {
    private static enum Response {YES,NO}
    private FileManager fileManager;
    private WordList wordList;
    private Ch9WordConCordance builder;
    private Scanner scanner;

    public static void main(String[] args) {
        Ch9WordConCordanceMain main=new Ch9WordConCordanceMain();
        main.start();
    }

    public Ch9WordConCordanceMain() {
        fileManager =new FileManager();
        builder = new Ch9WordConCordance();
        scanner = new Scanner(System.in);
    }
    private String inputFile(){
        String doc="";
        try{
            doc=fileManager.openFile();
        }catch (FileNotFoundException e){
            System.out.println("File not found.");
        }catch (IOException e){
            System.out.println("Error in opening file:");
        }
        System.out.println("Input Documnet:\n"+doc);
        return doc;
    }
    private void saveFile(String list){
        try {
            fileManager.saveFile(list);
        }catch (IOException e){
            System.out.println("Error in saving file:");
        }
    }
    private void start(){
        Response userReply;
        while (true){
            userReply=prompt("Run the program?");
            String document = inputFile();
            //wordList=build(document);
            //saveFile(wordList);

            if (userReply==Response.NO){
                break;
            }
        }
        System.out.println("Thank you for using the program.Good Bye");
    }
    private Response prompt(String question){
        String input;
        Response response=Response.NO;
        System.out.println(question+"(Yes-y;No-n):");
        input=scanner.next();

        if (input.equals("Y")||input.equals("y")){
            response=Response.YES;
        }
        return response;
    }

}
