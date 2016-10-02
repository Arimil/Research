/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication2;


import java.io.IOException;
        
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.*;
import javafx.collections.*;



public class FXMLDocumentController implements Initializable {
    
    ObservableList<String> testlist = FXCollections.observableArrayList("a","s","m","d");
    
   
    
    @FXML
    private Label label;
    public TextField var1;
    public TextField var2;
    public TextField expression; 
    public ComboBox cb1;
    @FXML
     
   
    private void handleButtonAction(ActionEvent event) throws IOException {
        String v1 = var1.getText();
        double dV1 = Double.parseDouble(v1);
        
        String v2 = var2.getText();
        double dV2 = Double.parseDouble(v2);  
        // Get current value
        String name = (String)cb1.getValue();
        System.out.print(name);
        /* x^2+7.34*x-17
        */
        
        FileOpen.main();
        double value1 = TestClass.TestMethod(dV1,dV2);
        
        System.out.println();
        label.setText(Double.toString(value1));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       cb1.setItems(testlist);
    }    
    
    } 
    
   
    
  
