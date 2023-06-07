package tjddnr.ToDoAppdemo.Todo.controller.dto;

import lombok.Getter;

@Getter
public class TodoPatchDto {
    private long id;
    private String title;
    private int todoOrder;
    private boolean completed;

    public TodoPatchDto(String title, int todoOrder, boolean completed) {
        this.title = title;
        this.todoOrder = todoOrder;
        this.completed = completed;
    }

    public void setId(long id) {
        this.id = id;
    }
}
