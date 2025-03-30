package Bridge;

public class Main {
    
    /*
        기능 계층과 구현 계층의 분리로 시스템의 확장성과 유지보수성을 높이는 패턴
        기능 계층의 MorseCodeBridge 클래스가 구현 계층인 MorseCode를 통해
        구체적으로 구현한 SymbolMorseCode와 WordMorseCode의 기능을 사용하는 다리 역할을 한다.
     */
    public static void main(String[] args) {
        MorseCodeBridge bridge = new MorseCodeBridge(new SymbolMorseCode());
        bridge.dot().dot().dot().space().dash().dash().dash().space().dot().dot().dot();

        /**
         * ・・・ --- ・・・
         */

        System.out.println();

        bridge = new MorseCodeBridge(new WordMorseCode());
        bridge.dot().dot().dot().space().dash().dash().dash().space().dot().dot().dot();

        /**
         * DOTDOTDOT DASHDASHDASH DOTDOTDOT
         */
    }
}
