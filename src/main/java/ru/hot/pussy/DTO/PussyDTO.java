package ru.hot.pussy.DTO;

import lombok.Data;
import ru.hot.pussy.entity.Dick;
import ru.hot.pussy.entity.Pussy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
public class PussyDTO {

    private long id;

    private String name;

    private String ownerName;

    private int deep;

    private String version;

    private List<DickDTO> dicks;

    public List<PussyDTO> mappingPussyToPussyDTO(List<Pussy> pussySet) {
        List<PussyDTO> resultPussyToPussyDTO = new ArrayList<>();
        for (Pussy pussy : pussySet) {
            PussyDTO pussyDTO = new PussyDTO();
            pussyDTO.setId(pussy.getId());
            pussyDTO.setName(pussy.getName());
            pussyDTO.setOwnerName(pussy.getOwnerName());
            pussyDTO.setDeep(pussy.getDeep());
            pussyDTO.setVersion("1.0");
            dicks = new ArrayList<>();
            for (Dick dick : pussy.getDicks()) {
                DickDTO dickDTO = new DickDTO();
                dickDTO.setId(dick.getId());
                dickDTO.setName(dick.getName());
                dickDTO.setOwnerName(dick.getOwnerName());
                dickDTO.setLength(dick.getLength());
                dickDTO.setVersion("1.1");
                dicks.add(dickDTO);
            }
            pussyDTO.setDicks(dicks);
            resultPussyToPussyDTO.add(pussyDTO);
        }
        return resultPussyToPussyDTO;
    }

}
