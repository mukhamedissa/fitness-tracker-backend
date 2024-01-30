package sportnbeer.kz.plugins

import io.ktor.server.application.*
import org.koin.ktor.plugin.Koin
import org.koin.logger.slf4jLogger
import sportnbeer.kz.bodyparts.data.di.bodyPartsModules

fun Application.configureDi() {
    install(Koin) {
        slf4jLogger()
        modules(
            listOf(
                bodyPartsModules
            )
        )
    }
}