package com.fastcode.sampleapplication3.application.extended.store;

import org.springframework.stereotype.Service;
import com.fastcode.sampleapplication3.application.core.store.StoreAppService;

import com.fastcode.sampleapplication3.domain.extended.store.IStoreRepositoryExtended;
import com.fastcode.sampleapplication3.domain.extended.address.IAddressRepositoryExtended;
import com.fastcode.sampleapplication3.domain.extended.staff.IStaffRepositoryExtended;
import com.fastcode.sampleapplication3.commons.logging.LoggingHelper;

@Service("storeAppServiceExtended")
public class StoreAppServiceExtended extends StoreAppService implements IStoreAppServiceExtended {

	public StoreAppServiceExtended(IStoreRepositoryExtended storeRepositoryExtended,
				IAddressRepositoryExtended addressRepositoryExtended,IStaffRepositoryExtended staffRepositoryExtended,IStoreMapperExtended mapper,LoggingHelper logHelper) {

		super(storeRepositoryExtended,
		addressRepositoryExtended,staffRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

