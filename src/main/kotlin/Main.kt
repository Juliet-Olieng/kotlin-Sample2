fun main(){
    greetingSomeone("Juliet")

    var x=remainderOfTwoNumbers(68,5)
    println(x)

sumTwoNumbers(45,34)
    var y=sumTwoNumbers(58,23)
    println(y)
    var z=sumTwoNumbers(67,15)
    println(z)

aboutME("Whitney","you are beautiful")
}

fun greetingSomeone(name:String){
    println("Hello" +name)
}

fun remainderOfTwoNumbers(num1:Int,num2:Int):Int{
    var remainder =num1%num2
    return remainder
}

fun sumTwoNumbers(num1:Int,num2:Int):Int{
    var sum =num1+num2
    return(sum)

}
fun aboutME(name:String,fact:String){
    println("Hello" +name +fact)
}