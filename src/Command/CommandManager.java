package Command;

import java.util.Stack;

// 명령 실행과 관리
public class CommandManager {
    private final Stack<Command> undoStack = new Stack<Command>();
    private final Stack<Command> redoStack = new Stack<Command>();

    // 실행하면 undo에는 넣고, redo는 클리어 
    public void executeCommand(Command command) {
        command.execute();
        undoStack.push(command);
        redoStack.clear();
    }

    // undo를 실행하면 undo가 비어있지 않으면 undo를 실행하고
    // 다시 redo를 해야 하기에 redo에도 추가.
    public void undo() {
        if (!undoStack.isEmpty()) {
            Command command = undoStack.pop();
            command.undo();
            redoStack.push(command);
        }
    }

    // undo의 반대
    public void redo() {
        if (!redoStack.isEmpty()) {
            Command command = redoStack.pop();
            command.execute();
            undoStack.push(command);
        }
    }
}
