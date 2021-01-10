package com.fastcode.sampleapplication3.restcontrollers.extended;

import org.springframework.web.bind.annotation.*;
import com.fastcode.sampleapplication3.restcontrollers.core.CustomerController;
import com.fastcode.sampleapplication3.application.extended.customer.ICustomerAppServiceExtended;
import com.fastcode.sampleapplication3.application.extended.address.IAddressAppServiceExtended;
import com.fastcode.sampleapplication3.application.extended.payment.IPaymentAppServiceExtended;
import com.fastcode.sampleapplication3.application.extended.rental.IRentalAppServiceExtended;
import org.springframework.core.env.Environment;
import com.fastcode.sampleapplication3.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/customer/extended")
public class CustomerControllerExtended extends CustomerController {

		public CustomerControllerExtended(ICustomerAppServiceExtended customerAppServiceExtended, IAddressAppServiceExtended addressAppServiceExtended, IPaymentAppServiceExtended paymentAppServiceExtended, IRentalAppServiceExtended rentalAppServiceExtended,
	     LoggingHelper helper, Environment env) {
		super(
		customerAppServiceExtended,
    	addressAppServiceExtended,
    	paymentAppServiceExtended,
    	rentalAppServiceExtended,
		helper, env);
	}

	//Add your custom code here

}

