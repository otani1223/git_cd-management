<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CD登録画面</title>
</head>
<body>
<% 
		String error = request.getParameter("error");
		if(error != null){
			
	%>
		<p style="color:red">図書の登録に失敗しました。</p>
		<h3>CD登録</h3>
		<form action="RegisterCdExecuteServlet" method="post">
			CD名：<input type="text" name="name" value="<%=request.getParameter("name") %>"><br>
			アーティスト：<input type="text" name="art" value="<%=request.getParameter("art") %>"><br>
			値段：<input type="text" name="price" value="<%=request.getParameter("price") %>"><br>
				  <input type="submit" value="登録">
		</form>
	<%	
		} else {
	%>
	<h3>CD登録</h3>
	<form action="RegisterCdExecuteServlet" method="post">
			CD名：<input type="text" name="name"><br>
			アーティスト：<input type="text" name="art"><br>
			値段：<input type="text" name="price"><br>
				  <input type="submit" value="登録">
	
	</form>
	<% } %>
</body>
</html>