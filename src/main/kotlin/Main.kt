fun main() {
val char=firstChar("Angela","Emmy")
println(char)
    

val calc=Calculator(20,2)
calc.addition()
calc.subtraction()
calc.division()
calc.multiplication()

val results = number(arrayOf(2,45,60,20,56))
 
}

fun firstChar(string1: String, string2: String): Char{
   if (string1.length > string2.length) {
       string1[0]
   }
   else if(string2.length > string1.length){ 
       return string2[0]  
   }
    else {       
       string1[0]
   }
}
//QUESTION 5
class Calculator(var num1: Int,var num2: Int){
        fun addition(){
           println(num1+num2)
        }

        fun subtraction(){
            println(num1 - num2)
        }

        fun division(){

         println(num1 / num2)
        }

        fun multiplication(){
          println(num1 * num2)
        }
    }

//QUESTION 2
fun number(numbers: Array<Int>): Triple<Int, Int, Double> {
    val min = numbers.min()
    val max = numbers.max()
    val average = numbers.average()
    return Triple(min, max, average)
}


