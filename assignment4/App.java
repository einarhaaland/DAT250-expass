package no.hvl.dat110.rest.counters;

import com.google.gson.Gson;

import static spark.Spark.*;

public class App {
	
	public static void main(String[] args) {

		if (args.length > 0) {
			port(Integer.parseInt(args[0]));
		} else {
			port(8080);
		}

		TodoService todoService = new TodoService();

		//CREATE
		post("/todos/add", (request, response) -> {
			response.type("application/json");
			Todo todo = new Gson().fromJson(request.body(), Todo.class);
			todoService.addTodo(todo);
			return todo.toJson();
		});

		//READ
		get("/todos", (request, response) -> {
			response.type("application/json");
			return new Gson().toJsonTree(todoService.getTodos());
		});

		get("/todos/:id", (request, response) -> {
			response.type("application/json");
			return new Gson().toJsonTree(todoService.getTodo(request.params(":id")));
		});

		//UPDATE
		put("/todos/:id", (request, response) -> {
			response.type("application/json");
			Todo toEdit = new Gson().fromJson(request.body(), Todo.class);
			Todo editedTodo = todoService.editTodo(toEdit);

			if (editedTodo != null) {
				return new Gson().toJsonTree(editedTodo);
			} else {
				return new Gson().toJson("Todo not found or error in edit");
			}
		});

		//DELETE
		delete("/todos/:id", (request, response) -> {
			response.type("application/json");
			todoService.deleteTodo(request.params(":id"));
			return new Gson().toJson("user deleted");
		});

    }
    
}
