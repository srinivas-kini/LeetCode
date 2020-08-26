package practice_problems
//https://leetcode.com/problems/path-crossing/
fun isPathCrossing(path: String): Boolean {
    var xCount = 0
    var yCount = 0
    val visitedPoints = mutableSetOf<String>()
    visitedPoints.add("0,0")
    for (i in path.indices) {
        yCount = if (path[i] == 'N') ++yCount else if (path[i] == 'S') --yCount else yCount
        xCount = if (path[i] == 'E') ++xCount else if (path[i] == 'W') --xCount else xCount
        if (visitedPoints.contains("$xCount,$yCount")) return true
        else visitedPoints.add("$xCount,$yCount")
    }
    return false
}

