package sportnbeer.kz.plugins

import com.apurebase.kgraphql.GraphQL
import io.ktor.server.application.*
import org.koin.ktor.ext.inject
import sportnbeer.kz.bodyparts.data.repository.BodyPartsRepository
import sportnbeer.kz.bodyparts.data.schema.bodyPartsSchema

fun Application.configureGraphQl() {
    val bodyPartsRepository by inject<BodyPartsRepository>()

    install(GraphQL) {
        playground = true
        schema {
            bodyPartsSchema(repository = bodyPartsRepository)
        }
    }
}