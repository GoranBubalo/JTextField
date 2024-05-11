import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//When we add extends JFrame it means that the Class MyFrame will behave like JFrame
public class MyFrame extends JFrame implements ActionListener {
    JTextField textField;
    JButton button;
    public MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //This code setts the Layout style
        this.setLayout(new FlowLayout());
        textField = new JTextField();
        //This part sets the textField Style
        textField.setFont(new Font("Consolas",Font.PLAIN,35));
        textField.setForeground(new Color(0x00ff00));
        textField.setBackground(Color.black);
        textField.setCaretColor(Color.white);
        textField.setText("Username");




        button = new JButton("Submit");
        button.addActionListener(this);
        textField.setPreferredSize(new Dimension(250,40));
        this.add(button);
        this.add(textField);
        this.pack(); // the size of the frame will adjust to fit the components we have
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            System.out.println("Welcome " + textField.getText());
            //Disable the text field and Button submit after submiting a user
            button.setEnabled(false);
            textField.setEditable(false);

        }
    }

}
