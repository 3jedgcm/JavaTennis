package State;

public enum SimpleGameState implements GameState {
    LOVE("0"),
    FIFTEEN("15"),
    THIRTY("30"),
    FORTY("40"),
    ADVANTAGE("Advantage"),
    WIN("win");

    private String state = "";

    SimpleGameState(String state){
        this.state = state;
    }

    @Override
    public String toString(){
        return state;
    }
}
