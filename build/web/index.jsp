<%-- 
    Document   : index
    Created on : 2017.02.12., 12:27:38
    Author     : Kaczur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="lotto" class="lotto.LottoBean"/>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ötöslottó szelvény</title>
  </head>
  <body>
    <h1>Ötöslottó szelvény</h1>
    <p> <%= lotto.getLotto() %> </p>
    <p> <%
      for (int i = 1; i <= 5; i++) { %>
        <p> <%= lotto.getLotto() %> </p>
      <% }
    %></p>
  </body>
</html>
