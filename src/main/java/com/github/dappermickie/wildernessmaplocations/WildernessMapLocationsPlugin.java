package com.github.dappermickie.wildernessmaplocations;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;

@Slf4j
@PluginDescriptor(
	name = "Wilderness Map Locations"
)
public class WildernessMapLocationsPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private WildernessMapLocationsConfig config;

	@Inject
	private OverlayManager overlayManager;

	@Inject
	private WorldMapLocationsOverlay worldMapLocationsOverlay;

	@Inject
	private ClosestLocationOverlay closestLocationOverlay;

	@Override
	protected void startUp() throws Exception
	{
		overlayManager.add(worldMapLocationsOverlay);
		overlayManager.add(closestLocationOverlay);
	}

	@Override
	protected void shutDown() throws Exception
	{
		overlayManager.remove(worldMapLocationsOverlay);
		overlayManager.remove(closestLocationOverlay);
	}

	@Provides
	WildernessMapLocationsConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(WildernessMapLocationsConfig.class);
	}


	public static WildernessMapPoint[] getMapPoints() {
		return new WildernessMapPoint[] {
			new WildernessMapPoint("Rev Cave", new WorldPoint(3122, 3838, 0)), // REV CAVE
			new WildernessMapPoint("35 Port", new WorldPoint(3098, 3789, 0)), // 35 PORT
			new WildernessMapPoint("27 Port", new WorldPoint(3035, 3724, 0)), // 27 PORT
			new WildernessMapPoint("Bandit Camp", new WorldPoint(3037, 3698, 0)), // BANDIT CAMP
			new WildernessMapPoint("Cemetery", new WorldPoint(2975, 3749, 0)), // CEMETERY
			new WildernessMapPoint("Chaos Altar", new WorldPoint(2965, 3820, 0)), // CHAOS ALTAR
			new WildernessMapPoint("44 Port", new WorldPoint(2980, 3859, 0)), // 44 PORT
			new WildernessMapPoint("Rune Rock", new WorldPoint(3055, 3889, 0)), // RUNE ROCK
			new WildernessMapPoint("Spider Hill", new WorldPoint(3168, 3884, 0)), // SPIDER HILL
			new WildernessMapPoint("Lavas", new WorldPoint(3202, 3832, 0)), // LAVAS
			new WildernessMapPoint("50 Port", new WorldPoint(3307, 3920, 0)), // 50 PORT
			new WildernessMapPoint("New Gate", new WorldPoint(3336, 3900, 0)), // NEW GATE
			new WildernessMapPoint("Glory Hill", new WorldPoint(3340, 3875, 0)), // GLORY HILL
			new WildernessMapPoint("GDZ", new WorldPoint(3287, 3876, 0)), // GDZ
			new WildernessMapPoint("GAP", new WorldPoint(3250, 3857, 0)), // GAP
			new WildernessMapPoint("NW Exit", new WorldPoint(3260, 3827, 0)), // NW EXIT
			new WildernessMapPoint("Vet'ion", new WorldPoint(3220, 3780, 0)), // VETION
			new WildernessMapPoint("Mid Exit", new WorldPoint(3284, 3803, 0)), // MID EXIT
			new WildernessMapPoint("Callisto", new WorldPoint(3292, 3855, 0)), // CALLISTO
			new WildernessMapPoint("NE Exit", new WorldPoint(3320, 3825, 0)), // NE EXIT
			new WildernessMapPoint("Venenatis", new WorldPoint(3316, 3796, 0)), // VENENATIS
			new WildernessMapPoint("South Exit", new WorldPoint(3282, 3770, 0)), // SOUTH EXIT
			new WildernessMapPoint("HSHOE", new WorldPoint(3311, 3771, 0)), // HORSE SHOE
			new WildernessMapPoint("SLAYER (N)", new WorldPoint(3293, 3751, 0)), // NORTH SLAYER
			new WildernessMapPoint("SLAYER (S)", new WorldPoint(3260, 3658, 0)), // SOUTH SLAYER
			new WildernessMapPoint("Chaos Temple (N)", new WorldPoint(3235, 3635, 0)), // CHAOS TEMPLE NORTH
			new WildernessMapPoint("Chaos Temple (S)", new WorldPoint(3237, 3578, 0)), // CHAOS TEMPLE SOUTH
			new WildernessMapPoint("19 Port", new WorldPoint(3227, 3662, 0)), // 19 PORT
			new WildernessMapPoint("13 Port", new WorldPoint(3156, 3613, 0)), // 13 PORT
			new WildernessMapPoint("Carralanger", new WorldPoint(3167, 3673, 0)), // CARRALANGER
			new WildernessMapPoint("Crab TP", new WorldPoint(3351, 3783, 0)), // WILDY CRAB
			new WildernessMapPoint("Old Gate", new WorldPoint(3224, 3911, 0)), // OLD GATE
			new WildernessMapPoint("Kbd Cage (N)", new WorldPoint(3029, 3882, 0)), // NORTH KBD CAGE
			new WildernessMapPoint("Spindel", new WorldPoint(3180, 3744, 0)), // SPINDEL
			new WildernessMapPoint("Dwarves", new WorldPoint(3246, 3791, 0)), // DWARVES
		};
	}
}
