import java.awt.Color

//class Car constructor(make: String, model: String) {
//    val make = make
//    val model = model
//}

// val =>>> just getter
// var =>>> getter and setter

//class Car (val make: String,val model: String, var color: String) {
//
//    fun accelerate(){
//        println("vroom vroom")
//    }
//
//    fun details(){
//    println("this is a $color $make $model")
//    }
//}
//
//class Truck(val make: String, val model:String, val towingCapacity: Int){
//    fun tow(){
//        println("taking the horses to the rodeo")
//    }
//}

// the justn one class keyword means final class, but if you add open keyword at the beginning of the class,
// you do class not final and that is able to inherited from other classes.

open class Vehicle(val make: String, val model: String) {

    // open means overridable
    open fun accelerate() {
        println("vroom vroom")
    }

    fun park() {
        println("parking the vehicle")
    }

    fun brake() {
        println("STOP")
    }
}

class Car(make: String, model: String, var color: String) : Vehicle(make, model) {
    override fun accelerate() {
        println("We are going ludicrous model!")
        super.accelerate()
    }
}

class Truck(make: String, model: String, val towingCapacity: Int) : Vehicle(make, model) {
    fun tow(){
        println("headed out to the mountains")
    }
}

fun main(args: Array<String>) {

    val tesla = Car("Tesla","ModelS","Red")
    tesla.accelerate()
    val truck = Truck("Ford","F-150",10000)
    truck.accelerate()
//    var car = Car("Toyota", "Avalon", "Red")
//    println(car.make)
//    println(car.model)
//    car.accelerate()
//    car.details()
//    val truck = Truck("Ford", "F-150", 10000)
//    truck.tow()

}