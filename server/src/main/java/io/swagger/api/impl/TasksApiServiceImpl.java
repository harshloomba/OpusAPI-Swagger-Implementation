package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.Error;
import io.swagger.model.NewTask;
import io.swagger.model.Task;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-21T09:22:23.594-07:00")
public class TasksApiServiceImpl extends TasksApiService {
    @Override
    public Response cancelTaskById(Long taskId, SecurityContext securityContext) throws NotFoundException {
        String responseMessage="";
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, responseMessage)).build();

    }
    @Override
    public Response createCategorizationTask(String instruction, String attachment, List<String> categories, String callbackUrl, String attachmentType, String urgency, String status, SecurityContext securityContext) throws NotFoundException {
        String responseMessage="";

        /*Accounting and Expenses
        Content Moderation
        Copyright Detection
        Document Processing
        Marketing Data
        Organize files
        Organize images
        Organize text
        Product Categorization
        Sales Data
        Spam Detection
        Timesheet Data*/

        //Task Meta Data will be added into the task database
        //Company on our panel information will be in the company database
        //Based on urgency task will be routed to the right company by judging if that company already has many tasks or not
        //companyID and Queue of tasksIDs will be created as a datastruture and dequeue and enqueue will be done based on taks completion
        //Task will be routed to the company which works in that area
        //Now asynch call will be made to the particular server, for now it be our localhost.
        //Once company worker will update the task by putting it in the json format file on particular path
        //Our async callback will be back with the response, it will be forwarded to client with the response and update our database

        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, responseMessage)).build();
    }
    @Override
    public Response createPhoneCallTask(String callbackUrl, String instruction, String phoneNumber, String attachmentType, String attachment, String entityName, String script, String urgency, List<String> fields, SecurityContext securityContext) throws NotFoundException {
        String responseMessage="{\n" +
                "  \"created_at\": \"2016-06-27T23:53:10.367Z\",\n" +
                "  \"callback_url\": \"http://www.example.com/test_callback\",\n" +
                "  \"type\": \"phonecall\",\n" +
                "  \"status\": \"pending\",\n" +
                "  \"instruction\": \"Call this man and tell me his email.\",\n" +
                "  \"urgency\": \"day\",\n" +
                "  \"params\": {\n" +
                "    \"fields\": {\n" +
                "      \"email\": \"Email Address\"\n" +
                "    },\n" +
                "    \"entity_name\": \"Alexandr Wang\",\n" +
                "    \"phone_number\": \"5055006865\"\n" +
                "  },\n" +
                "  \"task_id\": \"5771bc6631b72659f0d3692b\"\n" +
                "}";
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, responseMessage )).build();
    }
    @Override
    public Response createTranscriptionTask(String instruction, String attachment, String callbackUrl, String attachmentType, String urgency, String status, SecurityContext securityContext) throws NotFoundException {
        String responseMessage="{\n" +
                "  \"created_at\": \"2016-06-25T02:18:04.248Z\",\n" +
                "  \"callback_url\": \"http://www.example.com/test_callback\",\n" +
                "  \"type\": \"transcription\",\n" +
                "  \"status\": \"pending\",\n" +
                "  \"instruction\": \"Transcribe the given fields. Then for each news item on the page, transcribe the information for the row.\",\n" +
                "  \"urgency\": \"day\",\n" +
                "  \"params\": {\n" +
                "    \"row_fields\": {\n" +
                "      \"username\": \"Username of submitter\",\n" +
                "      \"comment_count\": \"Number of comments\"\n" +
                "    },\n" +
                "    \"fields\": {\n" +
                "      \"title\": \"Title of Webpage\",\n" +
                "      \"top_result\": \"Title of the top result\"\n" +
                "    },\n" +
                "    \"attachment\": \"http://www.reddit.com/\",\n" +
                "    \"attachment_type\": \"website\"\n" +
                "  },\n" +
                "  \"task_id\": \"576de9dc1ea5f917d56fc2a0\"\n" +
                "}";
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, responseMessage)).build();
    }
    @Override
    public Response getAllTasks(SecurityContext securityContext) throws NotFoundException {
        //have to setup the process
        String responseMessage="";
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, responseMessage)).build();
    }
    @Override
    public Response getTaskById(Long taskId, SecurityContext securityContext) throws NotFoundException {
        //have to setup the process
        String responseMessage="";
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, responseMessage)).build();
    }
}
