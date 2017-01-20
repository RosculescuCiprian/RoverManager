import coordinates.Coordinates
import directions.rover.NorthDirection
import org.scalatest.{FlatSpec, Matchers}


class CardinalPointTests extends FlatSpec with Matchers {

  val startCoordinate = Coordinates(0,0)

  "NorthDirection" should "increase the coordinate by 1 when moving in it's direction" in {
    NorthDirection.changePositionOnMove(startCoordinate) should equal(Coordinates(0,1))
  }
}
