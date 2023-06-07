package tjddnr.ToDoAppdemo.Todo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tjddnr.ToDoAppdemo.Todo.application.TodoService;
import tjddnr.ToDoAppdemo.Todo.controller.dto.TodoDto;
import tjddnr.ToDoAppdemo.Todo.controller.dto.TodoPostDto;
import tjddnr.ToDoAppdemo.Todo.controller.mapper.TodoMapper;
import tjddnr.ToDoAppdemo.Todo.domain.TodoV1;

import java.util.List;

@RestController
@Validated
public class TodoController {
    private TodoService todoService;
    private TodoMapper todoMapper;

    public TodoController(TodoService todoService, TodoMapper todoMapper) {
        this.todoService = todoService;
        this.todoMapper = todoMapper;
    }

    @PostMapping
    public ResponseEntity getRegisterTodoList(@RequestBody TodoPostDto todoPostDto) {
        TodoDto todoDto = todoService.createTodo(todoPostDto);
        return new ResponseEntity<>(todoDto, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getTodoLists() {
        List<TodoV1> todoV1s = todoService.findTodoLists();
        List<TodoDto> todoDtos = todoMapper.todoV1sToTodoDtos(todoV1s);

        return new ResponseEntity(todoDtos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity getTodoList(@PathVariable("id") long id) {
        TodoV1 todoV1 = todoService.findTodoList(id);
        TodoDto todoDto = todoMapper.todoToTodoDto(todoV1);

        return new ResponseEntity(todoDto, HttpStatus.OK);
    }
}
