package sportnbeer.kz.bodyparts.data.model

import kotlinx.serialization.Serializable
import org.jetbrains.exposed.dao.id.IntIdTable

object BodyParts : IntIdTable(name = "body_parts") {
    val name = varchar("name", 100)
}

@Serializable
data class BodyPart(
    val id: Int,
    val name: String
)