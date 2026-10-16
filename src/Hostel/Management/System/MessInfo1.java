/*package Hostel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class MessInfo1 extends JFrame {
    JTextField t2,t3,t4,t5,t6;
    JComboBox t7;
    JButton b1,b2;
    MessInfo1(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(10,40,900,450);
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try {

            con c = new con();
            String q = "select * from hms.messinfor";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch (Exception e ){
            e.printStackTrace();

        }

        JLabel l2 = new JLabel("Name");
        l2.setBounds(64,70,152,22);
        l2.setFont(new Font("Tahoma", Font.BOLD, 14));
        l2.setForeground(Color.WHITE);
        panel.add(l2);
        t2 =new JTextField();
        t2.setBounds(200,70,156,20);
        t2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t2.setForeground(Color.WHITE);
        t2.setBackground(new Color(16,108,115));
        panel.add(t2);

        JLabel l3 = new JLabel("Phone");
        l3.setBounds(64,110,152,22);
        l3.setFont(new Font("Tahoma", Font.BOLD, 14));
        l3.setForeground(Color.WHITE);
        panel.add(l3);
        t3 = new JTextField();
        t3.setBounds(200,110,156,20);
        t3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t3.setForeground(Color.WHITE);
        t3.setBackground(new Color(16,108,115));
        panel.add(t3);

        JLabel l4 = new JLabel("Price");
        l4.setBounds(64,150,152,22);
        l4.setFont(new Font("Tahoma", Font.BOLD, 14));
        l4.setForeground(Color.WHITE);
        panel.add(l4);
        t4 =new JTextField();
        t4.setBounds(200,190,156,20);
        t4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t4.setForeground(Color.WHITE);
        t4.setBackground(new Color(16,108,115));
        panel.add(t4);

        JLabel l5 = new JLabel("Gmail");
        l5.setBounds(64,190,152,22);
        l5.setFont(new Font("Tahoma", Font.BOLD, 14));
        l5.setForeground(Color.WHITE);
        panel.add(l5);
        t5 =new JTextField();
        t5.setBounds(200,150,156,20);
        t5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t5.setForeground(Color.WHITE);
        t5.setBackground(new Color(16,108,115));
        panel.add(t5);

        JLabel l6 = new JLabel("Address");
        l6.setBounds(64,230,152,22);
        l6.setFont(new Font("Tahoma", Font.BOLD, 14));
        l6.setForeground(Color.WHITE);
        panel.add(l6);
        t6 =new JTextField();
        t6.setBounds(200,230,156,20);
        t6.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t6.setForeground(Color.WHITE);
        t6.setBackground(new Color(16,108,115));
        panel.add(t6);

        JLabel l7 = new JLabel("Home Delivery");
        l7.setBounds(64,275,152,22);
        l7.setFont(new Font("Tahoma", Font.BOLD, 14));
        l7.setForeground(Color.WHITE);
        panel.add(l7);

        t7 =new JComboBox(new String[]{"Available", "Not-Available"});
        t7.setBounds(200,275,156,20);
        t7.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t7.setForeground(Color.WHITE);
        t7.setBackground(new Color(16,108,115));
        panel.add(t7);

        JButton back = new JButton("Back");
        back.setBounds(450,510,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });


        setUndecorated(true);
        setLayout(null);
        setSize(900,600);
        setLocation(500,100);
        setVisible(true);
    }
    public static void main(String[] args) {

        new MessInfo1();
    }
}

 */