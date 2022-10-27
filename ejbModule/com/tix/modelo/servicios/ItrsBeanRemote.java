package com.tix.modelo.servicios;

import javax.ejb.Remote;

import com.tix.modelo.entidades.Itr;

@Remote
public interface ItrsBeanRemote {

	void registro(Itr itr);

	Itr obtenerItrPorId(Long idItr);

}