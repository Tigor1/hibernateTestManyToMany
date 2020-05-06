package ru.hot.pussy.DTO;

import lombok.Data;
import ru.hot.pussy.entity.Dick;

import java.util.HashSet;
import java.util.Set;

@Data
public class DickDTO {
    private long id;

    private String name;

    private String ownerName;

    private int length;

    private Set<PussyDTO> pussiesDTO;

    private String version;

    public Set<DickDTO> mappingDickToDickDTO (Set<Dick> dickSet) {
        Set<DickDTO> resultDickDto = new HashSet<>();
        for (Dick dick : dickSet) {
            DickDTO dickDTO = new DickDTO();
            dickDTO.setId(dick.getId());
            dickDTO.setName(dick.getName());
            dickDTO.setOwnerName(dick.getOwnerName());
            dickDTO.setLength(dick.getLength());
            resultDickDto.add(dickDTO);
        }
        return resultDickDto;
    }
}
