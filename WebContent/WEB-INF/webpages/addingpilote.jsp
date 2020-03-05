<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>add a fly or a pilote</title>
	<style><%@ include file="bootstrap.min.css" %></style>
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
<form action="/HibernateVolPilote/addp" method="post">
<h1>Add a pilote here</h1>
  <div class="form-group">
    <label>Pilote Lastname</label>
    <input type="text" class="form-control" name="nom" id="pilotenom" aria-describedby="emailHelp" placeholder="Enter lastname">
  </div>
  <div class="form-group">
    <label>Pilote Firstname</label>
    <input type="text" class="form-control" name="prenom" id="piloteprenom" placeholder="Enter Firstname">
  </div>
  <div class="form-group">
    <label>Pilote phone number</label>
    <input type="number" class="form-control" name="phone" id="pilotephone" placeholder="Enter a phone number">
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>

</body>
</html>