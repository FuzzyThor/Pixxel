package io.pixxel.command;

public interface CommandExecutor {
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args);
}
