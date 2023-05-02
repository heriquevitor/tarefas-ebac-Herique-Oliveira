package br.com.herique.dao;

/**
 *
 * @author Herique
 *
 */

import java.util.Collection;

import br.com.herique.domain.Cliente;

public interface IClienteDAO<Long> {

	public Boolean cadastrar(Cliente cliente);

	public void excluir(Long cpf);

	public void alterar(Cliente cliente);

	public Cliente consultar(Long cpf);

	public Collection<Cliente> buscartodos();

}
