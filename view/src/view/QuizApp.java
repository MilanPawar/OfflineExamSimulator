package view;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Random;

public class QuizApp extends JFrame {
    private JButton section1Button;
    private JButton section2Button;
    private JButton section3Button;
    private JLabel timerLabel;
    private JPanel imagePanel;
    private Timer timer;
    private int timeRemaining = 180; // 180 minutes

    public QuizApp() {
        setTitle("Quiz App");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        section1Button = new JButton("Section 1");
        section2Button = new JButton("Section 2");
        section3Button = new JButton("Section 3");
        timerLabel = new JLabel("Time: " + timeRemaining + " min");
        imagePanel = new JPanel();

        section1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Load images from section 1 folder
                // Update imagePanel with images
            }
        });

        section2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Load images from section 2 folder
                // Update imagePanel with images
            }
        });

        section3Button.addActionListener( new ActionListener()) { imageLabel = new JLabel();
                 add(imageLabel, BorderLayout.CENTER);
//            @Override
//            public void actionPerformed(ActionEvent e) {  
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
                // Load images from section 3 folder
                // Update imagePanel with images
            }
        });

        // Create a timer to countdown
        timer = new Timer(60000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (timeRemaining > 0) {
                    timeRemaining--;
                    timerLabel.setText("Time: " + timeRemaining + " min");
                } else {
                    timer.stop();
                    // Handle quiz time over
                }
            }
        });

        timer.start();

        add(section1Button, BorderLayout.SOUTH);
        add(section2Button, BorderLayout.NORTH);
        add(section3Button, BorderLayout.CENTER);
        add(timerLabel, BorderLayout.EAST);
        add(imagePanel, BorderLayout.CENTER);
        
        private void displayImage(int index) {
            ImageIcon randomImage = new ImageIcon(imageFiles[index].getAbsolutePath());
            imageLabel.setIcon(randomImage);
        }
    }
   
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new QuizApp().setVisible(true);
            }
        });
    }
}
