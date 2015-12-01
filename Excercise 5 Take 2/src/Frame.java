import java.awt.BorderLayout;
import javax.swing.*;

public class Frame extends JFrame{
	
   
   
    public Frame(String idk){

        setLayout(new BorderLayout());

        JLabel enterYourName = new JLabel(idk);
       // JTextField textBoxToEnterName = new JTextField(21);
        JPanel panelTop = new JPanel();
        panelTop.add(enterYourName);
       // panelTop.add(textBoxToEnterName);

        //JButton submit = new JButton("Submit");
       // JPanel panelBottom = new JPanel();
       // panelBottom.add(submit);

        
        add(panelTop, BorderLayout.NORTH);
        //add(panelBottom, BorderLayout.SOUTH);

        setTitle("Frickin JFRAME");

        pack();
        setLocationRelativeTo(null);
    }

   
    }
