package acc.br.producer.dtos;

public record UserRegisteredPayload(String fullName, String emailAddress, int confirmationCode) {

}
