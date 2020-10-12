package application;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class FenetreControler {
	 @FXML
	    Button btn_creer;
	 	TextField txt_nom;
	 	ChoiceBox cbox;
	 	int id_produit,id_categorie;
	 	String nom,description,visuel;
	 	double tarif;

	    @FXML
	    public void click_btn() {
	        System.out.println( "Button clicked");
	        nom = txt_nom.getText();
	       //dans fction initialise
	        //ajouter un produit
	        Produit p=new Produit(id_produit,nom,description,tarif,visuel,id_categorie);
	        Produit.create(p);
	    }
	    
	  /*@FXML
	   public void initialize() throws Initialize{
		   
	  }
	  */

	   

}
