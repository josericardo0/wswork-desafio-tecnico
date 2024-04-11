package service;

import dto.CarroDTO;

import java.util.List;

public interface CarroService {
    CarroDTO getCarroById(Long id);
    CarroDTO createCarro(CarroDTO carroDTO);
    CarroDTO updateCarro(Long id, CarroDTO carroDTO);
    void deleteCarro(Long id);
    List<CarroDTO> getAllCarros();
}
