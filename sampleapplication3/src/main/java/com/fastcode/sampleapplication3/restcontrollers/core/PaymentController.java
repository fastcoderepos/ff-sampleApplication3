package com.fastcode.sampleapplication3.restcontrollers.core;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.fastcode.sampleapplication3.commons.search.SearchCriteria;
import com.fastcode.sampleapplication3.commons.search.SearchUtils;
import com.fastcode.sampleapplication3.commons.search.OffsetBasedPageRequest;
import com.fastcode.sampleapplication3.application.core.payment.IPaymentAppService;
import com.fastcode.sampleapplication3.application.core.payment.dto.*;
import com.fastcode.sampleapplication3.application.core.customer.ICustomerAppService;
import com.fastcode.sampleapplication3.application.core.rental.IRentalAppService;
import com.fastcode.sampleapplication3.application.core.staff.IStaffAppService;
import java.util.*;
import java.time.*;
import com.fastcode.sampleapplication3.commons.logging.LoggingHelper;

@RestController
@RequestMapping("/payment")
@RequiredArgsConstructor
public class PaymentController {

	@Qualifier("paymentAppService")
	@NonNull protected final IPaymentAppService _paymentAppService;

    @Qualifier("customerAppService")
	@NonNull  protected final ICustomerAppService  _customerAppService;

    @Qualifier("rentalAppService")
	@NonNull  protected final IRentalAppService  _rentalAppService;

    @Qualifier("staffAppService")
	@NonNull  protected final IStaffAppService  _staffAppService;

	@NonNull protected final LoggingHelper logHelper;

	@NonNull protected final Environment env;

	@RequestMapping(method = RequestMethod.POST, consumes = {"application/json"}, produces = {"application/json"})
	public ResponseEntity<CreatePaymentOutput> create(@RequestBody @Valid CreatePaymentInput payment) {
		CreatePaymentOutput output=_paymentAppService.create(payment);
		Optional.ofNullable(output).orElseThrow(() -> new EntityNotFoundException(String.format("No record found")));

		Optional.ofNullable(output).orElseThrow(() -> new EntityNotFoundException(String.format("No record found")));

		Optional.ofNullable(output).orElseThrow(() -> new EntityNotFoundException(String.format("No record found")));

		return new ResponseEntity(output, HttpStatus.OK);
	}

	// ------------ Delete payment ------------
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, consumes = {"application/json"})
	public void delete(@PathVariable String id) {

    	FindPaymentByIdOutput output = _paymentAppService.findById(Integer.valueOf(id));
    	Optional.ofNullable(output).orElseThrow(() -> new EntityNotFoundException(String.format("There does not exist a payment with a id=%s", id)));

    	_paymentAppService.delete(Integer.valueOf(id));
    }


	// ------------ Update payment ------------
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = {"application/json"}, produces = {"application/json"})
	public ResponseEntity<UpdatePaymentOutput> update(@PathVariable String id, @RequestBody @Valid UpdatePaymentInput payment) {

	    FindPaymentByIdOutput currentPayment = _paymentAppService.findById(Integer.valueOf(id));
		Optional.ofNullable(currentPayment).orElseThrow(() -> new EntityNotFoundException(String.format("Unable to update. Payment with id=%s not found.", id)));


		payment.setVersiono(currentPayment.getVersiono());
	    UpdatePaymentOutput output = _paymentAppService.update(Integer.valueOf(id),payment);
		Optional.ofNullable(output).orElseThrow(() -> new EntityNotFoundException(String.format("No record found")));
		Optional.ofNullable(output).orElseThrow(() -> new EntityNotFoundException(String.format("No record found")));
		Optional.ofNullable(output).orElseThrow(() -> new EntityNotFoundException(String.format("No record found")));
		return new ResponseEntity(output, HttpStatus.OK);
	}


	@RequestMapping(value = "/{id}", method = RequestMethod.GET, consumes = {"application/json"}, produces = {"application/json"})
	public ResponseEntity<FindPaymentByIdOutput> findById(@PathVariable String id) {

    	FindPaymentByIdOutput output = _paymentAppService.findById(Integer.valueOf(id));
    	Optional.ofNullable(output).orElseThrow(() -> new EntityNotFoundException(String.format("Not found")));

		return new ResponseEntity(output, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, consumes = {"application/json"}, produces = {"application/json"})
	public ResponseEntity find(@RequestParam(value="search", required=false) String search, @RequestParam(value = "offset", required=false) String offset, @RequestParam(value = "limit", required=false) String limit, Sort sort) throws Exception {

		if (offset == null) { offset = env.getProperty("fastCode.offset.default"); }
		if (limit == null) { limit = env.getProperty("fastCode.limit.default"); }

		if(sort == null || sort.isEmpty()) {
			sort = Sort.by(Sort.Direction.ASC, "paymentId");
		}
		
		Pageable Pageable = new OffsetBasedPageRequest(Integer.parseInt(offset), Integer.parseInt(limit), sort);
		SearchCriteria searchCriteria = SearchUtils.generateSearchCriteriaObject(search);

		return ResponseEntity.ok(_paymentAppService.find(searchCriteria,Pageable));
	}
	@RequestMapping(value = "/{id}/customer", method = RequestMethod.GET, consumes = {"application/json"}, produces = {"application/json"})
	public ResponseEntity<GetCustomerOutput> getCustomer(@PathVariable String id) {
    	GetCustomerOutput output= _paymentAppService.getCustomer(Integer.valueOf(id));
		Optional.ofNullable(output).orElseThrow(() -> new EntityNotFoundException(String.format("Not found")));

		return new ResponseEntity(output, HttpStatus.OK);
	}
	@RequestMapping(value = "/{id}/rental", method = RequestMethod.GET, consumes = {"application/json"}, produces = {"application/json"})
	public ResponseEntity<GetRentalOutput> getRental(@PathVariable String id) {
    	GetRentalOutput output= _paymentAppService.getRental(Integer.valueOf(id));
		Optional.ofNullable(output).orElseThrow(() -> new EntityNotFoundException(String.format("Not found")));

		return new ResponseEntity(output, HttpStatus.OK);
	}
	@RequestMapping(value = "/{id}/staff", method = RequestMethod.GET, consumes = {"application/json"}, produces = {"application/json"})
	public ResponseEntity<GetStaffOutput> getStaff(@PathVariable String id) {
    	GetStaffOutput output= _paymentAppService.getStaff(Integer.valueOf(id));
		Optional.ofNullable(output).orElseThrow(() -> new EntityNotFoundException(String.format("Not found")));

		return new ResponseEntity(output, HttpStatus.OK);
	}

}


