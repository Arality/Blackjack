import java.util.ArrayList;

public class StandardCardFactory{

    private static ArrayList<Card> cardList = GenerateCardList();

    public static ArrayList<Card> Generate(){
        return cardList;
    }

    private static ArrayList<Card> GenerateCardList(){
        ArrayList<Card> cardList = new ArrayList<Card>();
        ArrayList<ISuite> suiteList = GenerateSuiteList();
        ArrayList<IValue> valueList = GenerateValueList();

        for(ISuite suite : suiteList){
            for(IValue value : valueList)
            cardList.add(new Card(suite, value));
        }
        return cardList;
    }

    // Generate the list of card suites
    private static ArrayList<ISuite> GenerateSuiteList(){
        ArrayList<ISuite> suiteList = new ArrayList<ISuite>();
        suiteList.add(new Clubs());
        suiteList.add(new Diamonds());
        suiteList.add(new Hearts());
        suiteList.add(new Spades());
        return suiteList;
    }

    // Generate the list of card values
    private static ArrayList<IValue> GenerateValueList(){
        ArrayList<IValue> valueList = new ArrayList<IValue>();
        valueList.add(new One());
        valueList.add(new Two());
        valueList.add(new Three());
        valueList.add(new Four());
        valueList.add(new Five());
        valueList.add(new Six());
        valueList.add(new Seven());
        valueList.add(new Eight());
        valueList.add(new Nine());
        valueList.add(new Ten());
        valueList.add(new Jack());
        valueList.add(new Queen());
        valueList.add(new King);
        valueList.add(new Ace());
    }

}