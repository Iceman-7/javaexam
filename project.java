/* Κλάση User: */

import java.lang.*;

public class User {
	String name, phone;

	public User(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
}

/* Κλάση Admin: */

public class Admin extends User {
	boolean isAdmin;

	public Admin(String name, String phone) {
		super(name, phone);
		this.isAdmin = true;
	}
}

/* Κλάση Donator: */

public class Donator extends User {
	ArrayList<Offers> offersList;

	public Donator(String name, String phone) {
		super(name, phone);
		offersList = new ArrayList<Offers>();
	}
}


/* Κλάση Beneficiary: */

public class Beneficiary extends User {
	public Beneficiary(String name, String phone) {
		super(name, phone);
	}
}

/* Κλάση Εntity: */

public class Entity {

	string name;
	string description;
	int id;
	
	public string getEntintyInfo() {

		List<String> info = new ArrayList<>(); 

		info.add(name); 
		info.add(description);
		info.add(id);  
		return info; 
	}
}

/* Κλάση Μaterial: */

public class Material extends Entity {

	double level1;
	double level2;
	double level3;

	public double getDetails() {
		if noPersons==1 {
			return level1;
		} elseif noPersons>=2 && noPersons<=4 {
			return level2;
		} elseif noPersons==5 {
			return level3;
		}
	}	
}

/* Κλάση RequestDonationList: */

public class RequestDonationList { 

	ArrayList<RequestDonation> rdEntities = new ArrayList<RequestDonation>(); 

	rdEntities.get(entity.id);
	RequestDonation r=new RequestDonation; 

	for (int i = 0; i < rdEntities.size(); i++) { 
		if (r==rdEntities.get(i)) { 
		rdEntities.get(i).quantity=rdEntities.get(i).quantity+r; 
	} else {
		rdEntities.add(r); 
	} 

	try { 
		for (int j = 0; j < entityList.size(); i++) { 
			if (r==rdEntities.get(i)) {
				System.out.println("Υπάρχει");
			}			
	} catch (Exception e) { 
		System.out.println("Δεν υπάρχει."); 
	}


	rdEntities.remove(new RequestDonation); 

	static void monitor() { 
		for (int i = 0; i < rdEntities.size(); i++) { 
		System.out.println(rdEntities.get(i).quantity); System.out.println(rdEntities.get(i).name); 
		} 
	}

	static void reset() { 
		rdEntities.clear();
	}
 }

*/ Κλάση Requests: */

public class Requests extends RequestDonationList {

	static void vaildRequestDonation() {

		boolean egkrisi=false;
		for (int i = 0; i < rdEntities.size(); i++) { 
			if (rdEntities.get(i)==”Material”) { 
				if (rdEntities.get(i).noPersons=”level1”) {
					if (rdEntities.get(i).quantity<RequestDonation.quantity) {
						System.out.prinln(“Εγκρίνεται η παροχή”);
						egkrisi=true;
					}
				} elseif (rdEntities.get(i).noPersons=”level2”) {
					if (rdEntities.get(i).quantity<RequestDonation.quantity*4) {
						System.out.prinln(“Εγκρίνεται η παροχή”);
						egkrisi=true;
					}
				} elseif (rdEntities.get(i).noPersons=”level3”) {
					if (rdEntities.get(i).quantity<RequestDonation.quantity*5) {
						System.out.prinln(“Εγκρίνεται η παροχή”);
						egkrisi=true;
					}
				}
			} elseif (rdEntities.get(i)==”Service”) {
				System.out.prinln(“Δεν μας αφορά”);
				egkrisi=false;
			}
		} 
	}

	try { 
		for (int i = 0; i < rdEntities.size(); i++) { 
			if (rdEntities.get(i).quantity>0 && egkrisi=true)  { 
				rdEntities.add(r); 
			}
	    }
	}	
	catch  (Exception1 e) {
		for (int i = 0; i < rdEntities.size(); i++) { 
			if (rdEntities.get(i).quantity<=0) {
				System.out.println(“δεν επαρκεί”);
			}
	     }
	}	
	catch  (Exception2 e) {
		if (egkrisi=false) {
			System.out.println(“δεν το δικαιούται ο Beneficiary”);
		}
	}

	static void commit() { 
 
	try { 
		for (int i = 0; i < rdEntities.size(); i++) { 
			if (rdEntities.get(i).quantity>0 && egkrisi=true)  { 
				currentDonations(i)=currentDonations(i)-rdEntities.get(i).quantity; 
				rdEntities.remove(rdEntities.get(i));
				receivedList.add(rdEntities.get(i));
 	        }
	    }
	}
	catch  (Exception1 e) {
       for (int i = 0; i < rdEntities.size(); i++) { 
			if (rdEntities.get(i).quantity<=0) {
				System.out.println(“δεν επαρκεί”);
			}
	    }
	}	
	catch  (Exception2 e) {
		if (egkrisi=false) {
			System.out.println(“δεν το δικαιούται ο Beneficiary”);
		}
	}
}

*/ Κλάση Offers: */

public class Offers extends RequestDonationList {

	 
 	static void commit() { 
		
		int count=0;
		for (int i = 0; i < rdEntities.size(); i++) { 
			if (rdEntities.get(i)==offerslist.get(i)) {
				currentDonations.get(i)= rdEntities.get(i);
			}
		}
		if (count== rdEntities.size()) {
			rdEntities.clear();
		}
	}
}

/* Κλάση Menu: */

public class Menu {
	
	public void display_menu() {
		Scanner kin = new Scanner ( System.in );
		System.out.println ( "Give your mobile phone number:" );
		int mob =kin.nextLine();
		System.out.println ( "1) Add Offer\n 2) Show Offers\n 3) Commit\n 4) Back\n 5)Logout\n 6)Exit" );
		System.out.print ( "Selection: " );
		Scanner ep = new Scanner ( System.in );
		int choice =ep.nextLine();
		while choice!=6 {
			switch ( choice ) {
			case 1:
				System.out.println ( "You picked option 1" );
				break;
			case 2:
				System.out.println ( "You picked option 2" );
				break;
			case 3:
				System.out.println ( "You picked option 3" );
				break;
			case 4:
				System.out.println ( "You picked option 4" );
				break;
			case 5:
				System.out.println ( "You picked option 5" );
				break;	
			default:
				System.err.println ( "Unrecognized option" );
				break;
			}
		choice =ep.nextLine();
		}
	}
}