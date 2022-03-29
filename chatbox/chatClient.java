import java.io.PrintStream;
import java.net.*;
import java.util.Scanner;

public class chatClient
{
    public static void main(String[] args) throws Exception
    {
        String name;
        Socket s = new Socket("127.0.0.1",2222);

        Scanner scanner = new Scanner(s.getInputStream());

        System.out.println(scanner.nextLine());
        name = scanner.nextLine();
        PrintStream reply = new PrintStream(s.getOutputStream());
        reply.println(name);


    }
}