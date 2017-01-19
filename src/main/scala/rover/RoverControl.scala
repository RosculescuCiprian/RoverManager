package rover

import coordinates.Coordinates
import directions.rover.NorthDirection


case class RoverControl(roverPosition: RoverPosition = RoverPosition(Coordinates(0,0), facingCardinalPoint = NorthDirection))
