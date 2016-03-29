package model.daoCoelba;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.beanCoelba.Cliente;

public class ClienteDao {
    private int row;
    private Connection conn;
    private PreparedStatement stm;
    
    public ClienteDao(){
        
    }
    
     private void start(String sql) throws SQLException {
        conn = new ConnectionFactory().getConnection();
        stm = conn.prepareStatement(sql);
    }
    
    private void finish() throws SQLException {
        stm.close();
        conn.close();
    }
    
    private void finish(ResultSet r) throws SQLException {
        stm.close();
        conn.close();
        r.close();
    }
    
    public boolean inserir(Cliente cliente) {
        try {
            start("insert into coelba.cliente (cpf,nome,telefone,email,cep,numero) values(?,?,?,?,?,?)");
            
            stm.setString(1, cliente.getCpf());
            stm.setString(2, cliente.getNome());
            stm.setString(3, cliente.getTelefone());
            stm.setString(4, cliente.getEmail());
            stm.setString(5,  cliente.getCep());
            stm.setInt(6, cliente.getNumero());

            row = stm.executeUpdate();
            
	    finish();
            return(row > 0);
        }
        catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public boolean pesquisar(Cliente cliente) {
        try {
            start("select * from coelba.cliente where cpf = ?");

            stm.setString(1, cliente.getCpf());

            ResultSet r = stm.executeQuery();
            
            while (r.next()) {
                cliente.setNome(r.getString("nome"));
            }
            finish(r);
            return(true);
        }
        catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public boolean update(Cliente cliente) {
        try {            
            start("update coelba.cliente set nome = ? where cpf = ?");
                    
            stm.setString(1, cliente.getCpf());
            stm.setString(2, cliente.getNome());
            stm.setString(3, cliente.getTelefone());
            stm.setString(4, cliente.getEmail());
            stm.setString(5,  cliente.getCep());
            stm.setInt(4, cliente.getNumero());
            
            row = stm.executeUpdate();

            finish();
            return(row > 0);
        }
        catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean excluir(Cliente cliente) {
        try {
            start("delete from coelba.cliente where cpf = ?");

            stm.setString(1, cliente.getCpf());

            row = stm.executeUpdate();

            finish();
            return (row > 0);
        }
        catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
}
