import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class projCtoF {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setTitle("Degree Converter");
        window.setSize(500,400);
        window.setLayout(null);

        
        JLabel celsius = new JLabel();
        celsius.setText("celsius");
        celsius.setBounds(90,30,150,50);
        window.add(celsius);
        ImageIcon logo = new ImageIcon("D:/my program files/Kofe Website/media/strawHatLogo.jpeg");
        window.setIconImage(logo.getImage());


        JLabel fareinheit = new JLabel();
        fareinheit.setText("fareinheit");
        fareinheit.setBounds(290,30,150,50);
        window.add(fareinheit);

        JTextField celsiusBlock = new JTextField();
        celsiusBlock.setBounds(50,100,150,50);
        window.add(celsiusBlock);

        JTextField fareinheitBlock = new JTextField();
        fareinheitBlock.setBounds(250,100,150,50);
        window.add(fareinheitBlock);


        JButton convert = new JButton();
        convert.setText("convert");
        convert.setBounds(50,190,150,50);
        window.add(convert);
        convert.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(!celsiusBlock.getText().equals("") && fareinheitBlock.getText().equals("")){
                    int name = Integer.parseInt(celsiusBlock.getText());
                    double name2 = (name * 9/5) + 32;
                    String str = ""+name2;
                    fareinheitBlock.setText(str);
                } 
                else if(celsiusBlock.getText().equals("") && !fareinheitBlock.getText().equals("") ) {
                    int name = Integer.parseInt(fareinheitBlock.getText());
                    double name2 = (name - 32) * 5 / 9;
                    String str = ""+name2;
                    celsiusBlock.setText(str);
                }
                else{
                    celsiusBlock.setText("ERROR");
                    fareinheitBlock.setText("ERROR");
                }  
            }
        });

        JButton clear = new JButton();
        clear.setText("clear");
        clear.setBounds(250,190,150,50);
        window.add(clear);
        clear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                celsiusBlock.setText("");
                fareinheitBlock.setText("");
            }
        });


        //these must be placed below to reduce the lag or to improve performance by increasing the efficiency.
        window.setVisible(true);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);//to position the widow at the center of the page
    }
}
