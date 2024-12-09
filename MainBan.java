package Oops.java.com;
import java.util.*;
import java.io.*;
public class MainBan {
public static void main(String[] args) {
     boolean loop=true;
     final String AdminUN="AdmiN&999";
     final String AdminPW="999&AdmiN";
     String UserName;
     String passWord;
     String AadherNO="";
     Scanner s=new Scanner(System.in);
     while(loop) {
     System.out.println("Choose AnyOne \n 0. Admin \n 1. Create Account  \n 2. Check Balance  \n 3. Deposit   \n 4. Withdraw  \n 5. Exit");
     int Num=s.nextInt();
     switch(Num) {
     case 0:
    	 System.out.println("Enter the USERNAME :");
    	 String Aname=s.next();
    	 System.out.println("Enter the PASSWORD :");
    	 String Apass=s.next();
    	 if(AdminUN.equals(Aname)&&AdminPW.equals(Apass)) {
    		 System.out.println("Admin DashBoard");
    		 boolean loop1=true;
    		 while(loop1) {
    		 System.out.println("Choose AnyOne \n 1. Account Details \n 2. Delet Account  \n 3. Exit");
    		 int n=s.nextInt();
    		 switch(n) {
    		 case 1:
    			 BookingAcc.display();
    			 break;
    		 case 2:
    			 System.out.println("Account deleted Successfully");
    			 break;
    		 case 3:
    			 loop1=false;
    			 break;
    		 }
    		 }
    		 
    	 }
    	 else {
    		 System.out.println("UserName or PassWord is Worng");
    	 }
    	 break;
     case 1:
    	 System.out.println("Enter the Name :");
    	 String name=s.next();
    	 System.out.println("Create the PassWord :");
    	 String Pass_word=s.next();
    	 System.out.println("Enter the Aadhar No :");
    	 AadherNO=s.next();
    	 System.out.println("Enter the Age :");
    	 int age=s.nextInt();
    	 System.out.println("Enter the PhoneNO :");
    	 long phoneNO=s.nextLong();
    	 System.out.println("Enter the Email :");
    	 String email=s.next();
    	 BookingAcc.accHolder(name,Pass_word,AadherNO,age,phoneNO,email);
    				System.out.println("Account Sccessfully Created...");
    				System.out.println("Your Account Number is :"+name+"@"+AadherNO.substring(AadherNO.length()-4, AadherNO.length()));
    	 break;
     case 2:
    	 System.out.println("Enter your userName :");
    	  UserName=s.next();
    	 System.out.println("ENter your Password :");
    	 passWord=s.next();
    	 for(Account a:BookingAcc.accHol) {
    		 if(a.getName().equals(UserName)) {
    			 if(a.getPass_Word().equals(passWord)) {
    				System.out.println("Your Balance is :"+a.getBalance());
    				break;
    			 }
    			 else {
    				 System.out.println("Your UserName or Password is Worng");
    			 }
    		 }
    	 }
    	 break;
     case 3:
    	 System.out.println("Enter your Username :");
    	 UserName=s.next();
    	 System.out.println("Enter the PassWord:");
    	 passWord=s.next();
    	 for(Account a:BookingAcc.accHol) {
    		 if(a.getName().equals(UserName)) {
    			 if(a.getPass_Word().equals(passWord)) {
                    System.out.println("Enter the deposite Amount :");
                    int deposite=s.nextInt();
                    a.setBalance(deposite+a.getBalance());
                    System.out.println(deposite+" Credited Your Account");
                    break;
    			 }
    			 else {
    				 System.out.println("Your UserName or Password is Worng");
    			 }
    		 }
    	 }
    	 break;
     case 4:
    	 System.out.println("Enter your Username :");
    	 UserName=s.next();
    	 System.out.println("Enter the PassWord:");
    	 passWord=s.next();
    	 for(Account a:BookingAcc.accHol) {
    		 if(a.getName().equals(UserName)) {
    			 if(a.getPass_Word().equals(passWord)) {
                    System.out.println("Enter the Withdraw Amount :");
                    int Withdraw=s.nextInt();
                    if(a.getBalance()>Withdraw) {
                    System.out.println(Withdraw+" Debited Your Account");
                    a.setBalance(a.getBalance()-Withdraw);
                    break;
                    }
                    else {
                    	System.out.println("Insuffiecent Balance...");
                    	break;
                    }
    			 }
    			 else {
    				 System.out.println("Your UserName or Password is Worng");
    			 }
    		 }
    	 }
    	 break;
     case 5:
    	 loop=false;
    	 break;
     default :
    	 System.out.println("Invaild Option");
     }
     }
}
}
