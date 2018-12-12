package com.assiz.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assiz.cursomc.domains.Pedido;
import com.assiz.cursomc.repositories.PedidoRepository;
import com.assiz.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository categoriaRepository;
	
	public Pedido buscar(Integer id) {
		Pedido categoria = categoriaRepository.findOne(id);
		if (categoria == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
					+ ", Tipo: " + Pedido.class.getName());
		}
		return categoria;
	}

}
