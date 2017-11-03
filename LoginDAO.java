

import com.mysql.jdbc.Connection;
import antlr.collections.List;


public class LoginDAO {
	
	private Connection con = ConexaoFactory.getConnection();
	
	public void cadastrar(Pessoa pessoa) {
		String sql = "insert into login(id_pessoa,senha)values(?,?)";
		try(PreparedStatement preparestatement = con.prepareStatement(sql)) {
			
			preparestatement.setString(1, pessoa.getId_Pessoa()); 
			preparestatement.setString(2, pessoa.getSenha());
			
			
			preparestatement.execute();
			preparestatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void alterar(Pessoa pessoa){
		String sql = "update pessoa set nome = ?, id_pessoa = ?, senha = ? where idusuario = ?";
		try(PreparedStatement preparedStatement = con.prepareStatement(sql)){
			preparedStatement.setString(1, usuario.getNome());
			preparedStatement.setString(2, usuario.getId_Pessoa());
			preparedStatement.setString(3, usuario.getSenha());
			preparedStatement.setInt(4, usuario.getId_Pessoa());
			preparedStatement.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public void excluir(Pessoa pessoa){
		String sql = "delete from usuario where id_Pessoa = ?";
		try(PreparedStatement preparedStatement = con.prepareStatement(sql)){
			preparedStatement.setInt(1, usuario.getId_Pessoa());
			preparedStatement.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public void salvar(Pessoa pessoa){
		if(pessoa.getId_Pessoa() != null && pessoa.getIdUsuario()!=0 ){
			aleterar(pessoa);
		}else {
			cadastrar(pessoa);
		}
	}
	
	public Pessoa buscarPorId(IntegerType id){
		String sql = "Select * from pessoas where id_pessoa = ?";
		Pessoa pessoa = null ;
		
		try(PreparedStatement preparedStatement = con.prepareStatement(sql)) {
			preparedStatement.setInt(1, id);
			
			ResultSet result = preparedStatement.executeQuery();
			if(result.next()){
				pessoa = new Pessoa();
				pessoa.setId_Pessoa(result.getInt("id_pessoa"));
				usuario.setNome(result.getString("Nome"));
				usuario.setLogin(result.getString("Login"));
				usuario.setSenha(result.getString("senha"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return usuario;
	}
	
	public List buscarTodos(){
		List<Usuario> listarUsuarios = new ArrayList<>();
		
		String sql = "Select * from usuario";
		Usuario usuario = null ;
		
		try(PreparedStatement preparedStatement = con.prepareStatement(sql)) {
			
			ResultSet result = preparedStatement.executeQuery();

			while(result.next()){
				usuario = new Usuario();
				usuario.setIdUsuario(result.getInt("idUsuario"));
				usuario.setNome(result.getString("Nome"));
				usuario.setLogin(result.getString("Login"));
				usuario.setSenha(result.getString("senha"));
				
				
				listarUsuarios.add(usuario);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return listarUsuarios;
	}
}