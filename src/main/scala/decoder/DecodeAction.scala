package decoder

import actions.{Right, Left, Move, RoverAction}

object DecodeAction {
  val ActionDecoder: Map[String, RoverAction] = Map("L"->Left, "R"-> Right, "M"-> Move)
}

