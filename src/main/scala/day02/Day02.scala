package day02

import helpers.{Day00, Helpers}

object Day02 extends Day00 {
  def commands =
    Helpers.lines("data/day02_input.txt").map(line => line.split(" ")).map(arr => Tuple2(arr.head, arr.tail.head.toInt))
  partOne()
  partTwo()

  def partOne(): Unit =
    val finalPosition = commands.foldLeft(new PositionOne(0, 0))((pos, command) => pos.update(command))
    println(finalPosition.depth * finalPosition.horizontal)

  def partTwo(): Unit =
    val finalPosition = commands.foldLeft(new PositionTwo(0, 0, aim = 0))((pos, command) => pos.update(command))
    print(finalPosition.depth * finalPosition.horizontal)
}
