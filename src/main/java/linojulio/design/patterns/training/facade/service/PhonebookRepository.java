package linojulio.design.patterns.training.facade.service;

import linojulio.design.patterns.training.facade.usecase.model.Contact;

import java.util.HashMap;

public class PhonebookRepository {
    private static HashMap<Contact, String> phonebookCache = new HashMap<>();

    private PhonebookRepository() {
        super();
    }

    public void addOrUpdateEntry(
            Contact contact,
            String phoneNumber
    ) {
        phonebookCache.put(contact, phoneNumber);
    }

    public HashMap<Contact, String> getPhonebookCache() {
        return phonebookCache;
    }

    public static PhonebookRepository getInstance() {
        return InstanceHolder.instance;
    }

    private static class InstanceHolder {
        public static PhonebookRepository instance = new PhonebookRepository();

    }

}
