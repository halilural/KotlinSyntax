fun main(args: Array<String>) {

    var name : String = "HalilU"
//    name = null

    var nullableName : String? = null
    nullableName = "Something"

    // Null check
    var length =  0
    if (nullableName!=null)
    length = nullableName.length
    else
        length = -1

    println(length)

    val l = if( nullableName != null) nullableName.length else -1
    println(l)

    // Second method Safe Call Operator ?
    nullableName = null
    println(nullableName?.length)

    //Third method is Elvis Operator
    // ?: means if there is not non-null value
    val len = nullableName?.length ?: -1

    println(len)

//    nullableName = "Something"
    val noName = nullableName ?: "No one knows me..."
    println(noName)

    // !! means We knows it is there, except it is not there.
    // only use when you know %100 percent that a value does exist for that variable
    println(nullableName!!.length)




}