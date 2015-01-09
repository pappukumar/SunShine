package app.com.example.android.sunshine;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by apappu_standard on 1/4/15.
 */
public class WeatherDataParser {
    /**
     * Given a string of the form returned by the api call:
     * http://api.openweathermap.org/data/2.5/forecast/daily?q=94043&mode=json&units=metric&cnt=7
     * retrieve the maximum temperature for the day indicated by dayIndex
     * (Note: 0-indexed, so 0 would refer to the first day).
     */
    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex)
            throws JSONException {
        JSONObject jsonObj  = new JSONObject(weatherJsonStr);


        // TODO: add parsing code here
        return -1;
    }

}
