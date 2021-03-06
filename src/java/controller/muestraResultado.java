package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.TrianguloEquilatero;

@WebServlet(name = "muestraResultado", urlPatterns = {"/muestraResultado"})
public class muestraResultado extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
              double base = Double.parseDouble(request.getParameter("base"));
              double altura = Double.parseDouble(request.getParameter("altura"));
            TrianguloEquilatero trianguloEquilatero = new TrianguloEquilatero(base,altura);
           
           request.setAttribute("TrianguloEquilatero", trianguloEquilatero);
           request.getRequestDispatcher("/operaciones.jsp").forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}


