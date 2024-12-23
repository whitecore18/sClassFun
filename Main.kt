fun <T> print(value: T, wrapper: Char) {
    val wrappedValue = when (wrapper) {
        '{' -> "{$value}"
        '[' -> "[$value]"
        '(' -> "($value)"
        else -> "$value"
    }
    println(wrappedValue)
}

class Person<T>(val name: String, val phone: T) {
    override fun toString(): String {
        return "Person: name = $name, phone = $phone"
    }
}

fun main() {

    print(10, '{')
    print("Hello", '[')
    print(listOf(10, 16, 3))
    print('f', '(')

    val person1 = Person("Иван", 1234567890) // телефон как число
    val person2 = Person("Мария", "9876543210") // телефон как строка

    println(person1)
    println(person2)
}