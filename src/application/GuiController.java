package application;

import java.io.IOException;

import backend.BackEnd;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.HTMLEditor;

public class GuiController {
	
	@FXML
	HTMLEditor welcomeInput;
	
	@FXML
	HTMLEditor welcomeOutput;
	
	@FXML
	Button generateLinks;
	
	@FXML
	TextField linkDomain;
	
	@FXML
	TextField welcomeDomain;
	
	@FXML
	HTMLEditor linkOutput;
	
	@FXML
	CheckBox[] c;
	
	@FXML
	AnchorPane servicesTab;
	
	
	@FXML
	public void initialize() {
		c = new CheckBox[23];
		
		for(int i = 0; i < c.length; i++) {
			c[i] = new CheckBox();
			c[i].setLayoutX(36);
			c[i].setLayoutY(10 + 20 * i);
			servicesTab.getChildren().add(c[i]);
		}
		
		c[0].setText("Bonding");
		c[1].setText("Cosmetic Contouring");
		c[2].setText("Cosmetic Fillings");
		c[3].setText("Dentures");
		c[4].setText("Extractions");
		c[5].setText("Bone Grafts");
		c[6].setText("Gum Grafts");
		c[7].setText("Jaw/TMJ");
		c[8].setText("Root Canal Therapy");
		c[9].setText("Sealants");
		c[10].setText("Veneers");
		c[11].setText("Braces (Orthodontia)");
		c[12].setText("Cosmetic Dentistry");
		c[13].setText("Crowns and Bridges");
		c[14].setText("Excessive or Uneven Gums");
		c[15].setText("Flap Surgery");
		c[16].setText("Implants");
		c[17].setText("Maxillofacial Surgery");
		c[18].setText("Scaling and Root Planing");
		c[19].setText("Speciality Dentures");
		c[20].setText("Whitening");
		c[21].setText("Invisalign for Teens");
		c[22].setText("Invisalign for Adults");
	}
	
	public void convert(ActionEvent event) {
		String input = welcomeInput.getHtmlText();
		String output = BackEnd.convert(input);
		if(!welcomeDomain.getText().equals("")) {
			output = BackEnd.welcomeLink(output, welcomeDomain.getText());
		}
		welcomeOutput.setHtmlText(output);
	}
	
	public void generateLinks(ActionEvent event) {
		Boolean[] checks = new Boolean[23];
		checks[0] = c[0].isSelected();
		checks[1] = c[1].isSelected();
		checks[2] = c[2].isSelected();
		checks[3] = c[3].isSelected();
		checks[4] = c[4].isSelected();
		checks[5] = c[5].isSelected();
		checks[6] = c[6].isSelected();
		checks[7] = c[7].isSelected();
		checks[8] = c[8].isSelected();
		checks[9] = c[9].isSelected();
		checks[10] = c[10].isSelected();
		checks[11] = c[11].isSelected();
		checks[12] = c[12].isSelected();
		checks[13] = c[13].isSelected();
		checks[14] = c[14].isSelected();
		checks[15] = c[15].isSelected();
		checks[16] = c[16].isSelected();
		checks[17] = c[17].isSelected();
		checks[18] = c[18].isSelected();
		checks[19] = c[19].isSelected();
		checks[20] = c[20].isSelected();
		checks[21] = c[21].isSelected();
		checks[22] = c[22].isSelected();
		
		String domain = linkDomain.getText();
		
		String output = BackEnd.generateLink(domain, checks);
		
		linkOutput.setHtmlText(output);
	}
	
	public void reset(ActionEvent event) {
		c[0].setSelected(false);
		c[1].setSelected(false);
		c[2].setSelected(false);
		c[3].setSelected(false);
		c[4].setSelected(false);
		c[5].setSelected(false);
		c[6].setSelected(false);
		c[7].setSelected(false);
		c[8].setSelected(false);
		c[9].setSelected(false);
		c[10].setSelected(false);
		c[11].setSelected(false);
		c[12].setSelected(false);
		c[13].setSelected(false);
		c[14].setSelected(false);
		c[15].setSelected(false);
		c[16].setSelected(false);
		c[17].setSelected(false);
		c[18].setSelected(false);
		c[19].setSelected(false);
		c[20].setSelected(false);
		c[21].setSelected(false);
		c[22].setSelected(false);
	}
	
	public void all(ActionEvent event) {
		c[0].setSelected(true);
		c[1].setSelected(true);
		c[2].setSelected(true);
		c[3].setSelected(true);
		c[4].setSelected(true);
		c[5].setSelected(true);
		c[6].setSelected(true);
		c[7].setSelected(true);
		c[8].setSelected(true);
		c[9].setSelected(true);
		c[10].setSelected(true);
		c[11].setSelected(true);
		c[12].setSelected(true);
		c[13].setSelected(true);
		c[14].setSelected(true);
		c[15].setSelected(true);
		c[16].setSelected(true);
		c[17].setSelected(true);
		c[18].setSelected(true);
		c[19].setSelected(true);
		c[20].setSelected(true);
		c[21].setSelected(true);
		c[22].setSelected(true);
	}
}
