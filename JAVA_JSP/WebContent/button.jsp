/*Design an Html Page Containing option buttons(maths,physics,chemistry &)
Biology)& buttons submit & reset.when the user clicks submit,the server
responds by adding a cookie containing  the selected subject & sends a 
message back to the client program should not allow duplicate cookies
to be written
*/
<%@page langhuage="java" %>
<%@page import="java.sql.*" %>
<html>
<body>
<form method="post" action="newfile.jsp">
  <input type="checkbox" value="java" name="c1">Java<br>
  <input type="checkbox" value="php" name="c2">Php<br>
  <input type="checkbox" value="python" name="c3">Python<br>
  <input type="checkbox" value="jsp" name="c4">jsp<br>
  <input type="submit" value="add Cookie">
</form>
</body>
</html>
