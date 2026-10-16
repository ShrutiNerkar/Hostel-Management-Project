package Hostel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Mess extends JFrame {

    Mess(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,990,590);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/customer.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(660,280,300,300);
        panel.add(label);

        JTable table = new JTable();
        table.setBounds(10,34,980,450);
        table.setForeground(Color.WHITE);
        table.setBackground(new Color(3,45,48));
        panel.add(table);

        try{
            con c = new con();
            String MessSQL = "select * from hms.messinfor";
            ResultSet resultSet = c.statement.executeQuery(MessSQL);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e){
            e.printStackTrace();
        }

        JButton back = new JButton("BACK");
        back.setBounds(350,500,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        JLabel name = new JLabel("Name");
        name.setBounds(70,11,70,19);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(name);

        JLabel phone = new JLabel("Phone");
        phone.setBounds(230,11,70,19);
        phone.setForeground(Color.WHITE);
        phone.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(phone);

        JLabel price = new JLabel("Price");
        price.setBounds(550,11,70,19);
        price.setForeground(Color.WHITE);
        price.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(price);

        JLabel gmail = new JLabel("Gmail");
        gmail.setBounds(390,11,70,19);
        gmail.setForeground(Color.WHITE);
        gmail.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(gmail);

        JLabel address = new JLabel("Address");
        address.setBounds(690,11,70,19);
        address.setForeground(Color.WHITE);
        address.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(address);

        JLabel delivery = new JLabel("HomeDelivery");
        delivery.setBounds(850,11,70,19);
        delivery.setForeground(Color.WHITE);
        delivery.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(delivery);


        setUndecorated(true);
        setLayout(null);
        setLocation(430,100);
        setSize(1000,600);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Mess();
    }
}
