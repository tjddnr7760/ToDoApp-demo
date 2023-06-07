package tjddnr.ToDoAppdemo.Todo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tjddnr.ToDoAppdemo.Todo.application.TodoService;
import tjddnr.ToDoAppdemo.Todo.controller.dto.TodoDto;
import tjddnr.ToDoAppdemo.Todo.controller.dto.TodoPatchDto;
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
        List<TodoDto> todoDtos = todoService.findTodoLists();

        return new ResponseEntity(todoDtos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity getTodoList(@PathVariable("id") long id) {
        TodoDto todoDto = todoService.findTodoList(id);

        return new ResponseEntity(todoDto, HttpStatus.OK);
    }

    @PatchMapping("/{id}")
    public ResponseEntity patchTodoList(@PathVariable("id") long id,
                                        @RequestBody TodoPatchDto todoPatchDto) {
        todoPatchDto.setId(id);
        TodoDto todoDto = todoService.updateTodoList(todoPatchDto);

        return new ResponseEntity(todoDto, HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity deleteAll() {
        todoService.deleteTodoAll();

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteTodoList(@PathVariable("id") long id) {
        todoService.deleteTodoById(id);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
