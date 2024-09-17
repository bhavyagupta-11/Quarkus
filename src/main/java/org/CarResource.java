package org;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

@Path("/cars")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CarResource {

    @Inject
    CarService carService;

    @GET
    public List<Car> listCars() {
        return carService.listCars();
    }

    @GET
    @Path("/{id}")
    public Response getCar(@PathParam("id") String id) {
        Car car = carService.findCarById(id);
        if (car == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.ok(car).build();
    }

    @POST
    @Transactional
    public Response createCar(Car car) {
        Car createdCar = carService.createCar(car);
        return Response.status(Response.Status.CREATED).entity(createdCar).build();
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public Response updateCar(@PathParam("id") String id, Car car) {
        Car updatedCar = carService.updateCar(id, car);
        if (updatedCar == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.ok(updatedCar).build();
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public Response deleteCar(@PathParam("id") String id) {
        boolean deleted = carService.deleteCar(id);
        if (!deleted) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.noContent().build();
    }
}
