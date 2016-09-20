import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.LinkedList;
import java.lang.Math;
import java.util.AbstractCollection;

class MovieRecommender{

	private List<Movie> movieList;
	private List<Customer> custList;

	public MovieRecommender(OpenData data){
		movieList = data.getMovies();
		custList = data.getCustomers();
	}

	public void recommend(){
		for (Customer customer : custList){
			int movieId = -1;
			double score = 0.0;
			for (Movie movie : movieList){
				if ( ! customer.hasScored(movie.getId())){
					double result = score(customer, movie.getId());
					if (result >= score){
						movieId = movie.getId();
					}
				}
			}

			System.out.println("To customer " + customer.getId() + ", I recommend id: " + movieId + " title: " + movieList.get(movieId).getName());
		}
	}


	public double score(Customer customerA, int movieId){
		double score = 0.0;
		double sumWeights = 0.0;
		double sumWRating = 0.0;

		for (Customer customerB : custList){
			if (customerB.hasScored(movieId)){
				double weightAverage = weight(customerA, customerB);
				int rating = customerB.getScore(movieId);
				double wRating = weightAverage * rating;

				sumWeights += weightAverage;
				sumWRating += wRating;
			}
		}

		if (sumWRating == 0){
			score = 0;
		}
		else{
			score = sumWRating / sumWeights;
		}

		return score;


	}

	public double weight(Customer customerA, Customer customerB){

		double overallWeights = 0.0;
		double score = 0.0;

		Set<Integer> moviesCommon = customerA.getAllScored();
		moviesCommon.addAll(customerB.getAllScored());

		for (int movieId : moviesCommon){
			score += Math.pow(customerA.getScore(movieId) - customerB.getScore(movieId), 2);
		}

		overallWeights = overallWeights + 1.0 / ( 1.0 + Math.sqrt(score));
		return overallWeights;
	}
}