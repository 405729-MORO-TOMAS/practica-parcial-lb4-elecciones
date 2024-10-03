package ar.edu.utn.frc.tup.lc.iv.services;

import ar.edu.utn.frc.tup.lc.iv.models.District;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ElectionsServiceImpl implements  ElectionsService{
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<District> getDistricts(String districtName) {
        String url = "http://localhost:8081/distritos";
        if (districtName != null && !districtName.isEmpty()){
            url = url + "?distrito_nombre=" + districtName;
        }

        ResponseEntity<District[]> response = restTemplate.getForEntity(url, District[].class);
        if (response.getBody() != null)
            return Arrays.stream(response.getBody()).toList();
        else
            return new ArrayList<>();
    }
}
