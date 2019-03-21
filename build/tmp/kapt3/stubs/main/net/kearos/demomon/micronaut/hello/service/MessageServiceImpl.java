package net.kearos.demomon.micronaut.hello.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lnet/kearos/demomon/micronaut/hello/service/MessageServiceImpl;", "Lnet/kearos/demomon/micronaut/hello/service/MessageService;", "messageRepository", "Lnet/kearos/demomon/micronaut/hello/repository/MessageRepository;", "(Lnet/kearos/demomon/micronaut/hello/repository/MessageRepository;)V", "getMessageRepository", "()Lnet/kearos/demomon/micronaut/hello/repository/MessageRepository;", "addMessage", "", "message", "Lnet/kearos/demomon/micronaut/hello/model/Message;", "getAll", "", "jx-micronaut-seed"})
@javax.inject.Singleton()
public final class MessageServiceImpl implements net.kearos.demomon.micronaut.hello.service.MessageService {
    @org.jetbrains.annotations.NotNull()
    private final net.kearos.demomon.micronaut.hello.repository.MessageRepository messageRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<net.kearos.demomon.micronaut.hello.model.Message> getAll() {
        return null;
    }
    
    @java.lang.Override()
    public void addMessage(@org.jetbrains.annotations.NotNull()
    net.kearos.demomon.micronaut.hello.model.Message message) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.kearos.demomon.micronaut.hello.repository.MessageRepository getMessageRepository() {
        return null;
    }
    
    public MessageServiceImpl(@org.jetbrains.annotations.NotNull()
    net.kearos.demomon.micronaut.hello.repository.MessageRepository messageRepository) {
        super();
    }
}