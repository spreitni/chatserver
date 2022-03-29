import java.io.PrintStream;
import java.net.*;
import java.util.Scanner;

public class chatServer
{
    public static void main(String[] args) throws Exception
    {
        String name;
        ServerSocket s = new ServerSocket(2222);
        System.out.println("Listenning for Connection...");
        Socket client = s.accept(); //blocks
        System.out.println("Connection Established...");
        PrintStream clientOutput = new PrintStream(client.getOutputStream());
        Scanner clientInput = new Scanner(client.getInputStream());
        
        clientOutput.println("What is your name?");
        name = clientInput.nextLine();
        clientOutput.println("Hi " + name +" i hope you have a wonderful day");
        System.out.println("read: " + name);
        
    }
}