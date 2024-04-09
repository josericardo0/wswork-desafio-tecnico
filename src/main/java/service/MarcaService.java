package service;

import dto.MarcaDTO;

public interface MarcaService {
    MarcaDTO getMarcaById(Long id);
    MarcaDTO createMarca(MarcaDTO marcaDTO);
    MarcaDTO updateMarca(Long id, MarcaDTO marcaDTO);
    void deleteMarca(Long id);
}
