
public class CarroClasse {
/*	Sem o construtor
	private String carro = "";
	private String adicional = "";*/
	
/*	Com o construtor */
	private String carro;
	private String adicional;
	
	public CarroClasse(String carro,String adicional) {
		this.carro = carro;
		this.adicional = adicional;
	}
	public String getCarro() {
		return carro;
	}
	public void setCarro(String carro) {
		this.carro = carro;
	}
	public String getAdicional() {
			return adicional;
		}
	public void setAdicional(String adicional) {
		this.adicional = adicional;
	} 
}
