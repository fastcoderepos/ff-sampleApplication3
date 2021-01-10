package com.fastcode.sampleapplication3.domain.core.filmcategory;

import java.time.*;
import javax.persistence.*;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter @Setter
@NoArgsConstructor
public class FilmCategoryId implements Serializable {

	private static final long serialVersionUID = 1L;
	
    private Integer categoryId;
    private Integer filmId;
    
    public FilmCategoryId(Integer categoryId,Integer filmId) {
 	this.categoryId = categoryId;
 	this.filmId = filmId;
    }
    
}
