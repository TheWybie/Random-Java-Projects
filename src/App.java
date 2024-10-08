import AdventurePack.*;

public class App {
    public static void main(String[] args){
        Option myOption = new Option("I better leave now.",0);
        Option[] myOptionArr = new Option[1];
        myOptionArr[0] = myOption;
        Quest myQuest = new Quest("Quest for the pussy", "The title is dumb and the whole idea behind it is as well.\nWaste your time in something better.",myOptionArr );
        System.out.println(myQuest.toString());
    }
}
