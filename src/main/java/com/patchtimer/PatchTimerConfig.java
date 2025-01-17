package com.patchtimer;

import net.runelite.client.config.*;
import java.awt.*;

@ConfigGroup("patchtimer")
public interface PatchTimerConfig extends Config {
	@ConfigSection(
		name = "Timer Settings",
		description = "",
		position = 100
	)
	String timerSettings = "timersettings";

	@Alpha

	@ConfigItem(
			keyName = "backgroundSize",
			name = "Background Size",
			description = "How large the timer background should be",
			position = 0,
			section = timerSettings
	)
	default int getBackgroundSize() {
		return 16;
	}

	@ConfigItem(
			keyName = "backgroundColor",
			name = "Background Color",
			description = "The Color the timer background should be",
			position = 1,
			section = timerSettings
	)
	default Color getBackgroundColor() {
		return new Color(0,0,0,167);
	}

//	@ConfigItem(
//			position = 2,
//			keyName = "fontSize",
//			name = "Font size",
//			description = "Size of the font to use for XP drops. Only works with custom font.",
//			section = timerSettings
//	)
//	default int getFontSize() {
//		return 12;
//	}

	@ConfigItem(
			keyName = "textColor",
			name = "Text Color",
			description = "The color the timer text should be",
			position = 3,
			section = timerSettings
	)
	default Color getTextColor() {
		return new Color(255,255,255,255);
	}

	@ConfigItem(
			keyName = "tick_early_color",
			name = "Tick Early color",
			description = "The color being 1t early",
			position = 4,
			section = timerSettings
	)
	default Color getTick_early_color() {
		return new Color(255, 0, 0,255);
	}
	@ConfigItem(
			keyName = "tick_perfect_color",
			name = "Tick perfect color",
			description = "The color for being tick perfect chop on tree respawn",
			position = 5,
			section = timerSettings
	)
	default Color getTick_perfect_color() {
		return new Color(64, 255, 0,255);
	}
	@ConfigItem(
			keyName = "tick_late_color",
			name = "Late Tick Color",
			description = "The color for being 1 tick late to respawn",
			position = 6,
			section = timerSettings
	)
	default Color getTick_late_color() {
		return new Color(255, 239, 0,255);
	}
	@Alpha
	@ConfigItem(
			keyName = "assumeTick",
			name = "Assume Respawn tick",
			description = "If the timer should assume that the tree will respawn 1 tick sooner on single log roll",
			position = 101
	)
	default boolean getAssumeTick(){
		return false;
	}
}
