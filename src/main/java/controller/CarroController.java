package controller;

import dto.CarroDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.CarroService;

import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarroController {

    @Autowired
    private final CarroService carroService;

    public CarroController(CarroService carroService) {
        this.carroService = carroService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<CarroDTO> getCarro(@PathVariable Long id) {
        CarroDTO carroDTO = carroService.getCarroById(id);
        return ResponseEntity.ok(carroDTO);
    }

    @GetMapping
    public ResponseEntity<List<CarroDTO>> getAllCarros() {
        List<CarroDTO> carros = carroService.getAllCarros();
        return ResponseEntity.ok(carros);
    }

    @PostMapping
    public ResponseEntity<CarroDTO> createCarro(@RequestBody CarroDTO carroDTO) {
        CarroDTO createdCarro = carroService.createCarro(carroDTO);
        return new ResponseEntity<>(createdCarro, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CarroDTO> updateCarro(@PathVariable Long id, @RequestBody CarroDTO carroDTO) {
        CarroDTO updatedCarro = carroService.updateCarro(id, carroDTO);
        return ResponseEntity.ok(updatedCarro);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCarro(@PathVariable Long id) {
        carroService.deleteCarro(id);
        return ResponseEntity.noContent().build();
    }
}
