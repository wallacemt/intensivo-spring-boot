package com.dslst.dslist.dto;

import com.dslst.dslist.entities.Game;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@NoArgsConstructor
@Getter
@Setter
public class GameDTO {
    private Long id;
    private String title;
    private Integer year;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameDTO(Game entity){
        BeanUtils.copyProperties(entity, this);
    }
}
