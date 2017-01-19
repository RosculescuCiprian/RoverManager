package directions.general

trait CardinalPoint {
  val name: String
}

case object North extends CardinalPoint {
  override val name: String = "N"
}

case object South extends CardinalPoint {
  override val name: String = "S"
}

case object East extends CardinalPoint {
  override val name: String = "E"
}

case object West extends CardinalPoint {
  override val name: String = "W"
}

