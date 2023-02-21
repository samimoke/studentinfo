/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package studentinfo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
 * @author SAMUEL PC
 */
public class FXMLDocumentController implements Initializable {
    
    
    @FXML
    private Label label;

    @FXML
    private TextField ID;

    @FXML
    private TextField name;

    @FXML
    private TextField grade;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Label l1;

    @FXML
    private Label l2;

    @FXML
    private Label l3;
   



    @FXML
public  void Save(ActionEvent event) throws IOException {

        
        File file= new File("C:\\Users\\SAMUEL PC\\Desktop\\Student\\do.txt");
        file.setWritable(true);
        FileWriter fw= new FileWriter(file,true);
        
        
        fw.write(ID.getText()+"\t"+name.getText()+"\t"+grade.getText()+" \n");
         fw.flush();
    }
    @FXML
    public void Cancel(ActionEvent event) throws IOException {
        ID.clear();
        name.clear();
        grade.clear();
         }
    @FXML
    public void View(ActionEvent event) throws IOException {
        //Stage stage;
        String line=null;
         BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\SAMUEL PC\\Desktop\\Student\\do.txt"));
    //   String line=br.readLine();
        while((line=br.readLine())!=null){
        System.out.println(line);
    
          
           
           String[] arr;
       arr=line.split("\t");
      ID.setText(arr[0]);
      name.setText("sami");
      grade.setText("4");
    
    }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
