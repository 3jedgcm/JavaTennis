package State;

public enum TieBreakMatchState {
    WITH_TIE_BREAK(true),
    WITHOUT_TIE_BREAK(false);



    private Boolean state;

    TieBreakMatchState(Boolean state){
        this.state = state;
    }

    public Boolean getState(){
        return state;
    }
}
