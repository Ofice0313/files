package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramWriter {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good evening"};
		
		String path = "C:\\temp2\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			
			for(String line: lines) {
				bw.write(line);
				bw.newLine();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
