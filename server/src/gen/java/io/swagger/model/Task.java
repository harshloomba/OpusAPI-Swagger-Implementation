package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-21T09:22:23.594-07:00")
public class Task   {
  
  private Long taskId = null;
  private String createdAt = null;
  private String completedAt = null;
  private String callbackUrl = null;
  private String type = null;
  private String status = null;
  private String instruction = null;
  private String urgency = null;

  /**
   **/
  public Task taskId(Long taskId) {
    this.taskId = taskId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("taskId")
  public Long getTaskId() {
    return taskId;
  }
  public void setTaskId(Long taskId) {
    this.taskId = taskId;
  }

  /**
   **/
  public Task createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("createdAt")
  public String getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  /**
   **/
  public Task completedAt(String completedAt) {
    this.completedAt = completedAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("completedAt")
  public String getCompletedAt() {
    return completedAt;
  }
  public void setCompletedAt(String completedAt) {
    this.completedAt = completedAt;
  }

  /**
   **/
  public Task callbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("callbackUrl")
  public String getCallbackUrl() {
    return callbackUrl;
  }
  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }

  /**
   **/
  public Task type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  public Task status(String status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   **/
  public Task instruction(String instruction) {
    this.instruction = instruction;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("instruction")
  public String getInstruction() {
    return instruction;
  }
  public void setInstruction(String instruction) {
    this.instruction = instruction;
  }

  /**
   **/
  public Task urgency(String urgency) {
    this.urgency = urgency;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("urgency")
  public String getUrgency() {
    return urgency;
  }
  public void setUrgency(String urgency) {
    this.urgency = urgency;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Task task = (Task) o;
    return Objects.equals(taskId, task.taskId) &&
        Objects.equals(createdAt, task.createdAt) &&
        Objects.equals(completedAt, task.completedAt) &&
        Objects.equals(callbackUrl, task.callbackUrl) &&
        Objects.equals(type, task.type) &&
        Objects.equals(status, task.status) &&
        Objects.equals(instruction, task.instruction) &&
        Objects.equals(urgency, task.urgency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskId, createdAt, completedAt, callbackUrl, type, status, instruction, urgency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Task {\n");
    
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
    sb.append("    urgency: ").append(toIndentedString(urgency)).append("\n");
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

