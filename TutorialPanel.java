import javax.swing.*;
import java.awt.*;

public class TutorialPanel extends JPanel {
    protected void paintComponent(Graphics g) {
        Color mathColor = new Color(0, 100, 187);
        g.setColor(mathColor);
        g.fillRect(0, 0, 800, 1100);

        Color gameColor = new Color(255, 255, 0);
        g.setColor(gameColor);
        g.fillRect(800, 0, 800, 1100);

        Font tutorialFont = new Font("Arial", Font.BOLD, 60);
        g.setFont(tutorialFont);

        g.drawString("Let's begin with the basic ", 60, 60);
        g.setColor(mathColor);
        g.drawString("concepts for the game:", 805, 60);

        g.setFont(new Font("Utopia", Font.BOLD, 30));
        g.setColor(Color.GREEN);
        int lh = 30;
        int start = 140;

        g.drawString("Learn to budget:", 300, 100);
        g.drawString("What is budgeting?", 50, start);

        g.setFont(new Font("Utopia", Font.PLAIN, 25));


        g.drawString("Budgeting is saving money by only using a " , 50, start + lh);
        g.drawString("fixed amount of money for necessities like food ", 50, start + 2 * lh);
        g.drawString("rent, water, electricity and internet (most important).", 50, start + 3 * lh);
        g.drawString("For example:", 50, start + 4 * lh);
        g.drawString("You have a summer job washing cars.", 50, start + 5 * lh);
        g.drawString("You get $50 dollars everyday. You want to save ", 50, start + 6 * lh);
        g.drawString("money for a bike. And also need to ", 50, start + 7 * lh);
        g.drawString("pay for the necessities. Should you:", 50, start + 8 * lh);
        g.drawString("      a. Limit your spending, and invest the " , 50, start + 9 * lh);
        g.drawString("         rest for the bike, or should you", 50, start + 10 * lh);
        g.drawString("      b. Just spend as you need without planning,", 50, start + 11 * lh);
        g.drawString("         and keep your fingers crossed hoping to ", 50, start + 12 * lh);
        g.drawString("         save enough for the bike?", 50, start + 13 * lh);
        g.drawString("Of course, you would choose (a) because ", 50, start + 14 * lh);
        g.drawString("you are saving $30 for that bike everyday ", 50, start + 15 * lh);
        g.drawString("where as in (b), you don't know when you ", 50, start + 16 * lh);
        g.drawString("are going to have enough money to save.", 50, start + 17 * lh);


        //make game instructions:
        //initial value - have to plan budget for month - put into bank (will turn double) if you survive hah hah hah!!!
        //so choose carefully, budget wisely, there is either a gain or loss square
        g.setColor(Color.RED);

        g.setFont(new Font("Utopia", Font.BOLD, 30));
        g.drawString("Learn to play:", 1100, 100);
        g.drawString("Don't worry, you got this :)", 820, start);

        g.setFont(new Font("Utopia", Font.PLAIN, 25));
        g.drawString("You have an initial value of $1200. Every month is one level.", 820, start + lh);
        g.drawString("You have to complete 12 months to win. Anyway, at the beginning ", 820, start + 2 * lh);
        g.drawString("of the month, you can put money in the bank, so that at the end ", 820, start + 3 * lh);
        g.drawString("of month you can get twice for salary. ", 820, start + 4 * lh);
        g.drawString("You are going to roll the dice, and then you are going to pay", 820, start + 5 * lh);
        g.drawString("or get money for your life choices. But be careful when putting", 820, start + 6 * lh);
        g.drawString("money in the bank because every month, the prices increase.", 820, start + 7 * lh);
        g.drawString("Budget wisely so that you get the most benefit out of your salary!", 820, start + 8 * lh);
        g.drawString("Have fun playing! CLICK to go to the game!", 820, start + 9 * lh);
    }
}
