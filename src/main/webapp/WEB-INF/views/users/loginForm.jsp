<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="../layout/header.jsp"%>

<div class="container">
	<form action="/join" method="post">
		<div class="mb-3 mt-3">
			username : <input type="text" class="form-control" placeholder="Enter username" name="username">
		</div>
		<div class="mb-3">
			password : <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="password">
		</div>
		<button type="submit" class="btn btn-primary">로그인</button>
	</form>
</div>

<%@ include file="../layout/footer.jsp"%>