package io.shadowrealm.command;

import com.volmit.phantom.plugin.PhantomCommand;
import com.volmit.phantom.plugin.PhantomSender;
import com.volmit.phantom.world.WorldEditor;

import io.shadowrealm.Shade;
import io.shadowrealm.shade.map.ActiveMap;

public class CommandMapTest extends PhantomCommand
{
	public CommandMapTest()
	{
		super("test", "rift");
		requiresPermission(Shade.perm.map.test);
	}

	@Override
	public boolean handle(PhantomSender sender, String[] args)
	{
		if(!WorldEditor.hasSelection(sender.player()))
		{
			sender.sendMessage("Make a World Edit Selection of the map.");
			return true;
		}

		sender.sendMessage("Testing Map");
		new ActiveMap(true, sender.player());
		return true;
	}
}
