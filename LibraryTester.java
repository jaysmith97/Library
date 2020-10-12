import java.util.Scanner;
import java.util.ArrayList;

public class LibraryTester {

	public static void main(String[] args) {
		
		//Declaring ArrayLists
		ArrayList<Book> bookList = new ArrayList<Book>();
		ArrayList<Member> memberList = new ArrayList<Member>();
		Library library = new Library(bookList, memberList);
		
		//Calling the scanner
		Scanner sc = new Scanner(System.in);
		
		//Variable for the menu input 
		int menuInput;
		
		//boolean for the while loop
		boolean k = true;
		
		//While loop and Switch Statement for the menu system
		while(k==true)
		{
			displayMenu();
			menuInput = sc.nextInt();
			
			//Switch statement to determine the output of the menu system
			switch(menuInput)
			{
			case 1: 
				System.out.println("---Add Book---");
				sc.nextLine();
				
				//Enter details of the book
				int ID = library.bookID(sc);
				System.out.println("Enter Title of book: ");
				String title = sc.nextLine();
				String author = library.author(sc);
				Boolean onLoan = library.onLoan(sc);
				System.out.println("Enter how many times it has been loaned: ");
				int numTimesLoaned = sc.nextInt();
				
				//Book constructor which will then be added to the book array by the method that was made
				//in the library class
				Book book = new Book(ID, title, author, onLoan, numTimesLoaned);
				
				//Method to add the book to the ArrayList of books
				library.addBook(book);
				System.out.println("");
				break;
			
			case 2: 
				System.out.println("---Add Member---");
				
				//Variables to add a new member
				int memID = library.memberID(sc);
				
				String name = library.memName(sc);
				System.out.println("Enter Member's Address:");
				String address = sc.nextLine();
				System.out.println("Enter age of the Member:");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter number of books loaned: ");
				int numOfBooksLoaned = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter fines owed:");
				double fine = sc.nextDouble();
				//Member constructor which will then be added to the member ArrayList in the library class
				Member member  = new Member(memID, name, address, age,numOfBooksLoaned, fine);
				
				//Method to add the member to the ArrayList of members
				library.addMember(member);
				System.out.println("");
				break;
				
			case 3:
				System.out.println("---List of all books---");
				System.out.println("");
				library.displayBooks();
				break;
				
			case 4:
				System.out.println("---List of all Members---");
				System.out.println("");
				library.displayMembers();
				break;
			
			case 5: 
				System.out.println("---Edit Book---");
				library.editBook(sc);
				System.out.println("");
				break;
			
			case 6: 
				System.out.println("---Edit Member---");
				library.editMember(sc);
				System.out.println("");
				break;
				
			case 7:
				System.out.println("---Delete Book---");
				library.deleteBook(sc);
				System.out.println("");
				break;
				
			case 8:
				System.out.println("---Delete Member---");
				library.deleteMember(sc);
				System.out.println("");
				break;
				
			case 9:
				System.out.println("---Search for Book---");
				library.searchBook(sc);
				System.out.println("");
				break;
			
			case 10:
				System.out.println("---Search for Member---");
				library.searchMember(sc);
				System.out.println("");
				break;
				
			case 11:
				System.out.println("---Loan Book---");
				library.loanBook(sc);
				System.out.println("");
				break;
				
			case 12:
				System.out.println("---Return Book---");
				library.returnBook(sc);
				System.out.println("");
				break;
				
			case 13: 
				System.out.println("---Pay Fine---");
				library.payFine(sc);
				System.out.println("");
				break;
				
			case 14:
				System.out.println("---All Books on Loan---");
				library.booksOnLoan();
				System.out.println("");
				break;
				
			case 15:
				System.exit(1);
				break;
				
			default:
				System.out.println("You have not entered a valid option, enter again: ");
				break;
			}
		}
		//Closing the Scanner
		sc.close();

	}
	//Method to show the Menu System
	static void displayMenu()
	{
		System.out.println("------Menu System------");
		System.out.println("1) Add Book");
		System.out.println("2) Add Member");
		System.out.println("3) View List of Books");
		System.out.println("4) View List of Members");
		System.out.println("5) Edit a Book");
		System.out.println("6) Edit a Member");
		System.out.println("7) Delete a Book");
		System.out.println("8) Delete a Member");
		System.out.println("9) Search for a Book");
		System.out.println("10) Search for a Member");
		System.out.println("11) Loan a Book");
		System.out.println("12) Return a Book");
		System.out.println("13) Pay Fine");
		System.out.println("14) View all Books on Loan");
		System.out.println("15) Quit Program");
		System.out.println("Enter the option you would like: ");
	}
	

}
