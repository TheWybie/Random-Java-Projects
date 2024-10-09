import AdventurePack.*;

public class App {
    public static void main(String[] args){
        Option myOption = new Option("I better leave now.",4);
        Quest myQuest = new Quest("Shit Quest", "There's a lot of shit on the ground.\nWaste your time in something better.",myOption );
        System.out.println(myQuest.toString());
    }
}
