package com.cts.collections;

import java.io.FileOutputStream;

public class TrywithResorces {
public static void main(String[] args) {
	try(FileOutputStream fileOutputStream =new FileOutputStream("abc.txt")){      
		String msg = "Welcome";      
		byte byteArray[] = msg.getBytes();       
		fileOutputStream.write(byteArray);       
		}catch(Exception exception){  
		       System.out.println(exception);  
		}      
}


}
