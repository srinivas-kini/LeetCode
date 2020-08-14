//https://leetcode.com/problems/robot-return-to-origin/
fun judgeCircle(moves: String): Boolean {
    var yCount = 0
    var xCount = 0

    moves.forEach { move ->
        yCount = if (move == 'U') ++yCount else if (move == 'D') --yCount else yCount
        xCount = if (move == 'R') ++xCount else if (move == 'L') --xCount else xCount
    }
    return (xCount == 0 && yCount == 0)
}

