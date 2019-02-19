

public class WeatherConditionals
{
    public static String getWeatherAdvice(int temperature, String description)
    {
        boolean windy = false;
        if(description.equals(null) || description.length() == 0 || description.length() > 80)
        {
            return "invalid input";
        }
        if(description.equals("windy")&& temperature < 30)
        {
            return "Too windy or cold! Enjoy watching the weather through the window.";
        }
        else if(description.contains("snow"))
        {
            return "Too cold! Enjoy watching the weather through the window.";
        }
        else if(!(temperature<100))
        {
            return "Too Hot!";
        }
        else if(description.contains("snow") && temperature>100)
        {
            return "Not Possible";
        }
        else if(description.contains("freezing") && description.contains("cloudy"))
        {
            return "Don't go outside";
        }
        else
        {
            return temperature + " degrees and a " + description;
        }
    }
}
