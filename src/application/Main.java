package application;
	
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			// Conteneur permettant de gérer tous les autres sous-conteneurs
			BorderPane body = new BorderPane();
			
			
			// Bare de navigation
			 HBox navigation = new HBox(10);

	         Button b1 = new Button("HOME");
	         Button b2 = new Button("DEMANDE DE DEVIS");
	         Button b3 = new Button("ÉVALUER TRAVAUX");
	         Button b4 = new Button("EXEMPLES DE DEVIS");
	         Button b5 = new Button("ANNUAIRE DU BATIMENT");
	         Button b6 = new Button("CONSEILS DE PROS");
	         
	         b1.getStyleClass().add("btn-nav");
	         b2.getStyleClass().add("btn-nav");
	         b3.getStyleClass().add("btn-nav");
	         b4.getStyleClass().add("btn-nav");
	         b5.getStyleClass().add("btn-nav");
	         b6.getStyleClass().add("btn-nav");

	         Button b7 = new Button("CONNEXION");
	         b7.setId("connexion");
	         
	         HBox.setMargin(b6, new Insets(0, 200, 0, 0));
	         navigation.getChildren().addAll(b1, b2, b3, b4, b5, b6, b7);
	         
	         // Bande
	         TextField bande = new TextField("DEMANDE DE DEVIS");
	         bande.setEditable(false);
	         bande.setAlignment(Pos.CENTER);
	         bande.setId("bande");
	         
	         // Contenur contenant la barre de navigation et la bande
	         VBox topContainer = new VBox(10, navigation, bande);
	         topContainer.setId("topContainer");
	         body.setTop(topContainer);
	         
	         
	         // Conteneurs contenant le status de la demande
	         HBox categories = new HBox(10);
	         Button b8 = new Button("1 | MES COORDONNÉES ➞");
	         b8.setOnMouseClicked(new EventHandler<MouseEvent>() {
	        	 @Override
	        	 public void handle(MouseEvent event) {
	        		 
	    	         VBox mesCoordonnees = new VBox(10);
	    	         
	        	     Label coordonneesLabel = new Label("Mes coordoonées");
	        	     coordonneesLabel.getStyleClass().add("catLabel");
	    	         Label nomLabel = new Label("Nom *");
	    	         TextField nomInput = new TextField();
	    	         
	    	         Label prenomLabel = new Label("Prénom *");
	    	         TextField prenomInput = new TextField();
	    	         
	    	         Label emailLabel = new Label("Email *");
	    	         TextField emailInput = new TextField();
	    	         
	    	         Label telabel = new Label("Télpéhone *");
	    	         TextField telInput = new TextField();
	    	        
	    	         Label telDeuxLabel = new Label("Deuxième Télpéhone");
	    	         TextField telDeuxInput = new TextField();
	    	         
	    	         Label entrepriseLabel = new Label("Nom de l'entreprise ou de l'établissement publique  ❓");
	    	         TextField entrepriseInput = new TextField();
	    	         Tooltip tooltip = new Tooltip("Si vous représentez une entreprise ou un établissement publique");
	    	         Tooltip.install(entrepriseLabel, tooltip); 
	    	         
	    	         mesCoordonnees.getStyleClass().add("mesCoordonnees");
	    	         
	    	         nomInput.getStyleClass().add("input");
	    	         prenomInput.getStyleClass().add("input");
	    	         emailInput.getStyleClass().add("input");
	    	         telInput.getStyleClass().add("input");
	    	         telDeuxInput.getStyleClass().add("input");
	    	         entrepriseInput.getStyleClass().add("input");

	    	         
	    	         Button suivantButton = new Button("Suivant");
	    	         suivantButton.getStyleClass().add("btn-valider");
	    	         
	    	         HBox buttonContainer = new HBox(suivantButton);
	    	         buttonContainer.setAlignment(Pos.CENTER_RIGHT);
	    	         
	    	         mesCoordonnees.getChildren().addAll(
	    	        		 coordonneesLabel, prenomLabel, prenomInput, nomLabel, nomInput, 
	    	                 emailLabel, emailInput, telabel, telInput, 
	    	                 telDeuxLabel, telDeuxInput, entrepriseLabel, entrepriseInput, 
	    	                 buttonContainer
	    	                );
	    	         
	    	         body.setBottom(mesCoordonnees);
	        	 }
	         });
	         
	         Button b9 = new Button("2 | TYPE DE TRAVAUX ➞");
	         b9.setOnMouseClicked(new EventHandler<MouseEvent>() {
	        	 @Override
	        	 public void handle(MouseEvent event) {
	        		VBox typeDeTravaux = new VBox(10);
	        		 
	        		Label optionLabel = new Label("Je souhaite *");
	        		optionLabel.getStyleClass().add("catLabel");

	        	     // Créer des RadioButton
	        	    RadioButton option1 = new RadioButton("Rencontrer immédiatement jusqu'à 4 entreprises intéressées par mon projet.");
	        	    RadioButton option2 = new RadioButton("Recevoir par email des estimations de prix par les entreprises intéressées par mon projet sans que mes coordonnées soient communiquées.");

	        	     // Option par défaut
	        	     option1.setSelected(true);
	        	     
	        	     Label typeTravauxLabel = new Label("Travaux à réaliser");
	        	     typeTravauxLabel.getStyleClass().add("catLabel");
	    	         
	    	         Label nomLabel = new Label("Nom *");
	    	         TextField nomInput = new TextField();
	    	         
	    	         Label prenomLabel = new Label("Prénom *");
	    	         TextField prenomInput = new TextField();
	    	         
	    	         Label emailLabel = new Label("Email *");
	    	         TextField emailInput = new TextField();
	    	         
	    	         Label telabel = new Label("Télpéhone *");
	    	         TextField telInput = new TextField();
	    	        
	    	         Label telDeuxLabel = new Label("Deuxième Télpéhone");
	    	         TextField telDeuxInput = new TextField();
	    	         
	    	         Label entrepriseLabel = new Label("Nom de l'entreprise ou de l'établissement publique");
	    	         TextField entrepriseInput = new TextField();
	    	         Tooltip tooltip = new Tooltip("Si vous représentez une entreprise ou un établissement publique");
	    	         Tooltip.install(entrepriseLabel, tooltip); 
	    	         
	    	         typeDeTravaux.getStyleClass().add("typeDeTravaux");
	    	         
	    	         nomInput.getStyleClass().add("input");
	    	         prenomInput.getStyleClass().add("input");
	    	         emailInput.getStyleClass().add("input");
	    	         telInput.getStyleClass().add("input");
	    	         telDeuxInput.getStyleClass().add("input");
	    	         entrepriseInput.getStyleClass().add("input");

	    	         Button precedentButton = new Button("Précédent");
	    	         precedentButton.getStyleClass().add("btn-refuser");
	    	         
	    	         Button suivantButton = new Button("Suivant");
	    	         suivantButton.getStyleClass().add("btn-valider");
	    	         
	    	         HBox buttonContainer = new HBox();
	    	         buttonContainer.getChildren().addAll(precedentButton, suivantButton);
	    	         buttonContainer.getStyleClass().add("buttonContainer");
	    	         buttonContainer.setAlignment(Pos.CENTER_RIGHT);
	    	         
	    	         typeDeTravaux.getChildren().addAll(
	    	        		 optionLabel, option1, option2, typeTravauxLabel, prenomLabel, prenomInput, nomLabel, nomInput, 
	    	                 emailLabel, emailInput, telabel, telInput, 
	    	                 telDeuxLabel, telDeuxInput, entrepriseLabel, entrepriseInput, 
	    	                 buttonContainer
	    	                );

	    	         
	    	         body.setBottom(typeDeTravaux);
	        	 }
	         });
	         Button b10 = new Button("3 | DETAILS TRAVAUX ➞");
	         b10.setOnMouseClicked(new EventHandler<MouseEvent>() {
	        	 @Override
	        	 public void handle(MouseEvent event) {
	        		VBox detailTravaux = new VBox(10);
	        		
	        		Label detailsLabel = new Label("Details Travaux");
	        		detailsLabel.getStyleClass().add("catLabel");
	    	         
	        	     Label typeTravauxLabel = new Label("Travaux à réaliser");
	        	     typeTravauxLabel.getStyleClass().add("catLabel");
	        	     
	    	         Label titreLabel = new Label("Titre de ma demande de travaux*");
	    	         TextField titreInput = new TextField();
	    	         
	    	         Label descriptionLabel = new Label("Description des tâches à réaliser ( donner toutes les précisions utiles : dimensions, état ... )*");
	    	         TextArea descriptionInput = new TextArea();
	    	         
	    	         Label optionLabel = new Label("Je souhaite *");
	    	         optionLabel.getStyleClass().add("catLabel");

		        	 // Créer des RadioButton
		        	 RadioButton option1 = new RadioButton("Une seule entreprise réalise l'ensemble de la prestation.");
		        	 RadioButton option2 = new RadioButton("Découpage en lots : plusieurs entreprises réalisent la prestation.");
		        	 RadioButton option3 = new RadioButton("Indifférent : entreprise seule ou découpage en lots.");
		        	 // Option par défaut
		        	 option1.setSelected(true);
	    	         
	    	         
		        	 detailTravaux.getStyleClass().add("detailTravaux");
	    	         
	    	         titreInput.getStyleClass().add("input");
	    	         descriptionInput.getStyleClass().add("input");

		        	 Label infoComLabel = new Label("Informations complémentaires");
		        	 infoComLabel.getStyleClass().add("catLabel");
		        	 
		        	 Label delaiLabel = new Label("Délai de réalisation souhaité *");
		     		 MenuButton menu = new MenuButton("Délai");
		    		 MenuItem premOpt = new MenuItem("Dès que possible");
		    		 MenuItem deuxOpt = new MenuItem("D'ici 3 mois");
		    		 MenuItem troisOpt = new MenuItem("D'ici 6 mois");
		    		 MenuItem quatreOpt = new MenuItem("Dans plus de 6 mois");
		    		 MenuItem cinqOption = new MenuItem("Urgent");
		    		 menu.getItems().addAll(premOpt, deuxOpt, troisOpt, quatreOpt, cinqOption);

	    	         Label nbrDevisLabel = new Label("Nombre maximum de devis souhaités (maximum 4)");
	    	         TextField nbrDevisInput = new TextField();
	    	         
	    	         Label entrepriseDistanceLabel = new Label("Entreprise située à moins de km (minimum 30 km)");
	    	         TextField entrepriseDistanceInput = new TextField();
	    	         
	    	         Label budgetLabel = new Label("Budget (euros)");
	    	         TextField budgetInput = new TextField();
	    	         
	    	        
	    	         Button precedentButton = new Button("Précédent");
	    	         precedentButton.getStyleClass().add("btn-refuser");
	    	         
	    	         Button suivantButton = new Button("Suivant");
	    	         suivantButton.getStyleClass().add("btn-valider");
	    	         
	    	         HBox buttonContainer = new HBox();
	    	         buttonContainer.getChildren().addAll(precedentButton, suivantButton);
	    	         buttonContainer.getStyleClass().add("buttonContainer");
	    	         buttonContainer.setAlignment(Pos.CENTER_RIGHT);
	    	         
	    	         detailTravaux.getChildren().addAll(
	    	        		 detailsLabel, titreLabel, titreInput, descriptionLabel, descriptionInput, 
	    	        		 optionLabel, option1, option2, option3, 
	    	        		 infoComLabel, delaiLabel, menu,
	    	        		 nbrDevisLabel, nbrDevisInput, entrepriseDistanceLabel, entrepriseDistanceInput, budgetLabel, budgetInput,
	    	                 buttonContainer
	    	                );

	    	         
	    	         body.setBottom(detailTravaux);
	        	 }
	         });
	         
	         Button b11 = new Button("4 | RÉCAPITULATIF");
	         b11.setOnMouseClicked(new EventHandler<MouseEvent>() {
	        	 @Override
	        	 public void handle(MouseEvent event) {
	        		 
	        	 }
	         });
	         
	         
	         b8.getStyleClass().add("btn-status");
	         b9.getStyleClass().add("btn-status");
	         b10.getStyleClass().add("btn-status");
	         b11.getStyleClass().add("btn-status");
	         
	         categories.getChildren().addAll(b8,b9,b10,b11);
	         categories.setId("categories");
	         body.setCenter(categories);
	         
	         
	         Scene scene = new Scene(body, 1900, 1000);
	         scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	         primaryStage.setScene(scene);
	         primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}