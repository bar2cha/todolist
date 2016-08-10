package controllers

//import javax.inject._
import play.api._
import play.api.mvc._


class Application extends Controller {

  def index = Action {
    Ok("Hello world")
  }

  def tasks = TODO

  def newTask = TODO

  def deleteTask(id: Long) = TODO

}
