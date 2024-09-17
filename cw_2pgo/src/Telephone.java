public class Telephone {
    String marka;
    double rozdzielczosc;
    int numer;

    Telephone(String marka, double rozdzielczosc, int numer){
        this.marka = marka;
        this.rozdzielczosc = rozdzielczosc;
        this.numer = numer;
    }
    String wyslijWiadomosc(String msg, int numer){
        return "Wysyłam wiadomość " + msg + " na numer " + numer;

    }
}
