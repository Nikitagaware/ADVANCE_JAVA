//Accept emp name from user & delete the record.
<%@page language="java"%>
<%@page import="java.sql.*" %>
<html>
<body>
   <form method="post" action="delete1.jsp">
   Enter emp name to delete the record:
   <input type="text" name="t1"><br>
   <input type="submit" value="Delete">
   </form>
</body>
</html>