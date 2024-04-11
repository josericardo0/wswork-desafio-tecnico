package controller;

import dto.MarcaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.MarcaService;

import java.util.List;

@RestController
@RequestMapping("/marcas")
public class MarcaController {

    @Autowired
    private final MarcaService marcaService;

    public MarcaController(MarcaService marcaService) {
        this.marcaService = marcaService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<MarcaDTO> getMarca(@PathVariable Long id) {
        MarcaDTO marcaDTO = marcaService.getMarcaById(id);
        return ResponseEntity.ok(marcaDTO);
    }

    @GetMapping
    public ResponseEntity<List<MarcaDTO>> getAllMarcas() {
        List<MarcaDTO> marcas = marcaService.getAllMarcas();
        return ResponseEntity.ok(marcas);
    }


    @PostMapping
    public ResponseEntity<MarcaDTO> createMarca(@RequestBody MarcaDTO marcaDTO) {
        MarcaDTO createdMarca = marcaService.createMarca(marcaDTO);
        return new ResponseEntity<>(createdMarca, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MarcaDTO> updateMarca(@PathVariable Long id, @RequestBody MarcaDTO marcaDTO) {
        MarcaDTO updatedMarca = marcaService.updateMarca(id, marcaDTO);
        return ResponseEntity.ok(updatedMarca);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMarca(@PathVariable Long id) {
        marcaService.deleteMarca(id);
        return ResponseEntity.noContent().build();
    }
}
