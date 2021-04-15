package questao3;

import java.util.HashSet;

public class CadastroCliente {
    HashSet <Cliente> clientes = new HashSet();
    
    public void inserir(Cliente cliente) throws RepositorioException, ClienteJaExistenteException{
        if(clientes.contains(cliente)){
            throw new ClienteJaExistenteException();
        }else if(clientes.size() == 10){
            throw new RepositorioException();
        }
        clientes.add(cliente);
    }
    
    public Cliente buscar(Cliente cliente) throws ClienteInexistenteException{
        if(clientes.contains(cliente)){
            throw new ClienteInexistenteException();
        }
        for(Cliente clienteAux: clientes){
            if(clienteAux.equals(cliente)){
                return cliente;
            }
        }
        return null;
    }
}
