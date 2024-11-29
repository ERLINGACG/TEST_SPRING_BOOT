package com.javaweb.test_boot.serivce;

import com.javaweb.test_boot.pojo.EnvironmentTable;
import com.javaweb.test_boot.dao.EnvironmentTableMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnvironmentTableService {

    @Autowired
    EnvironmentTableMapper environmentTableMapper;

    public List<EnvironmentTable> getAll() {
        return environmentTableMapper.selectAll();
    }

    public EnvironmentTable selectById(int id) {
        return environmentTableMapper.selectById(id);
        
    }

}
