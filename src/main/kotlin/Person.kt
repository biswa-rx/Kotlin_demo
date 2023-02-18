class Person(firstName: String,lastName:String) {
//    val first: String
//    val second: String
//    init{
//        first = firstName
//        second = lastName
//    }
    constructor():this("Peter","Parker"){
        println("Secondary constructor")
    //if primary constructor is call then secondary constructor not call
    }
    
}