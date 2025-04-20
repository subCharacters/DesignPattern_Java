package Interpreter;

public class TurnCommand implements CommandExpression {
    private final String direction;

    public TurnCommand(String direction) {
        this.direction = direction;
    }

    @Override
    public void interpret(Context context) {
        context.turn(direction);
    }
}
