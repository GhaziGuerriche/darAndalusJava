package com.darAndalus.rest;

import com.dar.andalus.Image;
import com.dar.andalusDAO.ImageRepository;
import com.dar.andalusService.ApplicationContextLoader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.util.ArrayList;

/**
 *
 * @author ghazi.guerriche
 *
 */
@Path("home")
public class Home {

    ApplicationContextLoader ctx = new ApplicationContextLoader();

    @GET
    @Path("/AllSlider")
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response getAllSlider(@QueryParam("etfresearchId") long id) {
        JSONObject jsonObject = new JSONObject();
        List<String> urls = new ArrayList<>();
        ImageRepository imageRepository;
        imageRepository = (ImageRepository) ctx.getCtx().getBean(ImageRepository.class);
        Iterable<Image> images = imageRepository.findAll();
        try {

            jsonObject.put("status", "OK");
            jsonObject.put("images", images);

        } catch (Exception e) {
            e.printStackTrace();
            jsonObject.put("status", "KO");
            jsonObject.put("Name", "NewsUrlById");
            jsonObject.put("Cause", e.getMessage());
            return Response.ok(jsonObject.toJSONString(), MediaType.APPLICATION_JSON).build();
        }
        return Response.ok(jsonObject.toJSONString(), MediaType.APPLICATION_JSON).build();
    }

}
