package Interpreter;

public class MoveCommand implements CommandExpression {
    private final int steps;

    public MoveCommand(int steps) {
        this.steps = steps;
    }

    @Override
    public void interpret(Context context) {
        context.move(steps);
    }
}
