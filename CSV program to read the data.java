
import java.io.FileReader;
import java.io.IOException;
import com.opencsv.CSVReader;
public class Assignment
{

	public static void main(String[] args) 
	{
		CSVReader reader=null;
       
		try
		{
			reader=new CSVReader(new FileReader("C:\\Users\\HP\\Desktop\\CSV1.csv"));
			String[] nextLine;
			while((nextLine=reader.readNext()) !=null)
			{
				for(String token : nextLine)
				{
					System.out.println(token);
				}
				System.out.println("\n");
			}
				
		}
		  
		    catch (Exception e)
		{
				e.printStackTrace();
			}
		
	}

}
