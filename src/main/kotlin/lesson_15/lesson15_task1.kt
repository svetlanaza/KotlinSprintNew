package lesson_15

interface Flying {

    fun fly()
}

interface Swimming {

     fun swim()
}

class Carp : Swimming {

    override fun swim() {
        println("Карась плавает")
    }
}

class Duck : Swimming, Flying {

    override fun swim() {
        println("Утка плавает")
    }

    override fun fly() {
        println("Утка летает")
    }
}

class Gull : Swimming, Flying {
    override fun swim() {
        println("Чайка плавает")
    }

    override fun fly() {
        println("Чайка летает")
    }
}

fun main() {
    val carp = Carp()
    carp.swim()

    val duck = Duck()
    duck.swim()
    duck.fly()

    val gull = Gull()
    gull.swim()
    gull.fly()
}