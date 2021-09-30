package no.hvl.dat110.rest.counters;

import java.util.Collection;
import java.util.HashMap;

public class TodoService {
    private final HashMap<String, Todo> todoMap; //mock db

    public TodoService() {
        todoMap = new HashMap<>();
    }

    public void addTodo(Todo todo) {
        todoMap.put(todo.getId(), todo);
    }

    public Collection<Todo> getTodos() {
        return todoMap.values();
    }

    public Todo getTodo(String id) {
        return todoMap.get(id);
    }

    public Todo editTodo(Todo forEdit) throws Exception {
        try {
            if (forEdit.getId() == null)
                throw new Exception("ID cannot be blank");

            Todo toEdit = todoMap.get(forEdit.getId());

            if (toEdit == null)
                throw new Exception("Todo not found");

            if (forEdit.getSummary() != null) {
                toEdit.setSummary(forEdit.getSummary());
            }
            if (forEdit.getDescription() != null) {
                toEdit.setDescription(forEdit.getDescription());
            }
            if (forEdit.getId() != null) {
                toEdit.setId(forEdit.getId());
            }

            return toEdit;
        } catch (Exception ex) {
            throw new Exception("Failed to edit todo");
        }
    }

    public void deleteTodo(String id) {
        todoMap.remove(id);
    }

}