
<%@page import="java.util.List"%>
<%@page import="dev.sgp.entite.*" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>SGP - App</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-4.3.1-dist/css/bootstrap.css">
</head>

<body>
	<h1>Les collaborateurs</h1>
	
<ul>
<%
	List<Collaborateur> listeCollaborateurs = (List<Collaborateur>) request.getAttribute("toutMesCollaborateurs");
	for (Collaborateur monCollaborateur : listeCollaborateurs) {
%>


<img src="<%=monCollaborateur.getPhoto()%>"/>
<li><%=monCollaborateur.getMatricule()%></li>
<li><%=monCollaborateur.getNom()%></li>
<li><%=monCollaborateur.getPrenom()%></li>
<li><%=monCollaborateur.getMailPro()%></li>
<li><%=monCollaborateur.getBirthDate()%></li>
<li><%=monCollaborateur.getAdresse()%></li>
<li><%=monCollaborateur.getNumSecuSociale()%></li>
<li><%=monCollaborateur.getHeureCreation()%></li>


<%
	}
%>
</ul>

</body>
</html>