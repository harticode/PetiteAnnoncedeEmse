package com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.api;

import com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.dao.ConfessionDao;
import com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.dto.ConfessionDto;
import com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.model.Confession;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin
@RestController // RestController is a Spring stereotype to mark a class as a rest service
@RequestMapping("/api/confessions") // @RequestMapping is used to define a global URL prefix used to manage a resource (in our example all requests that start with /api/windows will be handle by this controller)
@Transactional

public class ConfessionController {
    private final ConfessionDao confessionDao;

    public ConfessionController(ConfessionDao confessionDao) {
        this.confessionDao = confessionDao;
    }

    @GetMapping
    public List<ConfessionDto> findAllOrderByDateofPost(){
        return confessionDao.findAllOrderByDateofPost().stream().map(ConfessionDto::new).collect(Collectors.toList());
    }

    @PostMapping
    public ConfessionDto create(@RequestBody ConfessionDto dto){
        Confession confession = null;
        confession = confessionDao.save(new Confession(dto.getDateofPost(), dto.getContentOfTheConfession()));
        return new ConfessionDto(confession);
    }
}
