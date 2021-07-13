package JavaA3;
import java.util.Scanner;
public class Parked_CarOwner_details {
	int token;
	private String ownerName;
	private String carModel;
	private long ownerMobileNo;
	private String ownerAddress;
	static int i = 1;

	Scanner sc = new Scanner(System.in);
	  public Parked_CarOwner_details() {
		  
		  	System.out.println(" ");
			System.out.println("Please enter your Name");
			ownerName = sc.nextLine();
			System.out.println("Please enter your Car model");
			carModel = sc.nextLine();
			System.out.println("Please enter your Addr");
			ownerAddress = sc.nextLine();
			System.out.println("Please enter your Mob No");
			ownerMobileNo = sc.nextLong();
			token = i;
			i++;
	  }
	  
	  public int getToken() { 
		  return token; 
	  }
	  public void setToken(int token) { 
		  this.token = token;
	  }
	  public String getOwnerName() { 
		  return ownerName; 
	  } 	  
	  public void setOwnerName(String ownerName) {
		  this.ownerName = ownerName; 
	  }  	  
	  public String getCarModel() { 
		  return carModel; 
	  } 
	  public void setCarModel(String carModel) {
		  this.carModel = carModel;
      }    
	  public long getOwnerMobileNo() {
		  return ownerMobileNo; 
	  }
	  public void setOwnerMobileNo(long owerMobileNo) { 
		  this.ownerMobileNo =owerMobileNo; 
	  } 
	  public String getOwnerAddress() { 
		  return ownerAddress; 
	  }	  
	  public void setOwnerAddress(String ownerAddress) {
		  this.ownerAddress = ownerAddress;
	  } 
	 
	  public String toString() {
		return "Parked_CarOwner_details [token=" + token + ", owerName=" + ownerName + ", carModel=" + carModel
				+ ", owerMobileNo=" + ownerMobileNo + ", owerAddress=" + ownerAddress + "]";
	}

}
