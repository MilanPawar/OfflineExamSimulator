package view;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class GateSim extends JFrame {
    private JLabel imageLabel;
    private JButton changeImageButton;

    private File[] imageFiles;
    private int currentIndex ;

    @SuppressWarnings("deprecation")
	public GateSim() {
        // Set up the JFrame
                        setTitle("Gate 2024 [iisc-banglore ");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create a JLabel to display the image
        imageLabel = new JLabel();
        
        imageLabel.setBounds(0, 0, 800, 800);
       // imageLabel.resize(200,200);
       
        
        
        
        add(imageLabel,BorderLayout.NORTH );//BorderLayout.CENTER
        //setSize(200,200);

        // Create a button to switch the image
        changeImageButton = new JButton("Change Image");
        add(changeImageButton, BorderLayout.SOUTH);

        // Load images from a folder
        File folder = new File("C:\\Users\\jay\\Desktop\\view\\src\\view");
        imageFiles = folder.listFiles((dir, name) -> name.toLowerCase().endsWith(".jpg"));
        
        if (imageFiles != null && imageFiles.length > 0) {
            // Initialize the index with a random value
            currentIndex = new Random().nextInt(imageFiles.length);
            
            displayImage(currentIndex);

            // Add ActionListener to the button
            changeImageButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    currentIndex = (currentIndex + 1) % imageFiles.length; // Cycle through the images
                    displayImage(currentIndex);
                }
            });
        } else {
            imageLabel.setText("No images found in the folder.");
            changeImageButton.setEnabled(false); // Disable the button if no images are found
        }
    }
    public Image scaleImage(Image image, int w, int h) {

        Image scaled = image.getScaledInstance(w, h, Image.SCALE_SMOOTH);

        return scaled;
    }
    @SuppressWarnings("deprecation")
	public  void displayImage(int index) {
        ImageIcon randomImage = new ImageIcon(imageFiles[index].getAbsolutePath());
         //scaleImage(randomImage,200,300);
        setSize(500,500);
        
       // randomImage.getIconHeight();
        //imageLabel.getIcon(randomImage);
        imageLabel.setIcon(randomImage);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GateSim  frame = new GateSim();
            frame.setVisible(true);
            frame.setBounds(EXIT_ON_CLOSE, ABORT, 800, 800);
            
            
        });
        }
    }

    
