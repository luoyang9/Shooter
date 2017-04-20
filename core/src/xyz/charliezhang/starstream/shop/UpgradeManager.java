package xyz.charliezhang.starstream.shop;

import com.badlogic.gdx.utils.Array;
import xyz.charliezhang.starstream.GameData;

/**
 * Created by Charlie Zhang on 4/19/2017.
 */
public class UpgradeManager {

    public static String[] UpgradeTypes = {
            "health" ,
            "damage"
    };

    public static int[] UpgradeMax = {
            10,
            5
    };

    public static long getUpgradeCost(Upgrade u) {
        int v = u.getValue();
        if(u.getName().equals("health")) {
            return v * 50;
        } else if(u.getName().equals("damage")) {
            return v * 100;
        }
        System.out.println("Unknown upgrade was encountered: " + u.getName());
        return 0;
    }

    public static Array<Upgrade> getPlayerUpgrades() {
        Array<Upgrade> upgrades = new Array<Upgrade>();
        for(String u : UpgradeTypes) {
            if(GameData.prefs.contains(u)) {
                upgrades.add(new Upgrade(u, GameData.prefs.getInteger(u)));
            }
        }
        return upgrades;
    }

    public static Array<Upgrade> getAllUpgrades() {
        Array<Upgrade> upgrades = new Array<Upgrade>();
        for(String u : UpgradeTypes) {
            if(GameData.prefs.contains(u)) {
                upgrades.add(new Upgrade(u, GameData.prefs.getInteger(u)));
            } else {
                upgrades.add(new Upgrade(u));
            }
        }
        return upgrades;
    }
}