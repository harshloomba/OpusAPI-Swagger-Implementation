package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Error;
import io.swagger.model.NewTask;
import io.swagger.model.Task;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-21T09:22:23.594-07:00")
public abstract class TasksApiService {
    public abstract Response cancelTaskById(Long taskId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createCategorizationTask(String instruction,String attachment,List<String> categories,String callbackUrl,String attachmentType,String urgency,String status,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createPhoneCallTask(String callbackUrl,String instruction,String phoneNumber,String attachmentType,String attachment,String entityName,String script,String urgency,List<String> fields,SecurityContext securityContext) throws NotFoundException;
    public abstract Response createTranscriptionTask(String instruction,String attachment,String callbackUrl,String attachmentType,String urgency,String status,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getAllTasks(SecurityContext securityContext) throws NotFoundException;
    public abstract Response getTaskById(Long taskId,SecurityContext securityContext) throws NotFoundException;
}
