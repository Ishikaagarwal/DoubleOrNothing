import javax.swing.*;
import java.awt.*;

public class TitlePanel extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Image titleImage = Toolkit.getDefaultToolkit().getImage("TitleImage.jpg");
        g.drawImage(titleImage, 200, 200, 1600, 1100, 0, 0, 400, 400, this);      //add this image in later( replace it!!)
        g.setFont(new Font("Papyrus", Font.BOLD, 80));
        g.setColor(Color.BLUE);
        g.drawString("12 Months or Bust!", 300, 90);   //title of game
        g.setFont(new Font("Poor Richard", Font.BOLD, 35));
        g.drawString("Click anywhere to get started.",400, 700);      //the prompt
    }
}