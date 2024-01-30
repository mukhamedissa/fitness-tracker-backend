package sportnbeer.kz.bodyparts.data.routing

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject
import sportnbeer.kz.bodyparts.data.repository.BodyPartsRepository

fun Route.bodyPartsRoute() {
    val bodyPartsRepository by inject<BodyPartsRepository>()

    route("/body_parts") {
        get("/") {
            call.respond(
                bodyPartsRepository.getAll()
            )
        }

        get("{bodyPartId}") {
            val id = call.parameters["bodyPartId"]?.toIntOrNull()
                ?:  throw IllegalArgumentException("Parameter bodyPartId not found")
            bodyPartsRepository
                .get(id = id)
                ?.let { bodyPart -> call.respond(bodyPart) }
        }
    }
}