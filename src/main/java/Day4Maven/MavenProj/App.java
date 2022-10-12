package Day4Maven.MavenProj;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(21, "Ram");
		tm.put(13, "Sita");
		tm.put(1, "Tina");
		NavigableMap<Integer, String> nmap = tm.descendingMap();

		System.out.println(nmap);
	}
}
