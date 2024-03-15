package com.ilyakrn.myelectronicsmod.init;


import com.ilyakrn.myelectronicsmod.items.ItemSolderingIron;
import com.ilyakrn.myelectronicsmod.items.ItemTrack;
import com.ilyakrn.myelectronicsmod.items.ItemTracks;
import com.ilyakrn.myelectronicsmod.items.ItemTracksConnector;
import net.minecraft.item.Item;

import java.util.ArrayList;

public class InitItems {
    public static final ArrayList<Item> ITEMS = new ArrayList<>();

    public static final Item SOLDERING_IRON = new ItemSolderingIron("soldering_iron");
    public static final Item ITEM_TRACK_VERTICAL = new ItemTrack("track_vertical");
    public static final Item ITEM_TRACK_HORIZONTAL = new ItemTrack("track_horizontal");
    public static final Item ITEM_TRACK_COLLECTOR = new ItemTrack("track_collector");

    public static final Item ITEM_TRACKS_VERTICAL = new ItemTracks("tracks_vertical");
    public static final Item ITEM_TRACKS_HORIZONTAL = new ItemTracks("tracks_horizontal");
    public static final Item ITEM_TRACKS_COLLECTOR = new ItemTracks("tracks_collector");

    public static final Item ITEM_TRACKS_FIRST_RIGHT_CONNECTOR = new ItemTracksConnector("tracks_first_right_connector");
    public static final Item ITEM_TRACKS_FIRST_LEFT_CONNECTOR = new ItemTracksConnector("tracks_first_left_connector");
    public static final Item ITEM_TRACKS_FIRST_TOP_CONNECTOR = new ItemTracksConnector("tracks_first_top_connector");
    public static final Item ITEM_TRACKS_FIRST_BOTTOM_CONNECTOR = new ItemTracksConnector("tracks_first_bottom_connector");


    public static final Item ITEM_TRACKS_SECOND_RIGHT_CONNECTOR = new ItemTracksConnector("tracks_second_right_connector");
    public static final Item ITEM_TRACKS_SECOND_LEFT_CONNECTOR = new ItemTracksConnector("tracks_second_left_connector");
    public static final Item ITEM_TRACKS_SECOND_TOP_CONNECTOR = new ItemTracksConnector("tracks_second_top_connector");
    public static final Item ITEM_TRACKS_SECOND_BOTTOM_CONNECTOR = new ItemTracksConnector("tracks_second_bottom_connector");


    public static final Item ITEM_TRACKS_THIRD_RIGHT_CONNECTOR = new ItemTracksConnector("tracks_third_right_connector");
    public static final Item ITEM_TRACKS_THIRD_LEFT_CONNECTOR = new ItemTracksConnector("tracks_third_left_connector");
    public static final Item ITEM_TRACKS_THIRD_TOP_CONNECTOR = new ItemTracksConnector("tracks_third_top_connector");
    public static final Item ITEM_TRACKS_THIRD_BOTTOM_CONNECTOR = new ItemTracksConnector("tracks_third_bottom_connector");


    public static final Item ITEM_TRACKS_FOURTH_RIGHT_CONNECTOR = new ItemTracksConnector("tracks_fourth_right_connector");
    public static final Item ITEM_TRACKS_FOURTH_LEFT_CONNECTOR = new ItemTracksConnector("tracks_fourth_left_connector");
    public static final Item ITEM_TRACKS_FOURTH_TOP_CONNECTOR = new ItemTracksConnector("tracks_fourth_top_connector");
    public static final Item ITEM_TRACKS_FOURTH_BOTTOM_CONNECTOR = new ItemTracksConnector("tracks_fourth_bottom_connector");
}
