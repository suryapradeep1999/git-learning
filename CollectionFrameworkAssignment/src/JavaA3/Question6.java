package JavaA3;
import java.util.Scanner;
public class Question6 {

	public static void main(String[] args) {
		User u1=new User("surya","surya789");
		User u2=new User("pradeep","pradeep789");
		User u3=new User("atukuri","atukuri7989t");
		ChatRoom c1=new ChatRoom();
		int i=0;
		c1.addUser(u1);
		c1.addUser(u2);
		c1.addUser(u3);
		
		do {
			System.out.println("Please select your option \n 1. log in \n 0. Exit");
			@SuppressWarnings("resource")
			Scanner sc1= new Scanner(System.in);
			i = sc1.nextInt();
			
			if(i==1) {
				String name;
				String pass;
				System.out.print("Username :");
				name = sc1.nextLine();
				System.out.print("Password :");
				pass = sc1.nextLine();
				User userLogged=new User(name,pass);
				if(c1.isUserValidated(userLogged)) {
					int n=0;
					do {
						System.out.println("\n\nPlease select your option \n 1. Join chat \n 0. Logout");
						n = sc1.nextInt();
						if(n==1) {
							  	int m=0;
							  	do {
									System.out.println("\n\nPlease select your option \n 1. Send message \n 2. View messages\n 3. List users \n 4. Clear chat \n 0. Exit \n");
									m = sc1.nextInt();
									switch(m) {
									  case 1:
										  String msg;
										  System.out.print("Enter message : ");
										  msg = sc1.nextLine();
										  c1.addMessage(userLogged,msg);
										  break;
									  case 2:
										  c1.getChat();
										  break;
									  case 3:
										  c1.getUsers();
										  break;
									  case 4:
										  c1.clearChat();
										  break;
									  case 0:
										  break;
									  default:
										  System.out.println("\n Invalid choice!\n");
										  break;
									}
							  	}
							  	while(m!=0);
						}
						else {
							System.out.println("\n Invalid choice!\n");
						}
					}
					while(n!=0);
				}
				else {
					System.out.println("\nInvalid Credentials!\n");
				}
			}
		}
		while(i!=0);		
	}

	}


