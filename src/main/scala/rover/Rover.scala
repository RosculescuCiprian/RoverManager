package rover

import actions.RoverAction
import coordinates.Coordinates
import directions.rover.NorthDirection


case class Rover(roverPosition: RoverPosition = RoverPosition(Coordinates(0,0), facingCardinalPoint = NorthDirection)) {
  def executeAction(roverAction: RoverAction) = this.copy(roverPosition = roverAction.executeAction(this.roverPosition))
}
