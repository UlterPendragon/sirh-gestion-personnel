package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateurController extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException, IOException {

		// recupere la valeur d'un parametre dont le nom collaborateurs/editer
		String paramMatricule = req.getParameter("matricule");
		if (paramMatricule == null){
			resp.sendError(400, "Un matricule est attendu");
		} else {
			resp.setContentType("text/html");

			// code HTML ecrit dans le corps de la reponse
			resp.getWriter().write("<h1>Edition de collaborateur</h1>" + "Matricule = "  + paramMatricule);		
		}
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse rep)	throws ServletException, IOException {
			// phase de traitement des requêtes POST
		
		String paramMatricule = req.getParameter("matricule");
		String paramTitre = req.getParameter("titre");
		String paramNom = req.getParameter("nom");
		String paramPrenom = req.getParameter("prenom");
		if (paramMatricule == null || paramTitre == null || paramNom == null || paramPrenom == null){
			rep.sendError(400, "Les paramètres suivants sont incorrects : ");
		} else {
			rep.setContentType("text/html");
			rep.getWriter().write("<h1>Creation d’un collaborateur avec les informations suivantes :</h1>"
			+ "Matricule = "  + paramMatricule 
			+ " Titre = " + paramTitre
			+ " Nom = " + paramNom
			+ " Prénom = " + paramPrenom);	
			
		}
	}
}