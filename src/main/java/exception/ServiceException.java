package exception;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class ServiceException extends Exception {
	private String message;
	private ServiceExceptionEnum tipo;

	// private ArrayList;

	public ServiceException() {

	}

	public ServiceException(String msg) {
		super(msg);
		this.message = msg;
	}

	public ServiceException(ServiceExceptionEnum tipo) {
		this.tipo = tipo;
	}

	public ServiceException(ArrayList listaErrosCurso) {
		// TODO Auto-generated constructor stub
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String msg) {
		this.message = msg;
	}

	public ServiceExceptionEnum getTipo() {
		return tipo;
	}

	public void setTipo(ServiceExceptionEnum tipo) {
		this.tipo = tipo;
	}

	public enum ServiceExceptionEnum {

		CURSO_CODIGO_INVALIDO("Código de curso inválido"), 
		CURSO_NOME_INVALIDO("Nome de curso inválido"), 
		ALUNO_MATRICULA_INVALIDA("Matrícula do aluno inválido"), 
		ALUNO_NOME_INVALIDO("Nome do aluno inválido"),
		CAMPO_INVALIDO("Campo vazio"),
		NUMERO_INVALIDO("O campo deve ser preenchido por números"),
		LIMITE_INVALIDO("Limite de caracteres acima do permitido"),
		DATA_NASCIMENTO_INVALIDO("Data de nascimento inválida"),
		DATA_INVALIDA("Data informada inválida "),
		NOTA_INVALIDA("Valor da nota inválido");

		private ServiceExceptionEnum() {
			// TODO Auto-generated constructor stub
		}

		private ServiceExceptionEnum(String valor) {
			// TODO Auto-generated constructor stub
		}

	}
}
