package linojulio.design.patterns.training.facade.service.model;

import linojulio.design.patterns.training.facade.service.ContactRepository;
import lombok.Data;

@Data
public class ContactRepositoryModel {
    private String name;
    private String cpf;

    public ContactRepositoryModel(
            String name,
            String cpf
    ) {
        this.name = name;
        this.cpf = cpf;
    }
}
