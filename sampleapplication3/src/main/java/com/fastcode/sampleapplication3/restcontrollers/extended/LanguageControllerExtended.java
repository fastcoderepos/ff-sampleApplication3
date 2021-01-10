package com.fastcode.sampleapplication3.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.sampleapplication3.restcontrollers.core.LanguageController;
import com.fastcode.sampleapplication3.application.extended.language.ILanguageAppServiceExtended;
import com.fastcode.sampleapplication3.application.extended.film.IFilmAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.sampleapplication3.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/language/extended")
public class LanguageControllerExtended extends LanguageController {

		public LanguageControllerExtended(ILanguageAppServiceExtended languageAppServiceExtended, IFilmAppServiceExtended filmAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		languageAppServiceExtended,
    	filmAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

