import java.io.*;

public class cobaException {
	public static void main(String[] args) {
		BufferedReader reader = null;
	
		try {
			reader = new BufferedReader(new FileReader("data.txt"));
			String baris = null;
			while ( (baris = reader.readLine()) !=null) {
				System.out.println(baris);
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
