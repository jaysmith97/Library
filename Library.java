import java.util.ArrayList;
import java.util.Scanner;
public class Library {
	
	//Declaring the ArrayList of books and members
	private ArrayList<Book> book = new ArrayList<Book>();
	private ArrayList<Member> member = new ArrayList<Member>();

	//Constructor for the library object that contains the array list of books and 
	//an ArrayList of Members
	public Library (ArrayList<Book> book, ArrayList<Member> member)
	{
		this.book = book;
		this.member = member;
	}
	
	//The getter for the ArrayList of members
	public ArrayList<Member> getMember() {
		return member;
	}
	
	//The setter for the ArrayList of members
	public void setMember(ArrayList<Member> member) {
		this.member = member;
	}

	// The setter for the ArrayList of books
	public void setBook(ArrayList<Book> newBook)
	{
		this.book = newBook;
	}
	
	//The getter for the ArrayList of books
	public ArrayList<Book> getBook()
	{
		return this.book;
	}
	
	//Method used to add a book into the ArrayList of books
	public void addBook(Book book)
	{
		this.book.add(book); 
	}
	
	//Method used to add a member into the ArrayList of members
	public void addMember(Member member)
	{
		this.member.add(member);
	}

	//Method to enter the book ID and ensure it is not equal to any other book ID
	public int bookID(Scanner sc)
	{
		//receiving input from user to set the Book ID
		System.out.println("Enter the Book ID: ");
		int ID= sc.nextInt();
		sc.nextLine();
		
		//for loop to iterate through the size of the ArrayList of books
		for (int i = 0; i<book.size(); i++)
		{
			//boolean to be used for while loop to ensure that the ID doesn't exist
			boolean l =true;
			
			//while loop used to ensure that the same ID can't be used
			while(l==true)
			{
				//if statement to check if the ID entered matches one that already exists
			if(book.get(i).getBookID() == ID)
			{
				//asking user to enter a new ID
				System.out.println("This ID already exists, Enter a new Book ID: ");
				ID=sc.nextInt();
				sc.nextLine();
			}else
			{
				//setting boolean equal to false to break out of the while loop
				l=false;
			}
			}
		}
		//returning the ID
		return ID;
	}
	
	//Method to ensure the authors name only contains letters
	public String author(Scanner sc)
	{
		//receiving input from user to set the name of author
		System.out.println("Enter Name of Author");
		String author = sc.nextLine();
		
		//boolean used for while loop to ensure name only contains Letters 
		boolean b = false;
		
		//while loop used to sure name of author only contains letters
		while(b==false)
		{
		//if statement to check if the author name entered contains anything other than Letters
		if(!author.matches("^[a-zA-z\\s]*$"))
		{
			//asking user to input a valid name
			System.out.println("Invalid Name, Re-Enter Name:");
			author = sc.nextLine();
		}
		
		//if statement to check if the matches Letters and Spaces
		if(author.matches("^[a-zA-z\\s]*$"))
		{
			//setting boolean equal to true to break out of the while loop
			b=true;
		}
		}
		//returning the author
		return author;
	}
	
	//Method to allow the user to input yes or no for the boolean onLoan when adding a book
	public boolean onLoan(Scanner sc)
	{
		//boolean used for while loop to ensure user inputed a correct statement
		boolean successful = false;
		
		//boolean used to set if the book is on loan
		boolean onLoan = false;
		
		//receiving input from the user to set the Book on loan
		System.out.println("Enter if its on loan:");
		String ifOnLoan = sc.nextLine();
		
		//if statement to check if the String entered from user equals yes
		if(ifOnLoan.equalsIgnoreCase("yes"))
		{
			//setting onLoan equal to true as user inputed yes
			onLoan =true;
			//setting successful equal to true to break the while loop below
			successful =true;
			//else if statement to check if user inputed no
			
		}else if (ifOnLoan.equalsIgnoreCase("no"))
			{
			//setting onLoan = to false as the user inputed no
			onLoan = false;
			//setting successful = to true to break the while loop below
			successful = true;
			}
		
		//while loop used to check if statement enter was invalid
		while(successful==false)
			{
				System.out.println("You entered an invalid statement, Enter again:");
				ifOnLoan = sc.nextLine();
				
				//same if and if else as before
				if(ifOnLoan.equalsIgnoreCase("yes"))
				{
					onLoan =true;
					successful =true;
				}else if (ifOnLoan.equalsIgnoreCase("no"))
					{
					onLoan = false;
					successful = true;
					}
			}
		
		//returning onLoan
		return onLoan;
	}
		
	//Method used enter the member ID and ensure it is not equal to any other memberID
	public int memberID(Scanner sc)
	{
		//receiving input from user to enter member ID
		System.out.println("Enter the Member ID: ");
		int memID = sc.nextInt();
		sc.nextLine();
		
		//for loop to iterate through the size of the ArrayList of members
		for(int i = 0; i<member.size(); i++)
		{
			//boolean for while loop
			boolean k =true;
			//while loop to ensure ID entered doesn't equal ID that already exists
			while(k==true)
			{
				//if statement to check if the ID entered equals ID that already exists
				if (member.get(i).getMemberID() == memID)
				{
					//asking user to input the ID again
					System.out.println("This ID already exists, Enter a new Member ID: ");
					memID = sc.nextInt();
					sc.nextLine();
				} 
				//else if it doesn't equal a member ID that exists
				else
				{
					//setting the boolean equal to false to break the while loop
					k=false;
				}
			}
		}
		
		//returning member ID
		return memID;
	}
	
	//Method used to ensure the members name only contains letters
	public String memName(Scanner sc)
	{
		//receiving input from user to enter the name of member
		System.out.println("Enter Name of Member:");
		String memName = sc.nextLine();
		//boolean used for the while loop
		boolean k =false;
		//while loop to check if the name entered contains Letters and Spaces
		while(k==false)
		{
			//if statement to check if the name entered doesn't equal Letters and Spaces
		if(!memName.matches("^[a-zA-z\\s]*$"))
		{
			//asking user to enter the name again
			System.out.println("Invalid Name, Re-Enter Name:");
			memName = sc.nextLine();
		}
		//if statement to check if the name entered equals Letters and Spaces
		if(memName.matches("^[a-zA-z\\s]*$"))
		{
			//setting boolean = to true to break out of the while loop
			k=true;
		}
		}
		
		//returning the name of the Member
		return memName;
	}

	//Method to display all books within the Array List
	public void displayBooks()
	{
		//String for onLoan to show Yes or No instead of True or False
		String onLoan = null;
		
		//for loop to iterate through the size of the ArrayList of books
		for(int i=0; i<book.size();i++)
		{
			//if statement to show if book is on loan to show yes or no
			if(book.get(i).isOnLoan()==true)
			{
				onLoan = "Yes";
			}else if (book.get(i).isOnLoan()==false)
			{
				onLoan="No";
			}
			
			book.get(i);
			//printing the information of the book to the console
			System.out.println("BookID: " + book.get(i).getBookID() + "\nTitle: " + book.get(i).getTitle() + 
			"\nAuthor: " + book.get(i).getAuthor() + "\nOn Loan: " + onLoan + 
			"\nNumber of Times Loaned: " + book.get(i).getNumTimesLoaned());
			System.out.println("");
		}
	}
	
	//Method used to display all members in the ArrayList of Members
	public void displayMembers()
	{
		//for loop to iterate through the size of the ArrayList of members
		for (int i = 0; i < member.size(); i++) 
		{
			//printing the information of the members to console
			System.out.println("Member ID: " + member.get(i).getMemberID() + "\nMember Name: " 
		 +member.get(i).getMemberName() +"\nMember's Address:" + member.get(i).getAddress()
		 +"\nMember Age: " + member.get(i).getAge() + "\nNumber of Books Loaned: " + member.get(i).getNumOfBooksLoaned()
		 +"\nFine owed: £" +member.get(i).getFine());
			System.out.println("");
		}
	}
	
	//This method is used to delete a book
	public void deleteBook(Scanner sc)
	{
		//receiving input from user to enter the Book ID they want to delete
		System.out.println("Enter the Book ID of the Book you wabt to Delete:");
		int bookID = sc.nextInt();
		sc.nextLine();
		
		//boolean to check if the book ID entered was correct
		boolean successful = false;
		
		//for loop to iterate through the size of the ArrayList of books
		for (int i=0; i<book.size();i++)
		{
			//if statement to check if the Book ID entered = one in the ArrayList of books
			if(book.get(i).getBookID() == bookID)
			{
				//removing the book from the ArrayList
				book.remove(i);
				//showing the user that the book removal was successful
				System.out.println("Book Removal Successful");
				//setting successful = to true as the ID's matched
				successful = true;
			}
		}
		//if statement to show that the book ID entered was not valid
		if(successful == false)
		{
			System.out.println("You Did Not Enter a Valid Book ID");
		}
	}
	
	//This method is used to delete a member from the ArrayList of members
	public void deleteMember(Scanner sc)
	{ 
		//receiving input from user to enter Member ID they want to delete
		System.out.println("Enter the Member ID of the Member you want to Delete:");
		int memID = sc.nextInt();
		sc.nextLine();
		
		//boolean to check if the member ID is correct
		boolean successful =false;
		
		//for loop to iterate through the size of the ArrayList of members
		for (int i = 0; i <member.size(); i++) 
		{
			//if statement to check if the member ID entered = one in the ArrayList
				if(member.get(i).getMemberID()==memID)
				{	
					//remove the member from the ArrayList
					member.remove(i);
					//showing user that the removal was successful
					System.out.println("Member Removal Successful");
					//setting boolean equal to true as the ID's matched
					successful = true;
				}
		}
		//if statement to show user that the Member ID entered was not valid
		if(successful == false)
		{
			System.out.println("You Did Not Enter a Valid Member ID");
		}
	}
	
	//This method is used to edit a book
	public void editBook (Scanner sc)
	{
		//receiving user input from user to enter Book ID of the book the want to edit
		System.out.println("Enter the Book ID of the Book you would like to edit: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		//boolean to be used to check if ID entered is correct
		boolean successful = false;
		
		//for loop to iterate through the size of the ArrayList of books
		for(int i=0; i<book.size();i++)
		{
			//if statement to check if the ID entered matches an ID in the ArrayList of Books
				if(book.get(i).getBookID() == id)
				{
					//receiving user input from user to change the details of the book
					Book b = book.get(i);
					System.out.println("Enter new book title: ");
					String title = sc.nextLine();
					b.setTitle(title);
					String author = author(sc);
					b.setAuthor(author);
					boolean onLoan = onLoan(sc);
					b.setOnLoan(onLoan);
					System.out.println("Enter the number of loans: ");
					int numOfLoans = sc.nextInt();
					b.setNumTimesLoaned(numOfLoans);
					sc.nextLine();
					
					//setting boolean equal to true as the ID's match
					successful = true;
				}
			}
		
		//if statement to show user that they did not enter a valid ID 
		if(successful == false)
		{
			System.out.println("You Did Not Enter a Valid Book ID");
		}
			
		
	}
	
	//This method is used to edit a member
	public void editMember(Scanner sc)
	{
		//receiving input from the user to enter the Member ID
		System.out.println("Enter the Member ID of the Member you want to edit:");
		int memID = sc.nextInt();
		sc.nextLine();
		
		//boolean to be used to check if the ID entered is correct
		boolean successful = false;
		
		//for loop to iterate through the size of the ArrayList of members
		for (int i=0; i<member.size(); i++)
		{
			
			//if statement to check if the Member ID entered matches an ID in the ArrayList
			if(member.get(i).getMemberID()==memID)
			{
				//receiving input from the user to change the details of the Member
				Member m = member.get(i);
				String name = memName(sc);
				m.setMemberName(name);
				System.out.println("Enter new Address of Member:");
				String address = sc.nextLine();
				m.setAddress(address);
				System.out.println("Enter New Age of Member");
				int age = sc.nextInt();
				m.setAge(age);
				sc.nextLine();
				System.out.println("Enter Number of Books Loaned:");
				int numOfBooksLoaned = sc.nextInt();
				m.setNumOfBooksLoaned(numOfBooksLoaned);
				sc.nextLine();
				System.out.println("Enter Fine Owed:");
				double fine = sc.nextDouble();
				sc.nextLine();
				m.setFine(fine);
				
				//setting the boolean equal to true as the ID's match
				successful = true;
			}
		}
		
		//if statement used to show the user that the ID they entered wasn't valid
		if(successful == false)
		{
			System.out.println("You Did Not Enter a Valid Member ID");
		}
	}

	//This method is used to search for a specific book by its ID
	public void searchBook(Scanner sc)
	{
		//Receiving user input to search for the book 
		System.out.println("Enter the Book ID:");
		int bookID = sc.nextInt();
		sc.nextLine();
		boolean successful = false;
		String onLoan = null;
		
		//for loop to iterate through the size of the ArrayList of Books
		for(int i =0; i<book.size();i++)
		{
			//if statement to check if the book ID entered matches one in the ArrayList
			if(book.get(i).getBookID()==bookID)
			{
				//Setting boolean equal to true as the ID's match
				successful = true;
				//if statement to check if the book enter is on loan
				if(book.get(i).isOnLoan()==true)
				{
					//if its on loan set the String equal to yes
					onLoan = "Yes";
				}else if (book.get(i).isOnLoan()==false)
				{
					//if its not on loan set the String equal to no
					onLoan="No";
				}
				//displaying the information of the book that was entered
				System.out.println("BookID: " + book.get(i).getBookID() + "\nTitle: " + book.get(i).getTitle() + 
				"\nAuthor: " + book.get(i).getAuthor() + "\nOn Loan: " + onLoan + 
				"\nNumber of Times Loaned: " + book.get(i).getNumTimesLoaned());
			}
		}
		//if statement to show that there wasnt a valid ID entered
		if(successful == false)
		{
			System.out.println("You Did Not Enter a Valid Book ID");
		}
	}

	//This method is used to search for a specific member by its ID
	public void searchMember(Scanner sc)
	{
		//receiving input from the user to enter the Member ID of Member they want
		//to search for
		System.out.println("Enter Member ID:");
		int memberID = sc.nextInt();
		sc.nextLine();
		
		//boolean to be used to check if the ID's match
		boolean successful = false;
		
		//for loop to iterate through the size of the ArrayList of members
		for (int i = 0; i < member.size(); i++)
		{
			//if statement to check if the ID entered matches one in the ArrayList
			if(member.get(i).getMemberID() == memberID)
			{
				//setting the boolean equal to true as the ID's match
				successful = true;
				
				//printing the information of the member entered
			    System.out.println("Member ID: " + member.get(i).getMemberID() + "\nMember Name: " 
			    +member.get(i).getMemberName() +"\nMember's Address:" + member.get(i).getAddress()
			    +"\nMember Age: " + member.get(i).getAge() + "\nNumber of Books Loaned: " + 
			    member.get(i).getNumOfBooksLoaned() +"\nFine owed: £" +member.get(i).getFine());
			}
		}
		
		//if statement used to show that the ID entered by user wasn't valid
		if(successful == false)
		{
			System.out.println("You Did Not Enter a Valid Member ID!");
		}
	}
	
	//This method is used to loan a book
	public void loanBook(Scanner sc)
	{
		//receiving input from user to enter the Member ID
		System.out.println("Enter Member ID:");
		int memID = sc.nextInt();
		sc.nextLine();
		
		//2 booleans used to check if the member ID and Book ID are correct
		boolean successful = false;
		boolean successful2 = false;
		
		//for loop to iterate through the size of the ArrayList of members
		for (int j=0; j<member.size();j++)
		{
		//if statement to check if the member ID entered is equal to one in the ArrayList
		if(member.get(j).getMemberID()==memID)
		{
			//setting successful = to true as the member ID entered is correct
			successful = true;
			//receiving user input for the book ID
			System.out.println("Enter the Book ID You Want to Loan(MAX LOAN 7 DAYS):");
			int id = sc.nextInt();
			sc.nextLine();
			
			//for loop to iterate through the size of the ArrayList of books
			for (int i=0; i<book.size();i++)
			{
				//if statement to check if the Book ID entered = an ID of book in ArrayList
				if(book.get(i).getBookID()==id)
				{
					//setting successful2 = to true as the ID entered matches 
					successful2 =true;
					
					//if statement to check if the book is not on loan
					if(book.get(i).isOnLoan()==false)
					{
						//setting the book on loan to true
						book.get(i).setOnLoan(true);
						//showing that the book is on loan 
						System.out.println(book.get(i).getTitle() + " is now on loan to " + 
						member.get(j).getMemberName());
					}
					//showing the user that the book is already on loan
					else
						{
							System.out.println("This book is already on loan");
						}
				}
			}
			//if statement to show that the Book ID entered isn't valid
			if(successful2 == false)
			{
				System.out.println("You Did Not Enter a Valid Book ID");
			}
		}
		}
		//if statement to show that the member ID entered isn't valid
			if(successful == false)
			{
			System.out.println("You Did Not Enter a Valid Member ID");
			}
			
			
	}
	
	//This method is used to return a book
	public void returnBook(Scanner sc)
	{
		//Ask user for the Member ID
		System.out.println("Enter member ID: ");
		int memID = sc.nextInt();
		sc.nextLine();
		
		//2 Booleans to ensure Member and Book ID's are correct
		boolean successful =false;
		boolean successful2 = false;
		
		// for loop to iterate through the member ArrayList
		for (int j = 0; j < member.size(); j++) 
		{
			//if statement to check if the member ID entered = one in the ArrayList
			if(member.get(j).getMemberID() ==memID)
			{
				//Asking user to input the Book ID
				System.out.println("Enter Book ID: ");
				int id = sc.nextInt();
				sc.nextLine();
			
				//setting successful = to true as the Member ID's match
				successful = true;
				
				//for loop to iterate through the size of the ArrayList of Books
				for (int i=0;i<book.size();i++)
				{
					//if statement to check if the book ID entered = one in the ArrayList of books
				   if(book.get(i).getBookID()==id)
				   {
					   //setting successful2 = to true as the ID's match
					successful2 = true;
					
					//if statement to check if the book entered is on loan
				      if(book.get(i).isOnLoan()==true)
				      {
				    	 //asking the user how many days did the member have the book
				        System.out.println("How many days did you have the book: ");
				        int days = sc.nextInt();
				        sc.nextLine();
				  //if statement to assign the fine
				      	if(days==7)
				     	{
				    	}
				    	else
					       {
					        double fine = ((days-7)*0.5);
				          	member.get(j).setFine(member.get(j).getFine()+fine);
				         	System.out.println("You owe a fine of £" +fine);
				         	}
				      	
				      	//setting the book on loan to false as it has been returned
				        book.get(i).setOnLoan(false);
				        //Adding one to the number of times the book has been loaned
				        book.get(i).setNumTimesLoaned(book.get(i).getNumTimesLoaned()+1);
				        //Adding one to the number of books loaned by the member
				        member.get(j).setNumOfBooksLoaned(member.get(j).getNumOfBooksLoaned()+1);
				        //showing user that the book has been returned
				        System.out.println(book.get(i).getTitle() + " has now been returned");
			          }
				      //else statement to show that the book is not on loan so it cant be returned
				      else
				         {
				          System.out.println("The book entered is currently not on loan");
				         }
			       }
			   }
				//if statement to show the user that they did not enter a valid book ID
				if(successful2 == false)
				{
					System.out.println("You Did Not Enter a Valid Book ID");
				}
		    }
		}
		
		// if statement to show the user that they did not enter a valid member ID
		if(successful == false)
		{
			System.out.println("You Did Not Enter a Valid Member ID");
		}
	}
	
	//This method is used to pay a fine
	public void payFine(Scanner sc)
	{
		//Allowing the user to enter the Member ID
		System.out.println("Enter Member ID:");
		int memID = sc.nextInt();
		sc.nextLine();
		
		//Booleans used to see if the Member ID and Book ID are valid
		boolean successful = false;
		boolean successful1 = false;
		
		//for loop to iterate through the Member ArrayList
		for (int i = 0; i < member.size(); i++) 
		{
			//if statement to see if the member ID enter equals a member ID in the Member ArrayList
			if(member.get(i).getMemberID()==memID)
			{
				successful = true;
				//if statement to tell user how much they have to pay and if they owe a fine
				//ask how much they would like to pay now
				if(member.get(i).getFine()==0)
				{
					System.out.println("You do not have to pay a fine");
				} else
					{
					System.out.println("You owe a fine of: £" + member.get(i).getFine());
					System.out.println("How much would you like to pay now?: ");
					double paid = sc.nextDouble();
					
					//while loop to ask the user to enter a valid amount if they entered an 
					//amount which was invalid
					while(successful1==false)
					{
						//if statement to ensure member enters a valid amount to pay off the fine
					if(paid<=member.get(i).getFine()&&paid>0)
					{
					member.get(i).setFine(member.get(i).getFine()- paid);
					System.out.println("You now owe: £" + member.get(i).getFine());
					successful1=true;
					}else
					{
						System.out.println("You Entered an Invalid Amount, Enter Again:");
						paid = sc.nextDouble();
						sc.nextLine();
					}
					}
					}
			}
		}
		//if statement to show that the user didn't input a valid Member ID
		if(successful == false)
		{
			System.out.println("You Did Not Enter a Valid Member ID");
		}
	}
	
	//This method is to display all the books currently on loan
	public void booksOnLoan()
	{
		//boolean used to see if there is books on loan
		boolean successful = false;
		
		//String to show if the book is on loan to show yes or no
		String onLoan = null;
		
		//for loop to iterate through the book ArrayList
		for (int i = 0; i < book.size(); i++) 
		{
			//if statement to show if book is on loan to show yes or no
			if(book.get(i).isOnLoan()==true)
			{
				onLoan = "Yes";
			}else if (book.get(i).isOnLoan()==false)
			{
				onLoan="No";
			}
			
			//if statement used to show all of the books on loan
			if(book.get(i).isOnLoan()==true)
			{

				System.out.println("Book ID:" + book.get(i).getBookID()+ "\nTitle: " + book.get(i).getTitle()
						+ "\nAuthor: " + book.get(i).getAuthor() + "\nOn Loan: " + onLoan +
						"\nNumber of Times Loaned: " + book.get(i).getNumTimesLoaned());
				System.out.println("");
				successful = true;
			}
			
		}
		
		//if statement to print there are no books on loan
		if(successful == false)
		{
			System.out.println("There are no books on loan!");
		}
	}

}
