class MovieRecommenderTester{
	public static void main(String[] args) {
		OpenData data = new OpenData("movies.txt", "customers.txt", "ratings.txt");
		MovieRecommender recommender = new MovieRecommender(data);
		recommender.recommend();
	}
}