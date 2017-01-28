package mytodo

class IndexController {

    def index() {
      render(view : "/index/index", model: [todos : Todo.listOrderById()])
    }

    def formTest() {
      String todoName = params.todo
      render todoName
    }
}
