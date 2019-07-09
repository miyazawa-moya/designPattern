public class Client {
    public static void main(String[] args) {
        Suuchi s = new Suuchi();
        Observer o1 = new NishinHyouji();
        Observer o2 = new JyuurokushinHyoji();

        s.attach(o1);
        s.attach(o2);
        int i = 0;
        while (i < 100) {
            s.putValue(i);
            i += (int) (Math.random() * 30) - 10;
        }

        s.detach(o2);
        while (i < 200){
            s.putValue(i);
            i+=(int)(Math.random()*30)-10;
        }

        s.attach(o2);
        s.detach(o1);
        while (i < 300){
            s.putValue(i);
            i+=(int)(Math.random()*30)-10;
        }

    }
}
