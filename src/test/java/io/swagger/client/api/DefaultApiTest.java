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

package io.swagger.client.api;

import io.swagger.client.model.Student;
import io.swagger.client.model.Students;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    /**
     * 
     *
     * Operation to fetch all the students
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void studentGetTest() throws Exception {
        String studentname = null;
        Students response = api.studentGet(studentname);

        // TODO: test validations
    }
    /**
     * 
     *
     * Updates an existing students
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void studentPutTest() throws Exception {
        Student body = null;
        api.studentPut(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void studentfindGetTest() throws Exception {
        String find = null;
        Students response = api.studentfindGet(find);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void studentidDeleteTest() throws Exception {
        Integer id = null;
        Student response = api.studentidDelete(id);

        // TODO: test validations
    }
}
