package Interpreter;

import java.util.List;

/**
 * 스크립트나 표현식을 해석하여 그것을 클래스로 표현하여 사용하는 패턴.
 * 일반적인 경우보다는 특수한 경우에 쓰임
 */
public class Main {
    public static void main(String[] args) {
        String script = """
                MOVE 3
                TURN LEFT
                ATTACK
                """;
        Context context = new Context();
        List<CommandExpression> commands = CommandParser.parse(script);

        for (CommandExpression cmd : commands) {
            cmd.interpret(context);
        }
    }
}
