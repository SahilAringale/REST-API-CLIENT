# REST-API-CLIENT

COMPANY: CODTECH IT SOLUTIONS

NAME: SAHIL ARINGALE

INTERN ID: CODHC179

DOMAIN: JAVA PROGRAMMING

DURATION: 4 WEEKS

MENTOR: NEELA SANTOSH


This Java application demonstrates how to consume a public REST API (OpenWeatherMap) to fetch real-time weather data and display it in a structured format. The application handles HTTP requests and parses the JSON responses to present the data in a user-friendly manner.

### Features:
- **HTTP Requests**: The application sends HTTP GET requests to the OpenWeatherMap API to retrieve weather information based on a specified city.
- **JSON Parsing**: The response from the API is in JSON format, which is parsed using the `org.json` library to extract key weather data such as temperature, humidity, pressure, and weather description.
- **Structured Output**: The extracted data is displayed in a clean, structured format, making it easy to read and interpret.

### How It Works:
1. **Making HTTP Requests**: The application uses `HttpURLConnection` to send GET requests to the OpenWeatherMap API, passing parameters such as the city name and API key.
2. **Parsing JSON Response**: The JSON response returned by the API is parsed using the `org.json` library to extract relevant weather data, including:
   - Temperature
   - Humidity
   - Pressure
   - Weather description (e.g., clear sky, light rain)
3. **Displaying Data**: The extracted data is then displayed in a structured format, providing users with a clear view of the current weather for the requested city.

### Instructions:
1. **Clone the repository**:
   ```
   git clone https://github.com/your-username/weather-api-client.git
   ```
2. **Obtain an API Key**: Sign up at [OpenWeatherMap](https://openweathermap.org/api) to get your free API key.
3. **Set up the project**:
   - Replace the placeholder `"your_api_key"` in the `WeatherApp.java` file with your actual API key.
4. **Compile and run**:
   - Use the following commands to compile and run the program:
     ```
     javac WeatherApp.java
     java WeatherApp
     ```

### Example Output:
Upon running the program, the following output will be displayed:
```
Weather Data for Mumbai:
Temperature: 30.2°C
Humidity: 85%
Pressure: 1010 hPa
Weather Description: light rain
```

#OUTPUT: ![Image](https://github.com/user-attachments/assets/3d6fc4a6-1850-4c8f-8390-34bdd78708d3)
