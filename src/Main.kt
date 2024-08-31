import kotlin.math.absoluteValue


fun main() {

    // интерфейс реализующий 2 функции ускорение за определенное время и отчет о транспорте
    lateinit var myTransoprt: Engine


    // Создали 3 вида транспорта
    val myBicycle = Bicycle()
    val myCar = Car()
    val myScooter = Scooter()


    // Мы будем выполнять действия для  велосипеда путем присвоения части обьекта которое является переопределнием интерфейса
    myTransoprt = myBicycle
    println(myTransoprt.speepUP(startSpeed = 0, time = 10))

    myTransoprt = myScooter
    println(myTransoprt.speepUP(startSpeed = 0, time = 10))

    myTransoprt = myCar
    println(myTransoprt.speepUP(startSpeed = 0, time = 10))



}



class Bicycle(): Engine  {
    private val acceleration = 5

    override fun speepUP(startSpeed: Int, time: Int): Int {
        this.otchet()
        return startSpeed + time * acceleration

    }

}

class Car() : Engine{

    private val acceleration = 30
    private val refueltime = 1

    override fun speepUP(startSpeed: Int, time: Int): Int {
        this.otchet()
        return startSpeed + (time - refueltime) * acceleration
    }

}

class Scooter() : Engine {

    private val acceleration = 10
    override fun speepUP(startSpeed: Int, time: Int): Int {
        this.otchet()
        return startSpeed + time * acceleration
    }

}


interface Engine {
    fun speepUP(startSpeed: Int, time: Int) : Int
    fun otchet() {
        println("its a ${this.javaClass.name}")
    }

}

//Разберём код подробнее:
//Интерфейс Engine:
//Определяет два метода: speedUP() для расчета скорости и otchet() для вывода информации о транспортном средстве.
//Метод otchet() имеет default реализацию, которая выводит имя класса.
//Классы Bicycle, Car, Scooter:
//Реализуют интерфейс Engine.
//Каждый класс имеет свою реализацию speedUP() с разными значениями ускорения и дополнительной логикой (например, время заправки для Car).
//Классы наследуют default реализацию otchet() из интерфейса.
//Функция main():
//Создает объекты разных транспортных средств.
//Использует lateinit var myTransport: Engine для хранения ссылки на объект, реализующий Engine.
//Присваивает myTransport разные объекты и вызывает speedUP(), демонстрируя полиморфизм. Что хорошо:
//Четкая структура: Код хорошо структурирован, легко читается и понятен.
//Использование интерфейса: Интерфейс Engine обеспечивает абстракцию и позволяет работать с разными типами транспорта единообразно.
//Полиморфизм: Вызов myTransport.speedUP() демонстрирует, как один и тот же метод может иметь разное поведение в зависимости от типа объекта.
//Default реализация: Метод otchet() с default реализацией показывает, как можно предоставлять базовую функциональность в интерфейсе.
