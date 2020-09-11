package com.adventure.game.demo.adventuregamedemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import io.swagger.annotations.*;

/**
 * This contoller will expose the API methods to setup/configure/customize the Adventure Game for the end user based on their requirements.
 * Admin will help the end user to set up the game as they requestd.
 */
@RestController
@RequestMapping(path = "/adventure-game/setUp" produces = "application/json")
public class AdventureGameSetUpController {
	
	
	public Result createRooms(@RequestBody TestGameRequest testGameRequest){
		/**
		 * Write a logc to create the number of rooms that are required for the game
		 */
        
	}
	
	public Result setItems(@RequestBody TestGameRequest testGameRequest){
		/**
		 * Write a logic to set the number of items as per the user request
		 */
	}
	
	public Result setDirections(@RequestBody TestGameRequest testGameRequest){
		/**
		 * Write a logic to set the directions for the player to traverse from Room to room and define the rules to go back and forth
		 */
	}

}