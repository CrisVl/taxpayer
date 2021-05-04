package com.hmrc.taxpayer.services;

import com.hmrc.taxpayer.model.VeterinaryDoctor;
import org.springframework.stereotype.Service;

@Service
public interface VeterinaryService extends CrudService<VeterinaryDoctor, Long> {
}
