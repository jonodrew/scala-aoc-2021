package day02

case class PositionOne(depth: Int, horizontal: Int) extends Position {
  def update(command: Tuple2[String, Int]): PositionOne =
    val dir = command._1
    dir match {
      case "forward" => this.copy(horizontal = this.horizontal + command._2)
      case "down" => this.copy(depth = this.depth + command._2)
      case "up" => this.copy(depth = this.depth - command._2)
    }
}
