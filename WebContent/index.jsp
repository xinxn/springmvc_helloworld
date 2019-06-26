<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<a href="${pageContext.request.contextPath }/testMethod">testMethod</a> <br>
	
	<a href="${pageContext.request.contextPath }/testParams?email=123&tel=110">testParams</a> <br>
	
	<a href="${pageContext.request.contextPath }/testHeaders">testHeaders</a>  <br>

	<a href="${pageContext.request.contextPath }/testAnt/ab/dc/a">testAnt</a>  <br>

	<a href="${pageContext.request.contextPath }/testPathVar/110110/hello/114114">testPathVar</a>  <br>

	<fieldset>
		testPost:<form action="${pageContext.request.contextPath }/testPost" method="post">
			<input type="submit" value="post_commit">
		</form>
		<hr>
		
		testDelete:<form action="${pageContext.request.contextPath }/testDelete" method="post">
			<input type="hidden" name="_method" value="DELETE"> 
			<input type="submit" value="delete_commit">
		</form>
		<hr>
		
		testPut:<form action="${pageContext.request.contextPath }/testPut" method="post">
			<input type="hidden" name="_method" value="put"> 
			<input type="submit" value="put_commit">
		</form>
		<hr>
		
		<a href="${pageContext.request.contextPath }/testGet">testGet</a>
	</fieldset>

	<a href="${pageContext.request.contextPath }/testReqParam?password=123123&hobby=ppq&hobby=ymq&hobby=bbq">testReqParam</a>  <br>

	
	<a href="${pageContext.request.contextPath }/testHeader">testHeader</a>  <br>

	<a href="${pageContext.request.contextPath }/testCookie">testCookie</a>  <br>

	
	<form action="${pageContext.request.contextPath }/testPOJO" method="post">
	
			<input type="text" name="username1"><br>
			<input type="password" name="password1"> <br>
			<input type="submit" value="/testPOJO">
	</form> <br>
	
	<a href="${pageContext.request.contextPath }/testNativeAPI">testNativeAPI</a>  <br>

	

</body>
</html>