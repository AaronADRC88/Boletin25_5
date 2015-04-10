package boletin25_5;

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
        text = new JTextField(0);
        //panel.setLayout(null);
        panel.add(boton);
        panel.add(boton1);
        panel.add(text);
        boton.addActionListener(this);

        marco.add(panel);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setSize(400, 300);
        marco.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (boton == e.getSource()) {
            text.setText("Premiches");
        }
    }

}
