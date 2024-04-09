package service;

import dto.CarroDTO;

public interface CarroService {
    CarroDTO getCarroById(Long id);
    CarroDTO createCarro(CarroDTO carroDTO);
    CarroDTO updateCarro(Long id, CarroDTO carroDTO);
    void deleteCarro(Long id);
}
