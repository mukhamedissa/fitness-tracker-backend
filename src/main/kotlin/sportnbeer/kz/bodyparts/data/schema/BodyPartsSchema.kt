package sportnbeer.kz.bodyparts.data.schema

import com.apurebase.kgraphql.schema.dsl.SchemaBuilder
import sportnbeer.kz.bodyparts.data.model.BodyPart
import sportnbeer.kz.bodyparts.data.repository.BodyPartsRepository

fun SchemaBuilder.bodyPartsSchema(
    repository: BodyPartsRepository
) {
    type<BodyPart> {
        description = "Body part object with identifier and name"
    }

    query("bodyParts") {
        description = "Retrieve all body parts"
        resolver { ->  repository.getAll() }
    }

    query("bodyPart") {
        description = "Retrieve single body part by ID"
        resolver { id: Int -> repository.get(id) }
    }
}