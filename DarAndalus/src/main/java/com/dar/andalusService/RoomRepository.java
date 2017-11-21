/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dar.andalusService;

import com.dar.andalus.Room;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author ghazi.guerriche
 */
public interface RoomRepository extends CrudRepository<Room, Long>{
    
}
