fun main(args: Array<String>) {

    // Immutable
    val imperials = listOf("Emperor", "Darth Vader", "Boba Fett", "Tarkin")
    println(imperials)
    println(imperials.sorted())
    println(imperials[2])
    println(imperials.last())
    println(imperials.contains("Emperor"))

    //Mutable
    val rebels = arrayListOf("Leiah", "Luke", "Han Solo", "Mon Mothma")
    println(rebels.size)
    rebels.add("Chewbacca")
    println(rebels)
    rebels.add(0,"Lando")
    println(rebels)
    println(rebels.indexOf("Luke"))
    rebels.remove("Han Solo")
    println(rebels)

    // Immutable hash Collections
    val rebelVehiclesMap = mapOf("Solo" to "Millenium Falcon","Luke" to "Landspeeder")
    println(rebelVehiclesMap)
    println(rebelVehiclesMap["Solo"])
    println(rebelVehiclesMap.get("Solo"))
    println(rebelVehiclesMap.getOrDefault("notinthemap", "This ship doesnt exist"))
    println(rebelVehiclesMap.values)
    println(rebelVehiclesMap.entries)

    //Mutable hash Collections
    val rebelVehicles = hashMapOf("Solo" to "Millenium Falcon","Luke" to "Landspeeder","Boba Fett" to "Rocket Pack")
    rebelVehicles["Luke"] = "XWing"
    println(rebelVehicles)
    rebelVehicles.put("Leiah","Tantive IV")
    println(rebelVehicles)
    rebelVehicles.remove("Boba Fett")
    println(rebelVehicles)
    rebelVehicles.clear()
    println(rebelVehicles)
    println(rebelVehicles.isEmpty())


}