package Oops.java.com;

public class Account {
	private String Name;
	private String Pass_Word;
	private String Aadhear;
	private int Age;
	private long PhoneNO;
	private String Email;
	private int Customer_id;
	private static int Balance=1000;
	
	
	public static int getBalance() {
		return Balance;
	}
	public static void setBalance(int balance) {
		Balance = balance;
	}
	public String getPass_Word() {
		return Pass_Word;
	}
	public void setPass_Word(String pass_Word) {
		Pass_Word = pass_Word;
	}
	public int getCustomer_id() {
		return Customer_id;
	}
	public void setCustomer_id(int customer_id) {
		Customer_id = customer_id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAadhear() {
		return Aadhear;
	}
	public void setAadhear(String aadhear) {
		Aadhear = aadhear;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public long getPhoneNO() {
		return PhoneNO;
	}
	public void setPhoneNO(long phoneNO) {
		PhoneNO = phoneNO;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String toString() {
		return  "Customer_ID :"+Customer_id+"\nName :"+Name+"\nPassWord :"+Pass_Word+"\nAadher :"+Aadhear+"\nAge :"+Age+"\nPhoneNo :"+PhoneNO+"\nEmail :"+Email;
		
	}

}
