package com.hmrc.taxpayer.services.springdatajpa;

import com.hmrc.taxpayer.model.VeterinaryDoctor;
import com.hmrc.taxpayer.repository.VeterinaryRepository;
import com.hmrc.taxpayer.services.VeterinaryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

public class VeterinarySDJpaService implements VeterinaryService {
    private final VeterinaryRepository veterinaryRepository;

    @Autowired
    public VeterinarySDJpaService(VeterinaryRepository veterinaryRepository) {
        this.veterinaryRepository = veterinaryRepository;
    }



    @Override
    public Set<VeterinaryDoctor> findAll() {
        Set<VeterinaryDoctor> vets = new HashSet<>();
        veterinaryRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public VeterinaryDoctor findById(Long aLong) {
        return veterinaryRepository.findById(Math.toIntExact(aLong)).orElse(null);
    }

    @Override
    public VeterinaryDoctor save(VeterinaryDoctor object) {
        return veterinaryRepository.save(object);
    }

    @Override
    public void delete(VeterinaryDoctor object) {
        veterinaryRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        veterinaryRepository.deleteById(Math.toIntExact(aLong));
    }
}
