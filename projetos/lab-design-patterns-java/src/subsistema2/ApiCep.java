package subsistema2;

public class ApiCep {

	private static ApiCep apiCep = new ApiCep();
	
	private ApiCep() {
	}
	
	public static ApiCep getInstancia() {
		return apiCep;
	}
	
	public static String getCidade(String cep) {
		return "Araraquara";
	}
	
	public static String getEstado(String cep) {
		return "SP";
	}
}
