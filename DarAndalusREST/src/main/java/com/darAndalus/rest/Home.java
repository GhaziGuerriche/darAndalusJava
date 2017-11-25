package com.darAndalus.rest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


import java.util.ArrayList;
import org.apache.commons.collections.map.HashedMap;

/**
 *
 * @author ghazi.guerriche
 *
 */
@Path("/cmsdata")
public class Home {

    @GET
    @Path("/EtfResearchUrlById")
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response getEtfResearchUrlById(@QueryParam("etfresearchId") long id) {
        JSONObject jsonObject = new JSONObject();
        List<String> urls = new ArrayList<>();
        try {
            
            jsonObject.put("urls", jsonize(urls));
            jsonObject.put("status", "OK");

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
