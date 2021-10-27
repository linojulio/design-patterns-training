package linojulio.design.patterns.training.facade.service;

import linojulio.design.patterns.training.facade.service.model.ContactRepositoryModel;

import java.util.HashMap;

public class ContactRepository {

    private static HashMap<String, ContactRepositoryModel> contactCache = new HashMap<>();

    private ContactRepository() {
        super();
    }

    public boolean addContact(String cpf, String name) {
        if (contactCache.containsKey(cpf)) return false;

        contactCache.put(
                cpf,
                new ContactRepositoryModel(
                        name,
                        cpf
                )
        );

        return true;
    }

    public boolean updateContact(String cpf, String name, String location) {
        if (!contactCache.containsKey(cpf)) return false;

        contactCache.put(
                cpf,
                new ContactRepositoryModel(
                        name,
                        cpf
                )
        );

        return true;
    }

    public ContactRepositoryModel getContactByCpf(String cpf) throws Exception {
        if (!contactCache.containsKey(cpf)) throw new Exception("not.found");

        return contactCache.get(cpf);
    }

    public static ContactRepository getInstance() {
        return InstanceHolder.instance;
    }

    private static class InstanceHolder {
        public static ContactRepository instance = new ContactRepository();
    }

}
