package AdventurePack;
public class Option{
    private String optionText;
    int rollPassValue;
    private Quest linkedQuest = null;

    public Option(String initText, int initRollPassValue, Quest initLinkedQuest){
        optionText = initText;
        rollPassValue = initRollPassValue;
        linkedQuest = initLinkedQuest; 
    }
    public Option(String initText, int initRollPassValue){
        optionText = initText;
        rollPassValue = initRollPassValue;
    }

    public String toString(){
        if(linkedQuest!=null) return (String)(optionText + "\nRollVal: "+rollPassValue+"\nNextQuest: "+linkedQuest.getTitle());
        return (String)(optionText + "\nRollVal: "+rollPassValue+"\nNo next Quest");
    }
}
