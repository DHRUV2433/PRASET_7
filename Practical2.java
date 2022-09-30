//This program is run by Dhruv Vekariya(21CE152)
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Practical2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("D:\\Dhruv\\Language\\Java\\src\\Part7\\Words.txt");
		System.out.println("This program is run by Dhruv Vekariya(21CE152)");
		if(!f.exists()) {
			f.createNewFile();
		}
		String[] words;
		BufferedReader reader = new BufferedReader(new FileReader(f));
		StringBuffer buffer = new StringBuffer();
		String s;
		while((s = reader.readLine()) != null)
		{
			buffer.append(s).append("\n");
		}
		words = buffer.toString().split("[0-9]+|\\W+");
		Map<String, Integer> map = new TreeMap<String, Integer>();
		for (String str : words) {
			String key = str;
			if (key.length() > 0) {
				if (!map.containsKey(key)) {
					map.put(key, 1);
				} else {
					int value = map.get(key);
					value++;
					map.put(key, value);
				}
			}
		}
		map.forEach((k,v) -> System.out.println(k+"\t"+v));//lambda expression
		reader.close();
	}
}