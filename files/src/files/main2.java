package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class main2 {
	public static void main(String[] args) {

		people a = new people("vitally", 21, "Meme-lord");
		people b = new people("david", 22, "dentist");
		people c = new people("bekki", 49, "haid dresser");
		people d = new people("adam", 17, "florist");
		people e = new people("jamie", 37, "oil rig woker");

		ArrayList<people> peeps = new ArrayList<people>();
		peeps.add(a);
		peeps.add(b);
		peeps.add(c);
		peeps.add(d);
		peeps.add(e);

		try {
			write_method(peeps);
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public static void write_method(ArrayList<people> peeps)
			throws UnsupportedEncodingException, FileNotFoundException, IOException {

		PrintStream fileStream = new PrintStream(new File("file.txt"));
		{
			for (people p : peeps) {
				fileStream.println(p.toString());

			}
		}
	}
}
