import javax.swing.*;
import java.awt.*;

class detials {      //start of details

    detials(ButtonGroup bg1, String pickpoint, String distination, int distance, JRadioButton d1, JRadioButton d2, JRadioButton d3, JRadioButton d4, JRadioButton d5, int fare1, int fare2, int fare3, int fare4, int fare5){
        JFrame f = new JFrame();
        ImageIcon img= new ImageIcon("taxi5.jpg");
        JLabel background =new JLabel("",img,JLabel.HEIGHT);
        background.setBounds(0,0,800,800);
        background.setVisible(true);
        background.setLayout(null);
        f.setBounds(0,0,700,800);
        f.setLayout(null);
        f.setVisible(true);
        JLabel d =new JLabel("Ride detials");
        d.setBounds(300,20,150,25);
        d.setFont(new Font("ss",Font.BOLD,23));
        JLabel l1=new JLabel("pickup");
        l1.setBounds(100,90,120,25);
        l1.setFont(new Font("dd",Font.BOLD,20));
        JLabel l2 =new JLabel(pickpoint);
        l2.setBounds(240,90,120,25);
        l2.setFont(new Font("dd",Font.BOLD,20));

        JLabel l3=new JLabel("Distination");
        l3.setBounds(100,140,120,25);
        l3.setFont(new Font("dd",Font.BOLD,20));
        JLabel l4 =new JLabel(distination);
        l4.setBounds(240,140,120,25);
        l4.setFont(new Font("dd",Font.BOLD,20));

        JLabel l5=new JLabel("Distance");
        l5.setBounds(100,190,120,25);
        l5.setFont(new Font("dd",Font.BOLD,20));
        JLabel l6 =new JLabel(String.valueOf(distance));
        l6.setBounds(240,190,120,25);
        l6.setFont(new Font("dd",Font.BOLD,20));

        JLabel l7=new JLabel("Booked ride");
        l7.setBounds(100,240,120,25);
        l7.setFont(new Font("dd",Font.BOLD,20));
        JLabel l8 =new JLabel(bg1.getSelection().getActionCommand());
        l8.setBounds(240,240,120,25);
        l8.setFont(new Font("dd",Font.BOLD,20));

        JLabel l9=new JLabel("Fare");
        l9.setBounds(100,290,120,25);
        l9.setFont(new Font("dd",Font.BOLD,20));
        JLabel l10 =new JLabel();
        l10.setBounds(240,290,120,25);
        l10.setFont(new Font("dd",Font.BOLD,20));
        JLabel l11 = new JLabel("Your ride will arrive shortly");
        l11.setFont(new Font("",Font.BOLD,20));
        l11.setBounds(230,340,270,25);
        f.add(d);
        f.add(l1);
        f.add(l11);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(l7);
        f.add(l8);
        f.add(l9);
        f.add(l10);
        f.add(background);
        while (d1.isSelected()){
            l10.setText(String.valueOf(fare1));
            break;
        }
        while (d2.isSelected()){
            l10.setText(String.valueOf(fare2));
            break;
        }
        while (d3.isSelected()){
            l10.setText(String.valueOf(fare3));
            break;
        }
        while (d4.isSelected()){
            l10.setText(String.valueOf(fare4));
            break;
        }
        while (d5.isSelected()){
            l10.setText(String.valueOf(fare5));
            break;
        }
    }


}

//   end of details





