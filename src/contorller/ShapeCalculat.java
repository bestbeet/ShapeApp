package contorller;

import com.sun.xml.internal.messaging.saaj.soap.JpegDataContentHandler;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ShapeCalculat extends JFrame {

    Rectangle rectangle1 = new Rectangle();

    public ShapeCalculat(){

        // Create Form Frame
        super("Shape Calculat");
        setSize(450, 300);
        setLocation(500, 280);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        // Label Height
        JLabel textHeight = new JLabel("Height :");
        textHeight.setBounds(15, 26, 85, 14);
        getContentPane().add(textHeight);

        // Input A
        final JTextField inputheight = new JTextField();
        inputheight.setBounds(60, 26, 62, 20);
        getContentPane().add(inputheight);

        // Label Width
        JLabel textWidth = new JLabel("Width  :");
        textWidth.setBounds(15, 52, 85, 14);
        getContentPane().add(textWidth);

        // Input B
        final JTextField inputwidht = new JTextField();
        inputwidht.setBounds(60, 52, 62, 20);
        getContentPane().add(inputwidht);

        // Label Result
        final JLabel lblResult = new JLabel("Result");
        lblResult.setBounds(15, 78, 85, 14);
        getContentPane().add(lblResult);


        // Button Sum
        JButton btnSum = new JButton("Calculat");
        btnSum.setBounds(194, 25, 100, 23);
        btnSum.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                rectangle1.setHeight( Double.valueOf(inputheight.getText())); // get from Input
                rectangle1.setWidth( Double.valueOf(inputwidht.getText())); // get from Input



                lblResult.setText(String.valueOf(rectangle1.getArea())); // assign value
            }
        });
        getContentPane().add(btnSum);

    }


}
