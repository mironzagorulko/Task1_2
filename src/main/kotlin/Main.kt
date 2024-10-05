fun countUniqueCharacters(input: String): Map<Char, Int> {
    val characterCount = mutableMapOf<Char, Int>()


    for (char in input) {
        characterCount[char] = characterCount.getOrDefault(char, 0) + 1
    }

    return characterCount.toSortedMap()
}

fun main() {

    val inputString = "ASSAABBSSAA"


    val characterCount = countUniqueCharacters(inputString)

    println("Количество различных символов:")
    for ((char, count) in characterCount) {
        println("$char - $count")
    }
}
