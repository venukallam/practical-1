fun main(){
    print("Enter 1st number: ")
    var num1: Int =Integer.valueOf(readLine())
    print("Enter 2nd number: ")
    var num2: Int =Integer.valueOf(readLine())
    println("1.Addition")
    println("2.Substraction")
    println("3.Multiplication")
    println("4.Division")
    print("Enter the arithmetic operation: ")
    var x: Int =Integer.valueOf(readLine())
    when (x) {
        1 -> addition(num1, num2)
        2 -> substract(num1, num2)
        3 -> multiply(num1, num2)
        4 -> divide(num1, num2)
    }
}
fun addition(num1: Int,num2: Int){
    val a: Int = num1 + num2
    println("Addition answer : $a")
}
fun substract(num1: Int,num2: Int){
    val b:Int = num1 - num2
    println("Substraction answer : $b")
}
fun multiply(num1: Int,num2: Int){
    val c:Int = num1 * num2
    println("Multiplication answer : $c")
}
fun divide(num1: Int,num2: Int){
    val d:Int = num1 / num2
    println("Devision answer : $d")
}
