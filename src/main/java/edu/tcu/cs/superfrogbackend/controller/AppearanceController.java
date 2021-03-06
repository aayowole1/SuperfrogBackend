package edu.tcu.cs.superfrogbackend.controller;


import edu.tcu.cs.superfrogbackend.domain.Appearance;
import edu.tcu.cs.superfrogbackend.domain.Result;
import edu.tcu.cs.superfrogbackend.domain.StatusCode;
import edu.tcu.cs.superfrogbackend.service.AppearanceService;
import edu.tcu.cs.superfrogbackend.service.EmailService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appearances")
public class AppearanceController {
    private AppearanceService appearanceService;


    public AppearanceController(AppearanceService appearanceService) {
        this.appearanceService = appearanceService;
    }

    @GetMapping()
    public Result findAll(){
        List<Appearance> all = appearanceService.findAll();
        Result result = new Result(true, StatusCode.SUCCESS, "Find All Success", all);
        return result;
    }

    @GetMapping("/{appearanceId}")
    public Result findById(@PathVariable Integer customerId){
        return new Result(true, StatusCode.SUCCESS, "Find One Success", appearanceService.findById(customerId));
    }

    @PostMapping()
    public Result save(@RequestBody Appearance newAppearance){
        appearanceService.save(newAppearance);
        return new Result(true, StatusCode.SUCCESS, "Save Success");
    }

    @PutMapping("/{appearanceId}")
    public Result update(@PathVariable Integer appearanceId, @RequestBody Appearance updatedAppearance){
        appearanceService.update(appearanceId, updatedAppearance);
        return new Result(true, StatusCode.SUCCESS, "Update Success");
    }

    @DeleteMapping("/{appearanceId}")
    public Result delete(@PathVariable Integer appearanceId){
        appearanceService.deleteById(appearanceId);
        return new Result(true, StatusCode.SUCCESS, "Delete Success");
    }


}
