package br.com.beautique.ms_query.repositories;

import br.com.beautique.ms_query.dtos.beautyprocedures.BeautyProcedureDTO;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BeautyProcedureRepository extends MongoRepository<BeautyProcedureDTO, Long> {
}
