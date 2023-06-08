package tjddnr.ToDoAppdemo.Todo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tjddnr.ToDoAppdemo.Todo.controller.dto.TodoPatchDto;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class TodoV1 implements Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @Column
    private int todoOrder;

    @Column
    private boolean completed;

    @Override
    public void update(TodoPatchDto todoPatchDto) {
        this.todoOrder = todoPatchDto.getTodoOrder();
        this.completed = todoPatchDto.isCompleted();
        this.title = todoPatchDto.getTitle();
    }
}
