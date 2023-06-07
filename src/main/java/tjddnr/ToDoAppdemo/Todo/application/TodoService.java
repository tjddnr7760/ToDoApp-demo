package tjddnr.ToDoAppdemo.Todo.application;

import org.springframework.stereotype.Service;
import tjddnr.ToDoAppdemo.Todo.controller.dto.TodoDto;
import tjddnr.ToDoAppdemo.Todo.controller.dto.TodoPostDto;
import tjddnr.ToDoAppdemo.Todo.controller.mapper.TodoMapper;
import tjddnr.ToDoAppdemo.Todo.domain.Todo;
import tjddnr.ToDoAppdemo.Todo.domain.TodoV1;
import tjddnr.ToDoAppdemo.Todo.infrastructure.TodoRepository;

import java.util.List;

@Service
public class TodoService {
    private final TodoRepository todoRepository;
    private TodoMapper todoMapper;

    public TodoService(TodoRepository todoRepository, TodoMapper todoMapper) {
        this.todoRepository = todoRepository;
        this.todoMapper = todoMapper;
    }

    public TodoDto createTodo(TodoPostDto todoPostDto) {
        TodoV1 todo = todoMapper.todoPostDtoToTodo(todoPostDto);
        todo = todoRepository.save(todo);
        return todoMapper.todoToTodoDto(todo);
    }

    public List<TodoV1> findTodoLists() {
        List<TodoV1> todoV1s = todoRepository.findAll();
        return todoV1s;
    }
}
