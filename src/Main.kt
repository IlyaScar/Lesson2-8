//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {


    class Box<T>(val item: T) // Класс
    fun <T> printItem(item: T): T {
        return item
    } // Функция

   val test =  printItem(34)
    println("$test")
    val test3 = println("testProduct")
    println(test3)

    //task1
    fun <T> validateField(field: T?): Boolean {

        if (field == null) return false
            else (return true)

    }

    val test5: String = "testProduct"
    println(validateField(test5))


    //task2
    fun <T> countElements(list: List<T>): Int {

        return list.size
    }
    val testString = listOf("product1","product2","product3")
    println(countElements(testString))

    //task3
    class Basket<T>(val items: List<T>) {

        fun addItem(newItem :T) {

        }

        fun getAllItems() {
            return getAllItems()
        }

    }
//не совсем разобрался что точно тут происходит
    fun <T : Weighable> Basket<T>.totalWeight(): Double {
        return this.items.sumOf { it.weight }

    }

    fun <T : Valuable> Basket<T>.totalValue(): Int {

        return this.items.sumOf { it.value }
    }

    data class Book(val title:String, override val value: Int) : Valuable
    data class Apple(val sort: String, override val weight: Double, override val value: Int ) : Weighable, Valuable

    val bookBasket = Basket(listOf(

        Book("asd", 233),
        Book("sdfd", 2900)
    ))

    val appleBasket = (listOf(
        Apple("apple1",0.21312,213)

    ))
//тут я немного запутался...разбираюсь
    var basketTest = Basket<Apple>()
    basketTest.addItem(Apple("new", 23.0, 44))
    println("Veight ${basketTest.totalWeight()}")



}

interface Weighable {
    val weight: Double
}

interface Valuable {
    val value: Int
}


fun <T> validateField(field1: T): Boolean {

   return field1!=null
}