package com.orte.buchankajava.networking.urluri;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ApachHTTPExample {
    public static void main(String[] args) {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet request = new HttpGet("http://example.org");
        request.addHeader("User-Agent", "Chrome");
        CloseableHttpResponse response =null    ;
        try {

            response = httpClient.execute(request);
            System.out.println("response code = " + response.getStatusLine().getStatusCode());
            BufferedReader reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            String line = "";
            while ((line = reader.readLine())!=null) {

                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            try {
                response.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
