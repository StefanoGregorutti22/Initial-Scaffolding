package com.example.Controllers;

import com.example.Dtos.DummyDto;
import com.example.Models.DummyModel;
import com.example.Services.DummyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dummy/")
public class DummyControllers {

    @Autowired
    private DummyService dummyService; //Conexion entre el controller y el service

    @GetMapping()
    public ResponseEntity<DummyDto> getDummyList() {
        List<DummyModel> dummyModelList = dummyService.getDummyList(); //Estos metodos generan conexion con el servicio
        return null;
    }
    @GetMapping("/{id}")
    public ResponseEntity<DummyDto> getDummyList(@PathVariable Long id)  {
        DummyModel dummyModel = dummyService.getDummy(id); //Estos metodos generan conexion con el servicio
        return null;
        //Tenemos que poner el @PathVariable porque sino nos va a dar error
    }
    @PostMapping()
    public ResponseEntity<DummyDto> createDummy(){
        DummyModel dummyModel = dummyService.createDummy(null); //Estos metodos generan conexion con el servicio
        return null;
    }

    @PutMapping
    public ResponseEntity<DummyDto> updateDummy() {
        DummyModel dummyModel = dummyService.updateDummy(null); //Estos metodos generan conexion con el servicio
        return null;
    }

    @DeleteMapping
    public ResponseEntity<DummyDto> deleteDummy() {
        dummyService.deleteDummy(null);
        return null;
    }
}
