/* Lists are immutable in nature. They can't have their individual values reassigned,
 * nor can they have items added or removed, while arrays have setting methods, which allow their items
 * to change. Arrays also cannot have items added to or removed from.
 * Both arrays and lists can have their entire value reassigned, if they aren't stored as final variables.
 * MutableList is an interface that allows more control over the individual items and length of a list.

 * Arrays are mostly used for primitive types, mainly because of processor overhead,
 * and preferably its specific type constructors.
 * On most cases we use convenient methods to make lists.
 * listOf() to have immutable lists and store constant values, and mutableListOf() for
 * mutable lists, which allow more freedom working with dynamic data.

 * Mutable means it can mutate - change, shrink, grow, adapt - and, in my opinion, is a special word selected
 * by the developers of the Kotlin language to indicate to its users that is a truly malleable list
 * and adds a bit of character to the Kotlin language, which is built to complement a giant of development, Java.
 */

 fun main() {
     val list = listOf(1, 2, 3)
 //    list[2] = 1 // Compiler error
 //    list.add // Compiler error
     val finalArray = arrayOf("a","b","c")
     finalArray[1] = "d"
 //    finalArray.add // Compiler error
 //    finalArray = arrayOf("f") // Compiler error
     var array = arrayOf("a","b","c")
     array[2] = "e"
 //    array.add // Compiler error
     array = arrayOf("f")
     val mutableList = mutableListOf<Any>(1.0,"a",2)
     mutableList[1] = "b"
     mutableList.add('c')
     mutableList.removeAt(0)
     mutableList.forEach { item -> println(item.toString()) }   
   }
