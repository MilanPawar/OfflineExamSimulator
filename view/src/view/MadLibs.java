package view;

import java.util.Scanner;   
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MadLibs{

 public static void Action1 () 
  {
//	 JFrame frame = new JFrame("instrructions");
//
//	 JPanel panel = new JPanel();
//	JLabel label=new JLabel( "ReadthefollowinginstructionscarefullyGeneralInstructions:\r\nTotaldurationoftheexaminationis180minutes.Calculatorisavailableontop,righthandsideofthescreen.\r\n Theclockwillbesetattheserver.Thecountdowntimerinthetoprightcornerofscreenwilldisplaytheremainingtimeavailableforyoutocompletetheexamination.Whenthetimerreacheszero,theexaminationwillendbyitself.Youwillnotberequiredtoendorsubmityourexamination.\r\n"
//			 panel.add(label);
//
//	 frame.add(panel);
//	 frame.setVisible(true);
    JFrame frame1 = new JFrame(" instructions" );
    // Add a window listener for close button
    frame1.addWindowListener(new WindowAdapter() {
    public void windowClosing(WindowEvent e) {
    System.exit(0);
        }
    });

    Scanner input = new Scanner(System.in);

    System.out.println(" Male Friend: ");
    String maleFriend = input.nextLine();
   
  

    // This is an empty content area in the frame
    JLabel jlbempty = new JLabel(  );
    jlbempty.setPreferredSize(new Dimension(600, 800));
    frame1.getContentPane().add(jlbempty, BorderLayout.CENTER);
    frame1.pack();
    frame1.setVisible(true);

  //  The story I want displayed on the jPanel:
    /*
     c.println( The Great Dough Disaster );
        c.println( \nLast summer, my friend  + maleFriend +   got a job at the   + adjective1 +  Pastry Shop. For the first few );
        c.println( weeks, he   + pastTenseVerb1 +   the floors,   + pastTenseVerb2 +   on the shelves, and unloaded   + largeNumber +   pound sacks );
        c.println( of flour from the delivery trucks.\n );
        c.println( Finally,  +famousFemale+ , the owner, told  +maleFriend+  that she would teach him to make bread. Now, ); 
        c.println( pay attention,  +maleFriend+ ,” she said every day. “I'll make the first batch of dough. Then you );
        c.println( can make the next batch while I go to  +place+ .\n );
        c.println( Poor  +maleFriend+ ! He had a habit of letting his  +bodyPart+  wander. When    +famousFemale+   left for  +place);
        c.println( he started to mix the ingredients. “Let me see,” he said. “I think she put in  +largeNumber2);
        c.println( packages of yeast.”\n );
        c.println( A short while later, the dough started  +ingEnding1+ . It kept on  +ingEnding1+ .  +maleFriend+  tried to ); 
        c.println( cover it with a(n)  +singularNoun+ , but the dough wouldn't stop  +ingEnding1+ . It was everywhere!  );
        c.println( “What can I do?” thought  +maleFriend+ .\n );
        c.println( Just then, Tyana returned from toronto. “ +maleFriend+ ” she screamed. “What have you done?” );
        c.println( “It's not my fault,” cried  +maleFriend+ . “The dough just started  +ingEnding1+  and wouldn't stop.” );
        c.println(famousFemale +   had to let him go. Now  +maleFriend+  has a job making  +singularNoun+ . I don't think he'll ever );
        c.print( eat bread again, let alone make it. );
      */


  }

 public static void main(String []args){
     Action1(); 
 }

}