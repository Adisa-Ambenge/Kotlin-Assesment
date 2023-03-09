fun main() {

val calculator=Calculator(20,2)
    val result1 = calculator.addition(2, 5)
    println(result1)

    val result2 = calculator.subtraction(80, 50)
    println(result2)

    val result3 = calculator.division(20, 10)
    println(result3)

    val result4 = calculator.multiplication(6, 5)
    println(result4)

    val numbers= arrayOf(33,28,90)
}

//fun firstChar(string1: String, string2: String): String {
//    return string1[0]
//    if (string1.length > string2.length) string1[0]
//
//
//    else if{
//    (string2.length > string1.length) string2[0]
//    }
//    else {
//        sring1[0]
//    }
//}
//QUESTION 5
open class Calculator(var num1: Int,var num2: Int){
        fun addition(num1: Int, num2:Int): Int {
            return num1 + num2
        }

        fun subtraction(num1:Int, num2: Int):Int {
            return num1 - num2
        }

        fun division(num1: Int, num2:Int): Int {

            return num1 / num2
        }

        fun multiplication(num1: Int, num2: Int): Int {
            return num1 * num2
        }
    }

//QUESTION 2
fun number(numbers: IntArray): Triple<Int, Int, Double> {
    val min = numbers.minOrNull() ?: 0
    val max = numbers.maxOrNull() ?: 0
    val average = numbers.average()
    return Triple(min, max, average)
}


