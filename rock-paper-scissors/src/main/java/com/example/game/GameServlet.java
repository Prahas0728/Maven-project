package com.example.game;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/play")

public class GameServlet extends HttpServlet {

    static int playerScore = 0;
    static int computerScore = 0;

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)

            throws ServletException, IOException {

        String userChoice = request.getParameter("choice");

        String[] options = {"Rock", "Paper", "Scissors"};

        Random random = new Random();

        String computerChoice =
                options[random.nextInt(3)];

        String result;

        if(userChoice.equals(computerChoice)) {

            result = "Match Draw!";

        }

        else if(
                (userChoice.equals("Rock")
                        && computerChoice.equals("Scissors"))

                        ||

                        (userChoice.equals("Paper")
                                && computerChoice.equals("Rock"))

                        ||

                        (userChoice.equals("Scissors")
                                && computerChoice.equals("Paper"))
        ) {

            result = "You Win!";
            playerScore++;

        }

        else {

            result = "Computer Wins!";
            computerScore++;

        }

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Game Result</title>");

        out.println("<style>");

        out.println("body{margin:0;padding:0;font-family:Arial;background:linear-gradient(135deg,#141e30,#243b55);color:white;height:100vh;display:flex;justify-content:center;align-items:center;}");

        out.println(".container{background:#1f2937;padding:40px;border-radius:20px;text-align:center;width:500px;box-shadow:0 0 20px rgba(0,0,0,0.5);}");

        out.println(".result{background:#374151;padding:20px;border-radius:15px;margin-top:20px;}");

        out.println(".scoreboard{display:flex;justify-content:space-around;margin-top:30px;font-size:20px;}");

        out.println("a{display:inline-block;margin-top:30px;padding:15px 25px;background:#2563eb;color:white;text-decoration:none;border-radius:10px;}");

        out.println("</style>");

        out.println("</head>");
        out.println("<body>");

        out.println("<div class='container'>");

        out.println("<h1>Rock Paper Scissors</h1>");

        out.println("<div class='result'>");

        out.println("<h2>Your Choice: " + userChoice + "</h2>");

        out.println("<h2>Computer Choice: " + computerChoice + "</h2>");

        out.println("<h1>" + result + "</h1>");

        out.println("</div>");

        out.println("<div class='scoreboard'>");

        out.println("<div>");
        out.println("Player");
        out.println("<br>");
        out.println(playerScore);
        out.println("</div>");

        out.println("<div>");
        out.println("Computer");
        out.println("<br>");
        out.println(computerScore);
        out.println("</div>");

        out.println("</div>");

        out.println("<a href='index.jsp'>Play Again</a>");

        out.println("</div>");

        out.println("</body>");
        out.println("</html>");
    }
}
