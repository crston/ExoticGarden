package English;

import me.mrCookieSlime.CSCoreLibPlugin.CSCoreLib;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu.MenuClickHandler;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu.MenuCloseHandler;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.plugin.java.JavaPlugin;
import org.inventivetalent.menubuilder.MenuBuilder;
import org.inventivetalent.menubuilder.ValueListener;
import org.inventivetalent.menubuilder.chat.ChatMenuBuilder;
import org.inventivetalent.menubuilder.chat.LineBuilder;
import org.inventivetalent.menubuilder.chat.component.MenuComponentCheckbox;

import java.util.UUID;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;

import java.util.*;
import org.bukkit.command.*;
import org.bukkit.event.*;
import org.bukkit.configuration.file.FileConfiguration;

public class Language {
    private static final PlayerJoinEvent event = null;
	Player player = event.getPlayer();
    String uuid = player.getUniqueId().toString();
    String language = AdvancedMultiLanguage.getLanguageOfUuid(uuid);
    
    new InventoryMenuBuilder().withSize(9).withTitle("Select your Language").withItem(1, new ItemStack(Material.STONE), new ItemListener() {
    public void onInteract(Player player, ClickType action, ItemStack item) {
    	if(language.equalsIgnoreCase("EN"));
    }
    }, ClickType.LEFT).show(player);