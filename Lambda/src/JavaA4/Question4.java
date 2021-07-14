package JavaA4;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
public class Question4 {

	public static void main(String[] args) {
		 List<String> people = new ArrayList<>();
		    people.add("Cricket");
	        people.add("Basketball");
	        people.add("Badminton");
	        people.add("Tennis");
	        people.add("Football");
	       
	        Predicate<String> predicate = p -> ((p.length()) % 2 != 0);
	        people.removeIf(predicate);
	        people.forEach(System.out::println);

}

}

	


