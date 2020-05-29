package com.ict.edu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Ex04 {
		public static void main(String[] args) {
			
			InputStreamReader isr = null;
			BufferedReader br = null;
			
			
			
			try {
				
					URL url = 
							new URL("https://8oi9s0nnth.apigw.ntruss.com/corona19-masks/v1/storesByAddr/json");
					
					URLConnection conn = url.openConnection();
					br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
					
					String msg = null;
					
					while((msg = br.readLine()) != null) {
						System.out.println(msg);
						
					}
				
				
				
				
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				try {
						br.close();
						isr.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			
			
			
			
			
			
			
			
			
			
			
		}
}
