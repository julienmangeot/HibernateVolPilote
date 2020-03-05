<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>add a fly</title>
	<style><%@ include file="bootstrap.min.css" %></style>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="/HibernateVolPilote/home">Home page</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="/HibernateVolPilote/addp">Add a pilote <span class="sr-only">(current)</span></a>
      </li>
        <li class="nav-item active">
        <a class="nav-link" href="/HibernateVolPilote/addv">Add a fly <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/HibernateVolPilote/showp">Show Pilote<span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/HibernateVolPilote/showv">Show Fly<span class="sr-only">(current)</span></a>
      </li>

    </ul>
  </div>
</nav>
<form action="/HibernateVolPilote/addv" method="post">
<h1>Add a fly here</h1>
  <div class="form-group">
    <label>Fly Date</label>
    <input type="text" class="form-control" name="date" id="flydate" placeholder="Enter a date">
  </div>
  <div class="form-group">
    <label>Fly Pilote</label>
    <select class="form-control" name="pilotefly" id="flypilote">
    	<c:forEach items="${listing}" var="l">
      		<option value="${l.idPilote}"> ${l.nomPilote} </option>
      	</c:forEach>
    </select>
  </div>
 <div>
<button type="submit" class="btn btn-primary">Submit</button>
</div>
</form> 
</body>
</html>