import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.util.Arrays;

public class login {
    public login(String name, String pasword){
        JFrame f2 = new JFrame();
        ImageIcon img= new ImageIcon("taxi5.jpg");
        JLabel background =new JLabel("",img,JLabel.HEIGHT);
        background.setBounds(0,0,800,800);
        background.setVisible(true);
        background.setLayout(null);
        JLabel l1=new JLabel("LOGIN");
        JLabel l2=new JLabel("user name");
        JLabel l3 = new JLabel("password");
        JTextField tf3=new JTextField();
        JPasswordField pf2 =new JPasswordField();
        JButton b3 =new JButton("login");
        f2.setLayout(null);
        f2.setVisible(true);
        f2.setResizable(true);
        f2.setBounds(0,0,800,800);
        l1.setVisible(true);
        l1.setBounds(240,20,120,100);
        l1.setFont(new Font("Serif", Font.BOLD, 14));
        l2.setVisible(true);
        l2.setBounds(140,100,120,100);
        l2.setFont(new Font("Serif", Font.BOLD, 14));
        tf3.setVisible(true);
        tf3.setBounds(220,140,120,25);
        l3.setVisible(true);
        l3.setBounds(145,150,120,100);
        l3.setFont(new Font("Serif", Font.BOLD, 14));
        pf2.setVisible(true);
        pf2.setBounds(220,190,120,25);
        b3.setBounds(220,240,120,25);

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usernamee=tf3.getText();
                String passwordd=pf2.getText();
                try {
                    FileWriter writer=new FileWriter("login.txt",true);
                    writer.write("\t\t''new entry''\n"+"USER NAME="+usernamee+"\npassword="+passwordd);
                    writer.write(System.getProperty("line.separator"));
                    writer.close();
                }catch (Exception ex){

                }
                String[] u={"aminah","faizan","farooq","umair","ume"};
                String p="oop123";

                if (Arrays.asList(u).contains(usernamee)&&passwordd.equals(p)) {
                    ride r = new ride();

                } else if (usernamee.equals(name)&&passwordd.equals(pasword)) {
                    ride r = new ride();

                } else JOptionPane.showMessageDialog(null, "Wrong password or user name");
            }
        });
        f2.add(l1);
        f2.add(l2);
        f2.add(tf3);
        f2.add(l3);
        f2.add(pf2);
        f2.add(b3);
        f2.add(background);
    }


    public login() {

    }
}//  end of login

