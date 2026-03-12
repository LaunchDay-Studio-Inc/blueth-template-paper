package online.blueth.template;

import org.bukkit.plugin.java.JavaPlugin;

public class BluethPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Blueth plugin enabled.");
    }

    @Override
    public void onDisable() {
        getLogger().info("Blueth plugin disabled.");
    }
}
