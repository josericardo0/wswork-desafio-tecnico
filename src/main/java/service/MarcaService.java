package service;

import dto.MarcaDTO;

import java.util.List;

public interface MarcaService {
    MarcaDTO getMarcaById(Long id);
    MarcaDTO createMarca(MarcaDTO marcaDTO);
    MarcaDTO updateMarca(Long id, MarcaDTO marcaDTO);
    void deleteMarca(Long id);
    List<MarcaDTO> getAllMarcas();
}
