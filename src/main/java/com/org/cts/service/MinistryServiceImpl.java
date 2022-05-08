package com.org.cts.service;

import com.org.cts.model.Ministry;
import com.org.cts.repository.MinistryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MinistryServiceImpl implements MinistryService {
    @Autowired
    MinistryRepo ministryRepo;

    @Override
    public void createMinistry(Ministry ministry) {
        ministryRepo.save(ministry);
    }

    @Override
    public List<Ministry> getAll() {
        List<Ministry> list  =ministryRepo.findAll();
        return list;
    }

    @Override
    public String updateMinistry(Ministry ministry) {
        ministryRepo.save(ministry);
        return null;

    }

    @Override
    public String deleteById(Integer id) {
        ministryRepo.deleteById(id);
        return null;
    }
}
