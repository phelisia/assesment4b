fun main(){
    println("hey")
    arrayinteger(arrayOf(3,5,6))
    mixedtype(arrayOf(5.5 ,3.4F,10,"Phelisia",2.2))
     var z=arraycharacters(arrayOf('a','e','i','o','u'))
    println(z)
}
fun arrayinteger(num:Array<Int>):Int{
    var product = 1
    num.forEach { number ->
        product *= number
        println(product)
    }
    return product
}
fun mixedtype(mix:Array<Any>):Double{
    var sum=0.0
    mix.forEach {
            name->
        if(name is Double|| name is Float){
            sum +=name.toString().toDouble()
            println(sum)
        }
    }
    return  sum
}
fun arraycharacters(vowels:Array<Char>):Int{
    var irabu=0
    vowels.forEach {
            name->
        if(name =='a'|| name=='e'||  name=='i'|| name=='o'|| name=='u'){
            irabu++

        }
    }

return irabu

}