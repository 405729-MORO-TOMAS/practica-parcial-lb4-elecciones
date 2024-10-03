package ar.edu.utn.frc.tup.lc.iv.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class District {
    private Long id;

    @JsonProperty("nombre")
    private String name;
}
