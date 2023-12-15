package Equals

class HotelRoom(val roomNumber: Int, val type: String, val pricePerNight: Double) {
    override fun toString(): String {
        return "HotelRoom(номер комнаты: $roomNumber, тип: '$type', стоимость в сутки: $pricePerNight)"


    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as HotelRoom

        if (roomNumber != other.roomNumber) return false
        if (type != other.type) return false
        if (pricePerNight != other.pricePerNight) return false

        return true
    }

    override fun hashCode(): Int {
        var result = roomNumber
        result = 31 * result + type.hashCode()
        result = 31 * result + pricePerNight.hashCode()
        return result
    }
}