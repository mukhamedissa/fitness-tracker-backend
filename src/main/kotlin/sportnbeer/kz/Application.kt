package sportnbeer.kz

import io.ktor.server.application.*
import sportnbeer.kz.plugins.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureSerialization()
    configureDatabases()
    configureHTTP()
    configureSecurity()
    configureDi()
    configureGraphQl()
}
