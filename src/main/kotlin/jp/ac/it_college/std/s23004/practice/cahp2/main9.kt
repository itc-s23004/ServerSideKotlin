package jp.ac.it_college.std.s23004.jp.ac.it_college.std.s23004.practice.cahp2

fun main() {
    val executor = AddCalculationExecutor(CommonCalculationExecutor())
    executor.printStartMessage()
    println(executor.calc(8, 11))

    val executorDelegate = AddCalculationExecutorDelegate(executor)
    executorDelegate.printStartMessage()
    println(executorDelegate.calc(8, 11))

    val person = Person()
    person.name = "Takehata"
    person.address = "Tokyo"
    println(person.name)
    println(person.address)
}