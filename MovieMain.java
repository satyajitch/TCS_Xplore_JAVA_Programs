import java.util.Scanner;

public class MovieMain {

	public static void main(String[] args) {
		Movie m[] = new Movie[4];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++) {
			int id = sc.nextInt();
			sc.nextLine();
			String director = sc.nextLine();
			int r = sc.nextInt();
			int b = sc.nextInt();
			m[i] = new Movie(id, director, r, b);
		}
		sc.nextLine();
		String directorUser = sc.nextLine();
		int ratingUser = sc.nextInt();
		int budgetUser = sc.nextInt();
		
		int result1 = MovieMain.findAvgBudgetByDirector(m, directorUser);
		Movie result2 = MovieMain.getMovieByRatingBudget(ratingUser, budgetUser, m);
		
		if(result1 == 0) {
			System.out.println("Sorry - The given director has not yet directed any movie");
		}
		else {
			System.out.println(result1);
		}
		if(result2 == null) {
			System.out.println("Sorry - No movie is available with the specified rating and budget requirement");
		}
		else {
			System.out.println(result2.getMovieId());
		}
	}
	public static int findAvgBudgetByDirector(Movie[] movie, String director) {
		int count = 0;
		int sum = 0;
		int avg = 0;
		for(Movie m : movie) {
			if(m.getDirector().equalsIgnoreCase(director)){
				sum += m.getBudget();
				count++;
			}
		}
		if(count == 0) {
			return 0;
		}
		else {
			avg = sum/count;
			return avg;			
		}
	}
	
	public static Movie getMovieByRatingBudget(int rating, int budget, Movie[] movie) {
		Movie result = null;
		for(Movie m : movie) {
			if(budget % rating == 0)
			if(m.getRating() == rating && m.getBudget() == budget) {
				result = m;
			}
		}
		return result;
	}

}

class Movie{
	private int movieId;
	private String director;
	private int rating;
	private int budget;
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	public Movie(int movieId, String director, int rating, int budget) {
		super();
		this.movieId = movieId;
		this.director = director;
		this.rating = rating;
		this.budget = budget;
	}
	
}
