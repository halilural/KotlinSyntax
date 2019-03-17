fun main(args: Array<String>) {

    var str = "May the force be with you."
    println(str)

    // Escaped String
    var str1 = "My dad said the funniest thing that he said \" a joke \" "

    // New line
    var str2 = "May the force \nbe with you"
    println(str2)

    // Tab
    var str3 = "May the force \tbe with you"
    println(str3)

    // Backspace
    var str4 = "May the force \b be with you"
    println(str4)

    // Return
    var str5 = "May the force\r be with you"
    println(str5)

    // Raw String

    val rawCrawl = """ A long time ago,
        in a galaxy
        far, far , away...
        BUMM BUMM BUMMMM"""

        println(rawCrawl)

    // Trim Margin for raw String

    val rawCraw2 = """|A long time ago,
        |in a galaxy
        |far, far , away...
        |BUMM BUMM BUMMMM""".trimMargin()

    println(rawCraw2)

    // Trim Margin with wanting parameter

    val rawCraw3 = """>A long time ago,
        >in a galaxy
        >far, far , away...
        >BUMM BUMM BUMMMM""".trimMargin(">")

    println(rawCraw3)

    // for loop in string for outputting all character in str string variables
    for(char in str){
        println(char)
    }

    // String comparing
    val contentEquals = str.contentEquals("Ma the force be with you.")
    println(contentEquals)

    // Containing char[] in string
    val contains = str.contains("force",true)

    println(contains)

    // Uppercase and lowercase function

    val toUpperCase = str.toUpperCase();
    val toLowerCase = str.toLowerCase();

    println(toUpperCase)
    println(toLowerCase)

    val num = 6
    val stringNum = num.toString()
    println(stringNum)

    // retrieve a litlle part string of str string function

    val subSequence = str.subSequence(4,13);
    println(subSequence)


    // String templates
    // strings in string

    val luke = "Luke Skywalker"
    val lightSaberColor = "green"
    val vehicle = "landspeeder"
    val age = 27
    println("$luke  has a $lightSaberColor lightsaber and drives a $vehicle and is $age years old")
    println("Lukes full name $luke has ${luke.length} characters")










}