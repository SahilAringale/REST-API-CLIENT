import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class WeatherApp {
    private static final String API_KEY = "https://api.open-meteo.com/v1/forecast?latitude=19.0728&longitude=72.8826&hourly=temperature_2m,relative_humidity_2m,wind_speed_10m"; // Replace with your OpenWeatherMap API key
    private static final String API_URL = "http://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s&units=metric";

    public static void main(String[] args) {
        
        String city = "Mumbai"; 

        try {
          
            String jsonResponse = getWeatherData(city);
            
        
            parseAndDisplayWeatherData(jsonResponse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    public static String getWeatherData(String city) throws Exception {
        String urlString = String.format(API_URL, city, API_KEY);
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        
      
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();
        
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        return response.toString(); 
    }

    
    public static void parseAndDisplayWeatherData(String jsonResponse) {
        try {
           
            JSONObject jsonObject = new JSONObject(jsonResponse);

            
            String cityName = jsonObject.getString("name");
            JSONObject main = jsonObject.getJSONObject("main");
            double temperature = main.getDouble("temp");
            double humidity = main.getDouble("humidity");

            
            JSONObject weather = jsonObject.getJSONArray("weather").getJSONObject(0);
            String description = weather.getString("description");

           
            System.out.println("Weather in " + cityName + ":");
            System.out.println("Temperature: " + temperature + "°C");
            System.out.println("Humidity: " + humidity + "%");
            System.out.println("Description: " + description);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
