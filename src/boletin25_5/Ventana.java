package boletin25_5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ventana implements ActionListener {

    JFrame marco;
    JPanel panel;
    JButton boton, boton1;
    JTextField text;

    public void amosar() {
        marco = new JFrame();
        panel = new JPanel();
        boton = new JButton("Debuxar");
        boton1 = new JButton("limpar");
        text = new JTextField(20);
        //panel.setLayout(null);
        panel.add(boton);
        panel.add(boton1);
        panel.add(text);
        boton.addActionListener(this);
        boton1.addActionListener(this);
        text.setText("0");

        marco.add(panel);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setSize(800, 600);
        marco.setLocationRelativeTo(null);
    }
        /**public void paintComponent(Graphics g){
            g.setColor(Color.red);
            g.fillOval(0, 0, 10, 10);
        }**/
    @Override
    public void actionPerformed(ActionEvent e) {
        if (boton == e.getSource()) {
         int x=(int)(Math.random()*700),y=(int)(Math.random()*600);
         int numCirculos=Integer.parseInt(text.getText());
            System.out.println("circ"+numCirculos);
            Graphics g=panel.getGraphics();
            for (int i = 0; i <numCirculos; i++) {
                g.setColor(Color.red);
                //g.drawOval(x+50, y+50, 80, 80);//circulo
                g.fillOval((int)(Math.random()*700),(int)(Math.random()*600), 80, 80);//redondo
                //x+=50;
                //y+=50;
            }
        }
        if (boton1 == e.getSource()) {
            panel.repaint();
        }
    }

}
