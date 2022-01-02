package j8designpatterns.command;

class ACAutomationRemote {
	Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void buttonPressed() {
		command.execute();
	}
}
