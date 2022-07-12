import java.net.*;
import java.io.*;
import java.util.*;

public class Server{
	public static void main (String []a) throws IOException
	{
	ServerSocket ss = new ServerSocket (31337);
	Socket s = ss.accept();

	Scanner scan = new Scanner(System.in);

	System.out.println("client connected");

	System.out.print("Please enter number from 1-3 : ");
	int num = scan.nextInt();
	String result;

	if(num==1)
	{ result = "satu";}

	else
	if(num==2)
	{result = "dua";}

	else
	{result="tiga";}





	InputStreamReader in = new InputStreamReader(s.getInputStream());
	BufferedReader bf = new BufferedReader(in);

	String str = bf.readLine();
	System.out.println("Client : "+str);

	PrintWriter pr = new PrintWriter(s.getOutputStream());
	pr.println(result);
	pr.flush();
	}
}