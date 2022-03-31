import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.ArrayList;
public class ChatWorkerThread extends Thread
{
    private Socket theClientSocket;
    private PrintStream clientOutput;
    private Scanner clientInput;
    ArrayList<String> Words = new ArrayList<String>();
    public ChatWorkerThread(Socket theClientSocket)
    {
        try 
        {
            System.out.println("Connection Established...");
            this.theClientSocket = theClientSocket;
            this.clientOutput = new PrintStream(this.theClientSocket.getOutputStream());    
            this.clientInput = new Scanner(this.theClientSocket.getInputStream());
        } 
        catch (Exception e) 
        {
            System.err.println("Bad things happened in thread!!!!!");
            e.printStackTrace();
        }
        
    }

    public void run()
    {
        //this is what the thread does
        this.clientOutput.println("What is your name?");
        String name = clientInput.nextLine();
        Words.add(name);
        System.out.println("read: " + name);
        System.out.println("read: " + Words);
        //sendToOther(name);

    }
}
