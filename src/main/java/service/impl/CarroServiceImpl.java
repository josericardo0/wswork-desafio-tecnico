package service.impl;

import dto.CarroDTO;
import model.Carro;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CarroRepository;
import service.CarroService;

import java.util.Optional;

@Service
public class CarroServiceImpl implements CarroService {

    private final CarroRepository carroRepository;

    @Autowired
    public CarroServiceImpl(CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }

    @Override
    public CarroDTO getCarroById(Long id) {
        Optional<Carro> carroOptional = carroRepository.findById(id);
        if (carroOptional.isPresent()) {
            Carro carro = carroOptional.get();
            CarroDTO carroDTO = new CarroDTO();
            BeanUtils.copyProperties(carro, carroDTO);
            return carroDTO;
        } else {
            throw new RuntimeException("Não foi encontrado nenhum carro com o ID: " + id);
        }
    }

    @Override
    public CarroDTO createCarro(CarroDTO carroDTO) {
        Carro carro = new Carro();
        BeanUtils.copyProperties(carroDTO, carro);
        carroRepository.save(carro);
        return carroDTO;
    }

    @Override
    public CarroDTO updateCarro(Long id, CarroDTO carroDTO) {
        Optional<Carro> carroOptional = carroRepository.findById(id);
        if (carroOptional.isPresent()) {
            Carro carro = carroOptional.get();
            BeanUtils.copyProperties(carroDTO, carro);
            carro.setId(id);
            carroRepository.save(carro);
            return carroDTO;
        } else {
            throw new RuntimeException("Não foi possível atualizar! Não existe um carro com o ID: " + id);
        }
    }

    @Override
    public void deleteCarro(Long id) {
        Optional<Carro> carroOptional = carroRepository.findById(id);
        if (carroOptional.isPresent()) {
            carroRepository.deleteById(id);
        } else {
            throw new RuntimeException("Não foi possível excluir! Não existe um carro com o ID: " + id);
        }
    }
}
