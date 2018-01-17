import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePanel extends JPanel implements ActionListener {
    ParentPanel parent;
    Game game;
    JButton dice, tutorialButton;
    JButton boostMeButton;
    boolean isRolling = false;
    int numberRolled;

    GamePanel(Game myGame, ParentPanel parentPanel) {
        game = myGame;
        parent = parentPanel;

        setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 20));

        dice = new JButton("Roll the Dice");
        dice.addActionListener(this);
        add(dice, BorderLayout.NORTH);

        tutorialButton = new JButton("Back to tutorial");
        add(tutorialButton);
        tutorialButton.addActionListener(this);

        boostMeButton = new JButton("EMERGENCY $100 BOOST");
        add(boostMeButton);
        boostMeButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(dice == e.getSource()){
            isRolling = true;
            numberRolled = (int)(Math.random()* 5 + 1);
            game.currentPosition += numberRolled;

            if(game.currentPosition > 30){
                game.currentPosition = game.currentPosition % 30;
                game.playerBalance += game.moneyInBank * 2;
                game.currentLevel++;
                if (game.currentLevel > 11){
                    parent.ShowYouWinPanel();
                }
                else {
                    parent.ShowBankPanel();
                }
            }

            double charge = game.charges[game.currentPosition - 1] * (1 +game.currentLevel/2.5);
            game.playerBalance += charge;

            if(game.playerBalance < 0){
                parent.ShowGameOverPanel();
            }
            repaint();
        }

        if(tutorialButton == e.getSource()){
            parent.ShowTutorialPanel();
        }

        if(boostMeButton == e.getSource()){
            game.playerBalance += 100;
            boostMeButton.setVisible(false);
        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //change the backgrounds according to the months
        if (game.currentLevel == 0 || game.currentLevel == 5 || game.currentLevel == 7 || game.currentLevel == 11) {
            Color color = new Color(199, 255, 253);
            setBackground(color);
        } else if (game.currentLevel == 9 || game.currentLevel == 10) {
            Color color = new Color(235, 226, 163);
            setBackground(color);
        } else if (game.currentLevel == 2 || game.currentLevel == 8) {
            Color color = new Color(210, 235, 159);
            setBackground(color);
        } else if (game.currentLevel == 3 || game.currentLevel == 6) {
            Color color = new Color(255, 251, 171);
            setBackground(color);
        } else {
            Color color = new Color(255, 189, 247);
            setBackground(color);
        }

        g.setFont(new Font("Utopia", Font.BOLD, 24));
        g.setColor(Color.BLUE);
        g.drawString("Current Balance: "+ game.playerBalance, 300, 100);

        g.drawString("Money in Savings Account: " + game.moneyInBank, 600, 100);
        g.drawString(game.months[game.currentLevel], 1000, 100);

        Image boardImage = Toolkit.getDefaultToolkit().getImage("Calendarr.jpg");
        g.drawImage(boardImage, 0, 200, 1600, 1100, 3, 25, 1099, 691, this);

        int startX = 0;
        int startY = 200;
        int squareWidth = 215;
        int squareHeight = 180;

        Font chargeFont = new Font("Utopia", Font.BOLD, 12);
        g.setFont(chargeFont);

        for(int i = 0; i < 31; i++){
            //local variables for the
            int sqWidth = 225;
            int sqHeight = 180;
            int topX = startX + ((i % 7)* sqWidth) + 10;
            int topY =  startY + ((i/7) * sqHeight) + 55;
            g.setColor(Color.BLACK);
            g.drawString(game.prompts[i], topX, topY);

            double charge = (int)Math.abs(game.charges[i] * (1 + game.currentLevel/2.5));
            if(game.charges[i] < 0){
                g.setColor(Color.RED);
                g.drawString("Pay $" + charge, topX, topY + 12);
            }
            else{
                Color myGreen = new Color(0, 112, 0);
                g.setColor(myGreen);
                g.drawString("Get $" + charge, topX, topY + 12);
            }
        }
        int topX = startX + (game.currentPosition % 7)* squareWidth + 75;
        int topY =  startY + (game.currentPosition/7) * squareHeight + 75;
        int bottomX = topX + squareWidth - 75;
        int bottomY = topY + squareHeight - 75;

        Image pawn = Toolkit.getDefaultToolkit().getImage("Pawn.jpg");
        g.drawImage(pawn, topX, topY, bottomX,  bottomY, 0, 7, 173, 141, this);

        Image dice = Toolkit.getDefaultToolkit().getImage("Dice.jpg");
        g.drawImage(dice, 0, 0, 160, 150, 0, 0, 640, 427, this);

        if(isRolling){
            g.setFont(new Font("Arial",Font.BOLD, 20));
            g.setColor(Color.RED);
            g.drawString("You rolled " + numberRolled, 200, 40);
        }
    }
}
