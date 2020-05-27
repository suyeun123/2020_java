package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex01 {

	public static void main(String[] args) {
		
		// 읽는 위치
		String pathname1
		= "C:"+ File.separator + "Study" + File.separator+"util" + File.separator+"iO01.java.jpg";  
		File file1 = new File(pathname1);
		
		// 쓰는위치
		String pathname2
		= "C:" + File.separator + "Study" + File.separator+"java.jpg";
		File file2 = new File(pathname2);
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			
			fis = new FileInputStream(file1);
			fos = new FileOutputStream(file2);
			
			int k = 0;
			while ((k=fis.read()) != -1) {
				fos.write(k);
			}
			
			
			
		}
		
		
		
		
	}
	
	
	
}
