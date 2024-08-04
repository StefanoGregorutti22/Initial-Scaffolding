package com.example.Services;

import com.example.Models.DummyModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DummyService {

    DummyModel getDummy(Long id);

    List<DummyModel> getDummyList();

    DummyModel createDummy(DummyModel dummyModel);
    DummyModel updateDummy(DummyModel dummyModel);
    void deleteDummy(DummyModel dummyModel);
}
