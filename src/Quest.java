public class Quest {
    private String title, text;
    private Dialogue dialogue;
    private Option[] options;

    public static class Option{
        private String optionText;
        int rollPassValue;
        private Quest linkedQuest = null;

        /*public Option(String initText, int initRollPassValue, Quest initLinkedQuest){
            optionText = initText;
            rollPassValue = initRollPassValue;
            linkedQuest = initLinkedQuest; 
        }*/
        public Option(String initText, int initRollPassValue){
            optionText = initText;
            rollPassValue = initRollPassValue;
        }

        public String toString(){
            if(linkedQuest!=null) return (String)(optionText + "\nRollVal: "+rollPassValue+"\nNextQuest: "+linkedQuest.title);
            return (String)(optionText + "\nRollVal: "+rollPassValue+"\nNo next Quest");
        }
    }

    public Quest(String initTitle, String initText, Option[] initOptions){
        title = initTitle;
        text = initText;
        options = initOptions;
    }

    public String toString(){
        String questString;
        questString = title + "\n" + text;
        for(int i = 0; i<options.length; i++){
            questString = questString +"\n" + options[i].toString()+"\n";
        }
        return questString;
    }

    
}
