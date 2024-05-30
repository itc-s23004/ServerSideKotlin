package jp.ac.it_college.std.s23004.jp.ac.it_college.std.s23004.practice.cahp2

interface CalculationExecutor {
    val message: String
    fun calc(num1: Int, num2: Int): Int
    fun printStartMessage()
}