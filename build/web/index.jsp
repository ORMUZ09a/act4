<%-- 
    Document   : index
    Created on : 27/02/2021, 06:47:38 PM
    Author     : jmmm9_000
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="controller.muestraOperacion" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Cookie ck[]=request.getCookies();
            if(ck!=null)
            {
                for(int i=0; i<ck.length; i++)
                {
                    if(ck[i].getName().equals("name"))
                    {
                        out.print("<h2> Tu nombre es: " +ck[i].getValue()+" ");
                    }
                    if(ck[i].getClass().equals("area"))
                    {
                        out.print("<h2> el area anterior es igual a  " +ck[i].getValue());
                    }
                    if(ck[i].getClass().equals("perimetro"))
                    {
                        out.print("<h2> el perimetro anterior es igual a  " +ck[i].getValue());
                    }
                 }
            }
            %>
          <h3>Triangulo</h3>
       <form action="muestraOperacion" method="post">
           <div>
                <label>Name:</label>
                <input type="Text" name="name">
            </div> 
           <div>
                <label>Base:</label>
                <input type="number" name="base">
            </div>
           <div>
               <label>Altura: </label>
               <input type="number" name="altura">
           </div>
           <button>
               Calcular
           </button>
       </form>
    </body>
</html>
