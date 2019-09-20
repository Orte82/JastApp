package com.orte.buchankajava.networking.urluri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Example4 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.flickr.com/photos/cubagallery/5508784414/");
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            connection.setRequestMethod("GET");// default GET call
            connection.setRequestProperty("User-Agent", "Chrome");
            connection.setReadTimeout(15000);

            int responseCode = connection.getResponseCode();
            System.out.println("Response code " + responseCode);

            if (responseCode != 200) {
                System.out.println("Error reading web page");
                System.out.println(connection.getResponseMessage());
                return;
            }
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line = "";
            while ((line = reader.readLine())!=null) {

                System.out.println(line);
            }
            reader.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
