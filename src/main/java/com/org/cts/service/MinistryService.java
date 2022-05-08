package com.org.cts.service;

import com.org.cts.model.Ministry;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface MinistryService {
    public void createMinistry( Ministry ministry);
    public List<Ministry> getAll();
    public String updateMinistry( Ministry ministry);
    public String deleteById( Integer id);

}
