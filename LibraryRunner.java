
/*
 * Activity 3.7.5
 */
import java.util.ArrayList;

public class LibraryRunner
{
  public static void main(String[] arg)
  {
    String authorToFind = "L. Frank Baum";
        for (Book book : childrensBooks) {
            if (book.getAuthor().equals(authorToFind)) {
                System.out.println(book.getTitle());
            }
        }

        
        String bookToFind = "The Wonderful Wizard of Oz";
        double minimumRating = 0.0;
        for (Book book : childrensBooks) {
            if (book.getTitle().equals(bookToFind)) {
                minimumRating = book.getRating();
                break; 
            }
        }
        System.out.println("Minimum rating: " + minimumRating); 

     
        System.out.println("\nBooks with rating >= " + minimumRating + ":");
        for (int i = 0; i < childrensBooks.size(); i++) {
            Book book = childrensBooks.get(i);
            if (book.getRating() >= minimumRating) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        
        }
    }
}


