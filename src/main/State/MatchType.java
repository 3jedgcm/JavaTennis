package State;

public enum MatchType {

    BEST_OF_THREE("2"),
    BEST_OF_FIVE("3");

    private String state;

    MatchType(String state){
        this.state = state;
    }

    @Override
    public String toString(){
        return state;
    }
}
