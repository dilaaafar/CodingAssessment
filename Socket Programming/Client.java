import java.net.*;
import java.io.*;

public class Client{
	public static void main (String []a) throws IOException
	{
	Socket s = new Socket ("localhost",31337);
	//172.16.22.1

	PrintWriter pr = new PrintWriter(s.getOutputStream());
	pr.println("It's working");
	pr.flush();

	InputStreamReader in = new InputStreamReader(s.getInputStream());
	BufferedReader bf = new BufferedReader(in);

	String str = bf.readLine();
	System.out.println("Server : "+str);
	}
}