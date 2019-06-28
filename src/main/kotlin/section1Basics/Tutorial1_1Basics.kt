package section1Basics

fun main(args: Array<String>) {

    var a: Int = 1000;

    a += 10
    println("a: $a")

    if (true is Boolean) {
        print("true is boolean\n")
    }

    /*
        *** Characters ***
     */
    var letterGrade: Char = 'A'

    // instance of -> is
    println("A is a Char : ${letterGrade is Char} ")

    // Get ASCII code of character
    println("A ascii: ${letterGrade.toInt()}")

    println("3.14 to int ${3.14.toInt()}")

    /*
        *** Strings ***
    */

    println("********** Strings **********")


    var rawString: String = "I am Raw String!"
    val escapedString: String = "I am escaped String!\n"

    // Escaped String has end of line character
    println("Hello!$escapedString")
    println("Hey!!$rawString")


}