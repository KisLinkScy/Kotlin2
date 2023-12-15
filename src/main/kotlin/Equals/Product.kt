package Equals

class Product(val productId: Int, val name: String, val price: Double) {
    override fun toString(): String {
        return "Product(номер: $productId, наименование: $name', цена: $price)"


    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Product

        if (productId != other.productId) return false
        if (name != other.name) return false
        if (price != other.price) return false

        return true
    }

    override fun hashCode(): Int {
        var result = productId
        result = 31 * result + name.hashCode()
        result = 31 * result + price.hashCode()
        return result
    }
}