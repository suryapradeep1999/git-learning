package JavaA3;

import java.util.Scanner;
public class SavingAccount implements Comparable<SavingAccount> {
	 Scanner sc = new Scanner(System.in);
	    long acc_ID;
	    double acc_balance;
	    String accountHolderName;
	    boolean isSalaryAccount;

	    public SavingAccount(long acc_ID ,double acc_balance, String accountHolderName, boolean isSalaryAccount) {
	        this.acc_balance = acc_balance;
	        this.acc_ID = acc_ID;
	        this.accountHolderName = accountHolderName;
	        this.isSalaryAccount = isSalaryAccount;
	    }
	    public String withdraw(int k) {
			if (acc_balance-k<0)
			return ("Insufficient balance");
			else {
				acc_balance= acc_balance-k;		
			return ("Amount withdrawn: " + k + "\nAccount Balance: "+acc_balance);
			}		
		}	
		public String deposit(int k) {
			acc_balance= acc_balance+k;
			return ("Amount deposited: " + k + "\nAccount Balance: "+acc_balance);
		}
	    public double getAcc_balance() {
	        return acc_balance;
	    }
	    public long getAcc_ID() {
	        return acc_ID;
	    }
	    public String getAccountHolderName() {
	        return accountHolderName;
	    }
	    public boolean isSalaryAccount() {
	        return isSalaryAccount;
	    }
	    public void setAcc_balance(double acc_balance) {
	        this.acc_balance = acc_balance;
	    }
	    public void setAcc_ID(long acc_ID) {
	        this.acc_ID = acc_ID;
	    }
	    public void setAccountHolderName(String accountHolderName) {
	        this.accountHolderName = accountHolderName;
	    }
	    public void setSalaryAccount(boolean salaryAccount) {
	        isSalaryAccount = salaryAccount;
	    }

	    public String toString() {
	        return "SavingAccount{" + "acc_ID=" + acc_ID +  ", acc_balance=" + acc_balance + ", accountHolderName='" + accountHolderName + '\'' + ", isSalaryAccount=" + isSalaryAccount +  '}';                        
	    }

	    public int compareTo(SavingAccount o) {
	        if(this.getAcc_ID() > o.getAcc_ID()) {
	            return 1;
	        }
	        else if(this.getAcc_ID() < o.getAcc_ID()) {
	            return -1;
	        }
	        else {
	            return 0;
	        }
	    }
}
