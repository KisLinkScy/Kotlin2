package Equals

class Book(val title: String, val author: String, val yearOfPublication: Int) {


    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Book

        if (title != other.title) return false
        if (author != other.author) return false
        if (yearOfPublication != other.yearOfPublication) return false

        return true
    }

    override fun hashCode(): Int {
        var result = title.hashCode()
        result = 31 * result + author.hashCode()
        result = 31 * result + yearOfPublication
        return result
    }

    override fun toString(): String {
        return "Book(Название: '$title', Автор: '$author', Год публикации: $yearOfPublication)"
    }
}