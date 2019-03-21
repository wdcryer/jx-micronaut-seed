package net.kearos.demomon.micronaut.hello.configuration;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lnet/kearos/demomon/micronaut/hello/configuration/ConferencesConfiguration;", "", "()V", "apiversion", "", "getApiversion", "()Ljava/lang/String;", "setApiversion", "(Ljava/lang/String;)V", "organization", "getOrganization", "setOrganization", "repository", "getRepository", "setRepository", "token", "getToken", "setToken", "username", "getUsername", "setUsername", "Companion", "jx-micronaut-seed"})
@io.micronaut.context.annotation.Requires(property = "conferences")
@io.micronaut.context.annotation.ConfigurationProperties(value = "conferences")
public final class ConferencesConfiguration {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String apiversion;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String organization;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String repository;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String username;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String token;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PREFIX = "conferences";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CONFERENCES_API_URL = "http://localhost:8081";
    public static final net.kearos.demomon.micronaut.hello.configuration.ConferencesConfiguration.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getApiversion() {
        return null;
    }
    
    public final void setApiversion(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOrganization() {
        return null;
    }
    
    public final void setOrganization(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUsername() {
        return null;
    }
    
    public final void setUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getToken() {
        return null;
    }
    
    public final void setToken(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public ConferencesConfiguration() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lnet/kearos/demomon/micronaut/hello/configuration/ConferencesConfiguration$Companion;", "", "()V", "CONFERENCES_API_URL", "", "PREFIX", "jx-micronaut-seed"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}