import java.io.*;

public class BufferReader 
{

	public static void main(String[] args) 
	{
		try 
		{
			// Make file and stream
			FileInputStream fr = new FileInputStream("c:\\example\\hangle.txt");    //Stirng file path using \\!
			InputStreamReader is= new InputStreamReader(fr,"UTF8");    //or MS949, 
			//Why using this code? because This file is not written in English.  

			//fileReader constructor receive bufferedReader
			BufferedReader br =new BufferedReader(is);

			//Saved file data was read a line.
			String readString=br.readLine(); 

			//Until all read saved data.
			while (readString!=null) 
			{
				System.out.println("Readstirng" +readString);
				//Next Line Read
				readString=br.readLine();
			}
			//return stream
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
