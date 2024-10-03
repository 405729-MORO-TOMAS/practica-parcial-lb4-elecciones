package ar.edu.utn.frc.tup.lc.iv.restclient;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DistrictRestClient {
    @JsonProperty("distritoId")
    private Long id;

    @JsonProperty("distritoNombre")
    private String name;
}