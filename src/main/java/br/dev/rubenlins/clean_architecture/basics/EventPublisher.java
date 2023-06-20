package br.dev.rubenlins.clean_architecture.basics;

public interface EventPublisher {

    void publish(Event event);

}
