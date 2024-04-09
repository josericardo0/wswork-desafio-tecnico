package utils;

import dto.CarroDTO;
import dto.MarcaDTO;
import dto.ModeloDTO;
import model.Carro;
import model.Marca;
import model.Modelo;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class DTOUtils {

    private static final ModelMapper modelMapper = new ModelMapper();

    public static List<CarroDTO> convertCarroListToDTOList(List<Carro> carros) {
        return carros.stream()
                .map(DTOUtils::convertCarroToDTO)
                .collect(Collectors.toList());
    }

    public static CarroDTO convertCarroToDTO(Carro carro) {
        return modelMapper.map(carro, CarroDTO.class);
    }

    public static List<MarcaDTO> convertMarcaListToDTOList(List<Marca> marcas) {
        return marcas.stream()
                .map(DTOUtils::convertMarcaToDTO)
                .collect(Collectors.toList());
    }

    public static MarcaDTO convertMarcaToDTO(Marca marca) {
        return modelMapper.map(marca, MarcaDTO.class);
    }

    public static List<ModeloDTO> convertModeloListToDTOList(List<Modelo> modelos) {
        return modelos.stream()
                .map(DTOUtils::convertModeloToDTO)
                .collect(Collectors.toList());
    }

    public static ModeloDTO convertModeloToDTO(Modelo modelo) {
        return modelMapper.map(modelo, ModeloDTO.class);
    }
}