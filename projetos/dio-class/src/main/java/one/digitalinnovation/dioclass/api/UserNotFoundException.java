package one.digitalinnovation.dioclass.api;

public class UserNotFoundException extends RuntimeException{

	public UserNotFoundException(Long id) {
		super("Nenhum usuário encontrado com o id infomado: " + id);
	}
}
