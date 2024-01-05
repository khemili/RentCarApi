package com.dev.api.rentcarapi.web;

import com.dev.api.rentcarapi.model.Car;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@Tag(name = "cars")
public interface CarEndpoints {

    @Operation(summary = "Get all cars", description = "Récupérer la liste de toutes les voitures")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation. Returns a list of cars.", content = @Content(schema = @Schema(implementation = Car.class))),
            @ApiResponse(responseCode = "404", description = "cars not found."),
            @ApiResponse(responseCode = "500", description = "Internal server error.")
    })
    public List<Car> getAllCar();
}