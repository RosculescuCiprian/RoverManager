import rover.Rover
import actions._

object Main {

  val listOfActions: List[RoverAction] = List(Left, Move, Right, Move, Move, Move)

  def main(args: Array[String]): Unit = {
    val rover: Rover = Rover()
    val endRover = listOfActions.foldLeft(rover)(_.executeAction(_))
    println(endRover)

  }
}
