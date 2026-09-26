import java.net.*;

class URLResourceInfo {
    public static void main(String[] args) {
        try {
            URL url = URI.create("https://example.com").toURL();

            System.out.println("Protocol:  " + url.getProtocol()); 
            System.out.println("Host Name: " + url.getHost());     
            System.out.println("Port:      " + url.getPort());     
            System.out.println("File Path: " + url.getPath());     
            System.out.println("Query:     " + url.getQuery());    
            System.out.println("Reference: " + url.getRef());      

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
