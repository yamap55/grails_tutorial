package mytodo

class IndexController {

    def index() {
      render(view : "/index/index", model: [todos : Todo.listOrderById()])
    }

    def formTest() {
      String todoName = params.todo
      render todoName
    }

    def save() {
      String todoName = params.todo
      Todo newTodo = new Todo(todoName : todoName)
      if (newTodo.validate()) {
        newTodo.save()
        redirect(controller : "index", action : "index")
      } else {
        render(view : "/index/index", model : [errorTodo : newTodo, todos : Todo.listOrderById()])
      }
    }
}
