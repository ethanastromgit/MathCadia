/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.view;

import MathCadia.MathCadia;
import byui.cit260.mathcadia.control.EnemiesControl;
import byui.cit260.mathcadia.control.PlayerControl;
import byui.cit260.mathcadia.exceptions.PlayerControlException;
import byui.cit260.mathcadia.model.DirectionEnum;
import byui.cit260.mathcadia.model.Location;

/**
 *
 * @author ethan
 */
public class TravelView extends View {

    public TravelView() {
        super("\n Choose which direction you would like to travel"
                + " or use a potion:"
                + "\n N - North"
                + "\n S - South"
                + "\n E - East"
                + "\n W - West"
                + "\n"
                + "\n P - Use Potion"
                + "\n"
                + "\n Q - Return to Game Menu");
    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); //Convert choice to upper case

        switch (choice) {
            case "N":
                try {
                    this.moveNorth();
                } catch (PlayerControlException ex) {
                    ErrorView.display(this.getClass().getName(),
                            ex.getMessage());
                }
                break;
            case "S":
                try {
                    this.moveSouth();
                } catch (PlayerControlException ex) {
                    ErrorView.display(this.getClass().getName(),
                            ex.getMessage());
                }
                break;
            case "E":
                try {
                    this.moveEast();
                } catch (PlayerControlException ex) {
                    ErrorView.display(this.getClass().getName(),
                            ex.getMessage());
                }
                break;
            case "W":
                try {
                    this.moveWest();
                } catch (PlayerControlException ex) {
                    ErrorView.display(this.getClass().getName(),
                            ex.getMessage());
                }
                break;
            case "P":
                try {
                    PlayerControl.recoverHealth();
                    this.console.println("You used a potion.");
                } catch (PlayerControlException ex) {
                    ErrorView.display(this.getClass().getName(),
                            ex.getMessage());
                }
                break;
            case "Q":
                return true;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
    }

    private void moveNorth() throws PlayerControlException {

        try {
            PlayerControl.isMoveValid(DirectionEnum.NORTH);
        } catch (PlayerControlException pce) {
            ErrorView.display(this.getClass().getName(),
                    pce.getMessage());
            return;
        }

        PlayerControl.movePlayer(DirectionEnum.NORTH);

        boolean isPotionHere = false; 
        isPotionHere = PlayerControl.isPotionHere();
        if (isPotionHere = true) {
            this.console.println("You found a potion.");
        }

        boolean isLocationVisited = PlayerControl.isLocationVisited();
        if (isLocationVisited == false) {

            boolean isEnemyHere = EnemiesControl.isEnemyHere();

            if (isEnemyHere == true) {
                Location playerLocation = MathCadia.getCurrentGame().getGamePlayer().getPlayerLocation();
                Location bossLocation = MathCadia.getCurrentGame().getEnemies().getBossLocation();
                Location enemyOneLocation = MathCadia.getCurrentGame().getEnemies().getEnemyOneLocation();
                Location enemyTwoLocation = MathCadia.getCurrentGame().getEnemies().getEnemyTwoLocation();
                Location enemyThreeLocation = MathCadia.getCurrentGame().getEnemies().getEnemyThreeLocation();

                if (playerLocation.getLocColumn() == enemyOneLocation.getLocColumn() && playerLocation.getLocRow() == enemyOneLocation.getLocRow()) {
                    EnemyOneView eov = new EnemyOneView();
                    eov.display();
                } else if (playerLocation.getLocColumn() == enemyTwoLocation.getLocColumn() && playerLocation.getLocRow() == enemyTwoLocation.getLocRow()) {
                    EnemyTwoView etv = new EnemyTwoView();
                    etv.display();
                } else if (playerLocation.getLocColumn() == enemyThreeLocation.getLocColumn() && playerLocation.getLocRow() == enemyThreeLocation.getLocRow()) {
                    EnemyThreeView ethv = new EnemyThreeView();
                    ethv.display();
                } else if (playerLocation.getLocColumn() == bossLocation.getLocColumn() && playerLocation.getLocRow() == bossLocation.getLocRow()) {
                    BossView bv = new BossView();
                    bv.display();
                }
            }
        }
    }

    private void moveSouth() throws PlayerControlException {
         
        try {
            PlayerControl.isMoveValid(DirectionEnum.SOUTH);
        } catch (PlayerControlException pce) {
            ErrorView.display(this.getClass().getName(),
                    pce.getMessage());
            return;
        }

        PlayerControl.movePlayer(DirectionEnum.SOUTH);

         boolean isPotionHere = false; 
        isPotionHere = PlayerControl.isPotionHere();
        if (isPotionHere = true) {
            this.console.println("You found a potion.");
        }

        boolean isLocationVisited = PlayerControl.isLocationVisited();
        if (isLocationVisited == false) {

            boolean isEnemyHere = EnemiesControl.isEnemyHere();

            if (isEnemyHere == true) {
                Location playerLocation = MathCadia.getCurrentGame().getGamePlayer().getPlayerLocation();
                Location bossLocation = MathCadia.getCurrentGame().getEnemies().getBossLocation();
                Location enemyOneLocation = MathCadia.getCurrentGame().getEnemies().getEnemyOneLocation();
                Location enemyTwoLocation = MathCadia.getCurrentGame().getEnemies().getEnemyTwoLocation();
                Location enemyThreeLocation = MathCadia.getCurrentGame().getEnemies().getEnemyThreeLocation();

                if (playerLocation.getLocColumn() == enemyOneLocation.getLocColumn() && playerLocation.getLocRow() == enemyOneLocation.getLocRow()) {
                    EnemyOneView eov = new EnemyOneView();
                    eov.display();
                } else if (playerLocation.getLocColumn() == enemyTwoLocation.getLocColumn() && playerLocation.getLocRow() == enemyTwoLocation.getLocRow()) {
                    EnemyTwoView etv = new EnemyTwoView();
                    etv.display();
                } else if (playerLocation.getLocColumn() == enemyThreeLocation.getLocColumn() && playerLocation.getLocRow() == enemyThreeLocation.getLocRow()) {
                    EnemyThreeView ethv = new EnemyThreeView();
                    ethv.display();
                } else if (playerLocation.getLocColumn() == bossLocation.getLocColumn() && playerLocation.getLocRow() == bossLocation.getLocRow()) {
                    BossView bv = new BossView();
                    bv.display();
                }
            }
        }
    }

    private void moveEast() throws PlayerControlException {
        
        try {
            PlayerControl.isMoveValid(DirectionEnum.EAST);
        } catch (PlayerControlException pce) {
            ErrorView.display(this.getClass().getName(),
                    pce.getMessage());
            return;
        }

        PlayerControl.movePlayer(DirectionEnum.EAST);

         boolean isPotionHere = false; 
        isPotionHere = PlayerControl.isPotionHere();
        if (isPotionHere = true) {
            this.console.println("You found a potion.");
        }

        boolean isLocationVisited = PlayerControl.isLocationVisited();
        if (isLocationVisited == false) {

            boolean isEnemyHere = EnemiesControl.isEnemyHere();

            if (isEnemyHere == true) {
                Location playerLocation = MathCadia.getCurrentGame().getGamePlayer().getPlayerLocation();
                Location bossLocation = MathCadia.getCurrentGame().getEnemies().getBossLocation();
                Location enemyOneLocation = MathCadia.getCurrentGame().getEnemies().getEnemyOneLocation();
                Location enemyTwoLocation = MathCadia.getCurrentGame().getEnemies().getEnemyTwoLocation();
                Location enemyThreeLocation = MathCadia.getCurrentGame().getEnemies().getEnemyThreeLocation();

                if (playerLocation.getLocColumn() == enemyOneLocation.getLocColumn() && playerLocation.getLocRow() == enemyOneLocation.getLocRow()) {
                    EnemyOneView eov = new EnemyOneView();
                    eov.display();
                } else if (playerLocation.getLocColumn() == enemyTwoLocation.getLocColumn() && playerLocation.getLocRow() == enemyTwoLocation.getLocRow()) {
                    EnemyTwoView etv = new EnemyTwoView();
                    etv.display();
                } else if (playerLocation.getLocColumn() == enemyThreeLocation.getLocColumn() && playerLocation.getLocRow() == enemyThreeLocation.getLocRow()) {
                    EnemyThreeView ethv = new EnemyThreeView();
                    ethv.display();
                } else if (playerLocation.getLocColumn() == bossLocation.getLocColumn() && playerLocation.getLocRow() == bossLocation.getLocRow()) {
                    BossView bv = new BossView();
                    bv.display();
                }
            }
        }
    }

    private void moveWest() throws PlayerControlException {
        
        try {
            PlayerControl.isMoveValid(DirectionEnum.WEST);
        } catch (PlayerControlException pce) {
            ErrorView.display(this.getClass().getName(),
                    pce.getMessage());
            return;
        }

        PlayerControl.movePlayer(DirectionEnum.WEST);

         boolean isPotionHere = false; 
        isPotionHere = PlayerControl.isPotionHere();
        if (isPotionHere = true) {
            this.console.println("You found a potion.");
        }

        boolean isLocationVisited = PlayerControl.isLocationVisited();
        if (isLocationVisited == false) {

            boolean isEnemyHere = EnemiesControl.isEnemyHere();

            if (isEnemyHere == true) {
                Location playerLocation = MathCadia.getCurrentGame().getGamePlayer().getPlayerLocation();
                Location bossLocation = MathCadia.getCurrentGame().getEnemies().getBossLocation();
                Location enemyOneLocation = MathCadia.getCurrentGame().getEnemies().getEnemyOneLocation();
                Location enemyTwoLocation = MathCadia.getCurrentGame().getEnemies().getEnemyTwoLocation();
                Location enemyThreeLocation = MathCadia.getCurrentGame().getEnemies().getEnemyThreeLocation();

                if (playerLocation.getLocColumn() == enemyOneLocation.getLocColumn() && playerLocation.getLocRow() == enemyOneLocation.getLocRow()) {
                    EnemyOneView eov = new EnemyOneView();
                    eov.display();
                } else if (playerLocation.getLocColumn() == enemyTwoLocation.getLocColumn() && playerLocation.getLocRow() == enemyTwoLocation.getLocRow()) {
                    EnemyTwoView etv = new EnemyTwoView();
                    etv.display();
                } else if (playerLocation.getLocColumn() == enemyThreeLocation.getLocColumn() && playerLocation.getLocRow() == enemyThreeLocation.getLocRow()) {
                    EnemyThreeView ethv = new EnemyThreeView();
                    ethv.display();
                } else if (playerLocation.getLocColumn() == bossLocation.getLocColumn() && playerLocation.getLocRow() == bossLocation.getLocRow()) {
                    BossView bv = new BossView();
                    bv.display();
                }
            }
        }
    }

}
