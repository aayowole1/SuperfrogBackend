package edu.tcu.cs.superfrogbackend.Authentication.Controllers;

import edu.tcu.cs.superfrogbackend.Authentication.Models.User;
import edu.tcu.cs.superfrogbackend.Authentication.Services.SpiritDirectorService;
import edu.tcu.cs.superfrogbackend.domain.Result;
import edu.tcu.cs.superfrogbackend.domain.StatusCode;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/directors")
@PreAuthorize("hasRole('DIRECTOR')")
public class SpiritDirectorController {
    private SpiritDirectorService service;

    public SpiritDirectorController(SpiritDirectorService service) {
        this.service = service;
    }

    @GetMapping()
    public Result findAll(){
        List<User> all = service.findAll();
        Result result = new Result(true, StatusCode.SUCCESS, "Find All Success", all);
        return result;
    }

    @GetMapping("/{spiritDirectorId}")
    public Result findById(@PathVariable Long spiritDirectorId){
        return new Result(true, StatusCode.SUCCESS, "Find One Success", service.findById(spiritDirectorId));
    }

    @PostMapping()
    public Result save(@RequestBody User spiritDirector){
        service.save(spiritDirector);
        return new Result(true, StatusCode.SUCCESS, "Save Success");
    }

    @PutMapping("/{spiritDirectorId}")
    public Result update(@PathVariable Long spiritDirectorId, @RequestBody User spiritDirector){
        service.update(spiritDirectorId, spiritDirector);
        return new Result(true, StatusCode.SUCCESS, "Update Success");
    }

    @DeleteMapping("/{spiritDirectorId}")
    public Result delete(@PathVariable Long spiritDirectorId){
        service.delete(spiritDirectorId);
        return new Result(true, StatusCode.SUCCESS, "Delete Success");
    }

}
