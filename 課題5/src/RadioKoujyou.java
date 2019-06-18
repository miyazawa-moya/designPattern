class RadioKojyou extends Kojyou {
    @Override
    public Seihin factoryMethod() {
        return new Radio();
    }
    public void touroku(Seihin s){
        Radio t = (Radio) s;
        t.numberring();
    }
}
