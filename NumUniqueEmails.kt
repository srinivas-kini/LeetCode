//https://leetcode.com/problems/unique-email-addresses/
fun numUniqueEmails(emails: Array<String>): Int {
    val res = mutableSetOf<String>()
    emails.forEach { email ->
        var (localName, domainName) = email.split("@")
        res.add("${localName.replace(".", "").replaceAfter("+", "").replace("+", "")}@$domainName")
    }
    res.forEach(::println)
    return res.size
}

