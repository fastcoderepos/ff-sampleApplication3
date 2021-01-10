package com.fastcode.sampleapplication3.domain.extended.payment;

import org.springframework.stereotype.Repository;
import com.fastcode.sampleapplication3.domain.core.payment.IPaymentRepository;
@Repository("paymentRepositoryExtended")
public interface IPaymentRepositoryExtended extends IPaymentRepository {

	//Add your custom code here
}

