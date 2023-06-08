package tjddnr.ToDoAppdemo.Todo.domain;

import tjddnr.ToDoAppdemo.Todo.controller.dto.TodoPatchDto;

public interface Todo {
    public abstract void update(TodoPatchDto todoPatchDto);
}
