package net.kearos.demomon.micronaut.hello.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0017R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lnet/kearos/demomon/micronaut/hello/controller/ConferenceController;", "", "conferenceClient", "Lnet/kearos/demomon/micronaut/hello/client/ConferenceClient;", "(Lnet/kearos/demomon/micronaut/hello/client/ConferenceClient;)V", "getConferenceClient", "()Lnet/kearos/demomon/micronaut/hello/client/ConferenceClient;", "randomConf", "Lnet/kearos/demomon/micronaut/hello/client/Conference;", "jx-micronaut-seed"})
@io.micronaut.http.annotation.Controller(value = "/conferences")
public class ConferenceController {
    @org.jetbrains.annotations.NotNull()
    private final net.kearos.demomon.micronaut.hello.client.ConferenceClient conferenceClient = null;
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Produces(value = {"application/json"})
    @io.micronaut.tracing.annotation.ContinueSpan()
    @io.micronaut.http.annotation.Get(value = "/random")
    public net.kearos.demomon.micronaut.hello.client.Conference randomConf() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.kearos.demomon.micronaut.hello.client.ConferenceClient getConferenceClient() {
        return null;
    }
    
    public ConferenceController(@org.jetbrains.annotations.NotNull()
    net.kearos.demomon.micronaut.hello.client.ConferenceClient conferenceClient) {
        super();
    }
}