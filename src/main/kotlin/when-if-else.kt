fun main() {
    trimester(7)
}

fun trimester(month:Int) {
    if (month in 1..3) {
        println("first trimester")
    } else if (month >=4 && month <=6) {
        println("Second trimester")
    } else if ( month >=7 && month <=9) {
        println("Third trimester")
    } else if (month >=10 && month <= 12 ){
        println("Fourth trimester")
    } else {println("did't found the month. please try again from 1 to 12.")
    }
}