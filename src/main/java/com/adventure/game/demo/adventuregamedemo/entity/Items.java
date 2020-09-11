package com.adventure.game.demo.adventuregamedemo.entity;

public enum ConnectionEnum {

EAST("1", "EAST"),
WEST("2", "WEST")
SOUTH("3", "SOUTH")
NORTH("4", "NORTH");

private final String directionId; // 1,2,3,4
private final String direction; // EAST, WEST,SOUTH, NORTH

private ConnectionEnum(String directionId, String direction){
	this.directionId = directionId;
	this.direction = direction;
}

public String getDirectionId(){
	return directionId;
}

}
