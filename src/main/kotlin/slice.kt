fun main() {

    var cars = mutableListOf("Toyota", "Volkswagen", "BMW", "Mercedes-Benz", "Ford", "Audi", "Nissan", "Honda")
    var newList: MutableList < String> = mutableListOf(    )

    // here si the newList with the half of the cars in a new list from index 1 each 2 spots
    newList = cars.slice(1 until cars.size step 2).toMutableList()
    //here is the order list from the rest of cars from index 0 .
    cars = cars.slice(0 until cars.size step 2).toMutableList()
    println(newList)
    println(cars)
}