
/**
 * Write a description of class Book here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Book
{
     private int x;
    private String title;
    public Book()
    {
        // initialise instance variables
        x = 0;
        title = "";
    }
    public String getTitle()
   {
       return title;
   }
    public void setTitle(String arg)
    {
        title = arg;
    }
    public int getRating()
   {
       return x;
   }
    public void setRating(int arg)
    {
        x = arg;
    }
}
