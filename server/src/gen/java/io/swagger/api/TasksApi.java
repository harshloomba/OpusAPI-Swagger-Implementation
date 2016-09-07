package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.TasksApiService;
import io.swagger.api.factories.TasksApiServiceFactory;

import io.swagger.annotations.ApiParam;

import io.swagger.model.Error;
import io.swagger.model.NewTask;
import io.swagger.model.Task;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/tasks")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the tasks API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-21T09:22:23.594-07:00")
public class TasksApi  {
   private final TasksApiService delegate = TasksApiServiceFactory.getTasksApi();

    @GET
    @Path("/{taskId}/cancel")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "cancel the task", response = void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "task cancelled", response = void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "No task found", response = void.class) })
    public Response cancelTaskById(@ApiParam(value = "Cancel task",required=true) @PathParam("taskId") Long taskId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.cancelTaskById(taskId,securityContext);
    }
    @POST
    @Path("/categorization")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Created categorization task", response = NewTask.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "return task response on categorization", response = NewTask.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "No task found", response = NewTask.class, responseContainer = "List") })
    public Response createCategorizationTask(@ApiParam(value = "A plaintext string explaining the instructions for the task.",required=true) @QueryParam("instruction") String instruction
,@ApiParam(value = "Attachment",required=true) @QueryParam("attachment") String attachment
,@ApiParam(value = "categories assigned to attachment",required=true) @QueryParam("categories") List<String> categories
,@ApiParam(value = "A string of the URL that should be POSTed once the task is completed for the response data. See the Callback section for more details.",required=true) @QueryParam("callbackUrl") String callbackUrl
,@ApiParam(value = "Attachment type") @QueryParam("attachmentType") String attachmentType
,@ApiParam(value = "A string describing the urgency of the response. One of immediate, day, or week, where immediate is a 15-minute response time.") @QueryParam("urgency") String urgency
,@ApiParam(value = "The status of the task", allowableValues="pending, completed, cancelled") @QueryParam("status") String status
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createCategorizationTask(instruction,attachment,categories,callbackUrl,attachmentType,urgency,status,securityContext);
    }
    @POST
    @Path("/phonecall")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "schedule the phone call", response = NewTask.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "return task response on phone call scheduling", response = NewTask.class, responseContainer = "List") })
    public Response createPhoneCallTask(@ApiParam(value = "A string of the URL that should be POSTed once the task is completed for the response data. See the Callback section for more details.",required=true) @QueryParam("callbackUrl") String callbackUrl
,@ApiParam(value = "A plaintext string explaining the instructions for the task.",required=true) @QueryParam("instruction") String instruction
,@ApiParam(value = "Phone number",required=true) @QueryParam("phoneNumber") String phoneNumber
,@ApiParam(value = "Attachment type",required=true) @QueryParam("attachmentType") String attachmentType
,@ApiParam(value = "Attachment",required=true) @QueryParam("attachment") String attachment
,@ApiParam(value = "The name of the entity which corresponds to the person or business of the phone number",required=true) @QueryParam("entityName") String entityName
,@ApiParam(value = "An optional script to be shown the the worker as they make the phone call. You should use this if you've already optimized a script for phone calling.") @QueryParam("script") String script
,@ApiParam(value = "A string describing the urgency of the response. One of immediate, day, or week, where immediate is a 15-minute response time.") @QueryParam("urgency") String urgency
,@ApiParam(value = "A dictionary corresponding to the fields to be recorded. Keys are the keys you'd like the fields to be returned under, and values are descriptions to be shown to human workers") @QueryParam("fields") List<String> fields
,@Context SecurityContext securityContext)
    throws NotFoundException {

        return delegate.createPhoneCallTask(callbackUrl,instruction,phoneNumber,attachmentType,attachment,entityName,script,urgency,fields,securityContext);
    }
    @POST
    @Path("/transcription")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Created transcription Task", response = NewTask.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "task response on transcription", response = NewTask.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "No task found", response = NewTask.class, responseContainer = "List") })
    public Response createTranscriptionTask(@ApiParam(value = "A plaintext string explaining the instructions for the task.",required=true) @QueryParam("instruction") String instruction
,@ApiParam(value = "Attachment",required=true) @QueryParam("attachment") String attachment
,@ApiParam(value = "A string of the URL that should be POSTed once the task is completed for the response data. See the Callback section for more details.",required=true) @QueryParam("callbackUrl") String callbackUrl
,@ApiParam(value = "Attachment type") @QueryParam("attachmentType") String attachmentType
,@ApiParam(value = "A string describing the urgency of the response. One of immediate, day, or week, where immediate is a 15-minute response time.") @QueryParam("urgency") String urgency
,@ApiParam(value = "The status of the task", allowableValues="pending, completed, cancelled") @QueryParam("status") String status
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createTranscriptionTask(instruction,attachment,callbackUrl,attachmentType,urgency,status,securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Retrieve all tasks", response = Task.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "return tasks information", response = Task.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "No task found", response = Task.class, responseContainer = "List") })
    public Response getAllTasks(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAllTasks(securityContext);
    }
    @GET
    @Path("/{taskId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "Get a single task", response = Task.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "return specified task", response = Task.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "No task found", response = Task.class) })
    public Response getTaskById(@ApiParam(value = "return the requested task",required=true) @PathParam("taskId") Long taskId
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getTaskById(taskId,securityContext);
    }
}
