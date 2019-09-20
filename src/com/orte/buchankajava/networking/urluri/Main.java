package com.orte.buchankajava.networking.urluri;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {

        try {
           // URI uri = new URI("http://username:password@myserver.com:5000/catalog?os=android#samsung");
            URI baseUri = new URI("http://username:password@myserver.com:5000");
            URI uri1 = new URI("/catalog/phones?os=android#samsung");
            URI uri2 = new URI("/catalog/tvs?manufacturer=samsung");
            URI uri3 = new URI("/stores/locations?zip=12345");
            URI resolvedURI1 = baseUri.resolve(uri1);
            URI resolvedURI2 = baseUri.resolve(uri2);
            URI resolvedURI3 = baseUri.resolve(uri3);

            URL url1 = null;
            URL url2 = null;
            URL url3 = null;
            try {
                url1 = resolvedURI1.toURL();
                url2 = resolvedURI2.toURL();
                url3 = resolvedURI3.toURL();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            System.out.println("Url1 = " + url1);
            System.out.println("Url2 = " + url2);
            System.out.println("Url3 = " + url3);

            URI relativizedURI = baseUri.relativize(resolvedURI2);
            System.out.println("Relative URI = " + relativizedURI);

            //URI uri = new URI("hello");
//            System.out.println("Scheme = " + uri.getScheme());
//            System.out.println("Scheme-specific part= " + uri.getSchemeSpecificPart());
//            System.out.println("Authority= " + uri.getAuthority());
//            System.out.println("User info= " + uri.getUserInfo());
//            System.out.println("Host = " + uri.getHost());
//            System.out.println("Port = " + uri.getPort());
//            System.out.println("Path = " + uri.getPath());
//            System.out.println("Query = " + uri.getQuery());
//            System.out.println("Fragment = " + uri.getFragment());

        } catch (URISyntaxException e) {
            System.out.println("uri bad syntax " + e.getMessage());
        }
    }
}
