package directions.rover

import directions.general._


object DirectionsFactory {
  private val DirectionsMap: Map[CardinalPoint, RoverDirection] = Map(North -> NorthDirection,
    South -> SouthDirection,
    East -> EastDirection,
    West -> WestDirection)

  def getRoverDirectionFromCardinalPoint(cardinalPoint: CardinalPoint) = DirectionsMap(cardinalPoint)
}
