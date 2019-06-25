//Creatorクラスに相当
abstract class Kojyou {
    //生成されたテレビかラジオをClientに返すメソッド
    public final Seihin create(){
        Seihin seihin = factoryMethod();
        touroku(seihin);
        return seihin;
    }
    //テレビかラジオを生成し返す抽象メソッド
    public abstract Seihin factoryMethod();
    //製造番号と製造年月日を登録する抽象メソッド
    public abstract void touroku(Seihin s);
}
