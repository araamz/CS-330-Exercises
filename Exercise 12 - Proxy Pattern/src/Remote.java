public class Remote implements IRemote {
	
	private int channel;
	private int volume;
	
	public Remote() {
		
		this.channel = 1;
		this.volume = 0;
		
	}

	public void volume_up() {
	
		if (this.volume >= 0 && this.volume < 100) {
			
			this.volume = this.volume + 1;
			
		}
		
	}

	public void volume_down() {
		
		if (this.volume > 0 && this.volume <= 100) {
			
			this.volume = this.volume - 1;
			
		}
		
	}
	
	public int get_volume() {
		
		return this.volume;
		
	}

	public void channel_up() {

		if (this.channel >= 1) {
			
			this.channel = this.channel + 1;
			
		}
		
	}

	public void channel_down() {
		
		if (this.channel > 1) {
			
			this.channel = this.channel - 1;
			
		}
		
	}
	
	public int get_channel() {
		
		return this.channel;
		
	}

}
