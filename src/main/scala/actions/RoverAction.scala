package actions

import directions.rover.DirectionsFactory
import rover.RoverPosition


trait RoverAction {
  val name: String

  def executeAction(roverPosition: RoverPosition): RoverPosition
}

case object Move extends RoverAction {
  override val name: String = "M"

  override def executeAction(roverPosition: RoverPosition): RoverPosition =
    roverPosition.copy(roverCoordinates = roverPosition
      .roverDirection.changePositionOnMove(roverPosition.roverCoordinates))
}

case object Left extends RoverAction {
  override val name: String = "L"

  override def executeAction(roverPosition: RoverPosition): RoverPosition =
    roverPosition.copy(roverDirection = DirectionsFactory.getRoverDirectionFromCardinalPoint(
      roverPosition.roverDirection.leftCardinalPoint
    ))
}

case object Right extends RoverAction {
  override val name: String = "R"

  override def executeAction(roverPosition: RoverPosition): RoverPosition =
    roverPosition.copy(roverDirection = DirectionsFactory.getRoverDirectionFromCardinalPoint(
      roverPosition.roverDirection.rightCardinalPoint
    ))
}

case object Stop extends RoverAction {
  override val name: String = "S"

  override def executeAction(roverPosition: RoverPosition): RoverPosition = roverPosition
}