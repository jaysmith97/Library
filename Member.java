
public class Member {
	//These are the instance variables for the member
	private int memberID;
	private String memberName;
	private String address;
	private int age;
	private int numOfBooksLoaned;
	private double fine;
	
	//This is the constructor method for the Member object
	public Member(int memberID, String memberName, String address,int age, int numOfBooksLoaned, double fine) 
	{
		this.memberID = memberID;
		this.memberName = memberName;
		this.address = address;
		this.age = age;
		this.numOfBooksLoaned = numOfBooksLoaned;
		this.fine = fine;
	}

	//the getter for the number of books loaned
	public int getNumOfBooksLoaned() {
		return numOfBooksLoaned;
	}

	//the setter for the number of books loaned
	public void setNumOfBooksLoaned(int numOfBooksLoaned) {
		this.numOfBooksLoaned = numOfBooksLoaned;
	}

	//the getter for the member ID
	public int getMemberID() 
	{
		return memberID;
	}

	//the setter for the member ID
	public void setMemberID(int memberID) 
	{
		this.memberID = memberID;
	}

	//the getter for the member name
	public String getMemberName() 
	{
		return memberName;
	}

	//the setter for the member name
	public void setMemberName(String memberName) 
	{
		this.memberName = memberName;
	}

	//the getter for the age
	public int getAge() 
	{
		return age;
	}

	//the setter for the age
	public void setAge(int age) 
	{
		this.age = age;
	}

	//the getter for the fine
	public double getFine() 
	{
		return fine;
	}

	//the setter for the fine
	public void setFine(double fine) 
	{
		this.fine = fine;
	}

	//the getter for the address
	public String getAddress() 
	{
		return address;
	}
	
    //the setter for the address
	public void setAddress(String address) 
	{
		this.address = address;
	}
}
