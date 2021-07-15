package JavaA5;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
public class Question14 {

	public static void main(String[] args) {
		Trader sohail = new Trader("Sohail", "Delhi");
		Trader kumar = new Trader("Kumar","Indore");
		Trader amit = new Trader("Amit","Delhi");
		Trader kiran = new Trader("Kiran","Andhra Pradesh");

		List<Transaction> transactions = Arrays.asList(
		    new Transaction(kiran, 2011, 300),
		    new Transaction(sohail, 2012, 1000),
		    new Transaction(sohail, 2011, 400),
		    new Transaction(kumar, 2012, 710),
		    new Transaction(kumar, 2012, 700),
		    new Transaction(amit, 2012, 950)
		);
		
		Optional<Integer> highestvalue =
			    transactions.stream()
			                .map(Transaction::getvalue)	
			                .reduce(Integer::max);
		System.out.println(highestvalue);

		

	}

}

	


