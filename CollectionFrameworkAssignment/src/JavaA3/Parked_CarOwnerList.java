package JavaA3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Parked_CarOwnerList {
	 Scanner sc = new Scanner(System.in);
		
		List<Parked_CarOwner_details> p1 = new ArrayList<>();
		
		public void add_new_car(List <Parked_CarOwner_details> pcodAdd) {
			if (pcodAdd.isEmpty()) {
			    pcodAdd.add(new Parked_CarOwner_details());
			}
			else {
				pcodAdd.add(new Parked_CarOwner_details());
			}
		}
			
		public void remove_car(List<Parked_CarOwner_details> pcod1, int a) {
			pcod1.remove(a-1);
		}
		public void getParkedCarLocation(int a) {
			if (a <= 80) {
				System.out.println("Car is parked on the first floor");
			} 
			else if (a > 80 && a <= 160) {
				System.out.println("Car is parked on the second floor");
			}
			else if (a > 160 && a <= 240) {
				System.out.println("Car is parked on the third floor");
		    }
			else if ((a > 240 && a <= 320)) {
				System.out.println("Car is parked on the fourth floor");
			}
			else {
				System.out.println("Please enter a valid token number");
				
			}
			
		}
}
