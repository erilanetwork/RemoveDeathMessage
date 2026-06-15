package com.erilanetwork.removeDeathMessage;

import net.kyori.adventure.text.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class EventListener implements Listener {

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e){
        e.deathMessage(Component.empty());
    }
}
