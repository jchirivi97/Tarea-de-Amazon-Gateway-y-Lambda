package edu.escuelaing.arem;


import static spark.Spark.get;
import static spark.Spark.port;

import edu.escuelaing.arem.services.MathServices;
import spark.Request;
import spark.Response;

public class App 
{
	
	private static MathServices math;
	
    public static void main( String[] args )
    {
    	port(8080);
        get("/", (req, res) -> principal(req, res));
        get("/resultado", (req, res) -> resultado(req,res));
    }
    
    
    private static String principal(Request req,Response res) {
    	 String principal 
    	 = "<!DOCTYPE html>"
 		        + "<html>"
 		        + "<body>"
 		        + "<h2>SQUARE</h2>"
 		        + "<form action=\"/resultado\" >"
 		        + "  Numero a calcular:<br>"
 		        + "  <input type=\"text\" name=\"numero\">"
 		        + "  </br>"
 		        + "  <br></br>"
 		        + "  <input type=\"submit\" value=\"calcular\">"
 		        + "	 </form>"
 		        + "  <br></br>"
 		        + "  <br></br>"
 		        + "</body>"
 		        + "</html>";
    	 
    	 return principal;
    	
    	
    }
    
    
    private static String resultado(Request req,Response res) {
    	
    	int numero = Integer.parseInt(req.queryParams("numero"));
    	

    	
    	numero = math.square(numero);
    	
    	String resultado 
   	 = "<!DOCTYPE html>"
		        + "<html>"
		        + "<body>"
		        + "<h2>SQUARE</h2>"
		        + "<h3>Resultado: </h3>"
		        + " <p>" + numero + "</p>"
		        + "  <br></br>"
		        + "</body>"
		        + "</html>";
    	
    	return resultado;	
    	
    }
    
    
}
