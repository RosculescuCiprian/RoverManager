package actions

import coordinates.Coordinates
import directions.rover.DirectionsFactory
import org.scalatest.{FlatSpec, Matchers}
import rover.RoverPosition

class RoverActionTests extends FlatSpec with Matchers {
  def initialRoverPosition = RoverPosition()

  def testActionEffectOnRoverPosition(roverAction: RoverAction, endRoverPosition: RoverPosition) = {
    roverAction.executeAction(initialRoverPosition) should equal(endRoverPosition)
  }

  "Left action" should "change the rover facing direction to position corresponding to it's left cardinal point" in {
    testActionEffectOnRoverPosition(Left, initialRoverPosition.copy(
      roverDirection = DirectionsFactory.getRoverDirectionFromCardinalPoint(initialRoverPosition.roverDirection.leftCardinalPoint)))
  }

  "Right action" should "change the rover facing direction to position corresponding to it's left cardinal point" in {
    testActionEffectOnRoverPosition(Right, initialRoverPosition.copy(
      roverDirection = DirectionsFactory.getRoverDirectionFromCardinalPoint(initialRoverPosition.roverDirection.rightCardinalPoint)))
  }

  "Move action" should "change the rover coordinates by 1 in the Y direction" in {
    testActionEffectOnRoverPosition(Move, initialRoverPosition.copy(roverCoordinates = Coordinates(0, 1)))
  }
}