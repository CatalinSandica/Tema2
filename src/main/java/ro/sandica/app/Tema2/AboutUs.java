package ro.sandica.app.Tema2;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
@SuppressWarnings("restriction")
public class AboutUs implements HttpHandler {
	public void handle(HttpExchange exchange) throws IOException {
		Home home = new Home();
		
		URI uri = exchange.getRequestURI();
		String response = "<html><head><title>About</title>"
				+ "<style>"
				+ "body {margin: 0 auto;}"
				+ "ul li {display:inline;list-type:none;padding:3px 10px;}"
				+ "h1 {text-align:center}"
				+ "</style>"
				+ "</head>"
				+ "<ul>"
				+ "<li><a href=\"http://localhost:8001/\">Log out</a></li>"
				+ "<li><a href=\"http://localhost:8001/home\\\">Home</a></li>"
				+ "<li><a href=\"http://localhost:8001/products\">Products</a></li>"
				+ "<li><a href=\"http://localhost:8001/services\">Services</a></li>"
				+ "<li><a href=\"http://localhost:8001/prices\">Prices</a></li>"
				+ "<li><a href=\"http://localhost:8001/contact\">Contact</a></li>"
				+ "</ul>"
				+ "<h1>Welcome to About Us page, "
				+ " "+ home.fName + " " + home.lName
				+ "</h1>"
				+ "<body></html>";
        exchange.sendResponseHeaders(200, response.getBytes().length);
        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}
