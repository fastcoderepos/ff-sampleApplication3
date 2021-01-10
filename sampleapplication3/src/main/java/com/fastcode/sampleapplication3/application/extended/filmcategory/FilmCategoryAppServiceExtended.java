package com.fastcode.sampleapplication3.application.extended.filmcategory;

import org.springframework.stereotype.Service;
import com.fastcode.sampleapplication3.application.core.filmcategory.FilmCategoryAppService;

import com.fastcode.sampleapplication3.domain.extended.filmcategory.IFilmCategoryRepositoryExtended;
import com.fastcode.sampleapplication3.domain.extended.category.ICategoryRepositoryExtended;
import com.fastcode.sampleapplication3.domain.extended.film.IFilmRepositoryExtended;
import com.fastcode.sampleapplication3.commons.logging.LoggingHelper;

@Service("filmCategoryAppServiceExtended")
public class FilmCategoryAppServiceExtended extends FilmCategoryAppService implements IFilmCategoryAppServiceExtended {

	public FilmCategoryAppServiceExtended(IFilmCategoryRepositoryExtended filmCategoryRepositoryExtended,
				ICategoryRepositoryExtended categoryRepositoryExtended,IFilmRepositoryExtended filmRepositoryExtended,IFilmCategoryMapperExtended mapper,LoggingHelper logHelper) {

		super(filmCategoryRepositoryExtended,
		categoryRepositoryExtended,filmRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

