/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.mathcadia.view;

import MathCadia.MathCadia;
import byui.cit260.mathcadia.control.EnemiesControl;
import byui.cit260.mathcadia.control.PlayerControl;
import byui.cit260.mathcadia.model.Inventory;
import byui.cit260.mathcadia.model.Player;
import byui.cit260.mathcadia.exceptions.PlayerControlException;
import byui.cit260.mathcadia.model.DirectionEnum;
import byui.cit260.mathcadia.model.Enemies;
import byui.cit260.mathcadia.model.Location;
import byui.cit260.mathcadia.model.Map;

/**
 *
 * @author ethan
 */
public class TravelView extends View {

    Map map = MathCadia.getCurrentGame().getGameMap();
    Player player = MathCadia.getCurrentGame().getGamePlayer();
    Inventory inv = MathCadia.getCurrentGame().getGamePlayer().getPlayerInventory();
    Enemies enemies = MathCadia.getCurrentGame().getEnemies();
    Location playerLocation = MathCadia.getCurrentGame().getGamePlayer().getPlayerLocation();
    Location bossLocation = enemies.getBossLocation();
    Location enemyOneLocation = enemies.getEnemyOneLocation();
    Location enemyTwoLocation = enemies.getEnemyTwoLocation();
    Location enemyThreeLocation = enemies.getEnemyThreeLocation();
    
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
                int potionAmt = inv.getPotionAmt();
                int healthPoints = player.getHealthPoints();

                try {
                    PlayerControl.recoverHealth(potionAmt, healthPoints);
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
        boolean moveValidity = false;
        boolean isPotionHere = false;
        boolean isEnemyHere = false;
        
        try {
            moveValidity = PlayerControl.isMoveValid(playerLocation, DirectionEnum.NORTH);
        } catch (PlayerControlException pce) {
            ErrorView.display(this.getClass().getName(),
                    pce.getMessage());
            return;
        }
        
        //Move Player if moveValidity is true
        if (moveValidity = true) {
            PlayerControl.movePlayer(playerLocation, DirectionEnum.NORTH);
            
            //Check if potion is here and add potion if true
            //Location location = MathCadia.getCurrentGame().getGameMap().getLocationAt(playerLocation.getLocColumn(), playerLocation.getLocRow());
            
            
            int potionAmt = inv.getPotionAmt();
            isPotionHere = PlayerControl.isPotionHere(map.getLocationAt(playerLocation.getLocColumn(), playerLocation.getLocRow()), potionAmt);

            if (isPotionHere == true) {
                if (inv.getPotionAmt() < inv.getMaxPotionAmt()) {
                    inv.setPotionAmt(potionAmt++);
                    map.getLocationAt(playerLocation.getLocColumn(), playerLocation.getLocRow()).setHasPotion(false);
                    this.console.println("You found a potion!");
                }
            }
            
            //Check if location has already been visited
            boolean isLocationVisited = false;
            isLocationVisited = PlayerControl.isLocationVisited();
            
            if (isLocationVisited == false) {
            
            //Check if enemy is here
                isEnemyHere = EnemiesControl.isEnemyHere(playerLocation, bossLocation, enemyOneLocation, enemyTwoLocation, enemyThreeLocation);

                if (isEnemyHere == true ) {
                    if (playerLocation.getLocColumn() == enemyOneLocation.getLocColumn() && playerLocation.getLocRow() == enemyOneLocation.getLocRow()) {
                        EnemyOneView eov = new EnemyOneView();
                        eov.display();
                    } else if (playerLocation.getLocColumn() == enemyTwoLocation.getLocColumn() && playerLocation.getLocRow() == enemyTwoLocation.getLocRow()) {
                        EnemyTwoView etv = new EnemyTwoView();
                        etv.display();
                    } else if (playerLocation.getLocColumn() == enemyThreeLocation.getLocColumn() && playerLocation.getLocRow() == enemyThreeLocation.getLocRow()) {
                        EnemyThreeView ethv = new EnemyThreeView();
                        ethv.display();
                    } else if (playerLocation.getLocColumn() == bossLocation.getLocColumn() && playerLocation.getLocRow() ==bossLocation.getLocRow()) {
                        BossView bv = new BossView();
                        bv.display();
                    }
                }
            }
            MathCadia.getCurrentGame().getGameMap().getLocationAt(playerLocation.getLocRow(), playerLocation.getLocColumn()).setLocationVisited(true);
        }
    }
    
    private void moveSouth() throws PlayerControlException {
        boolean moveValidity = false;
        boolean isPotionHere = false;
        boolean isEnemyHere = false;
        
        try {
            moveValidity = PlayerControl.isMoveValid(playerLocation, DirectionEnum.SOUTH);
        } catch (PlayerControlException pce) {
            ErrorView.display(this.getClass().getName(),
                    pce.getMessage());
            return;
        }
        
        //Move Player if moveValidity is true
        if (moveValidity = true) {
            PlayerControl.movePlayer(playerLocation, DirectionEnum.SOUTH);
            
            //Check if potion is here and add potion if true
            Location location = MathCadia.getCurrentGame().getGameMap().getLocationAt(playerLocation.getLocColumn(), playerLocation.getLocRow());

            int potionAmt = inv.getPotionAmt();
            isPotionHere = PlayerControl.isPotionHere(location, potionAmt);

            if (isPotionHere == true) {
                if (inv.getPotionAmt() < inv.getMaxPotionAmt()) {
                    inv.setPotionAmt(potionAmt++);
                    location.setHasPotion(false);
                    this.console.println("You found a potion!");
                }
            }
            
            //Check if enemy is here
            isEnemyHere = EnemiesControl.isEnemyHere(playerLocation, bossLocation, enemyOneLocation, enemyTwoLocation, enemyThreeLocation);
            
            if (isEnemyHere == true ) {
                if (playerLocation.getLocColumn() == enemyOneLocation.getLocColumn() && playerLocation.getLocRow() == enemyOneLocation.getLocRow()) {
                    EnemyOneView eov = new EnemyOneView();
                    eov.display();
                } else if (playerLocation.getLocColumn() == enemyTwoLocation.getLocColumn() && playerLocation.getLocRow() == enemyTwoLocation.getLocRow()) {
                    EnemyTwoView etv = new EnemyTwoView();
                    etv.display();
                } else if (playerLocation.getLocColumn() == enemyThreeLocation.getLocColumn() && playerLocation.getLocRow() == enemyThreeLocation.getLocRow()) {
                    EnemyThreeView ethv = new EnemyThreeView();
                    ethv.display();
                } else if (playerLocation.getLocColumn() == bossLocation.getLocColumn() && playerLocation.getLocRow() ==bossLocation.getLocRow()) {
                    BossView bv = new BossView();
                    bv.display();
                }
            }
            
         }
    }
    
    private void moveEast() throws PlayerControlException {
        boolean moveValidity = false;
        boolean isPotionHere = false;
        boolean isEnemyHere = false;
        
        try {
            moveValidity = PlayerControl.isMoveValid(playerLocation, DirectionEnum.EAST);
        } catch (PlayerControlException pce) {
            ErrorView.display(this.getClass().getName(),
                    pce.getMessage());
            return;
        }
        
        //Move Player if moveValidity is true
        if (moveValidity = true) {
            PlayerControl.movePlayer(playerLocation, DirectionEnum.EAST);
            
            //Check if potion is here and add potion if true
            Location location = MathCadia.getCurrentGame().getGameMap().getLocationAt(playerLocation.getLocColumn(), playerLocation.getLocRow());

            int potionAmt = inv.getPotionAmt();
            isPotionHere = PlayerControl.isPotionHere(location, potionAmt);

            if (isPotionHere == true) {
                if (inv.getPotionAmt() < inv.getMaxPotionAmt()) {
                    inv.setPotionAmt(potionAmt++);
                    location.setHasPotion(false);
                    this.console.println("You found a potion!");
                }
            }
            
            //Check if enemy is here
            isEnemyHere = EnemiesControl.isEnemyHere(playerLocation, bossLocation, enemyOneLocation, enemyTwoLocation, enemyThreeLocation);
            
            if (isEnemyHere == true ) {
                if (playerLocation.getLocColumn() == enemyOneLocation.getLocColumn() && playerLocation.getLocRow() == enemyOneLocation.getLocRow()) {
                    EnemyOneView eov = new EnemyOneView();
                    eov.display();
                } else if (playerLocation.getLocColumn() == enemyTwoLocation.getLocColumn() && playerLocation.getLocRow() == enemyTwoLocation.getLocRow()) {
                    EnemyTwoView etv = new EnemyTwoView();
                    etv.display();
                } else if (playerLocation.getLocColumn() == enemyThreeLocation.getLocColumn() && playerLocation.getLocRow() == enemyThreeLocation.getLocRow()) {
                    EnemyThreeView ethv = new EnemyThreeView();
                    ethv.display();
                } else if (playerLocation.getLocColumn() == bossLocation.getLocColumn() && playerLocation.getLocRow() ==bossLocation.getLocRow()) {
                    BossView bv = new BossView();
                    bv.display();
                }
            }
            
         }
    }
    
    private void moveWest() throws PlayerControlException {
        boolean moveValidity = false;
        boolean isPotionHere = false;
        boolean isEnemyHere = false;
        
        try {
            moveValidity = PlayerControl.isMoveValid(playerLocation, DirectionEnum.WEST);
        } catch (PlayerControlException pce) {
            ErrorView.display(this.getClass().getName(),
                    pce.getMessage());
            return;
        }
        
        //Move Player if moveValidity is true
        if (moveValidity = true) {
            PlayerControl.movePlayer(playerLocation, DirectionEnum.WEST);
            
            //Check if potion is here and add potion if true
            Location location = MathCadia.getCurrentGame().getGameMap().getLocationAt(playerLocation.getLocColumn(), playerLocation.getLocRow());

            int potionAmt = inv.getPotionAmt();
            isPotionHere = PlayerControl.isPotionHere(location, potionAmt);

            if (isPotionHere == true) {
                if (inv.getPotionAmt() < inv.getMaxPotionAmt()) {
                    inv.setPotionAmt(potionAmt++);
                    location.setHasPotion(false);
                    this.console.println("You found a potion!");
                }
            }
            
            //Check if enemy is here
            isEnemyHere = EnemiesControl.isEnemyHere(playerLocation, bossLocation, enemyOneLocation, enemyTwoLocation, enemyThreeLocation);
            
            if (isEnemyHere == true ) {
                if (playerLocation.getLocColumn() == enemyOneLocation.getLocColumn() && playerLocation.getLocRow() == enemyOneLocation.getLocRow()) {
                    EnemyOneView eov = new EnemyOneView();
                    eov.display();
                } else if (playerLocation.getLocColumn() == enemyTwoLocation.getLocColumn() && playerLocation.getLocRow() == enemyTwoLocation.getLocRow()) {
                    EnemyTwoView etv = new EnemyTwoView();
                    etv.display();
                } else if (playerLocation.getLocColumn() == enemyThreeLocation.getLocColumn() && playerLocation.getLocRow() == enemyThreeLocation.getLocRow()) {
                    EnemyThreeView ethv = new EnemyThreeView();
                    ethv.display();
                } else if (playerLocation.getLocColumn() == bossLocation.getLocColumn() && playerLocation.getLocRow() ==bossLocation.getLocRow()) {
                    BossView bv = new BossView();
                    bv.display();
                }
            }
            
         }
    }
    
}
