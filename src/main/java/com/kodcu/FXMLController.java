package com.kodcu;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.web.WebView;

/**
 * <ul>
    <li>Step 1: Right click to SVG image</li>
    <li>Step 2: Click to "Copy image to Clipboard"</li>
    <li>Result: JVM Crash will occur</li>
   </ul>
   <img src="istanbul-jug.svg">
 */
public class FXMLController implements Initializable {
    
    @FXML
    private WebView myView;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        myView.getEngine().load("http://asciidocfx.com/svgbug/index.html");
    }    
}
