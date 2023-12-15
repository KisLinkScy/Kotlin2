package Equals

class Student(val id: Int, val name: String, val course: String) {
    override fun toString(): String {
        return "Student(номер: $id, имя: '$name', курс:'$course')"


    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Student

        if (id != other.id) return false
        if (name != other.name) return false
        if (course != other.course) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + name.hashCode()
        result = 31 * result + course.hashCode()
        return result
    }
}