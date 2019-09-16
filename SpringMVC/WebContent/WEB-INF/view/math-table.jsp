<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<h1>Math table demo</h1>
	<form>
		<label>
			<input type="text" name="num"/>
			<br/>
			<button type="submit">Submit</button>
		</label>
	</form>
	
	<br/>
	
	<%
		String num= request.getParameter("num");
		if(num!=null){
			num = num.trim();
			if(num.length()>0){
		int n = Integer.parseInt(num);
		if(n!=0){%>
			<h3>Math table of <%=n %></h3>
			<%
			for(int i=1; i<=10; ++i){ %>
				<%= n %> * <%= i %> = <%=n*i %>
				<br/>
		<%}
		}
		}
		}
	%>

</body>
</html>