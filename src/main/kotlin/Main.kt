import java.util.*

fun main() {
    items("Oak","Neem","Olive","Jacaranda")
    places()
    digits()
    println(names("May","Penelope","Shem"))
}
fun items(tree1:String,tree2: String,tree3: String,tree4: String){
    var trees= arrayOf(tree1,tree2,tree3,tree4)
    println(trees.contentToString())
}
fun places(){
    var cities = arrayOf("harare","mumbai","dodoma","jakarta")
    println(cities.map{it.capitalize()})
}
fun digits(){
    var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum= numbers.get(1)+numbers.get(4)
    println(sum)
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())
}
fun names(name1: String,name2: String,name3: String):String{
    var identity= arrayOf(name1,name2,name3)
    return identity.contentToString()
}
