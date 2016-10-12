class Movie {
	private String name;
	private int id;

	public Movie(int id, String name){
		this.name = name;
		this.id = id;
	}

	public String getName(){
		return name;
	}

	public int getId(){
		return id;
	}

	public String toString(){
		return "id: " + getId() + " title: " + getName();
	}
}