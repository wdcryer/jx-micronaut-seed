package net.kearos.demomon.micronaut.hello.controller

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import io.micronaut.tracing.annotation.ContinueSpan
import net.kearos.demomon.micronaut.hello.client.Conference
import net.kearos.demomon.micronaut.hello.client.ConferenceClient

@Controller("/conferences")
open class ConferenceController(val conferenceClient: ConferenceClient) {

    @Get("/random")
    @ContinueSpan
    @Produces(MediaType.APPLICATION_JSON)
    open fun randomConf(): Conference {
        return conferenceClient.GetRandomConference()
    }
}