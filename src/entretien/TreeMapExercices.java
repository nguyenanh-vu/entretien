package entretien;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExercices {
	
	void exo1() {
		
		Map<Integer, String> m = new TreeMap<>();
		
		for (int i = 0; i < 100; i++) {
			m.put(i, "aa");
		}
	}

}
