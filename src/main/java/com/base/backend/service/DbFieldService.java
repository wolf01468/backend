package com.base.backend.service;

import com.base.backend.entity.DbField;
import com.base.backend.repository.DbFieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DbFieldService {
    @Autowired
    DbFieldRepository dbFieldRepository;

    public List<DbField> getAll() {
        return (List<DbField>) dbFieldRepository.findAll();
    }
}
