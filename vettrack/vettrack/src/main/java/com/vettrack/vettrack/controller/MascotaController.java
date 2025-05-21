package com.vettrack.vettrack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.vettrack.vettrack.model.Mascota;
import com.vettrack.vettrack.service.MascotaService;

@RestController
@RequestMapping("/api/mascotas")
@CrossOrigin(origins = "*")
public class MascotaController {

    @Autowired
    private MascotaService mascotaService;

    @PostMapping
    public Mascota crearMascota(@RequestBody Mascota mascota) {
        return mascotaService.guardarMascota(mascota);
    }

    @GetMapping
    public List<Mascota> obtenerMascotas() {
        return mascotaService.listarMascotas();
    }
}
