package massacsv.util;

import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.validation.CPFValidator;

public class ValidaCpf {

	public static boolean valida(String cpf) {
		System.out.println(cpf);
		CPFFormatter formatCpf = new CPFFormatter();
		
		System.out.println(formatCpf.unformat(cpf));

		CPFValidator cpfValidator = new CPFValidator();
		try {
			cpfValidator.assertValid(formatCpf.unformat(cpf));
			System.out.println(true);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
