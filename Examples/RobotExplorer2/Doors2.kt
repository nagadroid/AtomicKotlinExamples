// RobotExplorer2/Doors2.kt
package robotexplorer2
import robotexplorer2.Player.*
import robotexplorer2.Urge.*

val edge = Room(Edge())

class Doors {
  private var north: Room = edge
  private var south: Room = edge
  private var east: Room = edge
  private var west: Room = edge
  fun open(urge: Urge): Room =
    when (urge) {
      North -> north
      South -> south
      East -> east
      West -> west
    }
  fun connect(
    row: Int, col: Int,
    rooms: Map<Pair<Int, Int>, Room>
  ) {
    fun link(toRow: Int, toCol: Int) =
      rooms.getOrDefault(
        Pair(toRow, toCol), edge)
    north = link(row - 1, col)
    south = link(row + 1, col)
    east = link(row, col + 1)
    west = link(row, col - 1)
  }
}
