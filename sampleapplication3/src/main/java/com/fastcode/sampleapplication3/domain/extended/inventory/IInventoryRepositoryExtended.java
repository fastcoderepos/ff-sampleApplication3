package com.fastcode.sampleapplication3.domain.extended.inventory;

import org.springframework.stereotype.Repository;
import com.fastcode.sampleapplication3.domain.core.inventory.IInventoryRepository;
@Repository("inventoryRepositoryExtended")
public interface IInventoryRepositoryExtended extends IInventoryRepository {

	//Add your custom code here
}

