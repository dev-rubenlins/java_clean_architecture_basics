package br.dev.rubenlins.clean_architecture.basics;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.UUID;

@Getter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
public abstract class UseCaseResponse {

    private final UUID requestID;
    private final OperationResult operationResult;

}
