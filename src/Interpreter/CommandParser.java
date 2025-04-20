package Interpreter;

import java.util.ArrayList;
import java.util.List;

public class CommandParser {
    public static List<CommandExpression> parse(String script) {
        List<CommandExpression> commands = new ArrayList<>();
        String[] lines = script.split("\\n");

        for (String line : lines) {
            String[] tokens = line.trim().split(" ");
            switch (tokens[0]) {
                case "MOVE" -> commands.add(new MoveCommand(Integer.parseInt(tokens[1])));
                case "TURN" -> commands.add(new TurnCommand(tokens[1]));
                case "ATTACK" -> commands.add(new AttackCommand());
                default -> System.out.println("알 수 없는 명령: " + tokens[0]);
            }
        }

        return commands;
    }
}
