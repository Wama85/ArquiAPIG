package com.ucb.FrankyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import  java.util.*;
@RestController
@RequestMapping("/Work-flow")
public class WorkFlowController {
    @Autowired
    WorkFlowService workFlowService;

    @GetMapping()
    public List list(){
        return workFlowService.obtainList();

    }
    @PostMapping()
    public void save(
            @RequestBody WorkFlowDto workFlowDto
    ){
        WorkFlow workFlow=new WorkFlow(
                workFlowDto.name(),
                workFlowDto.description()
        );
        this.workFlowService.create(
                workFlow
        );
    }

}
