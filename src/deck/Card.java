public class Card{
    private ISuite suite;
    private IValue value;

    Card(ISuite suite, IValue value){
        this.suite = suite;
        this.value = value;
    }

    public String toString(){
        return suite + " of " + value;
    }

    public short valueOf(){
        return value.valueOf(); 
    }
}