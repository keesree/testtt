

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File; 
import java.io.IOException; 

public class Main extends  JFrame implements ActionListener{

    //declare our components or fields
    // a field is a global level variable
    
  JTextField txtInput = new JTextField(15);
 
  String [] fruitNames = new String[1];
    //declare textArea
  JTextArea txtOutputString = new JTextArea("Your text : ");
 
  JButton btnAdd = new JButton("calculate");
    
    //declare variables to hold information.
  	int count;
    String text;
    int length;
    int match;
    //main is the first method to run - method means function
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //declare a frame for form
        Main frame = new Main();
        frame.setSize(500,500);
        frame.setVisible(true);

    }
    //declare constructor for the project
    //The constructor sets everything up.
    public Main()
    {
      
        super("Fruits and Vegetables");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set layout manager
        setLayout(new FlowLayout());
        //add our components to the form
      add(new JLabel("Enter the size of the array:	"));
      add(txtInput);
	 add(btnAdd);
        add(txtOutputString);
        //*********
        //add listener to the button
        btnAdd.addActionListener(this);
      

      
      
      
      
      
      
    }//end of constructor
    
    //when you push the button - the code comes here
    
    public void actionPerformed(ActionEvent event)
    {
        Object objSource = event.getSource();
      
        if(objSource == btnAdd)
        {
     	  int  min = 100;
   		  int  max = 0;
     	  String output = "";
     	  String x = txtInput.getText();
      			    
      		 //creating the array
      		   
      		   if(count == 0) {
      			  length =(int) Double.parseDouble(txtInput.getText());
     			  String [] fruitarray = new String[length];
     			  fruitNames = fruitarray;
      		   }
      		   
      		 if( count > 0 && count < length+1) {
      			 String text = txtInput.getText();
      			 fruitNames[count-1] = text;
      		 }
      		 if( count == length) {
      		   for( int i = 0 ; i < length ; i++) {
      			   output += fruitNames[i]+"\n";
      			 fruitNames[i] = fruitNames[i].toUpperCase();
      		   }
      		   
      		 }
      		  txtOutputString.setText(output);
      	  	count++;
     	  }
  	 
 
     	   }
     	 

}
 	 






