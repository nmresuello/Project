//Nikkie Marie Resuello
// CHOOSE4CARDSSERVLET ACTIVITY
// OCTOBER 17, 2013
package labActivity;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletP2
 */
@WebServlet("/Choose4CardsServlet")
public class Choose4CardsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Choose4CardsServlet() {
        super();
        // TODO Auto-generated constructor stub
     
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		   PrintWriter out= response.getWriter();
		   out.println("<html><body><h1>Choose 4 Crads Servlet </h1>");
		   out.println("<form>");
		   
		   
		   out.println("Select once card for each suit: <br>");
		   out.println("Select card1: <br>");
		   out.println("<input type=radio name=card1 value=1>" 
				   + "<img src='images/clubA.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card1 value=2>" 
				   + "<img src='images/club2.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card1 value=3>" 
				   + "<img src='images/club3.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card1 value=4>" 
				   + "<img src='images/club4.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card1 value=5>" 
				   + "<img src='images/club5.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card1 value=6>" 
				   + "<img src='images/club6.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card1 value=7>" 
				   + "<img src='images/club7.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card1 value=8>" 
				   + "<img src='images/club8.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card1 value=9>" 
				   + "<img src='images/club9.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card1 value=10>" 
				   + "<img src='images/club10.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card1 value=jack>" 
				   + "<img src='images/clubJ.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card1 value=queen>" 
				   + "<img src='images/clubQ.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card1 value=king>" 
				   + "<img src='images/clubK.png' width=66 height=74></input><br>");
		   out.println("</form>");
		   
		   
		   out.println("<form>");
		   out.println("Select card2: <br>");
		   out.println("<input type=radio name=card2 value=1>" + "<img src='images/diamondA.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card2 value=2>" + "<img src='images/diamond2.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card2 value=3>" + "<img src='images/diamond3.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card2 value=4>" + "<img src='images/diamond4.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card2 value=5>" + "<img src='images/diamond5.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card2 value=6>" + "<img src='images/diamond6.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card2 value=7>" + "<img src='images/diamond7.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card2 value=8>" + "<img src='images/diamond8.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card2 value=9>" + "<img src='images/diamond9.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card2 value=10>" + "<img src='images/diamond10.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card2 value=jack>" + "<img src='images/diamondJ.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card2 value=queen>" + "<img src='images/diamondQ.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card2 value=king>" + "<img src='images/diamondK.png' width=66 height=74></input><br>");
		   out.println("</form>");
		   
		   
		   out.println("<form>");
		   out.println("Select card2: <br>");
		   out.println("<input type=radio name=card3 value=1>" 
				   + "<img src='images/heartA.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card3 value=2>" 
				   + "<img src='images/heart2.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card3 value=3>" 
				   + "<img src='images/heart3.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card3 value=4>" 
				   + "<img src='images/heart4.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card3 value=5>" 
				   + "<img src='images/heart5.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card3 value=6>" 
				   + "<img src='images/heart6.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card3 value=7>" 
				   + "<img src='images/heart7.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card3 value=8>" 
				   + "<img src='images/heart8.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card3 value=9>" 
				   + "<img src='images/heart9.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card3 value=10>" 
				   + "<img src='images/heart10.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card3 value=jack>" 
				   + "<img src='images/heartJ.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card3 value=queen>" 
				   + "<img src='images/heartQ.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card3 value=king>" 
				   + "<img src='images/heartK.png' width=66 height=74></input><br>");
		   out.println("</form>");

		   
		   
		   out.println("<form>");
		   out.println("Select card2: <br>");
		   out.println("<input type=radio name=card4 value=1>" 
				   + "<img src='images/spadeA.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card4 value=2>" 
				   + "<img src='images/spade2.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card4 value=3>" 
				   + "<img src='images/spade3.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card4 value=4>" 
				   + "<img src='images/spade4.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card4 value=5>" 
				   + "<img src='images/spade5.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card4 value=6>" 
				   + "<img src='images/spade6.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card4 value=7>" 
				   + "<img src='images/spade7.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card4 value=8>" 
				   + "<img src='images/spade8.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card4 value=9>" 
				   + "<img src='images/spade9.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card4 value=10>" 
				   + "<img src='images/spade10.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card4 value=jack>" 
				   + "<img src='images/spadeJ.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card4 value=queen>" 
				   + "<img src='images/spadeQ.png' width=66 height=74></input>");
		   out.println("<input type=radio name=card4 value=king>"
				   + "<img src='images/spadeK.png' width=66 height=74></input><br>");
		   out.println("</form>");
		   
		   
		   out.println("<form>");
		   out.println("<input type=submit value=SUBMIT>");
		   out.println("</form>");
		   
		   		String vcard1 [] = request.getParameterValues("card1");
		   		if (vcard1 == null){
		   			out.println("<br>Pls. select card1. <br>");	
		   		}
		   		else {
		   			out.println("Card is:" +"1.)" +vcard1+"<br>");
		   		}

		   		String vcard2 [] = request.getParameterValues("card2");
		   		if (vcard2 == null){
		   			out.println("<br>Pls. select card2. <br>");	
		   		}
		   		else {
		   			out.println("Card is:" +"2.)" +vcard2+"<br>");
		   		}
		   		
		   		
		   		String vcard3 [] = request.getParameterValues("card3");
		   		if (vcard3 == null){
		   			out.println("<br>Pls. select card3. <br>");	
		   		}
		   		else {
		   			out.println("Card is:" +"3.)" +vcard3+"<br>");
		   		
		   		}
		   		
		   		
		   		String vcard4 [] = request.getParameterValues("card4");
		   		if (vcard3 == null){
		   			out.println("<br>Pls. select card4. <br>");	
		   		}
		   		else {
		   			out.println("Card is:" +"4.)" +vcard4+"<br>");
		   		}
		   		
		  
		   		
		   		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
