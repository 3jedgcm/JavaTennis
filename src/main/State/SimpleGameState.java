package State;

public enum SimpleGameState implements SetGameState {
    LOVE("love"),
    FIFTEEN("fifteen"),
    THIRTY("thirty"),
    FORTY("forty"),
    ADVANTAGE("advantage"),
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
