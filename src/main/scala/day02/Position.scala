package day02

trait Position {
  val horizontal: Int
  val depth: Int
  def update(command: Tuple2[String, Int]): Position
}
