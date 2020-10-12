
public class Book {
	
	//These are the instance variables
	private int bookID;
	private String title;
	private String author;
	private boolean onLoan;
	private int numTimesLoaned;
	
	//This is the constructor method for the book object
	//It sets up the book ID, the title, the author, if its on loan and how many times its been loaned
	public Book(int bookID, String title, String author, boolean onLoan, int numTimesLoaned)
	{
		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.onLoan = onLoan;
		this.numTimesLoaned = numTimesLoaned;
	}
	
	//This method sets the Book ID
	public void setBookID(int newBookID)
	{
		bookID = newBookID;
	}
	
	//This methods sets the Book Title
	public void setTitle (String newTitle)
	{
		title = newTitle;
	}
	
	//This methods sets the Book Author
	public void setAuthor (String newAuthor)
	{
		author = newAuthor;
	}
	
	//This methods sets the book on loan
	public void setOnLoan (boolean OnLoan)
	{
		onLoan = OnLoan;
	}
	
	//This method sets how many times the book has been loaned
	public void setNumTimesLoaned (int newNumTimesLoaned)
	{
		numTimesLoaned = newNumTimesLoaned;
	}
	
	//This method gets the Book ID
	public int getBookID()
	{
		return bookID;
	}
	
	//This method gets the Book Title
	public String getTitle()
	{
		return title;
	}
	
	//This method gets the book's author
	public String getAuthor()
	{
		return author;
	}
	
	//This method checks if the book is on loan
	public boolean isOnLoan()
	{
		return onLoan;
	}
	
	//This method gets how many times the book has been loaned
	public int getNumTimesLoaned ()
	{
		return numTimesLoaned;
	}

}
