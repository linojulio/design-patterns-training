package linojulio.design.patterns.training.facade.usecase.model;

import lombok.Data;

@Data
public class Contact {
    private String name;
    private String cpf;
    private String location;

    public Contact(
            String name,
            String cpf,
            String location
    ) {
        this.name = name;
        this.cpf = cpf;
        this.location = location;
    }
}
