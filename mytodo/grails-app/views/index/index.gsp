<!DOCTYPE html>
<html lang="ja">
  <head>
    <meta charset="utf-8">
    <title>Todo</title>
<!--
    <link rel="stylesheet" href="style.css"/>
    <script src="script.js"></script>
<style type="text/css">
</style>
<script type="text/javascript">
</script>
-->
  </head>
  <body>
    <p>Todo application</p>
    <g:form controller="index" action="formTest">
      <g:textField name="todo" />
      <g:submitButton name="add-todo">Add Todo</g:submitButton>
    </g:form>

    <ul>
    <g:each in="${todos}" var="todo">
      <li>${todo.todoName}</li>
    </g:each>
    </ul>
  </body>
</html>
