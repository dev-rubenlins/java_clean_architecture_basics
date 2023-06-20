package br.dev.rubenlins.clean_architecture.basics;

public interface UseCase<T extends UseCaseRequest, V extends UseCaseResponse> {

    V execute(T request);

}
