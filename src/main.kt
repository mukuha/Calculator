import java.math.BigDecimal

fun main() {
    println("----------------------------------------------------")
    println("ADDITION | SUBTRACTION | MULTIPLICATION | DIVISION")
    println("----------------------------------------------------")
    loop@while (true) {
        var numberNumber = 1
        var number1: BigDecimal
        var number2: BigDecimal
        var operation: String
        var result: Double


        loop1@ while (true) {
            try {
                number1 = FunctionsLibrary.getInput("==>Enter Number ${numberNumber}: ")
            } catch (e: KotlinNullPointerException) {
                println("==>${e.message} value was null")
                continue@loop1
            } catch (e: NumberFormatException) {
                println("==>${e.message} is not a number")
                continue@loop1
            }
            break@loop1
        }

        loop2@ while (true) {
            print("==>Select an operation ( +  - / *): ")
            try {
                operation =
                        when (val input = readLine()) {
                            "+" -> "+"
                            "-" -> "-"
                            "/" -> "/"
                            "*" -> "*"
                            else -> throw Exception("==> '${input}' is unrecognized operation by this calculator\n"
                                    + "This simple calc only supports the following four operations:\n"
                                    + "----------------------------------------------------\n"
                                    + "Addition | Subtraction | Multiplication | Division\n"
                                    + "----------------------------------------------------\n")
                        }
            } catch (e: Exception) {
                print("==>${e.message}")
                continue@loop2
            }
            break@loop2
        }

        loop3@ while (true) {
            try {
                number2 = FunctionsLibrary.getInput("==>Enter Number ${++numberNumber}: ")
            } catch (e: KotlinNullPointerException) {
                println("==>${e.message} value was null")
                continue@loop3
            } catch (e: NumberFormatException) {
                println("==>${e.message} is not a number")
                --numberNumber
                continue@loop3
            }
            break@loop3
        }

        result =
                when (operation) {
                    "+" -> number1.plus(number2).toDouble()
                    "-" -> number1.minus(number2).toDouble()
                    "/" -> number1.div(number2).toDouble()
                    else -> number1.times(number2).toDouble()

                }

        println("-------------------------------")
        println("$number1 $operation $number2 = $result")
        println("-------------------------------")

        print("==> Enter ( +  - / *) to perform a calculation with this result ($result),\n"
                + "==> To start a new calculation, press 'n'\n"
                + "==> To exit the application, press 'e': ")

        loop4@ while (true) {
            numberNumber++
            when (val decision: String? = readLine()) {
                "e", "E" -> break@loop
                "n", "N" -> continue@loop
                "+" -> {
                    loop5@ while (true) {
                        try {
                            number1 = result.toBigDecimal()
                            operation = decision

                            number2 = FunctionsLibrary.getInput("==>Enter Number ${numberNumber}: ")

                            result = number1.plus(number2).toDouble()

                            println("-------------------------------")
                            println("$number1 $operation $number2 = $result")
                            println("-------------------------------")

                        } catch (e: KotlinNullPointerException) {
                            println("==>${e.message} value was null")
                        } catch (e: NumberFormatException) {
                            println("==>${e.message} is not a number")

                            print("==> Enter a number to continue\n"
                                    + "==> To start a new calculation, press 'n'\n"
                                    + "==> To exit the application, press 'e':\n")
                            continue@loop5
                        }
                        break@loop5
                    }//this is end of loop5 for +

                    print("==> Enter ( +  - / *) to do a calculation with this result ($result),\n"
                            + "==> To start a new calculation, press 'n'\n"
                            + "==> To exit the application, press 'e': ")

                    continue@loop4

                }
                "-" -> {
                    loop5@ while (true) {
                        try {
                            number1 = result.toBigDecimal()
                            operation = decision

                            number2 = FunctionsLibrary.getInput("==>Enter Number ${numberNumber}: ")

                            result = number1.minus(number2).toDouble()

                            println("-------------------------------")
                            println("$number1 $operation $number2 = $result")
                            println("-------------------------------")

                        } catch (e: KotlinNullPointerException) {
                            println("==>${e.message} value was null")
                        } catch (e: NumberFormatException) {
                            println("==>${e.message} is not a number")

                            print("==> Enter a number to continue\n"
                                    + "==> To start a new calculation, press 'n'\n"
                                    + "==> To exit the application, press 'e':\n")
                            continue@loop5
                        }
                        break@loop5
                    }//this is end of loop5 for -

                    print("==> Enter ( +  - / *) to do a calculation with this result ($result),\n"
                            + "==> To start a new calculation, press 'n'\n"
                            + "==> To exit the application, press 'e': ")

                    continue@loop4

                }
                "*" -> {
                    loop5@ while (true) {
                        try {
                            number1 = result.toBigDecimal()
                            operation = decision

                            number2 = FunctionsLibrary.getInput("==>Enter Number ${numberNumber}: ")

                            result = number1.times(number2).toDouble()

                            println("-------------------------------")
                            println("$number1 $operation $number2 = $result")
                            println("-------------------------------")

                        } catch (e: KotlinNullPointerException) {
                            println("==>${e.message} value was null")
                        } catch (e: NumberFormatException) {
                            println("==>${e.message} is not a number")

                            print("==> Enter a number to continue\n"
                                    + "==> To start a new calculation, press 'n'\n"
                                    + "==> To exit the application, press 'e':\n")
                            continue@loop5
                        }
                        break@loop5
                    }//this is end of loop5 for *

                    print("==> Enter ( +  - / *) to do a calculation with this result ($result),\n"
                            + "==> To start a new calculation, press 'n'\n"
                            + "==> To exit the application, press 'e': ")

                    continue@loop4

                }
                "/" -> {
                    loop5@ while (true) {
                        try {
                            number1 = result.toBigDecimal()
                            operation = decision

                            number2 = FunctionsLibrary.getInput("==>Enter Number ${numberNumber}: ")

                            result = number1.div(number2).toDouble()

                            println("-------------------------------")
                            println("$number1 $operation $number2 = $result")
                            println("-------------------------------")

                        } catch (e: KotlinNullPointerException) {
                            println("==>${e.message} value was null")
                        } catch (e: NumberFormatException) {
                            println("==>${e.message} is not a number")

                            print("==> Enter a number to continue\n"
                                    + "==> To start a new calculation, press 'n'\n"
                                    + "==> To exit the application, press 'e':\n")
                            continue@loop5
                        }
                        break@loop5
                    }//this is end of loop5 for /

                    print("==> Enter ( +  - / *) to do a calculation with this result ($result),\n"
                            + "==> To start a new calculation, press 'n'\n"
                            + "==> To exit the application, press 'e': ")

                    continue@loop4

                }
                else -> {
                    try {
                        throw Exception("==> '${decision}' is unrecognized operation by this calculator\n"
                                + "This simple calc only supports the following four operations:\n"
                                + "----------------------------------------------------\n"
                                + "Addition | Subtraction | Multiplication | Division\n"
                                + "----------------------------------------------------\n"
                                + "==> Enter ( +  - / *) to move on\n"
                                + "==> To start a new calculation, press 'n'\n"
                                + "==> To exit the application, press 'e': ")
                    } catch (e: Exception) {
                        print("${e.message}"); continue@loop4
                    }
                }
            }

        }
    }
    println("-------------------------------")
    println("Byebye!")
    println("-------------------------------")
    println()
    println()
    println("Powered by Mukuha")
    println()
    println()
}