package br.com.beautique.ms_query.services;

import br.com.beautique.ms_query.dtos.beautyprocedures.BeautyProcedureDTO;

import java.util.List;

public interface BeautyProcedureService {
    List<BeautyProcedureDTO> listAllBeautyProcedures();
    List<BeautyProcedureDTO> listByNameIgnoreCase(String name);
    List<BeautyProcedureDTO> listByDescriptionLikeIgnoreCase(String description);
}
