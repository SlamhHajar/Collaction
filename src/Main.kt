fun main() {
    var byarrayof= arrayOf(10,40,30,70,5)
    var bylistof= listOf(1,2,3,4,5)
    var bymutableList= mutableListOf(77,2020,35,452,58)
    println("------------------------Array with Index")
    for ((index,value) in byarrayof.withIndex()){
        println("Array : the index" +"[$index]"+"\t the number="+"$value")
    }
    println("------------------------List with Index")
    for (i in bylistof){
        var index=bylistof.indexOf(i)
        println("index"+"[$index]"+"value="+i)
    }
    println("------------------------Mutable Array")
    for(m in bymutableList.indices){
       println("with index"+"[$m]"+"with value="+bymutableList.get(m) )
    }
    println("------------------------ Answer of 3 Question")
    println("The first element on list "+bylistof.first())
    println("The first element on list "+bylistof.last())

    println("------------------------ Answer of 4 Question")
    val de= arrayListOf<String>("rock", "panda", "plastic plant", "alligator", "flowerpot")
 println(de.filter { it.contains('p') })
    println("------------------------Sorting on DEc and ASc")
    val list= listOf<Int>(8,4,7,1,2,3,0,5,6)
    println("Sorted ascending: ${list.sorted()}")
    println("Sorted descending: ${list.sortedDescending()}")
}