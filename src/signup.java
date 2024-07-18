import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

class signup {//                        strat of signup

    signup() {

        JFrame f1 = new JFrame("Ride booking app");// frame
        f1.getContentPane().setBackground(new Color(105, 130, 232, 255));
        f1.setLayout(null);
        f1.setVisible(true);
        f1.setResizable(true);
        f1.setSize(800, 800);
        JLabel l1 = new JLabel("create new account");///labels
        JLabel l2 = new JLabel("name");
        JLabel l3 = new JLabel("mobile number");
        JLabel l4 = new JLabel("password");
        JLabel l5 = new JLabel("date of birth");
        l1.setBounds(210, 0, 170, 100);///label bounds and properties
        l1.setFont(new Font("Serif", Font.BOLD, 20));
        l2.setBounds(150, 100, 120, 100);
        l2.setFont(new Font("Serif", Font.BOLD, 16));
        l3.setBounds(115, 150, 120, 100);
        l3.setFont(new Font("Serif", Font.BOLD, 16));
        l4.setBounds(120, 195, 120, 100);
        l4.setFont(new Font("Serif", Font.BOLD, 16));
        l5.setBounds(120, 240, 120, 100);
        JTextField tf1 = new JTextField();///text fields and properties
        JTextField tf2 = new JTextField();
        tf1.setBounds(220, 140, 120, 25);
        tf2.setBounds(220, 190, 120, 25);
        JPasswordField pf = new JPasswordField();   // password field
        pf.setBounds(220, 235, 120, 25);
        JButton b1 = new JButton("sign up");/// buttuns
        JButton b2 = new JButton("already have an account");
        b1.setBounds(230, 400, 100, 25);
        b2.setBounds(190, 450, 180, 25);
        //list
        String[] listdate = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13","14","15","16","17","18","19","20","21", "22", "33","24","25","26","27","28","29","30","31"};
        String[] listmonth = {"jan", "feb", "march", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec"};
        String[] listyear = {"1998","1999","2000","2001","2002", "2003", "2004", "2005", "2006"};
        JComboBox cb1 = new JComboBox(listdate);
        JComboBox cb2 = new JComboBox(listmonth);
        JComboBox cb3 = new JComboBox(listyear);
        cb1.setBounds(215, 300, 50, 25);
        cb2.setBounds(265, 300, 60, 25);
        cb3.setBounds(325, 300, 80, 25);
        //radio buttons
        JRadioButton rb1 = new JRadioButton("male");
        JRadioButton rb2 = new JRadioButton("female");
        JRadioButton rb3 = new JRadioButton("other");
        ButtonGroup bg = new ButtonGroup();
        rb1.setVisible(true);
        rb2.setVisible(true);
        rb3.setVisible(true);
        rb1.setBounds(210, 350, 60, 25);
        rb2.setBounds(265, 350, 70, 25);
        rb3.setBounds(330, 350, 70, 25);
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        f1.add(l1);
        f1.add(l2);
        f1.add(tf1);
        f1.add(l3);
        f1.add(tf2);
        f1.add(l4);
        f1.add(l5);
        f1.add(pf);
        f1.add(b1);
        f1.add(b2);
        f1.add(cb1);
        f1.add(cb2);
        f1.add(cb3);
        f1.add(rb1);
        f1.add(rb2);
        f1.add(rb3);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mnumber= tf2.getText();
                String pasword=pf.getText();
                String name=tf1.getText();

                cb1.getSelectedItem();
                cb2.getSelectedItem();
                cb3.getSelectedItem();
                rb1.setActionCommand("Male");
                rb2.setActionCommand("Female");
                rb3.setActionCommand("others");


                new login(name,pasword);


                try{

                    FileWriter writer = new FileWriter("signup.txt",true);
                    writer.write("\t\t''new entry''\n"+"NAME = "+name+"\nMOBILE NUMBER = "+mnumber+"\nPASSWORD = "+pasword+"\n GENDER = "
                            +bg.getSelection().getActionCommand()+"\nDATE OF BIRTH="+cb1.getSelectedItem()+"_"+cb2.getSelectedItem()+"_"+cb3.getSelectedItem());
                    writer.write(System.getProperty("line.separator"));
                    writer.close();
                }catch (Exception ex){

                }


            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                String name = null;
                String pasword = null;
                new login(name,pasword);



            }
        });
    }
}//          end of signup






