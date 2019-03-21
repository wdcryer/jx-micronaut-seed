package net.kearos.demomon.micronaut.hello.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0017J\u0016\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\b\b\u0001\u0010\f\u001a\u00020\tH\u0017R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lnet/kearos/demomon/micronaut/hello/controller/MessagesController;", "", "messageService", "Lnet/kearos/demomon/micronaut/hello/service/MessageService;", "(Lnet/kearos/demomon/micronaut/hello/service/MessageService;)V", "getMessageService", "()Lnet/kearos/demomon/micronaut/hello/service/MessageService;", "messages", "", "Lnet/kearos/demomon/micronaut/hello/model/Message;", "send", "Lio/micronaut/http/HttpResponse;", "message", "jx-micronaut-seed"})
@io.micronaut.http.annotation.Controller(value = "/message")
public class MessagesController {
    @org.jetbrains.annotations.NotNull()
    private final net.kearos.demomon.micronaut.hello.service.MessageService messageService = null;
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Produces(value = {"application/json"})
    @io.micronaut.http.annotation.Get(value = "/")
    @io.micronaut.tracing.annotation.ContinueSpan()
    public java.util.List<net.kearos.demomon.micronaut.hello.model.Message> messages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Post(value = "/")
    @io.micronaut.tracing.annotation.ContinueSpan()
    public io.micronaut.http.HttpResponse<?> send(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Body()
    @io.micronaut.tracing.annotation.SpanTag(value = "messages.create")
    net.kearos.demomon.micronaut.hello.model.Message message) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.kearos.demomon.micronaut.hello.service.MessageService getMessageService() {
        return null;
    }
    
    public MessagesController(@org.jetbrains.annotations.NotNull()
    net.kearos.demomon.micronaut.hello.service.MessageService messageService) {
        super();
    }
}