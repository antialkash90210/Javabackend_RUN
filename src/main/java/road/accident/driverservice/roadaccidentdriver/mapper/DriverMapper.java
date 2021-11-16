package road.accident.driverservice.roadaccidentdriver.mapper;

import org.mapstruct.Mapper;
import road.accident.driverservice.roadaccidentdriver.dto.CarDTO;
import road.accident.driverservice.roadaccidentdriver.dto.DriverDTO;
import road.accident.driverservice.roadaccidentdriver.entity.CarEntity;
import road.accident.driverservice.roadaccidentdriver.entity.DriverEntity;

import java.util.List;


@Mapper(componentModel = "spring")
public interface DriverMapper {
    DriverDTO driverToDriverDto(DriverEntity driver);

    List<DriverDTO> conveter(List<DriverEntity> driverEntities);

    List<CarDTO> convertList(List<CarEntity> cars);

    CarDTO map(CarEntity value);

    DriverEntity toEntity(DriverDTO dto);
}
