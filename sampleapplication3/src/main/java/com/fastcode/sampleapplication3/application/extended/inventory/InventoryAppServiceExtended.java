package com.fastcode.sampleapplication3.application.extended.inventory;

import org.springframework.stereotype.Service;
import com.fastcode.sampleapplication3.application.core.inventory.InventoryAppService;

import com.fastcode.sampleapplication3.domain.extended.inventory.IInventoryRepositoryExtended;
import com.fastcode.sampleapplication3.domain.extended.film.IFilmRepositoryExtended;
import com.fastcode.sampleapplication3.commons.logging.LoggingHelper;

@Service("inventoryAppServiceExtended")
public class InventoryAppServiceExtended extends InventoryAppService implements IInventoryAppServiceExtended {

	public InventoryAppServiceExtended(IInventoryRepositoryExtended inventoryRepositoryExtended,
				IFilmRepositoryExtended filmRepositoryExtended,IInventoryMapperExtended mapper,LoggingHelper logHelper) {

		super(inventoryRepositoryExtended,
		filmRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

