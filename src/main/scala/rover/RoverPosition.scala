package rover

import coordinates.Coordinates
import directions.rover.RoverDirection

case class RoverPosition(roverCoordinates: Coordinates, facingCardinalPoint: RoverDirection)
