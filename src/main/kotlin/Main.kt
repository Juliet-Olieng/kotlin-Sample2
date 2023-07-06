fun main(){
    greetingSomeone("Juliet")

    var x=remainderOfTwoNumbers(68,5)
    println(x)

var y=sumTwoNumbers(45,23,34,24)
    println(y)


aboutME("Whitney","you are beautiful")
    println(evencharacter("juliet"))

    readNumber(arrayOf(12,-23,0,-13,14,34,-0))
    println( factorialNumber(5))
    reverseString("juliet")
    evenOrOdd(arrayOf(12,13,14,15,16,17,18,19,20))
    largestNumber(arrayOf(23,30,12))
    isPalindrome("madam")
    isPalindrome("mama")
}
//Write a Kotlin program that takes a string as input and prints whether it is a palindrome or not.
fun isPalindrome(input: String){
    val text=input.reversed()
    if (text==input){
        println("$input is a palindrome")
    }
    else{
        println("$input is not a palindrome")
    }
}



//question1
fun evencharacter(name: String):String{
    var empty= StringBuilder()
    for (i in name.indices) {
        if (i % 2 == 0) {
            empty.append(name[i])

        }

    }
    return empty.toString()

}

fun greetingSomeone(name:String){
    println("Hello" +name)

var y= volume(23,34,23)
    println(y)
}

fun remainderOfTwoNumbers(num1:Int,num2:Int):Int{
    var remainder =num1%num2
    return remainder
}

fun sumTwoNumbers(num1:Int,num2:Int,num3:Int,num4:Int):Int{
    var sum =num1+num2+num3+num4
    return sum

}
fun aboutME(name:String,fact:String){
    println("Hello" +name +fact)
}
fun volume(dim1:Int, dim2:Int, dim3:Int):Int{
    var volume = dim1 * dim2 * dim3
    return volume
}
//Write a Kotlin program that reads a number from the user and prints whether it is positive, negative, or zero.
fun readNumber(numbers:Array<Int>){
    for (num in numbers){
        if (num>0){
            println("$num is positive")
        }
        else if (num<0){
            println("$num is negative")
        }
        else{
            println("$num is zero")
        }
    }


}
//Write a Kotlin program that calculates the factorial of a given number.
fun factorialNumber (number:Int):Long{
    var factorial =1L
    for (i in 1..number){
        factorial*=i
    }
    return factorial
}
//Write a Kotlin program that takes a string as input and prints the string reversed.
fun reverseString(text:String){
    var reversedString=text.reversed()
    println(reversedString)
}
//Write a Kotlin program that takes an integer as input and prints whether it is even or odd.
fun evenOrOdd(numbers: Array<Int>){
    for (num in numbers){
        if (num%2==0){
            println("$num is even")
        }
        else{
            println("$num is odd")
        }
    }
}

//ite a Kotlin program that takes three integers as input and prints the largest one.
fun largestNumber(input:Array<Int>){
    var largerNumber=if (input[0]>input[1] && input[0]>input[3]){
        input[0]
    }
    else if (input[1]>input[0] && input[1]>input[2]){
        input[1]
    }
    else{
        input[2]
    }
    println(largerNumber)

}