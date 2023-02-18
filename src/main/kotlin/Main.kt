fun getGreeting() = "Hello Kotlin"

fun sayHello() {
    println(getGreeting())
}
fun sayHello(greeting :String ,vararg  itemsToGreet: String){
    itemsToGreet.forEach { itemToGreet->
        println("$greeting  $itemToGreet")
    }
}
fun main() {
    //ARRAY
//    val interestingThings = arrayOf("Kotlin","Programming","Cimic Books")
//    println(interestingThings.size)
//    println(interestingThings[0])
//    println(interestingThings.get(0))

//    interestingThings.forEach {
//        println(it)
//    }
//    interestingThings.forEachIndexed {index,intrestingThing ->
//        println("Index is $index and value is $intrestingThing")
//    }

    //MAP
//    val map1 =  mapOf(1 to "kotlin",2 to "World");
//
//
//    val map =  mutableMapOf<Int,String>()
//    map.put(4,"Kotlin")
//    map.put(1,"hello")
//    map.put(2,"world")
//
//    map.forEach { t, u ->
//        println("Key $t and value $u")
//    }

//    val list = mutableListOf("kotlin","biswa","son")
//    for (s in list) {
//        println(s)
//    }
//    list.forEach(){
//        println(it)
//    }
//    sayHello("Hii","Kotlin","Python","Java","C++")

//    val interest = listOf(2,34,5,6,7,6)
//    interest.forEach(){num->
//        println(num)
//    }

}