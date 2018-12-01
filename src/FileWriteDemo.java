import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriteDemo {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\Poornesh\\Desktop\\file.txt");
		FileInputStream fis=null;
		FileOutputStream fout=null;
		try {
			fis=new FileInputStream(file);
			fout=new FileOutputStream("C:\\Users\\Poornesh\\Desktop\\edureka.txt");
			int content;
			while((content=fis.read())!=-1){
				
				fout.write(content);
			}System.out.println("file is coped successfully");
			}
		catch (IOException e) {
			e.printStackTrace();
		}
		fis.close();
		fout.close();
	}

}
