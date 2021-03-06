/*
 * film API
 * film description
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.ActeurDto;

/**
 * FilmDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-28T00:48:26.740721200-05:00[America/New_York]")
public class FilmDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_TITRE = "titre";
  @SerializedName(SERIALIZED_NAME_TITRE)
  private String titre;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ACTEURS = "acteurs";
  @SerializedName(SERIALIZED_NAME_ACTEURS)
  private List<ActeurDto> acteurs = null;


  public FilmDto id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public FilmDto titre(String titre) {
    
    this.titre = titre;
    return this;
  }

   /**
   * Get titre
   * @return titre
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTitre() {
    return titre;
  }


  public void setTitre(String titre) {
    this.titre = titre;
  }


  public FilmDto description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public FilmDto acteurs(List<ActeurDto> acteurs) {
    
    this.acteurs = acteurs;
    return this;
  }

  public FilmDto addActeursItem(ActeurDto acteursItem) {
    if (this.acteurs == null) {
      this.acteurs = new ArrayList<ActeurDto>();
    }
    this.acteurs.add(acteursItem);
    return this;
  }

   /**
   * Get acteurs
   * @return acteurs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ActeurDto> getActeurs() {
    return acteurs;
  }


  public void setActeurs(List<ActeurDto> acteurs) {
    this.acteurs = acteurs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilmDto filmDto = (FilmDto) o;
    return Objects.equals(this.id, filmDto.id) &&
        Objects.equals(this.titre, filmDto.titre) &&
        Objects.equals(this.description, filmDto.description) &&
        Objects.equals(this.acteurs, filmDto.acteurs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, titre, description, acteurs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilmDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    titre: ").append(toIndentedString(titre)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    acteurs: ").append(toIndentedString(acteurs)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

