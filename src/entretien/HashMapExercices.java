package entretien;

import java.util.HashMap;
import java.util.Map;

public class HashMapExercices {
	
	void exo1() {
		
		Map<Integer, String> m = new HashMap<>();
		
		m.put(1, "aaa");
		m.put(2, "bbb");
		m.put(30, "ccc");
		m.put(4, "ddd");
	}
	
	void exo2() {
		
		Map<String, String> m = new HashMap<>();
		
		m.put("aa", "aaa");
		m.put("bb", "bbb");
		m.put("cc", "ccc");
		m.put("bB", "ddd");
		
	}
}
