package com.fastcode.sampleapplication3.application.core.filmactor.dto;

import java.time.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class GetActorOutput {

 	private Integer actorId;
 	private String firstName;
 	private String lastName;
 	private LocalDateTime lastUpdate;
  	private Integer filmActorActorId;
  	private Integer filmActorFilmId;

}

