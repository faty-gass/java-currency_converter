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

    static String print = "" ;
    static String printEUR = "" ;
    static String printUSD = "" ;
    static String printGBP = "" ;

    
    public void actionPerformed(ActionEvent event){
        String pressed = event.getActionCommand();
        System.out.println(pressed);
        if (pressed.charAt(0)>='0' && pressed.charAt(0)<='9' ){
        // number pressed    
            if (print == ""){
                print = pressed;
            } else {
                print += pressed ;
            }
            seeCurrent.setText(print);
            System.out.println("set char in print" +pressed);
        } else if (pressed == "Reset"){
        //reset button pressed
        System.out.println("in reset");
            print = printEUR = printGBP = printUSD = "";
            seeCurrent.setText(print);
            see$.setText(printUSD);
            see$.setBackground(new Color(220,216,247));
            see€.setText(printEUR);
            see€.setBackground(new Color(220,216,247));
            see£.setText(printGBP);
            see£.setBackground(new Color(220,216,247));
        } else if (pressed == "C"){
            System.out.println("in C");
        // correct button pressed
            if (print != ""){
                String newPrint = print.substring(0,print.length()-1);
                print = newPrint ;
                seeCurrent.setText(print);
            }
        } else if (pressed == "€"){
        // EUR button
            if (print != ""){
                see€.setBackground(new Color(35,166,25));
                see$.setBackground(new Color(220,216,247));
                see£.setBackground(new Color(220,216,247));
                Double valGBP = Rates.changeEurToGbp(Double.parseDouble(print));
                Double valUSD = Rates.changeEurToUsd(Double.parseDouble(print));
                printEUR = print ;
                printGBP = String.format("%.3f",valGBP);
                printUSD = String.format("%.3f",valUSD);
                seeCurrent.setText(print);
                see$.setText(printUSD);
                see€.setText(printEUR);
                see£.setText(printGBP);
            }
        } else if (pressed == "$"){
        // USD button
            if (print != ""){
                see$.setBackground(new Color(35,166,25));
                see€.setBackground(new Color(220,216,247));
                see£.setBackground(new Color(220,216,247));
                Double valGBP = Rates.changeUsdToGbp(Double.parseDouble(print));
                Double valEUR = Rates.changeUsdToEur(Double.parseDouble(print));
                printUSD = print ;
                printGBP = String.format("%.3f",valGBP);
                printEUR = String.format("%.3f",valEUR);
                seeCurrent.setText(print);
                see$.setText(printUSD);
                see€.setText(printEUR);
                see£.setText(printGBP);
            }
        } else if (pressed == "£"){
        // GBP button
            if (print != ""){
                see£.setBackground(new Color(35,166,25));
                see$.setBackground(new Color(220,216,247));
                see€.setBackground(new Color(220,216,247));
                Double valUSD = Rates.changeGbpToUsd(Double.parseDouble(print));
                Double valEUR = Rates.changeGbpToEur(Double.parseDouble(print));
                printGBP = print ;
                printUSD = String.format("%.3f",valUSD);
                printEUR = String.format("%.3f",valEUR);
                seeCurrent.setText(print);
                see$.setText(printUSD);
                see€.setText(printEUR);
                see£.setText(printGBP);
            }
        }
 
    }

    public static void main(String[] args) {
        window = new JFrame("Currency Converter");
        window.setSize(300, 450);
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
        //btn$.setForeground(new Color(255,255,255));
        btn£.addActionListener(conv);
        btn€.addActionListener(conv);
        btn0.addActionListener(conv);
        btn1.addActionListener(conv);
/*         btn1.setBackground(new Color(124,141,230));
        btn1.setForeground(new Color(255,255,255)); */
        btn2.addActionListener(conv);
/*         btn2.setBackground(new Color(124,141,230));
        btn2.setForeground(new Color(255,255,255)); */
        btn3.addActionListener(conv);
/*         btn3.setBackground(new Color(124,141,230));
        btn3.setForeground(new Color(255,255,255)); */
        btn4.addActionListener(conv);
        btn5.addActionListener(conv);
        btn6.addActionListener(conv);
        btn7.addActionListener(conv);
        btn8.addActionListener(conv);
        btn9.addActionListener(conv);
        btnC.addActionListener(conv);
        btnReset.addActionListener(conv);

        see€ = new JLabel();
        //see€.setBorder(BorderFactory.createEtchedBorder());
        see€.setBackground(new Color(220,216,247));
        see€.setOpaque(true);
        see$ = new JLabel();
        //see$.setBorder(BorderFactory.createEtchedBorder());
        see$.setBackground(new Color(220,216,247));
        see$.setOpaque(true);
        see£  = new JLabel();
        //see£.setBorder(BorderFactory.createEtchedBorder());
        see£.setBackground(new Color(220,216,247));
        see£.setOpaque(true);
        seeCurrent = new JLabel();
        //seeCurrent.setBorder(BorderFactory.createEtchedBorder());

        lbPanel = new JPanel(new GridBagLayout());
        lbPanel.setBackground(new Color(47,25,151));
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.weighty = 0.3;
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
        nbPanel.setBackground(new Color(47,25,151));
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
        mainPanel.setBackground(new Color(47,25,151));
        GridBagConstraints d = new GridBagConstraints();
        d.gridx = 0;
        d.gridy = 1;
        d.fill = GridBagConstraints.BOTH;
        d.insets = new InsetsUIResource(5, 7, 2, 7);
        d.weighty = 0.35;
        mainPanel.add(lbPanel,d);
        d.gridx = 0;
        d.gridy = 2;
        d.weighty = 0.1;
        d.insets = new InsetsUIResource(5, 7, 3, 7);
        mainPanel.add(viewPanel,d);
        d.gridx = 0;
        d.gridy = 3;
        d.weighty = 0.55;
        d.insets = new InsetsUIResource(0, 7, 10, 7);
        mainPanel.add(nbPanel,d);

        window.add(mainPanel);
        window.setVisible(true);
    }
}