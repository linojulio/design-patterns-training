package linojulio.design.patterns.training.facade.usecase;

import linojulio.design.patterns.training.facade.boundary.ContactService;
import linojulio.design.patterns.training.facade.service.ContactRepository;
import linojulio.design.patterns.training.facade.service.LocationRepository;
import linojulio.design.patterns.training.facade.service.PhonebookRepository;
import linojulio.design.patterns.training.facade.usecase.model.Contact;

public class ContactImpl implements ContactService {

    @Override
    public void savePhoneToContact(
            String cpf,
            String phone
    ) {
        try {
            PhonebookRepository.getInstance().addOrUpdateEntry(
                    new Contact(
                            ContactRepository.getInstance().getContactByCpf(cpf).getName(),
                            cpf,
                            LocationRepository.getInstance().getLocatonByCpf(cpf)
                            ),
                    phone
            );
            System.out.println(PhonebookRepository.getInstance().getPhonebookCache());
        } catch(Exception ex) {
            var buffer = new StringBuffer();
            buffer.append(ex.getMessage()).append("\n");
            buffer.append("StackTrace: ");
            System.out.println(buffer.toString());
            ex.printStackTrace();
        }
    }
}
