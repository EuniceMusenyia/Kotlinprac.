fun main() {
    println(printName("Eunice"))
    println(printName("Senyia"))
    println( multiply(3, 2,5))
    println(multiply(1,0,2))
    println(multiply(3,2,9))

    greet("Eunice")
    greet("Esther")

    println(modulus(10,3))

    println(sum(1,2,3,4))

    interestingFact("adventure")

    fact("Esther", " is an artist")

    schoolname("akirachix")
    println(myAge("Esther", 23))
    println(myAge("Eunice",24))
    myName("Eunice")
    callMe("Eunice")
    callMe("Maggy")



    var fullName= arrayOf("Eunice","Musenyia", "Mutunga")
    fullName.set(1,"Senyia")
    println(fullName.get(1))
    println(fullName.contentToString())



    var friends= arrayOf("Esther","Emma","Maureen")
    friends.forEach{friend->
        println(friend)}
    for (y in friends){
        println(y)
    }
    friends.sort()


    println(friends.contentToString())
   println(friends.sortedArray().contentToString())

    var sortedFriends= friends.sortedArray()
    println(sortedFriends.contentToString())

   brothersArray("Jann","Jack","Cornelius","Wilson")

    cityArray()

    numberArray()

    println( classArray("Hopper Lab", "Ada lab", "Anita B").contentToString())

//Object Oriented Programming
var audi = Car ("Nissan", "Note", 0)
    println( audi.start())
    println(audi.accelerate(2))

//    inheritance
    var person1 = Person("Eunice", 30)
    println( person1.talk("I am tall"))
    person1.eat()

    var banker1 = Banker("Eunice", 20)
    println(banker1.talk("I am talking"))


//    println(multiply(3,2,5))
//    println(multiply(1,4,2))
//    println( multiply(2, 4,0))

    var ankara = Ankara("dotted")
    println(ankara.predictChanges(3.0,"happy"))


        val fabricPattern = Ankaras("Dotted")
//        fabricPattern.moods = "Happy"
//        fabricPattern.temperatures = 5
        println(fabricPattern.predictPattern("sad",3))
        var ankarapatters = Ankara2(10.5,10)
    println(ankarapatters.getmoodpattern())

println(ankarapatters.tempPattern())


}
fun printName(name:String) :String{
    var print =("Hello, my name is $name")
    return print
}fun multiply(num1: Int, num2: Int, num3: Int): Int{
    var product= num1*num2
    return product

}fun greet( name: String){
    println("hello "+ name)

}fun modulus(num1: Int, num2: Int): Int{
    var division= num1 % num2
    return division
} fun sum(num1: Int, num2: Int, num3: Int, num4: Int): Int{
    var addition = num1 + num2 + num3 + num4
    return addition
}fun interestingFact(fact: String){
    var fact = "I love" +  " " + fact
    println(fact)
}fun fact( name: String, fact: String){
    var funFact = name + " " + fact
    println(funFact)
}fun schoolname(school: String){
 println(school[0])
    println(school[2])
    println(school[3])
}
fun myAge(name: String, age: Int): String{
    val sentence = "My name is $name and I am $age years old"
    return sentence
    val sentence2 = "My name is $name and I am $age years old"
    return sentence2
}
fun myName(name: String){
    println(name.length)
}
fun callMe(MyName: String){
   val name = "Eunice"
    if (name == MyName){
        println("That's me")
    }
    else{
        println("I don't know who that is")
    }
//}fun arrayOfNames(){
//    var fullName= arrayOf("Eunice","Musenyia", "Mutunga")
//    arrayOfNames.set1


//} fun arrayOfFriends(){
//    var friends= arrayOf("Esther","Emma","Maureen")
//   arrayOfFriends.forEach{friend->
//       println(friend)


}
fun brothersArray(bro1:String,bro2:String,bro3: String,bro4: String){
    val brothers = arrayOf(bro1,bro2,bro3,bro4)
    println(brothers.contentToString())
}
fun cityArray(){
    val cities=  arrayOf("harare", "mumbai","dodoma","jakarta")
    println("${cities[0].replaceFirstChar { "H" }},${cities[1].replaceFirstChar { "M" }}, ${cities[2].replaceFirstChar { "D" }}, ${cities[3].replaceFirstChar { "J" }}")
}
fun numberArray(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    println(numbers[1] + numbers[4])
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())
    numbers.sort()
    for (number in numbers){
        println(number)
    }
}
fun classArray(class1:String,class2: String,class3:String): Array<String>{
    val classes= arrayOf(class1, class2,class3)
    return classes

}
// Object Oriented Programming
class Car (var make:String, var model: String,var speed: Int){
    fun start():String{
        return ("$make is starting")
//        println("${make} is starting")
    }
    fun accelerate(accelerate:Int):Int{
        speed = speed + accelerate
        return speed
    }
}
//Inheritance
open class Person(var name:String, var age :Int){
    open fun talk(words:String):String{

        return words
    }
    fun eat(){
        println("I am eating")
    }
}
class Banker (name: String,age: Int):Person(name, age){
    override fun talk(words: String): String {
        return  words
    }
}

class Ankara(var design:String){
    fun predictChanges(temperature:Double,mood:String):String{
        var temperature= 10.0
        for (i in 1..10){
            if (i>5 || mood=="Sad"){
                return " wear $design"
            }
            else if (i<5 || mood=="Happy"){
                return "$design has changed to "
            }
            else{
                return "The $design does not change"
            }

        }
        return "The $design change with respect to mood and temperature of the wearer" }
}


class Ankaras(val pattern: String) {
    fun predictPattern(moods:String,temperatures:Int): String {
        if (moods == "Happy" && temperatures > 30 || temperatures<=30) {
            return "The $pattern fabric pattern will be bright."
        } else if (moods == "Sad" && temperatures < 10 || temperatures>=10) {
            return "The $pattern fabric pattern will be dark."
        } else if (moods == "Neutral" && temperatures >= 10 && temperatures <= 30) {
            return "The $pattern fabric pattern will remain the same."
        } else {
            return "Unable to predict pattern changes."
        }
    }

}

class Ankara2(var temp:Double, var mood: Int){
    fun getmoodpattern():String {
        var mood = 10.0
        var temp = 27.0
        for (i in 1..10) {
            if (mood < 5) {
                return "wear floral patterns"
            } else if (mood > 5 )  {
                return "wear dark patterns"
            } else {
                return "wear neutral patterns"
            }
        }
        return ("NO PATTERN FOUND")
    }

    fun tempPattern():String{
        var temp= 30.0
        for (temp in 1..10){
            if (temp< 17.0){
                return "wear floral patterns"
            }
            else if (temp <17.0){
                return "wear dark patterns"
            }
            else{
                return "wear neutral patterns"
            }

        }

        return ("Provide the return value")
    }
}

