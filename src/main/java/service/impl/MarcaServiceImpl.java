package service.impl;

import dto.MarcaDTO;
import model.Marca;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.MarcaRepository;
import service.MarcaService;

import java.util.Optional;

@Service
public class MarcaServiceImpl implements MarcaService {

    private final MarcaRepository marcaRepository;

    @Autowired
    public MarcaServiceImpl(MarcaRepository marcaRepository) {
        this.marcaRepository = marcaRepository;
    }

    @Override
    public MarcaDTO getMarcaById(Long id) {
        Optional<Marca> marcaOptional = marcaRepository.findById(id);
        if (marcaOptional.isPresent()) {
            Marca marca = marcaOptional.get();
            MarcaDTO marcaDTO = new MarcaDTO();
            BeanUtils.copyProperties(marca, marcaDTO);
            return marcaDTO;
        } else {
            throw new RuntimeException("Não foi encontrada nenhuma marca com o ID: " + id);
        }
    }

    @Override
    public MarcaDTO createMarca(MarcaDTO marcaDTO) {
        Marca marca = new Marca();
        BeanUtils.copyProperties(marcaDTO, marca);
        marcaRepository.save(marca);
        return marcaDTO;
    }

    @Override
    public MarcaDTO updateMarca(Long id, MarcaDTO marcaDTO) {
        Optional<Marca> marcaOptional = marcaRepository.findById(id);
        if (marcaOptional.isPresent()) {
            Marca marca = marcaOptional.get();
            BeanUtils.copyProperties(marcaDTO, marca);
            marca.setId(id);
            marcaRepository.save(marca);
            return marcaDTO;
        } else {
            throw new RuntimeException("Não foi possível atualizar, nenhuma marca com o ID: " + id);
        }
    }

    @Override
    public void deleteMarca(Long id) {
        Optional<Marca> marcaOptional = marcaRepository.findById(id);
        if (marcaOptional.isPresent()) {
            marcaRepository.deleteById(id);
        } else {
            throw new RuntimeException("Não foi possível deletar, nenhuma marca com o ID: " + id);
        }
    }
}
