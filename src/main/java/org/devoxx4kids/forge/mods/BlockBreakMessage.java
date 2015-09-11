package org.devoxx4kids.forge.mods;

import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BlockBreakMessage {
	
	private boolean classValue = false;
	
	@SubscribeEvent
	public void sendMessage(BreakEvent event)
	{
		event.getPlayer().
		addChatComponentMessage(new ChatComponentText(EnumChatFormatting.GOLD + getMessage(classValue)));
		
		if(classValue = true)
			classValue = false;
		else
			classValue = true;
	}
	
	private String getMessage(boolean value)
	{
		if (value)
			return "U eat poop!!!";
		else 
			return "U drink pee!!!";
	}
	

}
