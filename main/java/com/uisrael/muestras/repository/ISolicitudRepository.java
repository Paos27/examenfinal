package com.uisrael.muestras.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.muestras.model.Solicitud;

public interface ISolicitudRepository extends JpaRepository<Solicitud, Integer> {

}
