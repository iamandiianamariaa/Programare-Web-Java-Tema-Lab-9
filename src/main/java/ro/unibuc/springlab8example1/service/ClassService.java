package ro.unibuc.springlab8example1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.unibuc.springlab8example1.domain.Class;
import ro.unibuc.springlab8example1.domain.Points;
import ro.unibuc.springlab8example1.dto.ClassDto;
import ro.unibuc.springlab8example1.mapper.ClassMapper;
import ro.unibuc.springlab8example1.repository.ClassRepository;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class ClassService {

    @Autowired
    private ClassRepository classRepository;

    @Autowired
    private ClassMapper classMapper;

    public ClassDto create(ClassDto classDto){
        Class class1 = classRepository.save(classMapper.mapToEntity(classDto));

        return classMapper.mapToDto(class1);
    }
    public ClassDto getClassById(Long id){
        Class class1 = classRepository.findClassById(id);
        return classMapper.mapToDto(class1);
    }

    public List<ClassDto> getAllClasses(){
        List<Class> classes = classRepository.findAll();

        return classes.stream().map(p -> classMapper.mapToDto(p)).collect(Collectors.toList());
    }
}
