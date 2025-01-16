//Accept table name from user & disp info in tabular format
<%@page language="java"%>
<%@page import="java.sql.*"%>
<html>
<body>
  <form method="post" action="display1.jsp">
  Enter Table Name:
  <input type="text" name="t1"><br>
  <input type="submit" value="show">
  </form>
</body>
</html>