package com.jeantravassos.rest.webservice.objectivesssservice.beans;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class HelloWorldBean {

    public final @NonNull String message;

}
