import javax.swing.*;
public class GameFrame extends JFrame{

    public GameFrame(Game myGame){
        super("The Java Store");
        setSize(1600, 1100);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        //all the basic aspects included
        ParentPanel parentPanel = new ParentPanel(myGame);
        //create instance of JPHolder
        setContentPane(parentPanel);
        setVisible(true);
        setResizable(false);
    }
}
