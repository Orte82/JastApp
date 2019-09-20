package com.orte.buchankajava.networking.urluri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class Example2 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.org");
            URLConnection urlConnection = url.openConnection();
            urlConnection.setDoOutput(true);
            urlConnection.connect();
            BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));


            Map<String, List<String >> headerFields = urlConnection.getHeaderFields();
            for(Map.Entry<String, List<String>> entry:headerFields.entrySet()){
                String key = entry.getKey();
                List<String> value = entry.getValue();
                System.out.println("----key = " + key);
                for (String string: value){
                    System.out.println("value = " + value);
                }
            }

            //BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
//            String line ="";
//            while (line != null){
//                line = reader.readLine();
//                System.out.println(line);
//            }
//            reader.close();
//            URI uri = url.toURI();
//
//            System.out.println("Scheme = " + uri.getScheme());
//            System.out.println("Scheme-specific part= " + uri.getSchemeSpecificPart());
//            System.out.println("Authority= " + uri.getAuthority());
//            System.out.println("User info= " + uri.getUserInfo());
//            System.out.println("Host = " + uri.getHost());
//            System.out.println("Port = " + uri.getPort());
//            System.out.println("Path = " + uri.getPath());
//            System.out.println("Query = " + uri.getQuery());
//            System.out.println("Fragment = " + uri.getFragment());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
