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
      .facingCardinalPoint.changePositionOnMove(roverPosition.roverCoordinates))
}

case object Left extends RoverAction {
  override val name: String = "L"

  override def executeAction(roverPosition: RoverPosition): RoverPosition =
    roverPosition.copy(facingCardinalPoint = DirectionsFactory.getRoverDirectionFromCardinalPoint(
      roverPosition.facingCardinalPoint.leftCardinalPoint
    ))
 }

case object Right extends RoverAction {
  override val name: String = "R"

  override def executeAction(roverPosition: RoverPosition): RoverPosition =
    roverPosition.copy(facingCardinalPoint = DirectionsFactory.getRoverDirectionFromCardinalPoint(
      roverPosition.facingCardinalPoint.rightCardinalPoint
    ))
 }

case object Stop extends RoverAction {
  override val name: String = "S"

  override def executeAction(roverPosition: RoverPosition): RoverPosition = roverPosition
}