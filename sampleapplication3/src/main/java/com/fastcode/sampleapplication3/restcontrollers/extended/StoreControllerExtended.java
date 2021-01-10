package com.fastcode.sampleapplication3.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.sampleapplication3.restcontrollers.core.StoreController;
import com.fastcode.sampleapplication3.application.extended.store.IStoreAppServiceExtended;
import com.fastcode.sampleapplication3.application.extended.address.IAddressAppServiceExtended;
import com.fastcode.sampleapplication3.application.extended.staff.IStaffAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.sampleapplication3.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/store/extended")
public class StoreControllerExtended extends StoreController {

		public StoreControllerExtended(IStoreAppServiceExtended storeAppServiceExtended, IAddressAppServiceExtended addressAppServiceExtended, IStaffAppServiceExtended staffAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		storeAppServiceExtended,
    	addressAppServiceExtended,
    	staffAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

