package massacsv.modelo;

public class Massa {

	private String phoneNumber;
	private String nationality;
	private String merchantId;
	private String code;
	private String agency;
	private String account;
	private String accountType;
	private String birthDate;
	
	
	private String password;
	private String passwordConfirmation;
	private String resposta;
	private String cpf;
	private String email;
	
	
	
	public Massa() {
	
	}


	public Massa(String phoneNumber, String nationality, String merchantId, String code, String agency, String account,
			String accountType, String birthDate, String password, String passwordConfirmation, String resposta,
			String cpf, String email) {
		super();
		this.phoneNumber = phoneNumber;
		this.nationality = nationality;
		this.merchantId = merchantId;
		this.code = code;
		this.agency = agency;
		this.account = account;
		this.accountType = accountType;
		this.birthDate = birthDate;
		this.password = password;
		this.passwordConfirmation = passwordConfirmation;
		this.resposta = resposta;
		this.cpf = cpf;
		this.email = email;
	}
	
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getAgency() {
		return agency;
	}
	public void setAgency(String agency) {
		this.agency = agency;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordConfirmation() {
		return passwordConfirmation;
	}
	public void setPasswordConfirmation(String passwordConfirmation) {
		this.passwordConfirmation = passwordConfirmation;
	}
	public String getResposta() {
		return resposta;
	}
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Massa [phoneNumber=" + phoneNumber + ", nationality=" + nationality + ", merchantId=" + merchantId
				+ ", code=" + code + ", agency=" + agency + ", account=" + account + ", accountType=" + accountType
				+ ", birthDate=" + birthDate + ", password=" + password + ", passwordConfirmation="
				+ passwordConfirmation + ", resposta=" + resposta + ", cpf=" + cpf + ", email=" + email + "]";
	}
	
	
}
