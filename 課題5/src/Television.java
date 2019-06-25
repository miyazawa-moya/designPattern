class Television  extends Seihin{
    //自分の製造番号と年月日を登録するフィールド
    private int tvSerialNumber;
    private String date;

    //自分の製造番号を登録
    public void numberring(){
        tvSerialNumber = Counter.getTvNumber();
    }

    //自分の製造年月日を登録
    public void setDate(String date){
        this.date = date;
    }

    //Seihinクラスより継承
    public void print(){
        System.out.println("このテレビに関する情報：");
        System.out.println("製造番号：" + tvSerialNumber);
        System.out.println("製造年月日" + date);
    }

}
