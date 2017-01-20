package rover

import actions.RoverAction

case class Rover(roverPosition: RoverPosition = RoverPosition()) {
  def executeAction(roverAction: RoverAction) = this.copy(roverPosition = roverAction.executeAction(this.roverPosition))
}