//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    /** Эот к какому заданию относится? */
    //удалил
    //task1
    fun <T> validateField(field: T?): Boolean {
        /** Я уже писал про форматирование кода if, надо его придерживаться, а не писать как попало, а еще проще тут вернуть результат сравнения без использования if, return field != null */
        // поправил
        return field != null;
    }
    val test5: String = "testProduct"
    println(validateField(test5))

    //task2
    fun <T> countElements(list: List<T>): Int {
        /** Про лишние пустые строки я тоже не раз уже писал, стоит прислушиваться к рекомендациям */
        return list.size
    }
    val testString = listOf("product1","product2","product3")
    println(countElements(testString))

    //task3
    /** Для чего у тебя два поля items и listItems? Можно оставить одно, то что в конструкторе и работать с ним */
    class Basket<T>(val items: List<T>) {
        val listItems = items.toMutableList()
        fun addItem(newItem :T) {
            /** Тут реализация не нужна? */
            //поправил
            listItems.add(newItem)
        }
        fun getAllItems( ) : List<T> {
            /** Проверял работу этого метода? предполагаю что нет */
            //поправил
            return listItems
        }
    }
//не совсем разобрался что точно тут происходит
    /** Если не разобрался, как написал? если вопросы лучше приходи с нимми */
    fun <T : Weighable> Basket<T>.totalWeight(): Double {
        return getAllItems().sumOf { it.weight }
    }
    fun <T : Valuable> Basket<T>.totalValue(): Int {
        return getAllItems().sumOf { it.value }
    }
    data class Book(val title:String, override val value: Int) : Valuable
    data class Apple(val sort: String, override val weight: Double, override val value: Int ) : Weighable, Valuable
    val bookBasket = Basket<Book>(listOf(
        Book("Harry Potter 1", 233),
        Book("Witcher", 2900)
    ))
    /** Тут вообще не Basket */
    val appleBasket = Basket<Apple>(listOf(
        Apple("Green",0.21312,213),
        Apple("New Summer",0.24,444)
    ))
//тут я немного запутался...разбираюсь
    /** Доразбирайся */
    appleBasket.addItem(Apple("RedChief", 23.0, 44))
    println("Apples Weight ${appleBasket.totalWeight()}")
    println("Apples Value ${appleBasket.totalValue()}")
    bookBasket.addItem(Book("Harry Potter 2", 23))
    println("Basket of Books ${bookBasket.totalValue()}")
}
interface Weighable {
    val weight: Double
}
interface Valuable {
    val value: Int
}
/** Оказывается есть второй вариант функции */
/*fun <T> validateField(field1: T): Boolean {
   return field1!=null
}*/
