import java.math.BigDecimal

class FunctionsLibrary {

    companion object {

        fun getInput(prompt: String): BigDecimal {
            print(prompt)
            val string = readLine()
            val number = string!!.toBigDecimal()
//            val number = num.toBigDecimal()
            return number
        }

//        fun subsequentCalculations(result: Double, numberNumber: Int, decision: String) {
//            var result1 = result
//            loop5@ while (true) {
//                try {
//                    val number1 = result
//                    val operation = decision
//
//                    val number2: Double = FunctionsLibrary.getInput("Enter Number ${numberNumber}: ")
//
//                    result1 =
//                            when (operation) {
//                                "+" -> number1.plus(number2)
//                                "-" -> number1.minus(number2)
//                                "/" -> number1.div(number2)
//                                else -> number1.times(number2)
//                            }
//
//
//
//                    println("-------------------------------")
//                    println("$number1 $operation $number2 = $result1")
//                    println("-------------------------------")
//
//                } catch (e: KotlinNullPointerException) {
//                    println("${e.message} value was null")
//                } catch (e: NumberFormatException) {
//                    println("${e.message} is not a number")
//
//                    print("==> Enter a number to continue\n"
//                            + "==> To start a new calculation, press 'n'\n"
//                            + "==> To exit the application, press 'e':\n")
//                    continue@loop5
//                }
//                break@loop5
//            }
//
//
//            print("==> Enter ( +  - / *) to do a calculation with this result ($result1),\n"
//                    + "==> To start a new calculation, press 'n'\n"
//                    + "==> To exit the application, press 'e': ")
//
//        }


    }
}