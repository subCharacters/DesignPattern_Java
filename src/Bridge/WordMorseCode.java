package Bridge;

public class WordMorseCode implements MorseCode {
    @Override
    public void dot() {
        System.out.print("DOT");
    }

    @Override
    public void dash() {
        System.out.print("DASH");
    }

    @Override
    public void space() {
        System.out.print(" ");
    }
}
