/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opdracht1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author webde
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField tekstveld;
    
    @FXML
    /*private void Cijferklik1(ActionEvent event) {
        if("0".equals(tekstveld.getText())){tekstveld.clear();}
        tekstveld.appendText("1");
    }*/
    
    private void Cijferklik(ActionEvent event) {
        Button btn = (Button) event.getSource();
        String id = btn.getId();
        //System.out.println(id);
        //evt.getSource().equals(myButton1)
        //System.out.println((event.getSource()).getId());
        if("0".equals(tekstveld.getText())){tekstveld.clear();}
        
        switch(id){
            case "cijfer1":
                tekstveld.appendText("1");
                break;
                
                case "cijfer2":
                tekstveld.appendText("2");
                break;
                
                case "cijfer3":
                tekstveld.appendText("3");
                break;
                
                case "cijfer4":
                tekstveld.appendText("4");
                break;
                
                case "cijfer5":
                tekstveld.appendText("5");
                break;
                
                case "cijfer6":
                tekstveld.appendText("6");
                break;
                
                case "cijfer7":
                tekstveld.appendText("7");
                break;
                
                case "cijfer8":
                tekstveld.appendText("8");
                break;
                
                case "cijfer9":
                tekstveld.appendText("9");
                break;
                
                case "keer":
                tekstveld.appendText("*");
                break;
                
                case "plus":
                tekstveld.appendText("+");
                break;
                
                case "min":
                tekstveld.appendText("-");
                break;
                
                case "delendoor":
                tekstveld.appendText("/");
                break;
        }
        //tekstveld.appendText("");
    }
    
    @FXML
    private void Uitkomstberekenen(ActionEvent event) {
        //tekstveld.appendText("=");
        String ingevoerd;
        ingevoerd = tekstveld.getText();
        
        
        Integer uitkomst = calculator.Bereken(ingevoerd);
        String uitkomstString = uitkomst.toString();
        tekstveld.setText(uitkomstString);
    }
    
    
    @FXML
    private void clearText(ActionEvent event) {
        tekstveld.setText("0");
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
