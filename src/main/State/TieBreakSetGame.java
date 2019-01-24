package State;

public enum TieBreakSetGame implements SetState{
    ZERO("0"),
    ONE("1"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    TIE_BREAK("TIE BREAK"),
    WIN("WIN");


    private String state = "";

    TieBreakSetGame(String state){
        this.state = state;
    }

    public String toString(){
        return state;
    }
}
