package ar.edu.utn.frc.tup.lc.iv.controllers;

import ar.edu.utn.frc.tup.lc.iv.models.District;
import ar.edu.utn.frc.tup.lc.iv.services.ElectionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("distritos")
public class ElectionsController {
    @Autowired
    private ElectionsService electionsService;

    @GetMapping("")
    public ResponseEntity<List<District>> getDistricts(@RequestParam("distrito_nombre") String districtName) {

        List<District> districts = electionsService.getDistricts(districtName);


        return ResponseEntity.ok(districts);
    }

}
