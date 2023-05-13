package j18_exceptionHandlingAndDebugging.CheckedException;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class ParseURL {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com/images");
            System.out.println(url.getContent());
            System.out.println(url.getProtocol());
            System.out.println(url.getHost());
            System.out.println(url.getPath());
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
