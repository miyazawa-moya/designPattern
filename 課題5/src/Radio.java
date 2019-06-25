public class Radio extends Seihin {
    //自分の製造番号を登録するフィールド
    private int radioSerialNumber;

    public void numberring(){
        radioSerialNumber = Counter.getRadioNumber();
    }
    //Seihinクラスより継承
    public void print(){
        System.out.println("このラジオに関する情報：");
        System.out.println("製造番号" + radioSerialNumber);
    }
}
