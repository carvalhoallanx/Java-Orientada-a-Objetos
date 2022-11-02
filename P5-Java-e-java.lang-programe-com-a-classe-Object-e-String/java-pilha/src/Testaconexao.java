
public class Testaconexao {

	public static void main(String[] args) {
		
		try (Conexao conexao = new Conexao()){
			conexao.leDados();
		}catch(IllegalStateException ex){
			System.out.println("Deu erro na conexao");
		}
		
		//-----------------------------------------------------
		
		
//Conexao con = new Conexao();
		
//		try{
//			con.leDados();
//		}catch (IllegalStateException ex) {
//			System.out.println("Erro na conexao");
//		}finally {
//			con.close();
//		}

	}

}
