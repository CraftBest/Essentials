package com.earth2me.essentials;

import java.util.Arrays;
import org.bukkit.inventory.meta.ItemMeta;

public class Favoriting
{
	public static ItemMeta applyLore(CommandSource source, ItemMeta item)
	{
		item.setLore(Arrays.asList(I18n.tl("applyFavoriting", source.getSender().getName())));
		return item;
	}
}
