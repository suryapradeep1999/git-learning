package JavaA3;
import java.util.Set;
import java.util.TreeSet; 
public class BankAccountList {

	public static void main(String[] args) {
		SavingAccount sal1=new SavingAccount(1000, 002, "surya", true);
		 SavingAccount sal2=new SavingAccount(2000, 001, "pradeep", true);
		 SavingAccount sal3=new SavingAccount(3000, 004, "durga", false);
		 SavingAccount sal4=new SavingAccount(4000, 003, "abishek", false);
		 SavingAccount sal5=new SavingAccount(5000, 005, "kota", true);
	     

			sal1.deposit(1122);
			sal2.withdraw(800);
			System.out.println(sal1.getAcc_balance());
			System.out.println(sal2.getAcc_balance());

			Set <SavingAccount> BankAccList = new TreeSet<>();
			
			BankAccList.add(sal5);
			BankAccList.add(sal4);
			BankAccList.add(sal3);
			BankAccList.add(sal2);
			BankAccList.add(sal1);
	     
			java.util.Iterator<SavingAccount> it = BankAccList.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
	     
			}
	}

}
