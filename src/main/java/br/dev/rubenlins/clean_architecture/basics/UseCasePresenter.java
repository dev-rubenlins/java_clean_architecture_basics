package br.dev.rubenlins.clean_architecture.basics;

public interface UseCasePresenter<T extends UseCaseResponse> {

    T prepareSuccessView(T response);

    T prepareFailView(T response);

}
