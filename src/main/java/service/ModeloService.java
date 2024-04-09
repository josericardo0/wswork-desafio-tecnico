package service;

import dto.ModeloDTO;

public interface ModeloService {
    ModeloDTO getModeloById(Long id);
    ModeloDTO createModelo(ModeloDTO modeloDTO);
    ModeloDTO updateModelo(Long id, ModeloDTO modeloDTO);
    void deleteModelo(Long id);
}
