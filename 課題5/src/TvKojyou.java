//Kokyouクラスの実体
public class TvKojyou extends Kojyou {
    @Override
    public Seihin factoryMethod() {
        return new Television();
    }
    public void touroku(Seihin s){
        Television t = (Television) s;
        t.numberring();
        t.setDate(Date.today());
    }
}
