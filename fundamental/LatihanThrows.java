import java.io.BufferedReader;
import java.io.FileReader;


public class LatihanThrows {
	public static void main(String[] args) {
      try {
		readFile();
	  } catch (Exception e) {
			e.printStackTrace();
	  }
	}
	
	public static void readFile() throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
		String baris;
		while ((baris= reader.readLine()) != null ) {
			System.out.println(baris);
		}
		
	}

}
