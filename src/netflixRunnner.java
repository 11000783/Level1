
public class netflixRunnner {
public static void main(String[] args) {
	//1. Instantiate some Movie objects (at least 5).
	//2. Use the Movie class to get the ticket price of one of your movies.

	//3. Instantiate a NetflixQueue.
	//4. Add your movies to the Netflix queue.
	//5. Print all the movies in your queue.
	
	//6. Use your NetflixQueue object to finish the sentence "the best movie is...."
	//7. Use your NetflixQueue to finish the sentence "the second best movie is...." 
Movie MeanGirls = new Movie("Mean Girls",8);
Movie EmojiMovie = new Movie("Emoji MOvie",1);
Movie WonderWoman = new Movie("Wonder Woman",8);
Movie lalal = new Movie("La la Land",8);
Movie dunkrik = new Movie("Dunkrik",8);
System.out.println(WonderWoman.getTicketPrice());
}
}
