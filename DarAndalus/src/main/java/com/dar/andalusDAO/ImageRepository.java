/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dar.andalusDAO;

import com.dar.andalus.Image;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author ghazi.guerriche
 */
@RepositoryRestResource(collectionResourceRel = "image", path = "image")
public interface ImageRepository extends CrudRepository<Image, Long>{
    
}
