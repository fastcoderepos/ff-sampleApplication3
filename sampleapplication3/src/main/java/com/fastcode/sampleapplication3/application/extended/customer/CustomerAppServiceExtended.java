package com.fastcode.sampleapplication3.application.extended.customer;

import org.springframework.stereotype.Service;
import com.fastcode.sampleapplication3.application.core.customer.CustomerAppService;

import com.fastcode.sampleapplication3.domain.extended.customer.ICustomerRepositoryExtended;
import com.fastcode.sampleapplication3.domain.extended.address.IAddressRepositoryExtended;
import com.fastcode.sampleapplication3.commons.logging.LoggingHelper;

@Service("customerAppServiceExtended")
public class CustomerAppServiceExtended extends CustomerAppService implements ICustomerAppServiceExtended {

	public CustomerAppServiceExtended(ICustomerRepositoryExtended customerRepositoryExtended,
				IAddressRepositoryExtended addressRepositoryExtended,ICustomerMapperExtended mapper,LoggingHelper logHelper) {

		super(customerRepositoryExtended,
		addressRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

