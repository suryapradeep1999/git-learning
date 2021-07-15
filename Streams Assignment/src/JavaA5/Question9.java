package JavaA5;

import static java.util.stream.Collectors.toList;
import java.util.Arrays;
import java.util.List;

import JavaA5.Trader;
import JavaA5.Transaction;
public class Question9 {

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
			    .map(transaction -> {
					System.out.println(transaction.gettrader().getcity());
					return transaction.getvalue();
			    })
		 .distinct()
		 .collect(toList());
		 

	}
}

	


