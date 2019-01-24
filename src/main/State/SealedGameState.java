package State;

public enum SealedGameState implements GameState {
    ZERO("0"),
    ONE("1"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EQUALS("="),
    SECURE("+1"),
    WIN("WIN");


    private String state = "";

    SealedGameState(String state){
        this.state = state;
    }

    @Override
    public String toString(){
        return state;
    }
}
