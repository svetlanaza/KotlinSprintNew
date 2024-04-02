package lesson_15

interface MovPassengers {

    val maxPassengers: Int
    val passengers: Int
    fun transportPassengers(passengers: Int)

}

interface MovCargo {
    val maxCargo: Int
    val cargo: Int
    fun transportCargo(cargo: Int)
}

class PassengerCar : MovPassengers {
    override val maxPassengers = 3
    override val passengers = 1
    override fun transportPassengers(passengers: Int) {
        println("Автомобиль перевез $passengers пассажиров")
    }
}

class Truck() : MovCargo, MovPassengers {
    override val maxCargo = 2000
    override val cargo = 1000
    override fun transportCargo(cargo: Int) {
        println("Грузовик перевез $cargo кг")
    }
    override val maxPassengers = 1
    override val passengers = 1

    override fun transportPassengers(passengers: Int) {
        println("Грузовик перевез $passengers пассажира")
    }
}

fun main() {
    val passengerCar1 = PassengerCar()
    passengerCar1.transportPassengers(3)

    val passengerCar2 = PassengerCar()
    passengerCar2.transportPassengers(2)

    val truck = Truck()
    truck.transportCargo(2000)
    truck.transportPassengers(1)

}


