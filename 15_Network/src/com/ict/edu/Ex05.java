package com.ict.edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

// �Ľ� : � ������(����, html ��)���� ���� ���ϴ� �����͸� Ư�� �����̳� ������ ������ �����ϴ� ���� ���Ѵ�

//  XML  : eXtensible Markup Language => Ȯ��ɼ� �ִ� ǥ�� ���
//			����ڰ� �±׸� ���� ����� �� �ִ�.
// 			<�����±� �Ӽ� = '��' �Ӽ� = '��'> �ؽ�Ʈ <��/�±�>
// 	
// xml �Ľ� : xml�� ������ �����͸� ���ϴ� �����͸� ����, �����ϴ� ���
// - DON���(Document Object Modeling)��� : ���������� �±׸� �ؼ��ϰ�, ǥ���ϴ� ���
// 
public class Ex05 {
	public static void main(String[] args) {
		
		
		BufferedReader br = null;
		
		// ���Ϸ� ����
		String pathname
		="C:"+ File.separator + "Study" + File.separator+"util" + File.separator+"���ó���.txt";  
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
				URL url = 
						new URL("http://www.kma.go.kr/XML/weather/sfc_web_map.xml");
				
				URLConnection conn = url.openConnection();
				br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				
				String msg = null;
				StringBuffer sb = new StringBuffer();
				
				while((msg = br.readLine()) != null) {
					sb.append(msg+"\n");
					
				}
			
			InputSource is = new InputSource(new StringReader(sb.toString()));	
				
			// sb�� �����ϴ� ������ �о�� �ȴ�.
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance(); 
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(is);
			
			
			// ���������� ���� ����
				StringBuffer sb2 = new StringBuffer();
						
		
			
			// ���ϴ� �±�(local)�� ã�� :
			NodeList locals = document.getElementsByTagName("local");
			for (int i = 0; i < locals.getLength(); i++) {
				
			
			
			
				// �±�(element) �ؽ�Ʈ ���ϱ�
				String txt = locals.item(i).getFirstChild().getNodeValue();
				System.out.print(txt + "\t");
				
				// �±�(element) �Ӽ�(attribute)
				String att1 = ((Element)(locals.item(i))).getAttribute("desc");
				String att2 = ((Element)(locals.item(i))).getAttribute("ta");
				System.out.print(att1 +"\t" + att2);
				
				// sb2�� ���� �����ϱ�
				sb2.append(txt + "\t");
				sb2.append(att1 + "\t");
				sb2.append(att2+ "\n");
				
				
			}
				
				// ���Ϸ� �����ϱ�
				fw = new FileWriter(file);
				bw = new BufferedWriter(fw);
				
				bw.write(sb2.toString());
				bw.flush();
				
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				
				bw.close();
				fw.close();
				br.close();
					
					
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	
	}
}
