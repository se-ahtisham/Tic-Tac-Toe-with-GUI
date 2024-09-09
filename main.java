import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

public class main {

    static JFrame jFrame = new JFrame();
    static JFrame resultFrame = new JFrame();
    static JButton exit, tryAgain;
    static JButton oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn;

    static boolean playerOneRole = false;
    static boolean playerTwoRole = false;


    public static boolean WinningCondition(JButton oneBtn, JButton twoBtn, JButton threeBtn, JButton fourBtn, JButton fiveBtn, JButton sixBtn, JButton sevenBtn, JButton eightBtn, JButton nineBtn) {
        return (!oneBtn.getText().equals(" ") && oneBtn.getText().equals(twoBtn.getText()) && twoBtn.getText().equals(threeBtn.getText())) ||
                (!fourBtn.getText().equals(" ") && fourBtn.getText().equals(fiveBtn.getText()) && fiveBtn.getText().equals(sixBtn.getText())) ||
                (!sevenBtn.getText().equals(" ") && sevenBtn.getText().equals(eightBtn.getText()) && eightBtn.getText().equals(nineBtn.getText())) ||
                (!oneBtn.getText().equals(" ") && oneBtn.getText().equals(fourBtn.getText()) && fourBtn.getText().equals(sevenBtn.getText())) ||
                (!twoBtn.getText().equals(" ") && twoBtn.getText().equals(fiveBtn.getText()) && fiveBtn.getText().equals(eightBtn.getText())) ||
                (!threeBtn.getText().equals(" ") && threeBtn.getText().equals(sixBtn.getText()) && sixBtn.getText().equals(nineBtn.getText())) ||
                (!oneBtn.getText().equals(" ") && oneBtn.getText().equals(fiveBtn.getText()) && fiveBtn.getText().equals(nineBtn.getText())) ||
                (!threeBtn.getText().equals(" ") && threeBtn.getText().equals(fiveBtn.getText()) && fiveBtn.getText().equals(sevenBtn.getText()));
    }


    public static boolean isDraw(JButton oneBtn, JButton twoBtn, JButton threeBtn, JButton fourBtn, JButton fiveBtn, JButton sixBtn, JButton sevenBtn, JButton eightBtn, JButton nineBtn) {
        return !oneBtn.getText().equals(" ") &&
                !twoBtn.getText().equals(" ") &&
                !threeBtn.getText().equals(" ") &&
                !fourBtn.getText().equals(" ") &&
                !fiveBtn.getText().equals(" ") &&
                !sixBtn.getText().equals(" ") &&
                !sevenBtn.getText().equals(" ") &&
                !eightBtn.getText().equals(" ") &&
                !nineBtn.getText().equals(" ");
    }



   public static JTextField playerOneTextField = new JTextField();
    public static  JTextField playerTwoTextField = new JTextField();


    public static void toss()
    {
        Random random = new Random();
        boolean toss = random.nextBoolean();
        if (toss) {
            playerOneTextField.setForeground(new Color(38, 50, 56));
            playerOneTextField.setBackground(new Color(119, 158, 203));
            playerTwoTextField.setForeground(new Color(119, 158, 203));
            playerTwoTextField.setBackground(new Color(38, 50, 56));
            playerOneRole = true;


        } else {
            playerTwoTextField.setForeground(new Color(38, 50, 56));
            playerTwoTextField.setBackground(new Color(119, 158, 203));
            playerOneTextField.setForeground(new Color(119, 158, 203));
            playerOneTextField.setBackground(new Color(38, 50, 56));
            playerTwoRole = true;
        }

    }


    public static void main(String[] args) {

        JFrame introFrame = new JFrame();
        introFrame.setTitle("Tic-Tac-Toe");
        introFrame.setBounds(700, 350, 500, 390);
        introFrame.getContentPane().setBackground(new Color(38, 50, 56));
        introFrame.setLayout(null);
        ImageIcon firstIcon = new ImageIcon("D:\\Java\\tic-tac-toe-game-Java\\Icon.jfif");
        introFrame.setIconImage(firstIcon.getImage());

        JTextField introFirstField = new JTextField();
        introFirstField.setText("Welcome!");
        introFirstField.setFont(new Font("Verdana", Font.BOLD, 40));
        introFirstField.setBounds(20, 30, 450, 50);
        introFirstField.setForeground(new Color(119, 158, 203));
        introFirstField.setBackground(new Color(38, 50, 56));
        introFirstField.setVisible(true);
        introFirstField.setHorizontalAlignment(JTextField.CENTER);
        introFirstField.setBorder(BorderFactory.createEmptyBorder());
        introFirstField.setLayout(null);


        JTextField playerOneName = new JTextField();
        playerOneName.setFont(new Font("Verdana", Font.PLAIN, 20));
        playerOneName.setBounds(20, 115, 350, 50);
        playerOneName.setBackground(new Color(33, 45, 51));
        playerOneName.setForeground(new Color(119, 158, 203));
        playerOneName.setVisible(true);
        playerOneName.setHorizontalAlignment(JTextField.LEFT);
        playerOneName.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 10)); // Top, Left, Bottom, Right padding
        playerOneName.setLayout(null);

        JTextField playerOneSign = new JTextField();
        playerOneSign.setFont(new Font("Verdana", Font.BOLD, 60));
        playerOneSign.setText("X");
        playerOneSign.setBounds(400, 100, 70, 70);
        playerOneSign.setBackground(new Color(38, 50, 56));
        playerOneSign.setForeground(new Color(119, 158, 203));
        playerOneSign.setHorizontalAlignment(JTextField.CENTER);
        playerOneSign.setBorder(BorderFactory.createEmptyBorder());
        playerOneSign.setLayout(null);

        JTextField playerTwoName = new JTextField();
        playerTwoName.setFont(new Font("Verdana", Font.PLAIN, 20));
        playerTwoName.setBounds(20, 185, 350, 50);
        playerTwoName.setBackground(new Color(33, 45, 51));
        playerTwoName.setForeground(new Color(119, 158, 203));
        playerTwoName.setHorizontalAlignment(JTextField.LEFT);
        playerTwoName.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 10)); // Top, Left, Bottom, Right padding
        playerTwoName.setLayout(null);

        JTextField playerTwoSign = new JTextField();
        playerTwoSign.setFont(new Font("Verdana", Font.BOLD, 60));
        playerTwoSign.setText("O");
        playerTwoSign.setBounds(400, 173, 70, 70);
        playerTwoSign.setBackground(new Color(38, 50, 56));
        playerTwoSign.setForeground(new Color(119, 158, 203));
        playerTwoSign.setHorizontalAlignment(JTextField.CENTER);
        playerTwoSign.setBorder(BorderFactory.createEmptyBorder());
        playerTwoSign.setLayout(null);


        JFrame jFrame = new JFrame();
        jFrame.setTitle("Tic-Tac-Toe");
        jFrame.setBounds(700, 250, 500, 640);
        jFrame.getContentPane().setBackground(new Color(38, 50, 56));
        jFrame.setLayout(null);
        ImageIcon imageIcon = new ImageIcon("D:\\Java\\tic-tac-toe-game-Java\\Icon.jfif");
        jFrame.setIconImage(imageIcon.getImage());


        playerOneTextField.setText(playerOneName.getText());
        playerOneTextField.setBounds(60, 40, 110, 50);
        playerOneTextField.setBackground(new Color(33, 45, 51));
        playerOneTextField.setForeground(new Color(180, 180, 180));
        playerOneTextField.setHorizontalAlignment(JTextField.CENTER);
        playerOneTextField.setFont(new Font("Verdana", Font.PLAIN, 15));
        playerOneTextField.setVisible(true);
        playerOneTextField.setBorder(BorderFactory.createEmptyBorder());
        playerOneTextField.setAlignmentY(JTextField.CENTER);
        playerOneTextField.setLayout(null);
        playerOneTextField.setEditable(false);
        playerOneTextField.setFocusable(false);

        JTextField VS = new JTextField();
        VS.setText("VS");
        VS.setFont(new Font("Verdana", Font.BOLD, 30));
        VS.setBounds(215, 40, 50, 50);
        VS.setForeground(new Color(119, 158, 203));
        VS.setBackground(new Color(38, 50, 56));
        VS.setVisible(true);
        VS.setHorizontalAlignment(JTextField.CENTER);
        VS.setBorder(BorderFactory.createEmptyBorder());
        VS.setLayout(null);


        playerTwoTextField.setEditable(false);
        playerTwoTextField.setText(playerTwoName.getText());
        playerTwoTextField.setFont(new Font("Verdana", Font.PLAIN, 15));
        playerTwoTextField.setBounds(310, 40, 110, 50);
        playerTwoTextField.setBackground(new Color(33, 45, 51));
        playerTwoTextField.setForeground(new Color(180, 180, 180));
        playerTwoTextField.setVisible(true);
        playerTwoTextField.setHorizontalAlignment(JTextField.CENTER);
        playerTwoTextField.setBorder(BorderFactory.createEmptyBorder());
        playerTwoTextField.setLayout(null);

        JButton submit = new JButton();
        submit.setText("Let's Play Game:)");
        submit.setFont(new Font("Verdana", Font.BOLD, 20));
        submit.setBounds(20, 270, 440, 50);
        submit.setBackground(new Color(119, 158, 203));
        submit.setForeground(new Color(33, 45, 51));
        submit.setHorizontalAlignment(JTextField.CENTER);
        submit.setBorder(BorderFactory.createEmptyBorder());
        submit.setLayout(null);
        submit.setFocusable(false);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                playerOneTextField.setText(playerOneName.getText());
                playerTwoTextField.setText(playerTwoName.getText());
                jFrame.add(oneBtn);
                jFrame.add(twoBtn);
                jFrame.add(threeBtn);
                jFrame.add(fourBtn);
                jFrame.add(fiveBtn);
                jFrame.add(sixBtn);
                jFrame.add(sevenBtn);
                jFrame.add(eightBtn);
                jFrame.add(nineBtn);
                jFrame.add(playerOneTextField);
                jFrame.add(VS);
                jFrame.add(playerTwoTextField);
                oneBtn.setText(" ");
                twoBtn.setText(" ");
                threeBtn.setText(" ");
                fourBtn.setText(" ");
                fiveBtn.setText(" ");
                sixBtn.setText(" ");
                sevenBtn.setText(" ");
                eightBtn.setText(" ");
                nineBtn.setText(" ");
                jFrame.setVisible(true);
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });


        introFrame.add(introFirstField);
        introFrame.add(playerOneName);
        introFrame.add(playerOneSign);
        introFrame.add(playerTwoName);
        introFrame.add(playerTwoSign);
        introFrame.add(submit);
        introFrame.setVisible(true);


        resultFrame.setTitle("Tic-Tac-Toe");
        resultFrame.setBounds(700, 350, 500, 300);
        resultFrame.getContentPane().setBackground(new Color(38, 50, 56));
        resultFrame.setLayout(null);
        ImageIcon secondIcon = new ImageIcon("D:\\Java\\tic-tac-toe-game-Java\\Icon.jfif");
        resultFrame.setIconImage(secondIcon.getImage());

        JTextField restultField = new JTextField();
        restultField.setText("Congratulation!!");
        restultField.setFont(new Font("Verdana", Font.BOLD, 40));
        restultField.setBounds(20, 45, 450, 50);
        restultField.setForeground(new Color(119, 158, 203));
        restultField.setBackground(new Color(38, 50, 56));
        restultField.setVisible(true);
        restultField.setHorizontalAlignment(JTextField.CENTER);
        restultField.setBorder(BorderFactory.createEmptyBorder());
        restultField.setLayout(null);

        JTextField restultScondField = new JTextField();
        restultScondField.setFont(new Font("Verdana", Font.PLAIN, 20));
        restultScondField.setBounds(20, 100, 450, 50);
        restultScondField.setForeground(new Color(119, 158, 203));
        restultScondField.setBackground(new Color(38, 50, 56));
        restultScondField.setVisible(true);
        restultScondField.setHorizontalAlignment(JTextField.CENTER);
        restultScondField.setBorder(BorderFactory.createEmptyBorder());
        restultScondField.setLayout(null);

toss();

        oneBtn = new JButton();
        oneBtn.setText(" ");
        oneBtn.setBounds(60, 120, 110, 110);
        oneBtn.setFont(new Font("Verdana", Font.BOLD, 50));
        oneBtn.setFocusable(false);
        oneBtn.setHorizontalAlignment(JTextField.CENTER);
        oneBtn.setBackground(new Color(33, 44, 49));
        oneBtn.setForeground(new Color(119, 158, 203));
        oneBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(oneBtn);


        oneBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (oneBtn.getText().contains(" ")) {
                    if (playerOneRole) {
                        oneBtn.setText("X");
                        playerTwoRole = true;
                        playerOneRole = false;
                        if (WinningCondition(oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn)) {
                            resultFrame.setVisible(true);
                            restultScondField.setText(playerOneTextField.getText() + " Wins the Match!");
                            resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            return;
                        }
                        playerTwoTextField.setForeground(new Color(38, 50, 56));
                        playerTwoTextField.setBackground(new Color(119, 158, 203));
                        playerOneTextField.setForeground(new Color(119, 158, 203));
                        playerOneTextField.setBackground(new Color(38, 50, 56));
                    } else {
                        oneBtn.setText("0"); //player two turn
                        playerOneRole = true;
                        playerTwoRole = false;
                        if (WinningCondition(oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn)) {
                            resultFrame.setVisible(true);
                            restultScondField.setText(playerTwoTextField.getText() + " Wins the Match!");
                            resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            return;
                        }
                        playerOneTextField.setForeground(new Color(38, 50, 56));
                        playerOneTextField.setBackground(new Color(119, 158, 203));
                        playerTwoTextField.setForeground(new Color(119, 158, 203));
                        playerTwoTextField.setBackground(new Color(38, 50, 56));
                    }
                } else if (isDraw(oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn)) {
                    resultFrame.setVisible(true);
                    restultScondField.setText("It's a Draw!");
                    resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }
        });


        twoBtn = new JButton();
        twoBtn.setText(" ");
        twoBtn.setBounds(185, 120, 110, 110);
        twoBtn.setFont(new Font("Verdana", Font.BOLD, 50));
        twoBtn.setFocusable(false);
        twoBtn.setHorizontalAlignment(JTextField.CENTER);
        twoBtn.setBackground(new Color(33, 44, 49));
        twoBtn.setForeground(new Color(119, 158, 203));
        twoBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(twoBtn);


        twoBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (twoBtn.getText().contains(" ")) {
                    if (playerOneRole) { //player one turn

                        twoBtn.setText("X");
                        playerTwoRole = true; // Update roles
                        playerOneRole = false;
                        if (WinningCondition(oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn)) {
                            resultFrame.setVisible(true);
                            restultScondField.setText(playerOneTextField.getText() + " Wins the Match!");
                            resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            return;
                        }
                        playerTwoTextField.setForeground(new Color(38, 50, 56));
                        playerTwoTextField.setBackground(new Color(119, 158, 203));
                        playerOneTextField.setForeground(new Color(119, 158, 203));
                        playerOneTextField.setBackground(new Color(38, 50, 56));
                    } else {

                        twoBtn.setText("0"); //player two turn
                        playerOneRole = true;
                        playerTwoRole = false;
                        if (WinningCondition(oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn)) {
                            resultFrame.setVisible(true);
                            restultScondField.setText(playerTwoTextField.getText() + " Wins the Match!");
                            resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            return;
                        }
                        playerOneTextField.setForeground(new Color(38, 50, 56));
                        playerOneTextField.setBackground(new Color(119, 158, 203));
                        playerTwoTextField.setForeground(new Color(119, 158, 203));
                        playerTwoTextField.setBackground(new Color(38, 50, 56));
                    }
                } else if (isDraw(oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn)) {
                    resultFrame.setVisible(true);
                    restultScondField.setText("It's a Draw!");
                    resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }

            }
        });


        threeBtn = new JButton();
        threeBtn.setText(" ");
        threeBtn.setBounds(310, 120, 110, 110);
        threeBtn.setFont(new Font("Verdana", Font.BOLD, 50));
        threeBtn.setFocusable(false);
        threeBtn.setHorizontalAlignment(JTextField.CENTER);
        threeBtn.setBackground(new Color(33, 44, 49));
        threeBtn.setForeground(new Color(119, 158, 203));
        threeBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(threeBtn);

        threeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (threeBtn.getText().contains(" ")) {
                    if (playerOneRole) { //player one turn
                        threeBtn.setText("X");
                        playerTwoRole = true; // Update roles
                        playerOneRole = false;
                        if (WinningCondition(oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn)) {
                            resultFrame.setVisible(true);
                            restultScondField.setText(playerOneTextField.getText() + " Wins the Match!");
                            resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            return;
                        }
                        playerTwoTextField.setForeground(new Color(38, 50, 56));
                        playerTwoTextField.setBackground(new Color(119, 158, 203));
                        playerOneTextField.setForeground(new Color(119, 158, 203));
                        playerOneTextField.setBackground(new Color(38, 50, 56));
                    } else {
                        threeBtn.setText("0"); //player two turn
                        playerOneRole = true;
                        playerTwoRole = false;
                        if (WinningCondition(oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn)) {
                            resultFrame.setVisible(true);
                            restultScondField.setText(playerTwoTextField.getText() + " Wins the Match!");
                            resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            return;
                        }
                        playerOneTextField.setForeground(new Color(38, 50, 56));
                        playerOneTextField.setBackground(new Color(119, 158, 203));
                        playerTwoTextField.setForeground(new Color(119, 158, 203));
                        playerTwoTextField.setBackground(new Color(38, 50, 56));
                    }
                } else if (isDraw(oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn)) {
                    resultFrame.setVisible(true);
                    restultScondField.setText("It's a Draw!");
                    resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }
        });


        fourBtn = new JButton();
        fourBtn.setText(" "); // will be empyet
        fourBtn.setBounds(60, 245, 110, 110);
        fourBtn.setFont(new Font("Verdana", Font.BOLD, 50));
        fourBtn.setFocusable(false);
        fourBtn.setHorizontalAlignment(JTextField.CENTER);
        fourBtn.setBackground(new Color(33, 44, 49));
        fourBtn.setForeground(new Color(119, 158, 203));
        fourBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(fourBtn);


        fourBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (fourBtn.getText().contains(" ")) {
                    if (playerOneRole) { //player one turn
                        fourBtn.setText("X");
                        playerTwoRole = true; // Update roles
                        playerOneRole = false;
                        if (WinningCondition(oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn)) {
                            resultFrame.setVisible(true);
                            restultScondField.setText(playerOneTextField.getText() + " Wins the Match!");
                            resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            return;
                        }
                        playerTwoTextField.setForeground(new Color(38, 50, 56));
                        playerTwoTextField.setBackground(new Color(119, 158, 203));
                        playerOneTextField.setForeground(new Color(119, 158, 203));
                        playerOneTextField.setBackground(new Color(38, 50, 56));

                    } else {
                        fourBtn.setText("0"); //player two turn
                        playerOneRole = true;
                        playerTwoRole = false;
                        if (WinningCondition(oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn)) {
                            resultFrame.setVisible(true);
                            restultScondField.setText(playerTwoTextField.getText() + " Wins the Match!");
                            resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            return;
                        }
                        playerOneTextField.setForeground(new Color(38, 50, 56));
                        playerOneTextField.setBackground(new Color(119, 158, 203));
                        playerTwoTextField.setForeground(new Color(119, 158, 203));
                        playerTwoTextField.setBackground(new Color(38, 50, 56));

                    }
                } else if (isDraw(oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn)) {
                    resultFrame.setVisible(true);
                    restultScondField.setText("It's a Draw!");
                    resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }

            }
        });


        fiveBtn = new JButton();
        fiveBtn.setText(" ");
        fiveBtn.setBounds(185, 245, 110, 110);
        fiveBtn.setFont(new Font("Verdana", Font.BOLD, 50));
        fiveBtn.setFocusable(false);
        fiveBtn.setHorizontalAlignment(JTextField.CENTER);
        fiveBtn.setBackground(new Color(33, 44, 49));
        fiveBtn.setForeground(new Color(119, 158, 203));
        fiveBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(fiveBtn);

        fiveBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (fiveBtn.getText().contains(" ")) {
                    if (playerOneRole) { //player one turn
                        fiveBtn.setText("X");
                        playerTwoRole = true; // Update roles
                        playerOneRole = false;
                        if (WinningCondition(oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn)) {
                            resultFrame.setVisible(true);
                            restultScondField.setText(playerOneTextField.getText() + " Wins the Match!");
                            resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            return;
                        }
                        playerTwoTextField.setForeground(new Color(38, 50, 56));
                        playerTwoTextField.setBackground(new Color(119, 158, 203));
                        playerOneTextField.setForeground(new Color(119, 158, 203));
                        playerOneTextField.setBackground(new Color(38, 50, 56));
                    } else {
                        fiveBtn.setText("0"); //player two turn
                        playerOneRole = true;
                        playerTwoRole = false;
                        if (WinningCondition(oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn)) {
                            resultFrame.setVisible(true);
                            restultScondField.setText(playerTwoTextField.getText() + " Wins the Match!");
                            resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            return;
                        }
                        playerOneTextField.setForeground(new Color(38, 50, 56));
                        playerOneTextField.setBackground(new Color(119, 158, 203));
                        playerTwoTextField.setForeground(new Color(119, 158, 203));
                        playerTwoTextField.setBackground(new Color(38, 50, 56));
                    }
                } else if (isDraw(oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn)) {
                    resultFrame.setVisible(true);
                    restultScondField.setText("It's a Draw!");
                    resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }
        });


        sixBtn = new JButton();
        sixBtn.setText(" "); // will be empyet
        sixBtn.setBounds(310, 245, 110, 110);
        sixBtn.setFont(new Font("Verdana", Font.BOLD, 50));
        sixBtn.setFocusable(false);
        sixBtn.setHorizontalAlignment(JTextField.CENTER);
        sixBtn.setBackground(new Color(33, 44, 49));
        sixBtn.setForeground(new Color(119, 158, 203));
        sixBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(sixBtn);


        sixBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (sixBtn.getText().contains(" ")) {
                    if (playerOneRole) { //player one turn
                        sixBtn.setText("X");
                        playerTwoRole = true; // Update roles
                        playerOneRole = false;
                        playerTwoTextField.setForeground(new Color(38, 50, 56));
                        playerTwoTextField.setBackground(new Color(119, 158, 203));
                        playerOneTextField.setForeground(new Color(119, 158, 203));
                        playerOneTextField.setBackground(new Color(38, 50, 56));
                        if (WinningCondition(oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn)) {
                            resultFrame.setVisible(true);
                            restultScondField.setText(playerOneTextField.getText() + " Wins the Match!");
                            resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            return;
                        }
                    } else {
                        sixBtn.setText("0"); //player two turn
                        playerOneRole = true;
                        playerTwoRole = false;
                        if (WinningCondition(oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn)) {
                            resultFrame.setVisible(true);
                            restultScondField.setText(playerTwoTextField.getText() + " Wins the Match!");
                            resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            return;
                        }
                        playerOneTextField.setForeground(new Color(38, 50, 56));
                        playerOneTextField.setBackground(new Color(119, 158, 203));
                        playerTwoTextField.setForeground(new Color(119, 158, 203));
                        playerTwoTextField.setBackground(new Color(38, 50, 56));
                    }
                } else if (isDraw(oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn)) {
                    resultFrame.setVisible(true);
                    restultScondField.setText("It's a Draw!");
                    resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }

            }
        });


        sevenBtn = new JButton();
        sevenBtn.setText(" ");
        sevenBtn.setBounds(60, 370, 110, 110);
        sevenBtn.setFont(new Font("Verdana", Font.BOLD, 50));
        sevenBtn.setFocusable(false);
        sevenBtn.setHorizontalAlignment(JTextField.CENTER);
        sevenBtn.setBackground(new Color(33, 44, 49));
        sevenBtn.setForeground(new Color(119, 158, 203));
        sevenBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(sevenBtn);


        sevenBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (sevenBtn.getText().contains(" ")) {
                    if (playerOneRole) { //player one turn
                        sevenBtn.setText("X");
                        playerTwoRole = true; // Update roles
                        playerOneRole = false;
                        if (WinningCondition(oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn)) {
                            resultFrame.setVisible(true);
                            restultScondField.setText(playerOneTextField.getText() + " Wins the Match!");
                            resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            return;
                        }
                        playerTwoTextField.setForeground(new Color(38, 50, 56));
                        playerTwoTextField.setBackground(new Color(119, 158, 203));
                        playerOneTextField.setForeground(new Color(119, 158, 203));
                        playerOneTextField.setBackground(new Color(38, 50, 56));
                    } else {
                        sevenBtn.setText("0"); //player two turn
                        playerOneRole = true;
                        playerTwoRole = false;
                        if (WinningCondition(oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn)) {
                            resultFrame.setVisible(true);
                            restultScondField.setText(playerTwoTextField.getText() + " Wins the Match!");
                            resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            return;
                        }
                        playerOneTextField.setForeground(new Color(38, 50, 56));
                        playerOneTextField.setBackground(new Color(119, 158, 203));
                        playerTwoTextField.setForeground(new Color(119, 158, 203));
                        playerTwoTextField.setBackground(new Color(38, 50, 56));
                    }
                } else if (isDraw(oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn)) {
                    resultFrame.setVisible(true);
                    restultScondField.setText("It's a Draw!");
                    resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }
        });


        eightBtn = new JButton();
        eightBtn.setText(" ");
        eightBtn.setBounds(185, 370, 110, 110);
        eightBtn.setFont(new Font("Verdana", Font.BOLD, 50));
        eightBtn.setFocusable(false);
        eightBtn.setHorizontalAlignment(JTextField.CENTER);
        eightBtn.setBackground(new Color(33, 44, 49));
        eightBtn.setForeground(new Color(119, 158, 203));
        eightBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(eightBtn);

        eightBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (eightBtn.getText().contains(" ")) {
                    if (playerOneRole) { //player one turn
                        eightBtn.setText("X");
                        playerTwoRole = true; // Update roles
                        playerOneRole = false;
                        if (WinningCondition(oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn)) {
                            resultFrame.setVisible(true);
                            restultScondField.setText(playerOneTextField.getText() + " Wins the Match!");
                            resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            return;
                        }
                        playerTwoTextField.setForeground(new Color(38, 50, 56));
                        playerTwoTextField.setBackground(new Color(119, 158, 203));
                        playerOneTextField.setForeground(new Color(119, 158, 203));
                        playerOneTextField.setBackground(new Color(38, 50, 56));
                    } else {
                        eightBtn.setText("0"); //player two turn
                        playerOneRole = true;
                        playerTwoRole = false;
                        if (WinningCondition(oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn)) {
                            resultFrame.setVisible(true);
                            restultScondField.setText(playerTwoTextField.getText() + " Wins the Match!");
                            resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            return;
                        }
                        playerOneTextField.setForeground(new Color(38, 50, 56));
                        playerOneTextField.setBackground(new Color(119, 158, 203));
                        playerTwoTextField.setForeground(new Color(119, 158, 203));
                        playerTwoTextField.setBackground(new Color(38, 50, 56));
                    }
                } else if (isDraw(oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn)) {
                    resultFrame.setVisible(true);
                    restultScondField.setText("It's a Draw!");
                    resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }
        });


        nineBtn = new JButton();
        nineBtn.setText(" "); // will be empyet
        nineBtn.setBounds(310, 370, 110, 110);
        nineBtn.setFont(new Font("Verdana", Font.BOLD, 50));
        nineBtn.setFocusable(false);
        nineBtn.setHorizontalAlignment(JTextField.CENTER);
        nineBtn.setBackground(new Color(33, 44, 49));
        nineBtn.setForeground(new Color(119, 158, 203));
        nineBtn.setBorder(BorderFactory.createEmptyBorder());
        jFrame.add(nineBtn);
        nineBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (nineBtn.getText().contains(" ")) {
                    if (playerOneRole) { //player one turn
                        nineBtn.setText("X");
                        playerTwoRole = true; // Update roles
                        playerOneRole = false;
                        if (WinningCondition(oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn)) {
                            resultFrame.setVisible(true);
                            restultScondField.setText(playerOneTextField.getText() + " Wins the Match!");
                            resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            return;
                        }
                        playerTwoTextField.setForeground(new Color(38, 50, 56));
                        playerTwoTextField.setBackground(new Color(119, 158, 203));
                        playerOneTextField.setForeground(new Color(119, 158, 203));
                        playerOneTextField.setBackground(new Color(38, 50, 56));

                    } else {
                        nineBtn.setText("0"); //player two turn
                        playerOneRole = true;
                        playerTwoRole = false;
                        if (WinningCondition(oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn)) {
                            resultFrame.setVisible(true);
                            restultScondField.setText(playerTwoTextField.getText() + " Wins the Match!");
                            resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            return;
                        }
                        playerOneTextField.setForeground(new Color(38, 50, 56));
                        playerOneTextField.setBackground(new Color(119, 158, 203));
                        playerTwoTextField.setForeground(new Color(119, 158, 203));
                        playerTwoTextField.setBackground(new Color(38, 50, 56));
                    }
                } else if (isDraw(oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn, sixBtn, sevenBtn, eightBtn, nineBtn)) {
                    resultFrame.setVisible(true);
                    restultScondField.setText("It's a Draw!");
                    resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }
        });


        tryAgain = new JButton();
        tryAgain.setText("PLAY AGAIN");
        tryAgain.setBounds(170, 180, 150, 50);
        tryAgain.setBackground(new Color(119, 158, 203));
        tryAgain.setForeground(new Color(33, 45, 51));
        tryAgain.setHorizontalAlignment(JButton.CENTER);
        tryAgain.setFont(new Font("Verdana", Font.PLAIN, 15));
        tryAgain.setBorder(BorderFactory.createEmptyBorder());
        tryAgain.setLayout(null);
        tryAgain.setFocusable(false);
        tryAgain.setVisible(true);

        tryAgain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.add(oneBtn);
                jFrame.add(oneBtn);
                jFrame.add(twoBtn);
                jFrame.add(threeBtn);
                jFrame.add(fourBtn);
                jFrame.add(fiveBtn);
                jFrame.add(sixBtn);
                jFrame.add(sevenBtn);
                jFrame.add(eightBtn);
                jFrame.add(nineBtn);
                jFrame.add(playerOneTextField);
                jFrame.add(VS);
                jFrame.add(playerTwoTextField);
                oneBtn.setText(" ");
                twoBtn.setText(" ");
                threeBtn.setText(" ");
                fourBtn.setText(" ");
                fiveBtn.setText(" ");
                sixBtn.setText(" ");
                sevenBtn.setText(" ");
                eightBtn.setText(" ");
                nineBtn.setText(" ");
                jFrame.setVisible(true);
                jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                toss();
            }
        });

        resultFrame.add(tryAgain);
        resultFrame.add(restultField);
        resultFrame.add(restultScondField);
        resultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
