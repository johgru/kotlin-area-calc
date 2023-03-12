import kotlin.math.sqrt

const val PI: Double = 3.14

fun main() {
    
    println("Options: triangle, circle, rectangle")

    when (readln()) {
        "triangle" -> {
            println("Enter first side of triangle:")
            val a = readln().toDouble()
            println("Enter second side of triangle:")
            val b = readln().toDouble()
            println("Enter third side of triangle:")
            val c = readln().toDouble()

            val s = (a + b + c) / 2
            println(sqrt(s * (s - a) * (s - b) * (s - c)))
        }

        "rectangle" -> {
            println("Enter first side of rectangle:")
            val a = readln().toDouble()
            println("Enter second side of rectangle:")
            val b = readln().toDouble()
            println(a * b)
        }

        "circle" -> {
            println("Enter circle radius")
            val r = readln().toDouble()
            println((PI * r * r))
        }

        else -> {
            println("Try again!")
            main()
        }
    }
}
