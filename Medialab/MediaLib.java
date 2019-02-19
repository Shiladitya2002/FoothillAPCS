
/**
 * Write a description of class MediaLib here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MediaLib
{
   public static void main(String[] args)
   {
      System.out.println("Welcome to Your Media Library"); 
      Song song1 = new Song();
      song1.setTitle("Johnny B. Goode");  
      System.out.println(song1.getTitle());
      Book book1 = new Book();
      book1.setTitle("Johnny B. Goode");  
      System.out.println(book1.getTitle());
      Movie movie1 = new Movie();
      movie1.setTitle("Johnny B. Goode");  
      System.out.println(movie1.getTitle());
   }
}
