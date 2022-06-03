<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="https://www.thymeleaf.org">
	<head>
		<title>Please Log In</title>
	</head>
	<body>
		<h1>Please Log In</h1>
		<div th:if="${param.error}">
			Invalid username and password.</div>
		<div th:if="${param.logout}">
			You have been logged out.</div>
		<form th:action="@{/login}" method="post">
			<div>
			<input type="text" name="username" placeholder="username"/>
			</div>
			<div>
			<input type="password" name="password" placeholder="password"/>
			</div>
			<input type="submit" value="Log in" />
			<div>
			Remember me:<input type="checkbox" name="remember me">
			</div>
		</form>
	</body>
</html>