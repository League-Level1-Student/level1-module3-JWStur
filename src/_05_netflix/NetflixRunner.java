package _05_netflix;

public class NetflixRunner {
	public static void main(String[] args) {
		Movie LOTR = new Movie("Lord of The Rings", 4);
		Movie HP = new Movie("Harry Potter", 3);
		Movie Pets = new Movie("The Secret Life of Pets", 5);
		Movie Old = new Movie("Old", 1);
		Movie Jungle = new Movie("Jungle Cruise", 2);
		NetflixQueue inQueue = new NetflixQueue();
		inQueue.addMovie(Jungle);
		inQueue.addMovie(Old);
		inQueue.addMovie(Pets);
		inQueue.addMovie(HP);
		inQueue.addMovie(LOTR);
		inQueue.printMovies();
		inQueue.sortMoviesByRating();
		System.out.println(inQueue.getBestMovie());
		System.out.println(inQueue.getMovie(1));
	}
}
