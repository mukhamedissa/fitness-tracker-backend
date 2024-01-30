package sportnbeer.kz.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.jetbrains.exposed.sql.selectAll
import org.jetbrains.exposed.sql.transactions.transaction
import sportnbeer.kz.bodyparts.data.routing.bodyPartsRoute
import sportnbeer.kz.database.Equipments

fun Application.configureRouting() {
    routing {
        bodyPartsRoute()
    }
}