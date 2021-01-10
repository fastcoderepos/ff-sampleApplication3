package com.fastcode.sampleapplication3.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.sampleapplication3.restcontrollers.core.FilmActorController;
import com.fastcode.sampleapplication3.application.extended.filmactor.IFilmActorAppServiceExtended;
import com.fastcode.sampleapplication3.application.extended.actor.IActorAppServiceExtended;
import com.fastcode.sampleapplication3.application.extended.film.IFilmAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.sampleapplication3.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/filmActor/extended")
public class FilmActorControllerExtended extends FilmActorController {

		public FilmActorControllerExtended(IFilmActorAppServiceExtended filmActorAppServiceExtended, IActorAppServiceExtended actorAppServiceExtended, IFilmAppServiceExtended filmAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		filmActorAppServiceExtended,
    	actorAppServiceExtended,
    	filmAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

