package tjddnr.ToDoAppdemo.Todo.application;

import org.springframework.stereotype.Service;
import tjddnr.ToDoAppdemo.Todo.controller.dto.TodoDto;
import tjddnr.ToDoAppdemo.Todo.controller.dto.TodoPatchDto;
import tjddnr.ToDoAppdemo.Todo.controller.dto.TodoPostDto;
import tjddnr.ToDoAppdemo.Todo.controller.mapper.TodoMapper;
import tjddnr.ToDoAppdemo.Todo.domain.TodoV1;
import tjddnr.ToDoAppdemo.Todo.infrastructure.TodoRepository;

import java.util.List;
import java.util.Optional;

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

    public List<TodoDto> findTodoLists() {
        List<TodoV1> todoV1s = todoRepository.findAll();
        List<TodoDto> todoDtos = todoMapper.todoV1sToTodoDtos(todoV1s);
        return todoDtos;
    }

    public TodoDto findTodoList(long id) {
        Optional<TodoV1> optionalTodoV1 = todoRepository.findById(id);
        TodoV1 findTodoV1 = optionalTodoV1.orElseThrow(() ->
                new RuntimeException());
        TodoDto todoDto = todoMapper.todoToTodoDto(findTodoV1);

        return todoDto;
    }

    public TodoDto updateTodoList(TodoPatchDto todoPatchDto) {
        Optional<TodoV1> optionalTodoV1 = todoRepository.findById(todoPatchDto.getId());
        TodoV1 findTodoV1 = optionalTodoV1.orElseThrow(() ->
                new RuntimeException());

        findTodoV1.update(todoPatchDto);
        return todoMapper.todoToTodoDto(todoRepository.save(findTodoV1));
    }

    public void deleteTodoAll() {
        todoRepository.deleteAll();
    }

    public void deleteTodoById(long id) {
        todoRepository.deleteById(id);
    }
}
