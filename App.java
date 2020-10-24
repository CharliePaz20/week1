package week1;

public class App {

	public static void main(String[] args) {

		  int ItemCost = 17;
		  int WalletAmount = 20;
		  int ManyFriends = 49;
		  int Age = 49;
		String FirstName = "Charlie";
		String LastName = "Phillips";
		char MIntial = 'H';

		  System.out.println( FirstName + " " + MIntial + " " + LastName + " is " + Age +"." );
		  System.out.println( FirstName + " has " + ManyFriends + " friends." );
		  System.out.println( FirstName + " has $" + WalletAmount + " in his wallet to pay for golf that cost $" + ItemCost + "." );
		  System.out.println( FirstName + " now has $" + (WalletAmount - ItemCost) + " in his wallet after paying for golf." );
		  System.out.println( FirstName + " has made " + (ManyFriends/Age) + " each year." );	
		  System.out.println( FirstName + " " + MIntial + " " + LastName +"." );
	}

}
