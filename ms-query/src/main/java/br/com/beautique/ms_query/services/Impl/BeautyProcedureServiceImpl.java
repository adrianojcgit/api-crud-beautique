package br.com.beautique.ms_query.services.Impl;

import br.com.beautique.ms_query.dtos.beautyprocedures.BeautyProcedureDTO;
import br.com.beautique.ms_query.repositories.BeautyProcedureRepository;
import br.com.beautique.ms_query.services.BeautyProcedureService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeautyProcedureServiceImpl implements BeautyProcedureService {

    private final BeautyProcedureRepository beautyProcedureRepository;

    public BeautyProcedureServiceImpl(BeautyProcedureRepository beautyProcedureRepository) {
        this.beautyProcedureRepository = beautyProcedureRepository;
    }

    @Override
    public List<BeautyProcedureDTO> listAllBeautyProcedures() {
        try{
            return beautyProcedureRepository.findAll();
        }catch(Exception e){
            throw  new RuntimeException("Error listening all beauty procedures");
        }
    }

    @Override
    public List<BeautyProcedureDTO> listByNameIgnoreCase(String name) {
        try{
            return beautyProcedureRepository.findByNameIgnoreCase(name);
        }catch(Exception e){
            throw  new RuntimeException("Error listening all beauty procedures by name");
        }
    }

    @Override
    public List<BeautyProcedureDTO> listByDescriptionLikeIgnoreCase(String description) {
        try{
            return beautyProcedureRepository.findByDescriptionLikeIgnoreCase(description);
        }catch(Exception e){
            throw  new RuntimeException("Error listening all beauty procedures by description");
        }
    }
}
