val name = "Vu"
fun main() {
    val n = 23
    val border = "*"
    printBorder1()
    println("Happy Birthday, ${name}")
    printBorder1()
    printBorder2()
    printBorder3()
    printBorder4(border)
    printBorder5(border, n)
}

fun printBorder1() {
    println("=======================")
}
fun printBorder2(){
    println()
    println("=======================")
    println("Happy Birthday, ${name}")
    println("=======================")
}

fun printBorder3(){
    println()
    repeat(23) {
        print("=")
    }
    println()
    println("Happy Birthday, ${name}")
    repeat(23) {
        print("=")
    }
}

fun printBorder4(n: String) {
    println()
    repeat(23) {
        print(n)
    }
    println()
    println("Happy Birthday, ${name}")
    repeat(23) {
        print(n)
    }
    println()
}

fun printBorder5(border: String, times: Int) {
    repeat(times) {
        print(border)
    }
    println()
    println("Happy Birthday, ${name}")
    repeat(times) {
        print(border)
    }
    println()
}