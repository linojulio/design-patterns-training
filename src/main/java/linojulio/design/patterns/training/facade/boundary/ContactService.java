package linojulio.design.patterns.training.facade.boundary;

public interface ContactService {
    public void savePhoneToContact(
            String cpf,
            String phone
    );
}
