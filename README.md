# adventure-game-demo
Acceptance Criteria

Part 1:
----------------------
Setup the Adventure game as per admin requirements.
(Admin selects the game based on players age and other preferences)


Part 2:
-------------------
Play the Adventure game 
Request: sending json object with rooms, items and directions.
Response:sucess or failure.

Success case:if the player follow the directions to pick up the items from  the  each rooms and then navigate to other rooms and then drop it at the end.Then the player id adds to "winner Id". 

Failure case scenarios: 
1.If the player missed to follow directions
2. items not found in the rooms(Item missing)
