package State;

public enum MatchType {

    BEST_OF_THREE("BO3"),
    BEST_OF_FIVE("BO5");

    private String state = "";

    MatchType(String state){
        this.state = state;
    }

    @Override
    public String toString(){
        return state;
    }
}
