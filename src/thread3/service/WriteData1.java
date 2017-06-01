package thread3.service;

import java.io.IOException;
import java.io.PipedWriter;

public class WriteData1 {
	public void writeMethod(PipedWriter out){
		try {
			System.out.println("write.......");
			for (int i = 0; i < 300; i++) {
				String outData = "" + (i+1);
				out.write(outData);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
