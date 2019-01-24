package State;

public enum SimpleSetState implements SetState{
    ZERO("0"),
    ONE("1"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    EQUALS("="),
    SECURE("+"),
    WIN("WIN");


    private String state = "";

    SimpleSetState(String state){
        this.state = state;
    }

    public String toString(){
        return state;
    }
}
