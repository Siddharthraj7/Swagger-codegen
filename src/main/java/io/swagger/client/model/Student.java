/*
 * Student API
 * Student API using swagger.io by Siddharth Raj
 *
 * OpenAPI spec version: 1.0.0
 * Contact: siddharth.raj2019@vitbhopal.ac.in
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Student
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-03-29T17:28:44.087714942Z[GMT]")
public class Student {
  @SerializedName("StudentID")
  private Integer studentID = null;

  @SerializedName("StudentName")
  private String studentName = null;

  @SerializedName("Standard")
  private String standard = null;

  @SerializedName("Fees")
  private Integer fees = null;

  public Student studentID(Integer studentID) {
    this.studentID = studentID;
    return this;
  }

   /**
   * Get studentID
   * @return studentID
  **/
  @Schema(example = "3", description = "")
  public Integer getStudentID() {
    return studentID;
  }

  public void setStudentID(Integer studentID) {
    this.studentID = studentID;
  }

  public Student studentName(String studentName) {
    this.studentName = studentName;
    return this;
  }

   /**
   * Get studentName
   * @return studentName
  **/
  @Schema(example = "Sid", description = "")
  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  public Student standard(String standard) {
    this.standard = standard;
    return this;
  }

   /**
   * Get standard
   * @return standard
  **/
  @Schema(example = "Sixth", description = "")
  public String getStandard() {
    return standard;
  }

  public void setStandard(String standard) {
    this.standard = standard;
  }

  public Student fees(Integer fees) {
    this.fees = fees;
    return this;
  }

   /**
   * Get fees
   * @return fees
  **/
  @Schema(example = "5000", description = "")
  public Integer getFees() {
    return fees;
  }

  public void setFees(Integer fees) {
    this.fees = fees;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Student student = (Student) o;
    return Objects.equals(this.studentID, student.studentID) &&
        Objects.equals(this.studentName, student.studentName) &&
        Objects.equals(this.standard, student.standard) &&
        Objects.equals(this.fees, student.fees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(studentID, studentName, standard, fees);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Student {\n");
    
    sb.append("    studentID: ").append(toIndentedString(studentID)).append("\n");
    sb.append("    studentName: ").append(toIndentedString(studentName)).append("\n");
    sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
