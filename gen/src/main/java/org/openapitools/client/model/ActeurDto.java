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

/**
 * ActeurDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-28T00:48:26.740721200-05:00[America/New_York]")
public class ActeurDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_NOM = "nom";
  @SerializedName(SERIALIZED_NAME_NOM)
  private String nom;

  public static final String SERIALIZED_NAME_PRENOM = "prenom";
  @SerializedName(SERIALIZED_NAME_PRENOM)
  private String prenom;


  public ActeurDto id(Long id) {
    
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


  public ActeurDto nom(String nom) {
    
    this.nom = nom;
    return this;
  }

   /**
   * Get nom
   * @return nom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNom() {
    return nom;
  }


  public void setNom(String nom) {
    this.nom = nom;
  }


  public ActeurDto prenom(String prenom) {
    
    this.prenom = prenom;
    return this;
  }

   /**
   * Get prenom
   * @return prenom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrenom() {
    return prenom;
  }


  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActeurDto acteurDto = (ActeurDto) o;
    return Objects.equals(this.id, acteurDto.id) &&
        Objects.equals(this.nom, acteurDto.nom) &&
        Objects.equals(this.prenom, acteurDto.prenom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nom, prenom);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActeurDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nom: ").append(toIndentedString(nom)).append("\n");
    sb.append("    prenom: ").append(toIndentedString(prenom)).append("\n");
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
