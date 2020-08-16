//https://leetcode.com/problems/reformat-date/
fun reformatDate(date: String): String {

    var mp = mapOf(
            "Jan" to "01",
            "Feb" to "02",
            "Mar" to "03",
            "Apr" to "04",
            "May" to "05",
            "Jun" to "06",
            "Jul" to "07",
            "Aug" to "08",
            "Sep" to "09",
            "Oct" to "10",
            "Nov" to "11",
            "Dec" to "12"
    )
    var fields = date.split(" ").toMutableList()
    if (fields[0].replace("[a-z]".toRegex(), "").length == 1) {
        fields[0] = "0${fields[0]}"
    }
    return "${fields[2]}-${mp[fields[1]]}-${fields[0].replace("[a-z]".toRegex(), "")}"

}
