package io.swagger.api.factories;

import io.swagger.api.TasksApiService;
import io.swagger.api.impl.TasksApiServiceImpl;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-08-21T09:22:23.594-07:00")
public class TasksApiServiceFactory {
    private final static TasksApiService service = new TasksApiServiceImpl();

    public static TasksApiService getTasksApi() {
        return service;
    }
}
