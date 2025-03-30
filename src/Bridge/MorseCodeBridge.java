package Bridge;

public class MorseCodeBridge {
    private MorseCode morseCode;

    public MorseCodeBridge(MorseCode morseCode) {
        this.morseCode = morseCode;
    }

    public MorseCodeBridge dot() {
        morseCode.dot();
        return this;
    }

    public MorseCodeBridge dash() {
        morseCode.dash();
        return this;
    }

    public MorseCodeBridge space() {
        morseCode.space();
        return this;
    }
}
