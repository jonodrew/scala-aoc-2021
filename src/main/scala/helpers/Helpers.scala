package helpers

import scala.io.Source

object Helpers {
  def lines(filepath: String): Iterator[String] =
    Source.fromFile(filepath).getLines()
}
