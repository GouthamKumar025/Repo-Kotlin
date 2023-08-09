fun main(){
    val string = "racecar"
    println("The String is $string")
    // reverse the string
    val reverse= string.reversed()
    if(string.equals(reverse)){
        println("The given string $string is a palindrome")
    }else{
        println("Try another one")
    }
}