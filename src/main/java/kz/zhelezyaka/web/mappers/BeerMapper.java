package kz.zhelezyaka.web.mappers;

import kz.zhelezyaka.domain.Beer;
import kz.zhelezyaka.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}
