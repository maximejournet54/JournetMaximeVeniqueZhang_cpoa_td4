package application;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import connexion.Persistance;

import pojo.Categorie;

import dao.DAOFactory;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class FenetreControler implements Initializable {
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
	        lbl_description.setText("Vous avez saisi "+nom+" " +description+ " " + tarif+" euros" + "" +cbx_categorie.getValue());
	        
	        
	        
	       
	        //ajouter un produit
	        //Produit p=new Produit(id_produit,nom,description,tarif,visuel,id_categorie);
	        //Produit.create(p);
	    }
	    
	    @Override
	    public void initialize(URL location, ResourceBundle resources) {
	    		DAOFactory dao = DAOFactory.getDAOFactory(Persistance.LISTE_MEMOIRE);
	            this.cbx_categorie.setItems(FXCollections.observableArrayList(dao.getCategorieDAO().findAll()));
		  }
	  

	   

}
