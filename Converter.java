import javax.swing.*;
import javax.swing.plaf.InsetsUIResource;

import java.awt.event.*;
import java.awt.Color.*;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;

public class Converter extends JFrame implements ActionListener {
    static JFrame window;
    static JPanel mainPanel;
    static JPanel lbPanel;
    static JPanel viewPanel;
    static JPanel nbPanel;

    static JLabel see€;
    static JLabel see$;
    static JLabel see£;
    static JLabel seeCurrent;

    static JButton btn$;
    static JButton btn€;
    static JButton btn£;
    static JButton btn1;
    static JButton btn2;
    static JButton btn3;
    static JButton btn4;
    static JButton btn5;
    static JButton btn6;
    static JButton btn7;
    static JButton btn8;
    static JButton btn9;
    static JButton btn0;
    static JButton btnC;
    static JButton btnReset;


    
    public void actionPerformed(ActionEvent event){
        String pressed = event.getActionCommand();
        System.out.println(pressed);
    }

    public static void main(String[] args) {
        window = new JFrame("Currency Converter");
        window.setSize(350, 450);
        window.setVisible(true);

        btn$ = new JButton("$");
        btn£ = new JButton("£");
        btn€ = new JButton("€");
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btn0 = new JButton("0");
        btnC = new JButton("C");
        btnReset = new JButton("Reset");

        Converter conv = new Converter();
        btn$.addActionListener(conv);
        btn£.addActionListener(conv);
        btn€.addActionListener(conv);
        btn0.addActionListener(conv);
        btn1.addActionListener(conv);
        btn2.addActionListener(conv);
        btn3.addActionListener(conv);
        btn4.addActionListener(conv);
        btn5.addActionListener(conv);
        btn6.addActionListener(conv);
        btn7.addActionListener(conv);
        btn8.addActionListener(conv);
        btn9.addActionListener(conv);
        btnC.addActionListener(conv);
        btnReset.addActionListener(conv);

        see€ = new JLabel("euro label");
        see€.setBorder(BorderFactory.createEtchedBorder());
        see$ = new JLabel("$ label");
        see$.setBorder(BorderFactory.createEtchedBorder());
        see£  = new JLabel("£ label");
        see£.setBorder(BorderFactory.createEtchedBorder());
        seeCurrent = new JLabel("current number label");
        seeCurrent.setBorder(BorderFactory.createEtchedBorder());

        lbPanel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 0.2;
        c.fill = GridBagConstraints.BOTH;
        lbPanel.add(btn€,c);
        c.gridx = 1;
        c.gridy = 0;
        c.weightx = 0.8;        
        lbPanel.add(see€,c);
        c.gridx = 0;
        c.gridy = 1;
        c.weightx = 0.2;
        c.insets = new InsetsUIResource(6, 0, 6, 0);       
        lbPanel.add(btn$,c);
        c.gridx = 1;
        c.gridy = 1;
        c.weightx = 0.8;  
        lbPanel.add(see$,c);
        c.gridx = 0;
        c.gridy = 2;
        c.weightx = 0.2;
        c.insets = new InsetsUIResource(0, 0, 0, 0);      
        lbPanel.add(btn£,c);
        c.gridx = 1;
        c.gridy = 2;
        c.weightx = 0.8;         
        lbPanel.add(see£,c);
        
        viewPanel = new JPanel(new GridLayout(1,1));
        viewPanel.add(seeCurrent);

        nbPanel = new JPanel(new GridLayout(4,3,7,7));
        nbPanel.add(btn1);
        nbPanel.add(btn2);
        nbPanel.add(btn3);
        nbPanel.add(btn4);
        nbPanel.add(btn5);
        nbPanel.add(btn6);
        nbPanel.add(btn7);
        nbPanel.add(btn8);
        nbPanel.add(btn9);
        nbPanel.add(btnC);
        nbPanel.add(btn0);
        nbPanel.add(btnReset);

        mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints d = new GridBagConstraints();
        d.gridx = 0;
        d.gridy = 1;
        d.fill = GridBagConstraints.BOTH;
        d.insets = new InsetsUIResource(5, 10, 2, 10);
        d.weighty = 0.3;
        mainPanel.add(lbPanel,d);
        d.gridx = 0;
        d.gridy = 2;
        d.weighty = 0.1;
        d.insets = new InsetsUIResource(0, 10, 2, 10);
        mainPanel.add(viewPanel,d);
        d.gridx = 0;
        d.gridy = 3;
        d.weighty = 0.6;
        d.insets = new InsetsUIResource(5, 10, 10, 10);
        mainPanel.add(nbPanel,d);

        window.add(mainPanel);
        window.setVisible(true);
    }
}