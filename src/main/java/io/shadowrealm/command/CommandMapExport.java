package io.shadowrealm.command;

import com.volmit.phantom.plugin.PhantomCommand;
import com.volmit.phantom.plugin.PhantomSender;
import com.volmit.phantom.world.WorldEditor;

import io.shadowrealm.Shade;

public class CommandMapExport extends PhantomCommand
{
	public CommandMapExport()
	{
		super("export", "save");
		requiresPermission(Shade.perm.map.export);
	}

	@Override
	public boolean handle(PhantomSender sender, String[] args)
	{
		if(!WorldEditor.hasSelection(sender.player()))
		{
			sender.sendMessage("Make a World Edit Selection of the map.");
			return true;
		}

		if(args.length != 1)
		{
			sender.sendMessage("/map export <name>");
			return true;
		}

		return true;
	}
}
