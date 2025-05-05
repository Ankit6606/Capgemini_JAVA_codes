
# 1. Book Management

Start by creating a **`Book`** class that represents a book in the library. This class should encapsulate its fields using **`private`** access modifiers and provide **`public`** getter methods.  
The fields should include **`id`**, **`title`**, **`author`**, and a boolean field **`isAvailable`** that tracks whether the book is available for borrowing.  
Create a **constructor** that initializes the **`id`**, **`title`**, and **`author`** of the book. By default, when a book is created, it should be marked as available (**`isAvailable = true`**).  
Also, define methods **`borrowBook()`** and **`returnBook()`** which update the availability status to false and true respectively.  
Override the **`toString()`** method to return a readable string that shows the book’s details, including whether it is currently available or borrowed.

# 2. User Roles: Inheritance and Abstraction

Create an abstract class named **`Person`**. This will represent a general person in the library system. The class should have **`protected`** fields **`id`** and **`name`**, and a **constructor** to initialize these fields.  
Declare an abstract method **`showRole()`** in the **`Person`** class. This method will be implemented by child classes to indicate the role of the person.  
Create two classes **`Member`** and **`Librarian`** that inherit from **`Person`**.  
In the **`Member`** class, override the **`showRole()`** method to print that the person is a library member.  
Similarly, in the **`Librarian`** class, override **`showRole()`** to print that the person is a librarian.

# 3. Library Operations

Create a class named **`Library`** which acts as the central class to manage the library system.

Inside this class, create an **`ArrayList<Book>`** to store all the books in the library and a **`HashMap<Integer, Member>`** to store all registered members, using their **`IDs`** as keys.  
Add a method named **`addBook(Book book)`** that adds a book to the book list.  
Add a method named **`registerMember(Member member)`** that adds a member to the map using their ID as the key.  

To allow a member to borrow a book, create a method **`borrowBook(int memberId, int bookId)`**. This method should:
- Use a **stream** to find the book by its **ID**.
- Check if the book is **available**.
- If it is, mark the book as borrowed by calling **`book.borrowBook()`**.
- If the book is not available, throw a custom exception **`BookNotAvailableException`**.
- If the book does not exist, also throw the same exception with a proper message.

Create another method **`returnBook(int bookId)`** which:
- Uses a stream to find the book by **ID**.
- If found, sets its availability status back to true using **`book.returnBook()`**.

# 4. Custom Exception Handling

Create a custom checked exception class named **`BookNotAvailableException`** that extends **`Exception`**.  
Provide a constructor that accepts a string **`message`** and passes it to the base class constructor using **`super(message)`**.

Use this exception in the **`borrowBook()`** method to handle error cases when the book is already borrowed or not found.  
Wrap the borrowing process in a **`try-catch`** block in your **`main`** method and print out the exception message if it occurs.

# 5. Collections

Use an **`ArrayList`** to store the list of books because it allows dynamic resizing and ordered insertion.  
Use a **`HashMap<Integer, Member>`** to store registered members. The member **`ID`** will serve as the key, and the **`Member`** object as the value. This allows for fast access and lookup of members.

# 6. Stream API

Inside the **`Library`** class, create a method **`showAvailableBooks()`** that:
- Uses **Java Stream API** to filter out books where **`isAvailable`** is true.
- Prints each of those books using **`forEach(System.out::println)`**.

Create another method **`showBooksByAuthor(String author)`** that:
- Uses **streams** to filter books that match the given **`author`** name (case insensitive).
- Then maps the book list to their titles using **`map(Book::getTitle)`**.
- Collects and prints the result as a list.

These methods demonstrate practical usage of **filtering**, **mapping**, and **collecting** using Java **Streams**.

# 7. Demonstration in the Main Method

Create a class **`LibrarySystem`** with a **`main(String[] args)`** method.  
Inside this method:
- Create an instance of the **`Library`** class.
- Add at least three books using **`addBook()`**.
- Register at least two members using **`registerMember()`**.
- Call **`showRole()`** on each member to demonstrate runtime polymorphism.
- Call **`showAvailableBooks()`** to list all available books.
- Use the **`borrowBook()`** method to let a member borrow a book.
- Attempt to borrow the same book again to trigger and catch **`BookNotAvailableException`**.
- Use **`returnBook()`** to return a borrowed book.
- Again call **`showAvailableBooks()`** to confirm the book is available.
- Finally, call **`showBooksByAuthor()`** with an author’s name to demonstrate filtering using **streams**.
