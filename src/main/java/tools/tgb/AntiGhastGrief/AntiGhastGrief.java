package tools.tgb.AntiGhastGrief;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Fireball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.entity.ExplosionPrimeEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class AntiGhastGrief extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getLogger().info("Anti Ghast Grief Enabled!");
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        getLogger().info("Anti Ghast Grief Disabled!");
    }

    @EventHandler
    public void onEntityExplode(EntityExplodeEvent event) {
        if(event.getEntityType() == EntityType.FIREBALL) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onExplosionPrime(ExplosionPrimeEvent event) {
        if(event.getEntityType() == EntityType.FIREBALL) {
            event.setFire(false);
        }
    }
}
