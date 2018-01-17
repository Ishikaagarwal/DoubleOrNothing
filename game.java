public class Game{
//    class Square {
//        String prompt;
//        double charge;
//    }
//
//    //define global variables such as balance of player, and money in the bank
//    Square[] squares = new Square[31];
    int playerBalance, moneyInBank;
    int currentPosition;
    int currentLevel;

    //write all the prompts
    String[] prompts = {" pay day",
            "Buy gas",
            "Get a haircut",
            "Find money on the sidewalk",
            "Buy present for sister",
            "Get your car fixed",
            "Sell Girl Scout cookies",
            "Buy a new electronic device",
            "Buy groceries",
            "Win a school competition",
            "Donate money to charity",
            "Buy clothes",
            "Get paid for babysitting",
            "Pay social security tax",
            "Take a train ride to visit Grandma",
            "Sell lemonade",
            "Visit doctor",
            "Pay medical insurance",
            "Receive birthday money",
            "Go to the movies",
            "Pay car insurance",
            "Win the lottery",
            "Dine Out",
            "Pay electricity bill",
            "Get money from tooth fairy",
            "Pay cell phone bill",
            "Buy dog food",
            "Wash cars to earn money",
            "Pay credit card bill",
            "Pay gym membership fee^",
            "Pay the Rent"
    };

    //initialize all the money charges that we are going to charge user
    double [] charges = {0, -20, -50, -100, 5, -10, -60, -50, 50, -60, -5, -25, 5, -100, -2, -20, 2, -5, -10, -10, 20, -70, -100, -40, 40, -300, -10, -10, 30, 25, -45};

    String[] months = {"January" , "February" , "March" , "April", "May",
            "June", "July", "August", "September", "October",
            "November", "December"};
    //main method
    //only going to call constructor and the draw board method
    public static void main (String[] args) {
        Game myGame = new Game();
        myGame.DrawBoard(myGame);
    }

    //constructor:
    //will make assign the prompts
    //will also initialize all the global variables
    public Game(){
        playerBalance = 1200;
        moneyInBank = 0;
        currentPosition = 1;
        currentLevel = 0;

//        for (int i = 0; i< 31; i++){
//            Square thisSquare = new Square();
//            thisSquare.prompt = prompts[i];
//            thisSquare.charge = charges[i];
//            squares[i] = thisSquare;
//        }
    }

    void DrawBoard(Game myGame){
        new GameFrame(myGame);
    }
}
