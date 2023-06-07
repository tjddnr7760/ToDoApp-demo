package tjddnr.ToDoAppdemo.Todo.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import tjddnr.ToDoAppdemo.Todo.domain.Todo;
import tjddnr.ToDoAppdemo.Todo.domain.TodoV1;

public interface TodoRepository extends JpaRepository<TodoV1, Long> {
}
