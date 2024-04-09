package controller;

import dto.ModeloDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.ModeloService;

import java.util.List;

@RestController
@RequestMapping("/modelos")
public class ModeloController {

    @Autowired
    private final ModeloService modeloService;

    public ModeloController(ModeloService modeloService) {
        this.modeloService = modeloService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ModeloDTO> getModelo(@PathVariable Long id) {
        ModeloDTO modeloDTO = modeloService.getModeloById(id);
        return ResponseEntity.ok(modeloDTO);
    }

    @GetMapping("/modelos")
    public ResponseEntity<List<ModeloDTO>> getAllModelos() {
        List<ModeloDTO> modelos = modeloService.getAllModelos();
        return ResponseEntity.ok(modelos);
    }

    @PostMapping
    public ResponseEntity<ModeloDTO> createModelo(@RequestBody ModeloDTO modeloDTO) {
        ModeloDTO createdModelo = modeloService.createModelo(modeloDTO);
        return new ResponseEntity<>(createdModelo, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ModeloDTO> updateModelo(@PathVariable Long id, @RequestBody ModeloDTO modeloDTO) {
        ModeloDTO updatedModelo = modeloService.updateModelo(id, modeloDTO);
        return ResponseEntity.ok(updatedModelo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteModelo(@PathVariable Long id) {
        modeloService.deleteModelo(id);
        return ResponseEntity.noContent().build();
    }
}
