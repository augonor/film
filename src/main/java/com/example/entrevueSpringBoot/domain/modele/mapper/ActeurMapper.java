package com.example.entrevueSpringBoot.domain.modele.mapper;


import com.example.entrevueSpringBoot.domain.modele.entite.Acteur;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.openapitools.client.model.ActeurDto;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ActeurMapper {

    ActeurDto toDto(Acteur acteur);

    Acteur toActeur(ActeurDto acteur);
}
