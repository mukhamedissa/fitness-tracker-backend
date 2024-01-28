package sportnbeer.kz.plugins

import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import io.ktor.server.application.*
import org.jetbrains.exposed.sql.Database

fun Application.configureDatabases() {
    Database.connect(
        datasource = HikariDataSource(
            HikariConfig("hikari.properties")
        )
    )
}
