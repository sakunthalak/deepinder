import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@SuppressWarnings("unused")
public class FileReadDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException 
	{
		
		File file=new File("C:\\Users\\Poornesh\\Desktop\\fileone.txt");
		FileInputStream fis=null;
		fis=new FileInputStream(file);
		int input;
		while((input=fis.read( ))!=-1) {
			System.out.println((char)input);
			
		}
			
		
		}
			
		
		
			
}
