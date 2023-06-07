package tjddnr.ToDoAppdemo.Todo.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TodoDto {
    private Long id;
    private String title;
    private int todoOrder;
    private boolean completed;
}
