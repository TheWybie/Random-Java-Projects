package AdventurePack;

public class Quest{
    private String title, text;
    private Dialogue dialogue;
    private Option[] options;

//#region CONSTRUCTORS
    public Quest(String initTitle, String initText, Option[] initOptions){
        title = initTitle;
        text = initText;
        options = initOptions;
    }


    public Quest(String initTitle, String initText, Option initOption){
        title = initTitle;
        text = initText;
        options = new Option[1];
        options[0] = initOption;
    }
//#endregion
    public String toString(){
        String questString;
        questString = title + "\n" + text;
        for(int i = 0; i<options.length; i++){
            questString = questString +"\n" + options[i].toString()+"\n";
        }
        return questString;
    }

    public String getTitle(){
        return title;
    }
}

