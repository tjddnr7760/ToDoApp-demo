package tjddnr.ToDoAppdemo.Todo.controller.mapper;

import org.mapstruct.Mapper;
import tjddnr.ToDoAppdemo.Todo.controller.dto.TodoDto;
import tjddnr.ToDoAppdemo.Todo.controller.dto.TodoPostDto;
import tjddnr.ToDoAppdemo.Todo.domain.Todo;
import tjddnr.ToDoAppdemo.Todo.domain.TodoV1;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TodoMapper {
    TodoV1 todoPostDtoToTodo(TodoPostDto todoPostDto);
    TodoDto todoToTodoDto(TodoV1 todoV1);
    List<TodoDto> todoV1sToTodoDtos(List<TodoV1> todoV1s);

}
