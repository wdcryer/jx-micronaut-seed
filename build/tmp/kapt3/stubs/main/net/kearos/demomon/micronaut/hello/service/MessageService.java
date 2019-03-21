package net.kearos.demomon.micronaut.hello.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H&\u00a8\u0006\b"}, d2 = {"Lnet/kearos/demomon/micronaut/hello/service/MessageService;", "", "addMessage", "", "message", "Lnet/kearos/demomon/micronaut/hello/model/Message;", "getAll", "", "jx-micronaut-seed"})
public abstract interface MessageService {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<net.kearos.demomon.micronaut.hello.model.Message> getAll();
    
    public abstract void addMessage(@org.jetbrains.annotations.NotNull()
    net.kearos.demomon.micronaut.hello.model.Message message);
}