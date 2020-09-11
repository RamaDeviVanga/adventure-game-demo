com.adventure.game.demo.adventuregamedemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import io.swagger.annotations.*;

/**
 * This contoller will expose the API method to play the Adventure Game once after all the Game setup configuration completed by the admin
 */
@RestController
@RequestMapping(path = "/adventure-game/play" produces = "application/json")
public class AdventureGameController {
	
	@ApiOperation(Value = "Simulate the Adventure Game ", nickname = "Create a simulator for Adventure Game")
	@ApiResponses(value = {@ApiResponse(code = 202, message = "Successfully completed the game"),
			ApiResponse (code = 400, message = "Bad Request"), @ApiResponse(code = 404 , message = "Not Found",)
			ApiResponse (code = 500, message "Internal Server Error")})
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Result playGame(@RequestBody TestGameRequest testGameRequest){
		    
	}

}