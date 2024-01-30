package sportnbeer.kz.bodyparts.data.di

import org.koin.dsl.module
import sportnbeer.kz.bodyparts.data.repository.BodyPartsRepository
import sportnbeer.kz.bodyparts.data.repository.BodyPartsRepositoryImpl

val bodyPartsModules = module {
    factory<BodyPartsRepository> {
        BodyPartsRepositoryImpl()
    }
}