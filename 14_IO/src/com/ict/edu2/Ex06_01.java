package com.ict.edu2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex06_01 {

	public static void main(String[] args) {

		String pathname1 = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "video.mp4";

		File file1 = new File(pathname1);

		// 쓰는 위치
		String pathname2 = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "비디오.mp4";
		File file2 = new File(pathname2);

		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {

			fis = new FileInputStream(file1);
			fos = new FileOutputStream(file2);

			int k = 0;
			while ((k = fis.read()) != -1) {
				fos.write(k);
			}
			fos.flush();

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				try {
					System.out.println("수고하셨습니다.");
					if (fos != null)
						fos.close();
					if (fis != null)
						fis.close();
				} catch (Exception e2) {
				}
			} finally {

			}
		}
	}
}
