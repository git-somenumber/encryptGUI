import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Write a description of class LetterGUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LetterGUI
{
    
    static String en;
    // static  
    public LetterGUI(){
        JFrame frame = new JFrame("Ceasar Cipher");
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // JPanel resPanel = new JPanel();
        // resPanel.setVisible(false);
        JPanel panel = new JPanel();
        panel.setVisible(true);
        placeComponents(panel);
        
        frame.setVisible(true);
        frame.add(panel);
        // // frame.add(resPanel);
        // frame.add(resPanel,BorderLayout.NORTH);
        
        
    }
    public static void main(String[] args)
    {
        new LetterGUI();
        // frame.getContentPane().add(yellowLabel, BorderLayout.CENTER);
    }
    
    private static void placeComponents(JPanel panel)
    {
        // p2.setLayout(null);
        panel.setLayout(null);
        
        // JLabel l = new JLabel("Put the String to be encrypted here 2");
        // l.setBounds(10,10,250,25);
        // p2.add(l);
        
        JLabel encryptBLab = new JLabel("Put the String to be encrypted here");
        encryptBLab.setBounds(10,10,250,25);
        panel.add(encryptBLab);
        
        JTextField text = new JTextField();
        text.setBounds(10,37,250,25);
        panel.add(text);
       
        JLabel getKey = new JLabel("Key");
        getKey.setBounds(10,72,250,25);
        panel.add(getKey);
        
        JTextField key = new JTextField();
        key.setBounds(10,107,250,25);
        panel.add(key);
        
        JButton submit = new JButton("Submit");
        submit.setBounds(20,142,75,50);
        panel.add(submit);
        submit.setToolTipText("get result of encryption");
        submit.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                LetterTest l = new LetterTest();
                int keyP = Integer.parseInt(key.getText());
                System.out.println(l.encrypt(text.getText(),keyP).toString());
                
                // JLabel x = new JLabel("Put the String to be encrypted here");
                // x.setBounds(10,260,250,25);
                // panel.add(x);
                // p2.setVisible(true);
                // panel.setVisible(false);
                
            }
        
        }
        );
    }
}
