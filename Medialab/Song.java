
/**
 * Write a description of class Song here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Song
{
    private int x;
    private String title;
    public Song()
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
