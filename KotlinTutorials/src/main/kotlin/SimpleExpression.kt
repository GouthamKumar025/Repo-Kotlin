fun main(){
    val bool = true
    val x = 9
    val y = 3
    val z = 9
    val final = !(x!=z) && bool || z>(x+y) && (!bool || y<z)
    println(final)
}