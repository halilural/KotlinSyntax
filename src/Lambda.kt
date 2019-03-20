fun main(args: Array<String>) {

    // lambda expression for Kotlin
    val printMessage = {message : String -> println(message)}

    // This is actually same thing with above
//    fun printMessage(message:String){
//        println(message)
//    }

    printMessage("Hello World")

    val sumA = {x: Int, y: Int -> x + y}
    println(sumA(5,3))

    // This is the same with sumA lambda expression notation
    val sumB : (Int,Int) -> Int = {x,y -> x+y}
    println(sumB(1,2))

    // Unit is the equivalent of void in Java

    fun downloadData(url : String, completion : () -> Unit){
    // send a download request
        // we got back data
        // there were no network errors
        completion()
    }

    // call the downloadData function
    downloadData("fakeUrl.com", { println("The code is in this block, will only run after the completion") })

    fun downloadCarData(url : String, completion : (Car) -> Unit){
        // send a download request
        // we got back car data
        val car = Car("Tesla", "ModelX", "Blue")
        completion(car)
    }

//    downloadCarData("fakeUrl.com", {
//        car -> println(car.make)
//        println(car.model)
//        println(car.color)
//    })

    downloadCarData("fakeUrl.com", {
        println(it.make)
        println(it.model)
        println(it.color)
    })

    fun downloadTruckData(url : String, completion : (Truck? , Boolean) -> Unit){
        // make the web request
        // we get the results back
        val webRequestSuccess = true
        if(webRequestSuccess){
            // received Truck Data
            val truck = Truck("Ford", "F-150",10000)
            completion(truck,webRequestSuccess)
        }else{
             completion(null,webRequestSuccess)
        }
    }

    downloadTruckData("fakeUrl.com", {
        truck, success ->
        if(success == true){
            // do something with truck
            truck?.tow()
        }else{
            // handle the web request failure
            println("Something went wrong")
        }
    })






}