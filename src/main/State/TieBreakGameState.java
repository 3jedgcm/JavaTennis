package State;

public enum TieBreakGameState implements SetGameState {
    ONE("one"),
    TWO("two"),
    THREE("three"),
    FOUR("four"),
    FIVE("five"),
    SIX("six"),
    SEVEN("seven"),
    EQUALS("equals"),
    SECURE("secure"),
    WIN("win");


    private String state = "";

    TieBreakGameState(String state){
        this.state = state;
    }

    @Override
    public String toString(){
        return state;
    }
}
