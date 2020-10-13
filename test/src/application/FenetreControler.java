package application;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FenetreControler {
	 @FXML private TextField txt_field_nom,txt_field_tarif;
	 @FXML private TextArea txt_area_description;
	 @FXML private ChoiceBox<Categorie> cbx_categorie;
	 @FXML private Label lbl_description;
	 private int id_produit,id_categorie;
	 private String nom,description,visuel;
	 private double tarif;

	    @FXML
	    public void click_btn() {
	        nom = txt_field_nom.getText();
	        description = txt_area_description.getText();
	        tarif= Double.parseDouble(txt_field_tarif.getText());
	        //id_categorie=cbx_categorie.getValue().hashCode();
	        lbl_description.setText("Vous avez saisi "+nom+" " +description+ " " + tarif+" euros");
	        
	        
	       
	        //ajouter un produit
	        //Produit p=new Produit(id_produit,nom,description,tarif,visuel,id_categorie);
	        //Produit.create(p);
	    }
	    
	    @FXML
		 public void initialize() {
	    	
			//cbx_categorie.setValue(); nom des categorie
		  }
	  

	   

}
