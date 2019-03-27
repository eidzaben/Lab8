 class Driver{
    public static void main(String[] args)
    {
        //Initialization of variables
        BoardGame game = new BoardGame();
        String eid = "Eid Zaben";
        String bob = "Bob";
        String erika = "Erika";
        String moe = "Moe";
        
        //Adding players to the game
        game.addPlayer(moe, GamePiece.RED_RACER, Location.BILLIARD_ROOM);
        game.addPlayer(bob, GamePiece.BLUE_RACER, Location.LOUNGE);
        game.addPlayer(eid,GamePiece.RED_THIMBLE, Location.STUDY);
        game.addPlayer(erika, GamePiece.BLUE_BOOT, Location.KITCHEN);

        //Initial set of players
        String pageOutput = "Players List:\n";
        for (String plyr : game.getPlayers()) {
        pageOutput += plyr + "\n";
        }

        //Each players piece
        String playerPieces = "Player Pieces: ";
        for (String pp : game.getPlayers()) {
            GamePiece a = game.getPlayerGamePiece(pp);
            playerPieces += "" +pp+ " has piece: " + a + "\n";
        }
        
        //Each players location
        String playerLocations = "Player Locations: ";
        for (String pl : game.getPlayers()){
            Location l = game.getPlayersLocation(pl);
            playerLocations += "" + pl + " is at location: " + l.toString().toLowerCase() + "\n";
        }

        /*
         * Four moves in order depending on priority
         */
        String firstMove = "Moe gets to move first due to priority ";
        firstMove +="" + "He moved from " + game.getPlayersLocation(moe).toString().toLowerCase() + " to ";
        game.movePlayer(moe,Location.HALL);
        firstMove += game.getPlayersLocation(moe).toString().toLowerCase() + "";

        String secondMove = "Bob gets to move second due to priority ";
        secondMove +="" + "He moved from " + game.getPlayersLocation(bob).toString().toLowerCase() + " to ";
        game.movePlayer(bob,Location.LIBRARY);
        secondMove += game.getPlayersLocation(bob).toString().toLowerCase() + "";

        String thirdMove = "Erika gets to move third due to priority ";
        thirdMove +="" + "She moved from " + game.getPlayersLocation(erika).toString().toLowerCase() + " to ";
        game.movePlayer(erika,Location.BILLIARD_ROOM);
        thirdMove += game.getPlayersLocation(erika).toString().toLowerCase() + "";

        String fourthMove = "Eid Zaben has to move last due to priority ";
        fourthMove +="" + "He moved from " + game.getPlayersLocation(eid).toString().toLowerCase() + " to ";
        game.movePlayer(eid,Location.LOUNGE);
        fourthMove += game.getPlayersLocation(eid).toString().toLowerCase() + "\n";

        //Locations after players moved
        String updatedLocations = "The updated player locations are: \n";
        for (String ul : game.getPlayers()) {
            Location newL = game.getPlayersLocation(ul);
            updatedLocations += "" + ul + " is now at location: " + newL.toString().toLowerCase() + "\n";
        }

        //Situation if two players try to move at the same time
        String ohNo = "Oh no Erika and Moe want to move at the same time! We need to use the moveTwoPlayers method to solve this. ";
        String[] twoNames = {"Moe", "Erika"};
        Location[] twoLocations = {Location.LIBRARY, Location.LOUNGE};
        String[] order = game.moveTwoPlayers(twoNames, twoLocations);
        game.movePlayer(moe,Location.LIBRARY);
        game.movePlayer(erika,Location.LOUNGE);
        String solution = "\nDue to priority, " + order[0] + " moves first, and " + order[1] + " moves next";
        String newLocs = "Moe is moving to " + twoLocations[0].toString().toLowerCase() + " and Erika is moving to " + twoLocations[1].toString().toLowerCase() + "";

        //Final location of players
        String finalLocations = "The Final locations of the players are:\n";
        for (String ul : game.getPlayers()) {
            Location newL = game.getPlayersLocation(ul);
            finalLocations += "" + ul + " is now at location: " + newL.toString().toLowerCase() + "";
        }

        //Printing everything out
        System.out.println(pageOutput);
        System.out.println(playerPieces);
        System.out.println(playerLocations);
        System.out.println(firstMove);
        System.out.println(secondMove);
        System.out.println(thirdMove);
        System.out.println(fourthMove);
        System.out.println(updatedLocations);
        System.out.println(ohNo);
        System.out.println(solution);
        System.out.println(newLocs);
        System.out.println(finalLocations);





    }
    
}




