package net.kearos.demomon.micronaut.hello.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rJ,\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0012H\u0002R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lnet/kearos/demomon/micronaut/hello/repository/MessageRepository;", "", "redisConnection", "Lio/lettuce/core/api/StatefulRedisConnection;", "", "(Lio/lettuce/core/api/StatefulRedisConnection;)V", "getRedisConnection", "()Lio/lettuce/core/api/StatefulRedisConnection;", "addMessage", "", "message", "Lnet/kearos/demomon/micronaut/hello/model/Message;", "getAll", "", "keyToMessage", "", "key", "syncCommands", "Lio/lettuce/core/api/sync/RedisCommands;", "jx-micronaut-seed"})
@javax.inject.Singleton()
public final class MessageRepository {
    @org.jetbrains.annotations.NotNull()
    private final io.lettuce.core.api.StatefulRedisConnection<java.lang.String, java.lang.String> redisConnection = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<net.kearos.demomon.micronaut.hello.model.Message> getAll() {
        return null;
    }
    
    private final java.lang.Iterable<net.kearos.demomon.micronaut.hello.model.Message> keyToMessage(java.lang.String key, io.lettuce.core.api.sync.RedisCommands<java.lang.String, java.lang.String> syncCommands) {
        return null;
    }
    
    public final void addMessage(@org.jetbrains.annotations.NotNull()
    net.kearos.demomon.micronaut.hello.model.Message message) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.lettuce.core.api.StatefulRedisConnection<java.lang.String, java.lang.String> getRedisConnection() {
        return null;
    }
    
    public MessageRepository(@org.jetbrains.annotations.NotNull()
    io.lettuce.core.api.StatefulRedisConnection<java.lang.String, java.lang.String> redisConnection) {
        super();
    }
}