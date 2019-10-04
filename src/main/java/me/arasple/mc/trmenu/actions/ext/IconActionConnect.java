package me.arasple.mc.trmenu.actions.ext;

import me.arasple.mc.trmenu.actions.BaseAction;
import me.arasple.mc.trmenu.utils.Bungees;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;

/**
 * @author Arasple
 * @date 2019/10/4 18:24
 */
public class IconActionConnect extends BaseAction {

    public IconActionConnect(String command) {
        super(command);
    }

    @Override
    public void onExecute(Player player, InventoryClickEvent e, String... args) {
        Bungees.connect(player, getCommand());
    }

}