package sportnbeer.kz.database

import org.jetbrains.exposed.dao.id.IntIdTable

object Muscles : IntIdTable() {
    val name = varchar("name", 100)
}

object Equipments : IntIdTable() {
    val name = varchar("name", 100)
}