package com.ucb.FrankyService;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class WorkFlowService {
    List<WorkFlow> list =new ArrayList<>();

    public List obtainList() {
        return this.list;
    }
    public void create(WorkFlow workFlow){
        this.list.add(workFlow);

    }


}
