package ro.sandica.app.Tema2;


import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
@SuppressWarnings("restriction")
public class Login implements HttpHandler{
	
	
     public void handle(HttpExchange t) throws IOException {
     
         String response = "<html><title>Login</title><body><h1>Login</h1>"
         		+ "<br><br>"
         		+ "<form action=\"http://localhost:8001/home\">"
         		+ "First name: <input type=\"text\" name=\"fname\"><br><br>"
         		+ "Last name: <input type=\"text\" name=\"lname\"><br>"
         		+ "<input type=\"submit\" value=\"Submit\">"
         		+ "</form>"
         		+ "<br><br>"
         		
         		+ "</body></html>";
         
         t.sendResponseHeaders(200, response.length());
         OutputStream os = t.getResponseBody();
         os.write(response.getBytes());
         os.close();      
         
     }
	
	
	public Login() {
		super();
	}
}
