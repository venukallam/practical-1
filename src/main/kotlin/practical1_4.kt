fun main() {
    print("Enter the number: ")
    var num: Int = Integer.valueOf(readLine())
    if (num % 2 == 0)
        println("$num is even")
    else
        println("$num is odd")
}