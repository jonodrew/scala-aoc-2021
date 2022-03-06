package day01
import helpers.{Day00, Helpers}

object Day01 extends Day00 {
  val lines = Helpers.lines("data/day01_input.txt").toList.map(line => line.toInt)
  partOne()
  partTwo()

  def partOne(): Unit =
    val offset = lines.slice(0, lines.size - 1).zip(lines.tail).filter(t => t._2 > t._1)
    println(offset.size)

  def partTwo(): Unit =
    val offsetOne = lines.tail.sliding(3, 1)
    println(lines.sliding(3, 1).zip(offsetOne).filter(t => t._2.sum > t._1.sum).size)
}
