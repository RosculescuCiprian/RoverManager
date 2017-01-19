package directions.rover

import coordinates.Coordinates
import directions.general._


trait RoverDirection {
  val cardinalPoint: CardinalPoint
  val leftCardinalPoint: CardinalPoint
  var rightCardinalPoint: CardinalPoint
  val changePositionOnMove: (Coordinates) => Coordinates
}

case object NorthDirection extends RoverDirection {
  override val cardinalPoint: CardinalPoint = North
  override val leftCardinalPoint: CardinalPoint = West
  override var rightCardinalPoint: CardinalPoint = East
  override val changePositionOnMove: (Coordinates) => Coordinates = Coordinates.GoUp(_)
}

case object SouthDirection extends RoverDirection {
  override val cardinalPoint: CardinalPoint = South
  override val leftCardinalPoint: CardinalPoint = East
  override var rightCardinalPoint: CardinalPoint = West
  override val changePositionOnMove: (Coordinates) => Coordinates = Coordinates.GoDown(_)
}

case object EastDirection extends RoverDirection {
  override val cardinalPoint: CardinalPoint = East
  override val leftCardinalPoint: CardinalPoint = North
  override var rightCardinalPoint: CardinalPoint = South
  override val changePositionOnMove: (Coordinates) => Coordinates = Coordinates.GoLeft(_)
}

case object WestDirection extends RoverDirection {
  override val cardinalPoint: CardinalPoint = West
  override val leftCardinalPoint: CardinalPoint = South
  override var rightCardinalPoint: CardinalPoint = North
  override val changePositionOnMove: (Coordinates) => Coordinates = Coordinates.GoRight(_)
}



