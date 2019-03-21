package net.kearos.demomon.micronaut.hello.configuration

import io.micronaut.context.annotation.ConfigurationProperties
import io.micronaut.context.annotation.Requires

@ConfigurationProperties(ConferencesConfiguration.PREFIX)
@Requires(property = ConferencesConfiguration.PREFIX)
class ConferencesConfiguration() {
    companion object {
        const val PREFIX = "conferences"
        const val CONFERENCES_API_URL = "http://localhost:8081"
    }

    var apiversion: String = ""
    var organization: String = ""
    var repository: String = ""
    var username: String = ""
    var token: String = ""


}