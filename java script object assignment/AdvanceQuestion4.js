class BankAccount {
    constructor(accountNumber, accountHolder, accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
    }
getBalance() {
    console.log("Available balance: Rs. " + this.accountBalance);
}
}
class Savings extends BankAccount {
    constructor(accountNumber, accountHolder, accountBalance) {
        super(accountNumber, accountHolder, accountBalance);
    }
    withdraw(amount) {
        if(this.accountBalance - amount >= 0) {
            console.log("Withdrawal of Rs. " + amount + "successfull. ");
            this.accountBalance=this.accountBalance-amount;
        } else {
            console.log("Withdrawal of Rs. " + amount + "failed: Not enough Balance");
        }
    }
}
class Current extends BankAccount {
	constructor(accountNumber, accountHolder, accountBalance, odLimit) {
        super(accountNumber, accountHolder, accountBalance);
        this.odLimit = odLimit;
    }
    withdraw(amount) {
        if(this.accountBalance - amount >= -(this.odLimit)) {
            console.log("Withdrawal of Rs. " + amount + "successfull. ");
            this.accountBalance=this.accountBalance-amount;
        } else {
            console.log("Withdrawal of Rs. " + amount + "failed: Not enough Balance");
        }
    }
} 
var currentAccount = new Current(12, "AB", 10000, 1000);
console.log("Operation of Current account: ");
currentAccount.getBalance();
currentAccount.withdraw(10000);
currentAccount.getBalance();
currentAccount.withdraw(500);
currentAccount.getBalance();
currentAccount.withdraw(1000);
currentAccount.getBalance();
var savingAccount = new Savings(13, "CD", 12000);
console.log("Operation of Current account: ");
savingAccount.getBalance();
savingAccount.withdraw(12000);
savingAccount.getBalance();
savingAccount.withdraw(1);
savingAccount.getBalance();