package ro.unibuc.springlab8example1.mapper;

import org.mapstruct.Mapper;
import ro.unibuc.springlab8example1.domain.Class;
import ro.unibuc.springlab8example1.domain.User;
import ro.unibuc.springlab8example1.dto.ClassDto;
import ro.unibuc.springlab8example1.dto.UserDto;

@Mapper(componentModel = "spring")
public interface ClassMapper {

    ClassDto mapToDto(Class clas);
    Class mapToEntity(ClassDto classDto);
}
