package lesson_07;
import java.util.*;

public class lab_7_1 {
    public static void main(String[] args) {
        boolean isContinuing = true;
        List <Book> myBooks  = new ArrayList<>();
        while (isContinuing) {
            System.out.println("=====MENU======");
            System.out.println("1. Input book");
            System.out.println("2. Find book by ISBN");
            System.out.println("0. Exit!");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input your option");
            int userInput = scanner.nextInt();
            switch(userInput) {
                case 1:
                    //add book
                    System.out.println("Please enter ISBN:");
                    String isbn = scanner.next();
                    System.out.println("Please enter title:");
                    String title = scanner.next();
                    System.out.println("Please enter authorName:");
                    String authorName = scanner.next();
                    System.out.println("Please enter the year:");
                    int year = scanner.nextInt();
                    Book book = new Book(isbn, title, authorName, year);
                    myBooks.add(book);
                    break;
                case 2:
                    //find book
                    System.out.println("Please enter ISBN to  :");
                    String isbnFind = scanner.next();
                    for (int i = 0; i < myBooks.size(); i++) {
                        System.out.println(myBooks.get(i).getISBN());
                        if (myBooks.get(i).getISBN().equals(isbnFind)) {

                            System.out.println("The book found: " + myBooks.get(i));
                            break;
                        }
                    }
                    System.out.println("not found book");
                    break;

                case 0:
                    //exit
                    System.out.println("Exit!");
                    isContinuing = false;
                default:
                    System.out.println("Pleas read menu again");
                    isContinuing = false;

            }
        }
    }
}
