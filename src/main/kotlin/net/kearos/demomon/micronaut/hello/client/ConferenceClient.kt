package net.kearos.demomon.micronaut.hello.client

import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client
import io.micronaut.tracing.annotation.ContinueSpan
import net.kearos.demomon.micronaut.hello.configuration.ConferencesConfiguration

@Client(ConferencesConfiguration.CONFERENCES_API_URL)
interface ConferenceClient {

    @Get("/conferences/random")
    @ContinueSpan
    fun GetRandomConference() : Conference
}