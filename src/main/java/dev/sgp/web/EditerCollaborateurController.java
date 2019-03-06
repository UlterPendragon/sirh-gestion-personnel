package dev.sgp.web;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

public class EditerCollaborateurController extends HttpServlet {
	
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;
			
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException, IOException {

		// recupere la valeur d'un parametre dont le nom collaborateurs/editer
		req.getRequestDispatcher("/WEB-INF/views/collab/newCollaborateurForm.jsp").forward(req, resp);
		}
		
	
	
	public void doPost(HttpServletRequest req, HttpServletResponse rep)	throws ServletException, IOException {
			// phase de traitement des requêtes POST
		
		String paramNom = req.getParameter("nom");
		String paramPrenom = req.getParameter("prenom");
		String paramBirthDate = req.getParameter("birthdate");
		String paramAdresse = req.getParameter("adresse");
		String paramNumSecuSociale = req.getParameter("numSecuSociale");
		
			rep.setContentType("text/html");
			rep.getWriter().write("<h1>Creation d’un collaborateur avec les informations suivantes :</h1>"
			+ " Nom = "  + paramNom 
			+ " Prénom = " + paramPrenom
			+ " Date de Naissance = " + paramBirthDate
			+ " Adresse = " + paramAdresse
			+ " Numéro de Sécurité Sociale = " + paramNumSecuSociale);
			
		
			LocalDate dateNaissance = LocalDate.parse(paramBirthDate);
			
			String emailPro = (paramNom + paramPrenom + "@societe.com");
			
			String initialePrenom = paramPrenom.substring(0,1);
			String initialeNom = paramNom.substring(0,1);
			String matricule = (initialePrenom + initialeNom + paramBirthDate );
			
			Instant maintenant = Instant.now();
			LocalDateTime maintenantIci = LocalDateTime.ofInstant(maintenant, ZoneId.systemDefault());
			ZonedDateTime dateHeure = maintenant.atZone(ZoneId.of("Europe/Paris"));
			
			String photo = "http://placekitten.com/200/200";
					 
			
			Collaborateur creationCollaborateur = new Collaborateur(matricule, paramNom, paramPrenom, dateNaissance, paramAdresse,
			paramNumSecuSociale, emailPro, photo, dateHeure, true);
			
			collabService.sauvegarderCollaborateur(creationCollaborateur);
			
			rep.sendRedirect("/sgp/collaborateurs/lister");
		}	
		
	}	


	
