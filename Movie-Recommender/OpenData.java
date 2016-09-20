import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.Integer;
import java.util.List;
import java.util.ArrayList;
import java.util.regex.Pattern;

class OpenData{

	private List<Movie> movieList = new ArrayList<Movie>();
	private List<Customer> custList = new ArrayList<Customer>();

	public OpenData(String movies, String customers, String ratings ){
		try{
			BufferedReader brMovies = new BufferedReader(new FileReader(new File(movies)));
			BufferedReader brCustomers = new BufferedReader(new FileReader(new File(customers)));
			BufferedReader brRatings = new BufferedReader(new FileReader(new File(ratings)));

			setupLists(brCustomers, true);
			setupLists(brMovies, false);

			String line = brRatings.readLine();
			while (line != null) {
				String[] lineLst = line.split(Pattern.quote("|"));
				Customer copy = custList.get(Integer.parseInt(lineLst[0]));
				copy.addScore(Integer.parseInt(lineLst[1]),Integer.parseInt(lineLst[2]));
				line = brRatings.readLine();
			}
		}

		catch (NumberFormatException e) {
			System.out.print("1 " + e);
			System.exit(1);
		}

		catch (IOException e) {
			System.out.print("2 " + e);
			System.exit(1);
		}
	}

	public void setupLists(BufferedReader br, boolean bool){
		try{
			String line = br.readLine();
			while (line != null){
				String[] lineLst = line.split(Pattern.quote("|"));

				if (bool){
					int i = Integer.parseInt(lineLst[0]);
					Customer cust = new Customer(i, lineLst[1]);
					custList.add(cust);
				}
				else{
					int i = Integer.parseInt(lineLst[0]);
					Movie movie = new Movie(i, lineLst[1]);
					movieList.add(movie);
				}
			line = br.readLine();
			}
		}

		catch (IOException e){
			System.out.print("3 " + e);
			System.exit(1);
		}
	}

	public List getMovies(){
		return movieList;
	}

	public List getCustomers(){
		return custList;
	}
}