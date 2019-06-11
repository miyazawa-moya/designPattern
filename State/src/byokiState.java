class byokiState extends DogState {
    private static byokiState s = new byokiState();
    private byokiState(){}

    public static DogState getInstance(){
        return s;
    }

    public void tukareta(Dog moto){ }
    public void tabeta(Dog moto){
        moto.changeState(FutsuuState.getInstance());
    }

    public String toString(){
        return "病気状態";
    }
}
