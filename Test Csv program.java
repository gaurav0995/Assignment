import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.FileNotFoundException;

public class test {

	public static void main(String[] args) throws Exception
	{
		FileInputStream filename=new FileInputStream("C:\\Users\\HP\\Desktop\\CSV1.csv");
		BufferedReader br=new BufferedReader(new InputStreamReader(filename));
		
		
		
		String v;
		while((v=br.readLine())!=null)
		{
			String a[]=v.split(",");
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
		
			
		}
		

	}

}
