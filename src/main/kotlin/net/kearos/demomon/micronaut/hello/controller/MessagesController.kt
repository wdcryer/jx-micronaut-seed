package net.kearos.demomon.micronaut.hello.controller

import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.*
import io.micronaut.tracing.annotation.ContinueSpan
import io.micronaut.tracing.annotation.SpanTag
import net.kearos.demomon.micronaut.hello.model.Message
import net.kearos.demomon.micronaut.hello.service.MessageService

@Controller("/message")
open class MessagesController(val messageService: MessageService) {

    @ContinueSpan
    @Get("/")
    @Produces(MediaType.APPLICATION_JSON)
    open fun messages(): List<Message> {
        return messageService.getAll()
    }

    @ContinueSpan
    @Post("/")
    open fun send(@SpanTag("messages.create") @Body message: Message): HttpResponse<*> {
        messageService.addMessage(message)
        return HttpResponse.ok<Any>()
    }
}