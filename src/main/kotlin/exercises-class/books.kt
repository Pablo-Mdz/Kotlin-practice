package `exercises-class`

// En el archivo MiNuevoEjercicio.kt
class Book(val title: String, val author: String, val year: Int)

class Library {
    val books = mutableListOf<Book>()

    fun addBook(book: Book) {
        books.add(book)
    }

    fun findBooksByAuthor(author: String): List<Book> {
        return books.filter { it.author == author }
    }

    fun findBooksByTitle(title: String): List<Book> {
        return books.filter { it.title == title }
    }
    fun findBooksByYear(year: Int): List<Book> {
        return books.filter { it.year == year }
    }
    // Agrega más funciones si es necesario
}

fun main() {
    val myLibrary = Library()
    myLibrary.addBook(Book("1984", "George Orwell", 1949))
    myLibrary.addBook(Book("Animal Farm", "George Orwell", 1945))

    val orwellBooks = myLibrary.findBooksByAuthor("George Orwell")
    orwellBooks.forEach { book ->
        println("${book.title}, written by ${book.author} in ${book.year}")
    }
    println("Total: ${orwellBooks.size} books. $orwellBooks")
}


// En el archivo MiNuevoEjercicio.kt
