import java.io.*;

public class ByteStreamTest{
		public static void main(String[] args) throws IOException {
				ByteArrayOutputStream bOutput = new ByteArrayOutputStream(12);
				while(bOutput.size() != 10){
						//Gets the input from the user
						bOutput.write(System.in.read());
				}
				byte b[] = bOutput.toByteArray();
				System.out.println("Print the contect");
				for(int x = 0; x < b.length; x++){
						//print the characters
						System.out.println((char)b[x] +"  ");
				}
				System.out.println("  ");
				int c;
				ByteArrayInputStream bInput = new ByteArrayInputStream(b);
				System.out.println("Converting characters to Upper case");
				for(int x = 0; x < 1; x++){
						while((c = bInput.read()) != -1){
								System.out.println(Character.toUpperCase((char)c));
						}
						bInput.reset();
				}
		}
}
