import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Set;

class Customer {
	private int id;
	private String name;
	private SortedMap<Integer, Integer> mapOfScores = new TreeMap<Integer, Integer>();

	public Customer(int id, String name){
		this.id = id;
		this.name = name;
	}

	public int getId(){
		return id;
	}

	public String getName(){
		return name;
	}

	public Set getAllScored(){
		return mapOfScores.keySet();
	}

	public boolean hasScored(int movieId){
		return mapOfScores.containsKey(movieId);
	}

	public void addScore(Integer movieId, Integer score){
		mapOfScores.put(movieId, score);
	}

	public boolean contains(Integer key){
		return mapOfScores.containsKey(key);
	}

	public int getScore(Integer idMovie){
		return mapOfScores.get(idMovie);
	}

	public String toString(){
		return "" + getId() + " " + getName();
	}
}