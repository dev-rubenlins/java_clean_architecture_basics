package br.dev.rubenlins.clean_architecture.basics;

import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SuperBuilder(toBuilder = true)
@Getter
@ToString
@EqualsAndHashCode
public abstract class Event {

    private final UUID requestID;
    private final ResultType result;
    private Optional additionalData;
    private List<String> ccurrences;

    protected Event(@NotNull UUID requestID, @NotNull ResultType result){
        this.requestID = requestID;
        this.result = result;
    }

}
