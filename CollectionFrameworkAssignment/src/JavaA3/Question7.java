package JavaA3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Question7 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int tkn;
		List<Parked_CarOwner_details> pcod1 = new ArrayList<Parked_CarOwner_details>();

		Parked_CarOwnerList pcol1 = new Parked_CarOwnerList();
		Parked_CarOwnerList pcol2 = new Parked_CarOwnerList();
		Parked_CarOwnerList pcol3 = new Parked_CarOwnerList();
		
		pcol1.add_new_car(pcod1);
		pcol2.add_new_car(pcod1);
		pcol3.add_new_car(pcod1);
		
		printAll(pcod1);
		
		  		  
		  System.out.println("");
		  System.out.println("Enter the token number");
		  tkn = sc.nextInt();
			
					pcol2.getParkedCarLocation(tkn);
					System.out.println("Before deletion");
					printAll(pcod1); 
		  
					System.out.println("");
		  pcol2.remove_car(pcod1, tkn);
		  System.out.println("After deletion");
		  printAll(pcod1);

	}

	private static void printAll(List<Parked_CarOwner_details> pcod1) {
		for (Parked_CarOwner_details pp : pcod1) {
			System.out.println(pp);
		}

	}
	}


