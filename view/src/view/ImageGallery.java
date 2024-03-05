package view;


import javax.swing.*;
//import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class ImageGallery extends JFrame {
    private JPanel imagePanel;
    private JButton prevButton;
    private JButton nextButton;
    private int currentImageIndex = 0;
    private File[] imageFiles;
    private JLabel[] imageLabels;
    private JTextField natTextField;


    public ImageGallery() {
        setTitle("Image Gallery");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the layout for the main frame
        setLayout(new BorderLayout());
        natTextField = new JTextField(20);
        add(new JLabel("NAT Input: "));
        add(natTextField);

        // Create an array of image labels
        imageLabels = new JLabel[3];

        // Create a panel to display the images
        imagePanel = new JPanel(new FlowLayout());

        // Create navigation buttons
        prevButton = new JButton("Previous");
        nextButton = new JButton("Next");

        // Add action listeners to the buttons
        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showPreviousImage();
            }
        });

        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showNextImage();
            }
        });

        // Add components to the main frame
        add(imagePanel, BorderLayout.CENTER);
        add(prevButton, BorderLayout.WEST);
        add(nextButton, BorderLayout.EAST);

        // Load image files from a folder
        File folder = new File("C:\\Users\\jay\\Desktop\\view\\src\\view");
        imageFiles = folder.listFiles();

        // Initialize image labels
        for (int i = 0; i < 3; i++) {
            imageLabels[i] = new JLabel();
            imagePanel.add(imageLabels[i]);
        }

        // Display the initial images
        showImages(currentImageIndex);
    }

    private void showImages(int startIndex) {
        for (int i = 0; i < 2; i++) {
            int imageIndex = startIndex + i;
            if (imageIndex >= 0 && imageIndex < imageFiles.length) {
                try {
                    BufferedImage image = ImageIO.read(imageFiles[imageIndex]);
                    imageLabels[i].setIcon(new ImageIcon(image));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                imageLabels[i].setIcon(null);
            }
        }
    }

    private void showNextImage() {
        currentImageIndex += 1;
        showImages(currentImageIndex);
    }

    private void showPreviousImage() {
        currentImageIndex -= 1;
        showImages(currentImageIndex);
    }

    public static void main(String[] args) { new MCQPanel();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
             //  new ImageGallery().setVisible(true);
                new MCQPanel().setVisible(true);
            }
        });
    }
}

