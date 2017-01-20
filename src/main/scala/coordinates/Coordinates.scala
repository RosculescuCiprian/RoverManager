package coordinates

case class Coordinates(x: Int, y: Int)

object Coordinates {

  def GoUp(coordinates: Coordinates) = Coordinates(coordinates.x, coordinates.y + 1)

  def GoDown(coordinates: Coordinates) = Coordinates(coordinates.x, coordinates.y - 1)

  def GoLeft(coordinates: Coordinates) = Coordinates(coordinates.x + 1, coordinates.y)

  def GoRight(coordinates: Coordinates) = Coordinates(coordinates.x - 1, coordinates.y)

}