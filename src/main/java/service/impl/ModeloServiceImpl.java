package service.impl;

import dto.ModeloDTO;
import model.Modelo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ModeloRepository;
import service.ModeloService;
import utils.DTOUtils;

import java.util.List;
import java.util.Optional;

@Service
public class ModeloServiceImpl implements ModeloService {

    private final ModeloRepository modeloRepository;

    @Autowired
    public ModeloServiceImpl(ModeloRepository modeloRepository) {
        this.modeloRepository = modeloRepository;
    }

    @Override
    public ModeloDTO getModeloById(Long id) {
        Optional<Modelo> modeloOptional = modeloRepository.findById(id);
        if (modeloOptional.isPresent()) {
            Modelo modelo = modeloOptional.get();
            ModeloDTO modeloDTO = new ModeloDTO();
            BeanUtils.copyProperties(modelo, modeloDTO);
            return modeloDTO;
        } else {
            throw new RuntimeException("Não foi encontrado nenhum modelo com o ID: " + id);
        }
    }

    @Override
    public List<ModeloDTO> getAllModelos() {
        List<Modelo> modelos = modeloRepository.findAll();
        return DTOUtils.convertModeloListToDTOList(modelos);
    }

    @Override
    public ModeloDTO createModelo(ModeloDTO modeloDTO) {
        Modelo modelo = new Modelo();
        BeanUtils.copyProperties(modeloDTO, modelo);
        modeloRepository.save(modelo);
        return modeloDTO;
    }

    @Override
    public ModeloDTO updateModelo(Long id, ModeloDTO modeloDTO) {
        Optional<Modelo> modeloOptional = modeloRepository.findById(id);
        if (modeloOptional.isPresent()) {
            Modelo modelo = modeloOptional.get();
            BeanUtils.copyProperties(modeloDTO, modelo);
            modelo.setId(id);
            modeloRepository.save(modelo);
            return modeloDTO;
        } else {
            throw new RuntimeException("Não foi possível atualizar! Nenhum modelo existente com o ID: " + id);
        }
    }

    @Override
    public void deleteModelo(Long id) {
        Optional<Modelo> modeloOptional = modeloRepository.findById(id);
        if (modeloOptional.isPresent()) {
            modeloRepository.deleteById(id);
        } else {
            throw new RuntimeException("Não existe um modelo para ser deletado com o ID: " + id);
        }
    }
}
