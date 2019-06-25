//テレビとラジオの製造番号をカウントするクラス
class Counter {
    private static int tvNum = 100;
    private static int radioNum = 76;

    //テレビかラジオが生成されたら製品番号をインクリメントし返す
    public static int getTvNumber(){
        return tvNum++;
    }
    public static int getRadioNumber(){
        return radioNum++;
    }
}
