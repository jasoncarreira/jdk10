module app {
    exports jc.jdk10.app;

    requires order;
    requires spring.beans;
    requires spring.context;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.webflux;
    requires spring.web;
    requires reactor.core;
    requires reactor.netty;
}