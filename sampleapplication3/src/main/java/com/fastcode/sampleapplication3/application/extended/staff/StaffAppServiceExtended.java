package com.fastcode.sampleapplication3.application.extended.staff;

import org.springframework.stereotype.Service;
import com.fastcode.sampleapplication3.application.core.staff.StaffAppService;

import com.fastcode.sampleapplication3.domain.extended.staff.IStaffRepositoryExtended;
import com.fastcode.sampleapplication3.domain.extended.address.IAddressRepositoryExtended;
import com.fastcode.sampleapplication3.commons.logging.LoggingHelper;

@Service("staffAppServiceExtended")
public class StaffAppServiceExtended extends StaffAppService implements IStaffAppServiceExtended {

	public StaffAppServiceExtended(IStaffRepositoryExtended staffRepositoryExtended,
				IAddressRepositoryExtended addressRepositoryExtended,IStaffMapperExtended mapper,LoggingHelper logHelper) {

		super(staffRepositoryExtended,
		addressRepositoryExtended,mapper,logHelper);

	}

 	//Add your custom code here
 
}

