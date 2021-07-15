package JavaA5;
import java.util.Arrays;

import java.util.List;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;


public class Question8 {

	public static void main(String[] args) {
		Trader sohail = new Trader("Sohail", "Pune");
		Trader kumar = new Trader("Kumar","Telangana");
		Trader amit = new Trader("Amit","Pune");
		Trader kiran = new Trader("Kiran","Andhra Pradesh");

		List<Transaction> transactions = Arrays.asList(
		    new Transaction(kiran, 2011, 300),
		    new Transaction(sohail, 2012, 1000),
		    new Transaction(sohail, 2011, 400),
		    new Transaction(kumar, 2012, 710),
		    new Transaction(kumar, 2012, 700),
		    new Transaction(amit, 2012, 950)
		);
		transactions.stream()
		.filter(d -> {
			return d.getyear() == 2011;
		})
		.sorted(comparing(Transaction::getyear))
		.map(d -> {
			System.out.println(d.getvalue());
			return d.getvalue();
		})
		.collect(toList());
	}		   
}

	


