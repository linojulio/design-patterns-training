package linojulio.design.patterns.training.facade;

import linojulio.design.patterns.training.facade.boundary.ContactService;
import linojulio.design.patterns.training.facade.service.ContactRepository;
import linojulio.design.patterns.training.facade.service.LocationRepository;
import linojulio.design.patterns.training.facade.service.PhonebookRepository;
import linojulio.design.patterns.training.facade.usecase.ContactImpl;
import linojulio.design.patterns.training.facade.usecase.model.Contact;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class FacadeTest {

    static final String cpf1 = "1234";
    static final String cpf2 = "12345";
    static final String cpf3 = "123456";
    static final String name1 = "Name1";
    static final String name2 = "Name2";
    static final String name3 = "Name3";
    static final String location1 = "Location1";
    static final String location2 = "Location2";
    static final String location3 = "Location3";

    @BeforeAll
    static void initializeTest() {

        ContactRepository.getInstance().addContact(
                cpf1,
                name1
        );
        ContactRepository.getInstance().addContact(
                cpf2,
                name2
        );
        ContactRepository.getInstance().addContact(
                cpf3,
                name3
        );
        LocationRepository.getInstance().addOrUpdateLocationByCpf(
                cpf1,
                location1
        );
        LocationRepository.getInstance().addOrUpdateLocationByCpf(
                cpf2,
                location2
        );
        LocationRepository.getInstance().addOrUpdateLocationByCpf(
                cpf3,
                location3
        );
    }

    @Test
    public void baseTest() {
        ContactService contactService = new ContactImpl();
        var phone1 = "Phone1";
        var phone2 = "Phone2";
        var phone3 = "Phone3";


        contactService.savePhoneToContact(
                cpf1,
                phone1
        );
        contactService.savePhoneToContact(
                cpf2,
                phone2
        );
        contactService.savePhoneToContact(
                cpf3,
                phone3
        );

        Assertions.assertEquals(
                PhonebookRepository.getInstance().getPhonebookCache(),
                Map.of(
                        new Contact(name1, cpf1, location1), phone1,
                        new Contact(name2, cpf2, location2), phone2,
                        new Contact(name3, cpf3, location3), phone3
                )
        );
    }
}
