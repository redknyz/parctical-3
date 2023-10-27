package org.example.Controllers;

import org.example.Tables.Crew;
import org.example.Repository.CrewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/crews")
public class CrewController {

    @Autowired
    private CrewRepository crewRepository;

    @GetMapping
    public List<Crew> getAllCrews() {
        return crewRepository.getAllCrews();
    }

    @GetMapping("/{id}")
    public Crew getCrewById(@PathVariable int id) {
        return crewRepository.getCrewById(id);
    }

    @PostMapping
    public Crew createCrew(@RequestBody Crew crew) {
        return crewRepository.createCrew(crew);
    }

    @PutMapping("/{id}")
    public Crew updateCrew(@PathVariable int id, @RequestBody Crew crew) {
        return crewRepository.updateCrew(id, crew);
    }

    @DeleteMapping("/{id}")
    public void deleteCrew(@PathVariable int id) {
        crewRepository.deleteCrew(id);
    }
}
