package ro.unibuc.springlab8example1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.unibuc.springlab8example1.domain.UserType;
import ro.unibuc.springlab8example1.dto.ClassDto;
import ro.unibuc.springlab8example1.dto.UserDto;
import ro.unibuc.springlab8example1.service.ClassService;
import ro.unibuc.springlab8example1.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/classes")
public class ClassController {

    @Autowired
    private ClassService classService;

    @PostMapping()
    public ResponseEntity<ClassDto> create(@RequestBody ClassDto classDto) {
        return ResponseEntity
                .ok()
                .body(classService.create(classDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClassDto> getClassById(@PathVariable Long id) {
        return ResponseEntity
                .ok()
                .body(classService.getClassById(id));
    }

    @GetMapping
    public ResponseEntity<List<ClassDto>> getAllClasses() {
        return ResponseEntity
                .ok()
                .body(classService.getAllClasses());
    }
}
