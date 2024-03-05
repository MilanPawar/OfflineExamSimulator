package view;

//public class navButton { JButton(Icon i)
//	void setIcon(Icon b) 
//	void addActionListener(ActionListener a) 
//	 public void itemStateChanged(ItemEvent e) {      
//        if(e.getSource()==checkBox1)  
//            label.setText("C++ Checkbox: "     
//            + (e.getStateChange()==1?"checked":"unchecked"));   //It creates a button with the specified icon object.
//
//}


//import java.awt.event.*;  
//import javax.swing.*;    
//public class navButton {  
//public static void main(String[] args) {  
//    JFrame f=new JFrame("Button Example");  
//    JButton b=new JButton(new ImageIcon("C:\\Users\\jay\\Desktop\\icon.png")); b.setBounds(100,100,90,30); 
//f.add(b);
//final JTextField tf=new JTextField();  
//    tf.setBounds(50,50, 150,20);  
//    //JButton b=new JButton("Click Here");
//   
//     
//    b.addActionListener(new ActionListener(){  
//public void actionPerformed(ActionEvent e){  
//            tf.setText("Welcome to Javatpoint.");  
//        }  
//    });  
//    f.add(b);//f.add(tf);  
//    f.setSize(900,400);  
//    f.setLayout(null);  
//    f.setVisible(true);   
//}  
//}  
import javax.swing.*;      
public class navButton{    
navButton(){    
JFrame f=new JFrame("Button Example");            
JButton b=new JButton(new ImageIcon("C:\\Users\\jay\\Desktop\\view\\src\\view\\icon.png"));    
b.setBounds(100,100,100, 40);    
f.add(b);    
f.setSize(300,400);    
f.setLayout(null);    
f.setVisible(true);    
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }         
public static void main(String[] args) {    
    new navButton();    
}    
}    