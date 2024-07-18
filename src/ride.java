import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ride { //        start of ride
    int fare;
    ride(){

        JFrame f3 = new JFrame();
        ImageIcon img= new ImageIcon("taxi7.jpg");
        JLabel background =new JLabel("",img,JLabel.HEIGHT);
        background.setBounds(0,0,800,800);
        background.setVisible(true);
        background.setLayout(null);
        JLabel l1 = new JLabel("Welcome to our app");
        l1.setFont(new Font("",Font.BOLD,17));
        JTextField tf5= new JTextField();
        JLabel l2 = new JLabel("Pickup point");
        l2.setFont(new Font("",Font.BOLD,17));
        JLabel l3 = new JLabel("Destination");
        l3.setFont(new Font("",Font.BOLD,17));
        JTextField tf6 = new JTextField();
        JRadioButton rb5=new JRadioButton("Bike");
        JRadioButton rb6=new JRadioButton("Mehran");
        JRadioButton rb7=new JRadioButton("Cultus");
        JRadioButton rb8=new JRadioButton("swift");
        ButtonGroup bg1 = new ButtonGroup();
        JLabel l4 = new JLabel("RIDE");
        l4.setFont(new Font("",Font.BOLD,17));
        JLabel l5 =new JLabel("Estimated distance");
        l5.setFont(new Font("",Font.BOLD,17));
        JTextField tf7=new JTextField();
        JButton b1 = new JButton("book");
        f3.setVisible(true);
        f3.setSize(800,800);
        f3.setLayout(null);
        l1.setBounds(240,30,200,25);
        tf5.setBounds(300,100,120,25);
        l2.setBounds(150,100,150,25);
        l3.setBounds(160,150,120,25);
        tf6.setBounds(300,150,120,25);
        rb5.setBounds(300,200,70,25);
        bg1.add(rb5);
        rb6.setBounds(380,200,70,25);
        bg1.add(rb6);
        rb7.setBounds(300,230,70,25);
        bg1.add(rb7);
        rb8.setBounds(380,230,70,25);
        bg1.add(rb8);
        l4.setBounds(200,215,120,25);
        l5.setBounds(120,260,150,25);
        tf7.setBounds(300,260,120,25);
        b1.setBounds(320,300,80,25);
        f3.add(l1);
        f3.add(tf5);
        f3.add(l2);
        f3.add(l3);
        f3.add(tf6);
        f3.add(rb5);
        f3.add(rb6);
        f3.add(rb7);
        f3.add(rb8);
        f3.add(l4);
        f3.add(l5);
        f3.add(tf7);
        f3.add(b1);
        f3.add(background);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pickpoint=tf5.getText();
                String distination=tf6.getText();
                rb5.setActionCommand("bike");
                rb6.setActionCommand("mehran");
                rb7.setActionCommand("cultus");
                rb8.setActionCommand("swift");
                Integer distance= Integer.parseInt(tf7.getText());
                try {
                    new driver( fare,  pickpoint,  distination,  distance,  bg1);
                }catch (Exception ee){
                }

                while (rb5.isSelected()){
                    fare=distance*20;
                    break;
                }
                while (rb6.isSelected()){
                    fare=distance*30;
                    break;
                }
                while (rb7.isSelected()){
                    fare=distance*34;
                    break;
                }
                while (rb8.isSelected())
                {
                    fare=distance*40;
                    break;
                }

               driver dd=new driver(  fare,  pickpoint,  distination,  distance,  bg1,  rb5,  rb6,  rb7,  rb8);
            }
        });

    }
}     //end of ride
