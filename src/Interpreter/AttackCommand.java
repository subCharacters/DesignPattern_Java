package Interpreter;

public class AttackCommand implements CommandExpression {
    @Override
    public void interpret(Context context) {
        context.attack();
    }
}
