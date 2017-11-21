/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dar.andalusService;

import com.dar.andalus.Menu;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author ghazi.guerriche
 */
public interface MenuRepository extends CrudRepository<Menu, Long>{
    
}
