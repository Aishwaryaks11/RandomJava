package FileHandling;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//import java.io.FileInputStream;

public class WriteSingleCharacter {

	public static void main(String[] args) throws Exception {
		String Path="C:\\FileHandling\\f1.txt";
		FileOutputStream fos=new FileOutputStream(Path);
fos.write('A');
System.out.println("Data Entered successfully");
fos.close();
	}

}
