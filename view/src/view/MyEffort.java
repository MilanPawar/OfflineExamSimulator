package view;

//import javax.swing.*;  
//public class MyEffort {  
//public static void main(String[] args) {  
//JFrame f=new JFrame();//creating instance of JFrame  
//          
//JButton b=new JButton("click");//creating instance of JButton  
//b.setBounds(130,100,100, 40);//x axis, y axis, width, height  
//          
//f.add(b);//adding button in JFrame  
//          
//f.setSize(400,500);//400 width and 500 height  
//f.setLayout(null);//using no layout managers  
//f.setVisible(true);//making the frame visible  
//}  
//}  

//constructor approcah
//import javax.swing.*;  
//public class MyEffort {  
//JFrame f;  
//MyEffort(){  
//f=new JFrame();//creating instance of JFrame  
//          
//JButton b=new JButton("click");//creating instance of JButton  
//b.setBounds(130,100,100, 40);  
//          
//f.add(b);//adding button in JFrame  
//          
//f.setSize(400,500);//400 width and 500 height  
//f.setLayout(null);//using no layout managers  
//f.setVisible(true);//making the frame visible  
//}  
//  
//public static void main(String[] args) {  
//new MyEffort();  
//}  
//}  


//inhertance



import javax.swing.*;  
public class MyEffort extends JFrame{//inheriting JFrame  
JFrame f;  
MyEffort(){  
JButton b=new JButton("click");//create button  
b.setBounds(130,100,100, 40);  
          
add(b);//adding button on frame  
setSize(400,500);  
setLayout(null);  
setVisible(true);  
}  
public static void main(String[] args) {  
new MyEffort();  
}}







