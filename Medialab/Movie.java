
/**
 * Write a description of class Movie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Movie
{
   private int x;
    private String title;
    public Movie()
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
