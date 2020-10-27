package LinkedList;
import java.io.*;
import java.net.*;
import java.util.*;
import java.net.InetAddress;
public class FindIpAddr {
    public static void main(String[] args) throws Exception {
        InetAddress localhost=InetAddress.getLocalHost();
        System.out.println("System Ip Address: "+(localhost.getHostAddress()).trim());
        String systemipaddress="";
        try {
            URL url_name=new URL("http://bot.whatismyipaddress.com");
            BufferedReader sc=new BufferedReader(new InputStreamReader(url_name.openStream()));
            systemipaddress= sc.readLine().trim();
        }
        catch (Exception e){
            systemipaddress="cannot execute properly";
        }
        System.out.println("Public Ip Addresss:"+systemipaddress+"\n");
    }
}
