import java.util.ArrayList;

public class IndexEntry {

	private String word;
	private ArrayList<Integer> numsList;
	
	IndexEntry(String given) {
		word = given.toUpperCase();
		numsList = new ArrayList<Integer>();
	}

	public static void add(int num) {
		if(numsList.contains(num) == false) {
			numsList.add(num);
		}
	}
	
	public String getWord(){
		return word;
	}
	
	public String toString() {
		String line = "";
		for (int i = 0; i < numsList.size(); i++) {
		    if(i + 1 < numsList.size()) {
				line += numsList.get(i) + ", ";
		    }else {
		    	line += numsList.get(i);
		    }
		}
		return word + line;
	}
	
	
}
