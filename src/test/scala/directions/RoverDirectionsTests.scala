package directions

import coordinates.Coordinates
import directions.rover._
import org.scalatest.{FlatSpec, Matchers}

class RoverDirectionsTests extends FlatSpec with Matchers {

  val startCoordinate = Coordinates(0, 0)

  def testRoverDirectionsMovingOptions(roverDirection: RoverDirection, endCoordinate: Coordinates) = {
    roverDirection.changePositionOnMove(startCoordinate) should equal(endCoordinate)
  }

  "NorthDirection" should "increase the Y coordinate by 1 when moving in it's direction" in {
    testRoverDirectionsMovingOptions(NorthDirection, Coordinates(0, 1));
  }
  "SouthDirection" should "decrease the Y coordinate by 1 when moving in it's direction" in {
    testRoverDirectionsMovingOptions(SouthDirection, Coordinates(0, -1));
  }
  "EastDirection" should "increase the X coordinate by 1 when moving in it's direction" in {
    testRoverDirectionsMovingOptions(EastDirection, Coordinates(1, 0));
  }
  "WestDirection" should "decrease the Y coordinate by 1 when moving in it's direction" in {
    testRoverDirectionsMovingOptions(WestDirection, Coordinates(-1, 0));
  }
}