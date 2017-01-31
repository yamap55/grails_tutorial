package mytodo

class Todo {
    String todoName
    static constraints = {
      todoName size: 3..3, blank:false, unique:true
    }
}
