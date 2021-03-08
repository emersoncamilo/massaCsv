package massacsv;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import massacsv.modelo.Massa;
import massacsv.util.Arquivo;
import massacsv.util.ValidaCpf;

public class LerCsv {
	
	private static List<Massa> massas;

	public static void main(String[] args) {
	
		File file1 = new File("D:\\Users\\emers\\Desktop\\MFA\\origin\\tipo1_1500ecs_model.csv");
		boolean file1TemCabecalho = true;

		File file2 = new File("D:\\Users\\emers\\Desktop\\MFA\\origin\\tipo2_hml_massaConvertido.csv");
		boolean file2TemCabecalho = true;

		massas = new ArrayList<Massa>();
		
		
		try {
			//lendo arquivo1
			Scanner leitor1 = new Scanner(file1);
			if(file1TemCabecalho)
			leitor1.nextLine();
			
			//lendo arquivo1
			Scanner leitor2 = new Scanner(file2);
			if(file2TemCabecalho)
			leitor2.nextLine();
					
			while ((leitor1.hasNext())&&(leitor2.hasNext())) {
				Massa massa = new Massa();
				
				//file1
//				System.out.printf("\nLinha File 1: ");
				String linhaFile1 = leitor1.nextLine();
				String [] valoresDaLinha1Separados = linhaFile1.split(",");
			
//				for (String string : valoresDaLinha1Separados) {
//					System.out.print("\t"+string+" ");
//				}
				
				//file2
//				System.out.printf("\nLinha File 2: ");
				String linhaFile2 = leitor2.nextLine();
				String [] valoresDaLinha2Separados = linhaFile2.split(";");
//				System.out.println(valoresDaLinha2Separados[0]);
//				for (String string : valoresDaLinha2Separados) {
//					System.out.print(""+string+" ");
//				}
				massa.setPhoneNumber(valoresDaLinha2Separados[0]);
				massa.setNationality(valoresDaLinha2Separados[1]);
				massa.setMerchantId(valoresDaLinha1Separados[0]);
				massa.setCode(valoresDaLinha1Separados[7]);
				massa.setAgency(valoresDaLinha1Separados[8]);
//				String s = String.format ("%012d", cel.getNumericCellValue());
//				massa.setAccountType(String.format("%017d", valoresDaLinha2Separados[6]));
				massa.setAccount(valoresDaLinha1Separados[9]);
				massa.setAccountType(valoresDaLinha2Separados[6]);
				massa.setBirthDate(valoresDaLinha2Separados[7]);
				massa.setPassword(valoresDaLinha2Separados[8]);
				massa.setPasswordConfirmation(valoresDaLinha2Separados[9]);
				massa.setResposta(valoresDaLinha2Separados[10]);
				
				if(ValidaCpf.valida(valoresDaLinha2Separados[11]))
				massa.setCpf(valoresDaLinha2Separados[11]);
				
				massa.setEmail(valoresDaLinha2Separados[12]);
				massas.add(massa);
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		imprimeMassa();

//		System.out.println("Iniciando... ");
//		try {
//			// csv file containing data
//			String strFile = "C:\\file1.csv";
//			CSVReader reader = new CSVReader(new FileReader(strFile));
//			String[] nextLine;
//			int lineNumber = 0;
//			System.out.println("limite "+reader.getLinesRead());
//			System.out.println();
//			while ((nextLine = reader.readNext()) != null) {
//				lineNumber++;
////				System.out.println("Line # " + lineNumber);
//				// nextLine[] is an array of values from the line
//				System.out.println(nextLine[1]);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
	}
	
	private static void imprimeMassa() {
		System.out.println("*********** Impressão das massas ***********\n");
		String ini= "cabecalho do csv";
		
		StringBuffer buffer = new StringBuffer();
	    
		buffer.append(ini);

		for (Massa massa : massas) {
			System.out.println(massa);
			buffer.append(linhaImpressa(massa)+"\n");
		}
		
		Arquivo.Write("D:\\Users\\emers\\Desktop\\file.csv", buffer.toString());
		
	}
	
	
	public static String linhaImpressa (Massa massa) {
		String ini= "|\"";
		String fim= "\"|";
		String div= "\"|\"";
		
		StringBuffer buffer = new StringBuffer();
	    
		buffer.append(ini);

		buffer.append(massa.getPhoneNumber());
	    buffer.append(div);
	    buffer.append(massa.getNationality());
	    buffer.append(div);
	    buffer.append(massa.getMerchantId());
	    buffer.append(div);
	    buffer.append(massa.getCode());
	    buffer.append(div);
	    buffer.append(massa.getCode());
	    buffer.append(div);
	    buffer.append(massa.getAgency());
	    buffer.append(div);
	    buffer.append(massa.getAccount());
	    buffer.append(div);
	    buffer.append(massa.getAccountType());
	    buffer.append(div);
	    buffer.append(massa.getBirthDate());
	    buffer.append(div);
	    buffer.append(massa.getPassword());
	    buffer.append(div);
	    buffer.append(massa.getPasswordConfirmation());
	    buffer.append(div);
	    buffer.append(massa.getResposta());
	    buffer.append(div);
	    buffer.append(massa.getCpf());
	    buffer.append(div);
	    buffer.append(massa.getEmail());
	    
	    buffer.append(fim);

	    System.out.println("Linha: \n" + buffer.toString());
//		System.exit(0);
		
		return buffer.toString();
		
	}
	
	
	
}