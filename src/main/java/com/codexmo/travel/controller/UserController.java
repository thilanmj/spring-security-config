package com.codexmo.travel.controller;

import com.codexmo.travel.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value="/User",description="Get User details",produces ="application/json")
public class UserController {

    @ApiOperation(value="get users")
    @ApiResponses(value={
            @ApiResponse(code=200,message="User Details Retrieved"),
            @ApiResponse(code=500,message="Internal Server Error"),
            @ApiResponse(code=404,message="User not found")
    })
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String custom() {
        return "custom";
    }
}
