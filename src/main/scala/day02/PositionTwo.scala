package day02

import scala.annotation.meta.getter

case class PositionTwo(depth: Int = 0, horizontal: Int = 0, aim: Int = 0) extends Position {
  def update(command: (String, Int)): PositionTwo =
    val dir: String = command._1
    val value: Int = command._2
    dir match {
      case "down" => this.copy(aim = this.aim + value)
      case "up" => this.copy(aim = this.aim - value)
      case "forward" => this.copy(horizontal = this.horizontal + value, depth = this.depth + this.aim * value)
    }
}