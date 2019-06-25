public class Client {
    public static void main(String[] args){
        //テレビとラジオを生成するcreatorの準備
        Kojyou koujyou1 = new TvKojyou();
        Kojyou koujyou2 = new RadioKojyou();

        //配列へテレビとラジオを生成し代入
        Seihin[] array = new Seihin[3];
        array[0] = koujyou1.create();
        array[1] = koujyou2.create();
        array[2] = koujyou1.create();

        //テレビとラジオの情報を出力
        for(int i = 0; i < array.length; ++i){
            array[i].print();
        }
    }
}
