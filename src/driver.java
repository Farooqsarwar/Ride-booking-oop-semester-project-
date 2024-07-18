import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class driver {//start of drive

    public driver(int fare, String pickpoint, String distination, Integer distance, ButtonGroup bg1, JRadioButton rb5, JRadioButton rb6, JRadioButton rb7, JRadioButton rb8) {
        JFrame f = new JFrame();
        ImageIcon img= new ImageIcon("taxi.jpg");
        JLabel background =new JLabel("",img,JLabel.HEIGHT);
        background.setBounds(0,0,800,800);
        background.setVisible(true);
        background.setLayout(null);
        f.setVisible(true);
        f.setSize(800, 800);
        f.setLayout(null);
        ButtonGroup b =new ButtonGroup();
        JLabel l1 = new JLabel("Drivers available");
        l1.setFont(new Font("s", Font.BOLD, 19));
        l1.setBounds(240, 20, 200, 25);
        JRadioButton d1=new JRadioButton("Driver 1");
        d1.setFont(new Font("ss",Font.BOLD,20));
        d1.setBounds(250,70,120,30);
        JLabel l2 = new JLabel("Fare");
        l2.setBounds(180, 120, 100, 25);
        l2.setFont(new Font("segiu", Font.BOLD, 20));
        JLabel l3 = new JLabel();
        l3.setBounds(280, 120, 100, 25);
        l3.setFont(new Font("serif", Font.BOLD, 20));

        JRadioButton d2=new JRadioButton("Driver 2");
        d2.setFont(new Font("ss",Font.BOLD,20));
        d2.setBounds(250,170,120,30);
        JLabel l4 = new JLabel("Fare");
        l4.setBounds(180, 220, 100, 25);
        l4.setFont(new Font("segiu", Font.BOLD, 20));
        JLabel l5 = new JLabel();
        l5.setBounds(280, 220, 100, 25);
        l5.setFont(new Font("serif", Font.BOLD, 20));

        JRadioButton d3=new JRadioButton("Driver 3");
        d3.setFont(new Font("ss",Font.BOLD,20));
        d3.setBounds(250,270,120,30);
        JLabel l6 = new JLabel("Fare");
        l6.setBounds(180, 320, 100, 25);
        l6.setFont(new Font("segiu", Font.BOLD, 20));
        JLabel l7 = new JLabel();
        l7.setBounds(280, 320, 100, 25);
        l7.setFont(new Font("serif", Font.BOLD, 20));

        JRadioButton d4=new JRadioButton("Driver 4");
        d4.setFont(new Font("ss",Font.BOLD,20));
        d4.setBounds(250,370,120,30);
        JLabel l8 = new JLabel("Fare");
        l8.setBounds(180, 420, 100, 25);
        l8.setFont(new Font("segiu", Font.BOLD, 20));
        JLabel l9 = new JLabel();
        l9.setBounds(280, 420, 100, 25);
        l9.setFont(new Font("serif", Font.BOLD, 20));

        JRadioButton d5=new JRadioButton("Driver 3");
        d5.setFont(new Font("ss",Font.BOLD,20));
        d5.setBounds(250,470,120,30);
        JLabel l10 = new JLabel("Fare");
        l10.setBounds(180, 520, 100, 25);
        l10.setFont(new Font("segiu", Font.BOLD, 20));
        JLabel l11 = new JLabel();
        l11.setBounds(280, 520, 100, 25);
        l11.setFont(new Font("serif", Font.BOLD, 20));
        b.add(d1);
        b.add(d2);b.add(d3);b.add(d4);b.add(d5);
        f.add(l1);
        f.add(d1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(d2);
        f.add(d3);
        f.add(l6);
        f.add(l7);
        f.add(d4);
        f.add(l7);
        f.add(l8);
        f.add(l9);
        f.add(l10);
        f.add(l11);
        f.add(d5);
        f.add(background);
        int fare1=fare+5;
        int fare2=fare+10;
        int fare3=fare+13;
        int fare4=fare-5;
        int fare5=fare-3;
        while (rb5.isSelected()){
            l3.setText(String.valueOf(fare1));
            l5.setText(String.valueOf(fare2));
            l7.setText(String.valueOf(fare3));
            l9.setText(String.valueOf(fare4));
            l11.setText(String.valueOf(fare5));
            break;
        }

        while (rb6.isSelected()){
            l3.setText(String.valueOf(fare1));
            l5.setText(String.valueOf(fare2));
            l7.setText(String.valueOf(fare3));
            l9.setText(String.valueOf(fare4));
            l11.setText(String.valueOf(fare5));
            break;
        }
        while (rb7.isSelected()){
            l3.setText(String.valueOf(fare1));
            l5.setText(String.valueOf(fare2));
            l7.setText(String.valueOf(fare3));
            l9.setText(String.valueOf(fare4));
            l11.setText(String.valueOf(fare5));
            break;
        }
        while (rb8.isSelected()){
            l3.setText(String.valueOf(fare1));
            l5.setText(String.valueOf(fare2));
            l7.setText(String.valueOf(fare3));
            l9.setText(String.valueOf(fare4));
            l11.setText(String.valueOf(fare5));
            break;
        }
        d1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               detials d =new detials(bg1,pickpoint,distination,distance,d1,  d2,  d3,  d4,  d5,  fare1,  fare2,  fare3,  fare4,  fare5);
            }
        });

        d2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                detials d =new detials(bg1,pickpoint,distination,distance,d1,  d2,  d3,  d4,  d5,  fare1,  fare2,  fare3,  fare4,  fare5);
            }
        });
        d3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                detials d =new detials(bg1,pickpoint,distination,distance,d1,  d2,  d3,  d4,  d5,  fare1,  fare2,  fare3,  fare4,  fare5);
            }
        });
        d4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               detials d =new detials(bg1,pickpoint,distination,distance,d1,  d2,  d3,  d4,  d5,  fare1,  fare2,  fare3,  fare4,  fare5);
            }
        });
        d5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               detials d =new detials(bg1,pickpoint,distination,distance,d1,  d2,  d3,  d4,  d5,  fare1,  fare2,  fare3,  fare4,  fare5);
            }
        });

    }
    public driver(int fare, String pickpoint, String distination, Integer distance, ButtonGroup bg1) {
    }

    public driver(int fare, JRadioButton rb5, JRadioButton rb6, JRadioButton rb7, JRadioButton rb8) {
    }

}