public class array {

	public static void main(String[] args) {
			
		// array = used to store multiple values within a single variable
		
		String[] games = new String[3]; // Instead of using Int, will be using String for that the Display will be the Game Names only.
		
		games[0] = "League of Legends";
		games[1] = "Valorant";
		games[2] = "Honkai Starrail";
			
		for(int i=0; i<games.length; i++) { // Always use the increment on a for loop which is (i++).
			System.out.println(games[i]); // Put the (i) beside the String which is called "games."
		}
	
	}
}