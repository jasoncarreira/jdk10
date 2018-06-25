module order {
    exports jc.jdk10.order.model;
    exports jc.jdk10.order.service;
    exports jc.jdk10.order.config;

    requires lombok;
    requires spring.context;
    requires spring.beans;
    requires spring.data.commons;
    requires spring.data.couchbase;
    requires spring.boot.starter.data.couchbase.reactive;
    requires reactor.core;
    requires validation.api;
}