import java.io.IOException;
import java.net.URI;
import java.util.*;

class Handler implements URLHandler {
    ArrayList<String> entries = new ArrayList();

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            if (entries.size() == 0) {
                return String.format("Enter list items!");
            }
            else {
                // ugly out, format in this block later
                return entries.toString();
            }
        }
        else {
            if (url.getPath().contains("/add")) {
                String[] para = url.getQuery().split("=");
                if ()
            }
        }
        return "404: Invalid Request";
    }
}

public class SearchEngine {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("missing port number");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
