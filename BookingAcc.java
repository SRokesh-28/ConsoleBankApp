package Oops.java.com;
import java.util.*;
public class BookingAcc {
	 static ArrayList<Account> accHol=new ArrayList<Account>();
	 static int accountLimit=10;
	 static int idGenerator=1;
	public static void accHolder(String name,String Pass_Word,String AadherNO,int age,long phoneNO,String email) {
		Account accountBook=new Account();
		if(accHol.size()<=accountLimit) {
			accountBook.setName(name);
			accountBook.setPass_Word(Pass_Word);
			accountBook.setAadhear(AadherNO);
			accountBook.setAge(age);
			accountBook.setPhoneNO(phoneNO);
			accountBook.setEmail(email);
			accountBook.setCustomer_id(idGenerator++);
			accountBook.setBalance(Account.getBalance());
			accHol.add(accountBook);
		}
		else {
			System.out.println("Sorry No Space to create New Account");
		}
	}
	public static void display() {
		for(Account A:accHol) {
			System.out.println(A.toString());

		}
	}
}
