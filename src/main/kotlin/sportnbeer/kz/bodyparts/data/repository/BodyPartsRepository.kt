package sportnbeer.kz.bodyparts.data.repository

import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.selectAll
import org.jetbrains.exposed.sql.transactions.transaction
import sportnbeer.kz.bodyparts.data.model.BodyPart
import sportnbeer.kz.bodyparts.data.model.BodyParts

interface BodyPartsRepository {
    fun getAll(): List<BodyPart>

    fun get(id: Int): BodyPart?
}

class BodyPartsRepositoryImpl : BodyPartsRepository {

    override fun getAll(): List<BodyPart> =
        transaction {
            BodyParts.selectAll()
                .map { row -> row.toBodyPart() }
        }

    override fun get(id: Int): BodyPart? =
        transaction {
            BodyParts.select {
                BodyParts.id eq id
            }.map { row -> row.toBodyPart() }.firstOrNull()
        }

    private fun ResultRow.toBodyPart(): BodyPart =
        BodyPart(
            id = this[BodyParts.id].value,
            name = this[BodyParts.name]
        )
}