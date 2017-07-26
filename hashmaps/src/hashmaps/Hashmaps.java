package hashmaps;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Hashmaps {

	public static void main(String[] args) {
		HashMap<String, Integer> anagrams = new HashMap<String, Integer>();
		try {

			HashMap<String, String> map = new HashMap<>();
			BufferedReader reader = new BufferedReader(new FileReader("wordList.txt"));
			String line = reader.readLine();
			while (line != null) {

				map.put(line, Sort(line, anagrams));

				line = reader.readLine();

			}

			System.out.println(anagrams);
			System.out.println(Collections.max(anagrams.values()));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static String Sort(String line, HashMap<String, Integer> anagrams) {

		char[] chars = line.toCharArray();
		Arrays.sort(chars);
		String sorted = new String(chars);
		count(sorted, anagrams);
		return sorted;
	}

	private static HashMap<String, Integer> count(String sorted, HashMap<String, Integer> anagrams) {
		if (anagrams.containsKey(sorted)) {
			anagrams.put(sorted, anagrams.get(sorted)+1);
		} else {
			anagrams.put(sorted, 1);
		}

		return anagrams;
		


}
}
