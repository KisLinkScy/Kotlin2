package Equals

class Employee(val employeeld: Int, val name: String, val department: String) {
    override fun toString(): String {
        return "Employee(номер: $employeeld, имя: '$name', отделение: '$department')"


    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Employee

        if (employeeld != other.employeeld) return false
        if (name != other.name) return false
        if (department != other.department) return false

        return true
    }

    override fun hashCode(): Int {
        var result = employeeld
        result = 31 * result + name.hashCode()
        result = 31 * result + department.hashCode()
        return result
    }
}