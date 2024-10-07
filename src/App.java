public class App {
    public static void main(String[] args){
        Quest.Option myOption = new Quest.Option("I better leave now.",0);
        Quest.Option[] myOptionArr = new Quest.Option[1];
        myOptionArr[0] = myOption;
        Quest myQuest = new Quest("Quest for the pussy", "The title is dumb and the whole idea behind it is as well.\nWaste your time in something better.",myOptionArr );
        System.out.println(myQuest.toString());
    }

    private static void varFunc(int a){
        int[] results = new int[20];
        int val;
        for(int i=0; i<1000; i++){
            val = (int)(Math.random()*(20)+1);
            results[val-1]++;
        }
        for(int i=0; i<results.length; i++){
            System.out.print(i+1 + ": ");
            for(int j=0;j<results[i];j++){
                System.out.print('#');
            }
            System.out.println();
        }

    }
}
