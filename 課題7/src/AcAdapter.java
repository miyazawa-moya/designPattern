class AcAdapter  implements Dengen {
    JapaneseConsent JC = new JapaneseConsent();

    public int kyuuden(){
        return (int)(JC.power()*0.16);
    }
}
