package com.fastcode.sampleapplication3.domain.core.filmactor;

import java.time.*;
import javax.persistence.*;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter @Setter
@NoArgsConstructor
public class FilmActorId implements Serializable {

	private static final long serialVersionUID = 1L;
	
    private Integer actorId;
    private Integer filmId;
    
    public FilmActorId(Integer actorId,Integer filmId) {
 	this.actorId = actorId;
 	this.filmId = filmId;
    }
    
}
