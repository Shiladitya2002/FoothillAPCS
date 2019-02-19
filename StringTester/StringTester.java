

public class StringTester
{
   public static void main(String[] args)
   {
       String weatherCondition = "fair (day)";
       System.out.println(weatherCondition.substring(0,5));
       System.out.println(WeatherConditionals.getWeatherAdvice(32, "heavy snow"));
    }
}
