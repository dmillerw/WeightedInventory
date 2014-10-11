package dmillerw.mods.realismmod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Properties;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.Loader;

import net.minecraft.src.ModLoader;

public class WeightValues {

	static File mcDir = Loader.instance().getConfigDir();
	static File propertiesFile = new File(mcDir + "/weight.properties");
	
	public static void createConfig() {
		Properties prop = new Properties();
		
		//BASE CONFIG --
		//STONE
		prop.setProperty("1", "8");

		//DIRT
		prop.setProperty("2", "2");

		//DIRT GRASS
		prop.setProperty("3", "4");

		//COBBLESTONE
		prop.setProperty("4", "6");

		//WOOD PLANKS(0,1,2,3)
		prop.setProperty("5", "1.5");

		//BUSHES(0,1,2,3)
		prop.setProperty("6", "0.1");

		//BEDROCK
		prop.setProperty("7", "0.1");

		//WATER SOURCE
		prop.setProperty("8", "0.1");

		//WATER FLOW
		prop.setProperty("9", "0.1");

		//LAVA SOURCE
		prop.setProperty("10", "0.1");

		//LAVA FLOW
		prop.setProperty("11", "0.1");

		//SAND
		prop.setProperty("12", "4");

		//GRAVEL
		prop.setProperty("13", "6");

		//GOLD ORE BLOCK
		prop.setProperty("14", "35");

		//IRON ORE BLOCK
		prop.setProperty("15", "11");

		//COAL ORE BLOCK
		prop.setProperty("16", "11");

		//WOOD BLOCKS(0,1,2,3)
		prop.setProperty("17", "6");

		//LEAVES (0,1,2,3)
		prop.setProperty("18", "0.1");

		//SPONGE
		prop.setProperty("19", "0.1");

		//GLASS
		prop.setProperty("20", "4");

		//LAPUS ORE BLOCK
		prop.setProperty("21", "7");

		//LAPUS BLOCK
		prop.setProperty("22", "36");

		//DISPENSER
		prop.setProperty("23", "29");

		//SANDSTONE(0,1,2)
		prop.setProperty("24", "8");

		//NOTEBLOCK
		prop.setProperty("25", "9");

		//SOME SORT OF RED BLOCK (Never seen it in creative)
		prop.setProperty("26", "0.1");

		//POWERED RAIL
		prop.setProperty("27", "97");

		//DETECTOR RAIL
		prop.setProperty("28", "36");

		//STICKY PISTON
		prop.setProperty("29", "21");

		//COBWEBS
		prop.setProperty("30", "0.1");

		//MORE BUSHES(0,1,2)
		prop.setProperty("31", "0.1");

		//ANOTHER BUSH
		prop.setProperty("32", "0.1");

		//PISTON
		prop.setProperty("33", "20");

		//PISTON HEAD
		prop.setProperty("34", "0.1");

		//WOOL(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)
		prop.setProperty("35", "0.5");

		//STATIC(Wait what)
		prop.setProperty("36", "0.1");

		//YELLOW FLOWER
		prop.setProperty("37", "0.1");

		//RED FLOWER
		prop.setProperty("38", "0.1");

		//BROWN MUSHROOM
		prop.setProperty("39", "0.1");

		//RED MUSHROOM
		prop.setProperty("40", "0.1");

		//GOLD BLOCK
		prop.setProperty("41", "288");

		//IRON BLOCK
		prop.setProperty("42", "34");

		//MONSTER BLOCKS(0,1,2,3,4,5,6)
		prop.setProperty("43", "0.1");

		//SLABS(0,1,2,3,4,5,6)
		prop.setProperty("44", "4");

		//BRICKS
		prop.setProperty("45", "8");

		//TNT
		prop.setProperty("46", "8");

		//BOOKSHELF
		prop.setProperty("47", "13");

		//MOSSY COBBLESTONE
		prop.setProperty("48", "8");

		//OBSIDIAN
		prop.setProperty("49", "18");

		//TORCH
		prop.setProperty("50", "0.1");

		//FIRE
		prop.setProperty("51", "0.1");

		//MOB SPAWNER
		prop.setProperty("52", "0.1");

		//WOODEN STAIRS
		prop.setProperty("53", "6");

		//CHEST
		prop.setProperty("54", "8");

		//STAR THING
		prop.setProperty("55", "0.1");

		//DIAMOND ORE BLOCK
		prop.setProperty("56", "17");

		//DIAMOND BLOCK
		prop.setProperty("57", "126");

		//CRAFTING BENCH
		prop.setProperty("58", "6");

		//SEEDS
		prop.setProperty("59", "0.1");

		//DIRT BLOCK(?)
		prop.setProperty("60", "0.1");

		//FURNACE
		prop.setProperty("61", "32");

		//LIT FURNACE
		prop.setProperty("62", "0.1");

		//WOOD(?)
		prop.setProperty("63", "0.1");

		//HALF WOODEN DOOR
		prop.setProperty("64", "0.1");

		//LADDER
		prop.setProperty("65", "4");

		//RAIL
		prop.setProperty("66", "37");

		//STONE STAIRS
		prop.setProperty("67", "24");

		//WOOD(??)
		prop.setProperty("68", "0.1");

		//LEVER
		prop.setProperty("69", "5");

		//STONE PRESSURE PLATE
		prop.setProperty("70", "2");

		//HALF IRON DOOR(Why are these even HERE?)
		prop.setProperty("71", "0.1");

		//WOOD PRESSURE PLATE
		prop.setProperty("72", "1");

		//REDSTONE BLOCK
		prop.setProperty("73", "5");

		//LIT REDSTONE BLOCK
		prop.setProperty("74", "0.1");

		//UNLIT REDSTONE TORCH
		prop.setProperty("75", "0.1");

		//REDSTONE TORCH
		prop.setProperty("76", "3");

		//STONE BUTTON
		prop.setProperty("77", "1");

		//SNOW PLATE
		prop.setProperty("78", "0.1");

		//ICE BLOCK
		prop.setProperty("79", "4");

		//SNOW BLOCK
		prop.setProperty("80", "2");

		//CACTUS
		prop.setProperty("81", "2");

		//CLAY BLOCK
		prop.setProperty("82", "2");

		//REEDS
		prop.setProperty("83", "0.1");

		//JUKE BOX
		prop.setProperty("84", "23");

		//FENCE
		prop.setProperty("85", "3");

		//PUMPKIN
		prop.setProperty("86", "4");

		//NETHERRACK
		prop.setProperty("87", "8");

		//SOULSAND
		prop.setProperty("88", "6");

		//GLOWSTONE
		prop.setProperty("89", "4");

		//NETHERPORTAL
		prop.setProperty("90", "0.1");

		//JACK'O'LANTERN
		prop.setProperty("91", "4");

		//CAKE BLOCK
		prop.setProperty("92", "0.1");

		//DOUBLE SLAB(?)
		prop.setProperty("93", "0.1");

		//DOUBLE SLAB(??)
		prop.setProperty("94", "0.1");

		//LOCKED CHEST
		prop.setProperty("95", "0.1");

		//TRAPDOOR
		prop.setProperty("96", "3");

		//STONE STUFF(0,1,2)
		prop.setProperty("97", "0.1");

		//MORE STONE STUFF(0,1,2,3)
		prop.setProperty("98", "0.1");

		//SPONGE(?)
		prop.setProperty("99", "0.1");

		//ANOTHER SPONGE(??)
		prop.setProperty("100", "0.1");

		//IRON BARS
		prop.setProperty("101", "24");

		//GLASS PANE
		prop.setProperty("102", "1");

		//MELLON
		prop.setProperty("103", "4");

		//IRON SPIKE(?)
		prop.setProperty("104", "0.1");

		//IRON SPIKE(??)
		prop.setProperty("105", "0.1");

		//VINES
		prop.setProperty("106", "0.1");

		//FENCE GATE
		prop.setProperty("107", "5");

		//BRICK STAIRS
		prop.setProperty("108", "24");

		//STONE STAIRS
		prop.setProperty("109", "24");

		//INFECTED DIRT
		prop.setProperty("110", "4");

		//LILLYPAD
		prop.setProperty("111", "0.1");

		//NETHERBRICK
		prop.setProperty("112", "10");

		//NETHERFENCE
		prop.setProperty("113", "30");

		//NETHERSTAIRS
		prop.setProperty("114", "30");

		//NETHERWART
		prop.setProperty("115", "0.1");

		//ENCHANTMENT TABLE
		prop.setProperty("116", "51");

		//BREWING STATION ACTIVE
		prop.setProperty("117", "0.1");

		//CAULDRON
		prop.setProperty("118", "0.1");

		//STATIC
		prop.setProperty("119", "0.1");

		//END PORTAL FRAME
		prop.setProperty("120", "0.1");

		//END STONE
		prop.setProperty("121", "15");

		//DRAGON EGG
		prop.setProperty("122", "10");

		//LAMP
		prop.setProperty("123", "5");

		//LAMP LIT
		prop.setProperty("124", "5");

		//WOOD PLANKS(0,1,2,3)(?)
		prop.setProperty("125", "0.1");

		//WOOD SLABS(0,1,2,3)(?)
		prop.setProperty("126", "0.1");

		//LIGHTER(?)
		prop.setProperty("127", "0.1");

		//SANDSTONE STAIRS
		prop.setProperty("128", "24");

		//EMERALD ORE BLOCK
		prop.setProperty("129", "4");

		//ENDER CHEST
		prop.setProperty("130", "72");

		//TRIPWIRE HOOK
		prop.setProperty("131", "8");

		//CEILING SPECKLES
		prop.setProperty("132", "0.1");

		//EMERALD BLOCK
		prop.setProperty("133", "5");

		//BIRCH STAIRS
		prop.setProperty("134", "3");

		//JUNGLE STAIRS
		prop.setProperty("135", "3");

		//CHERRY STAIRS
		prop.setProperty("136", "3");

		//COMMAND BLOCK
		prop.setProperty("137", "0.1");

		//BUFFER
		prop.setProperty("138", "0.1");

		//IRON SHOVEL
		prop.setProperty("256", "9");

		//IRON PICKAXE
		prop.setProperty("257", "13");

		//IRON AXE
		prop.setProperty("258", "13");

		//FLINT AND STEEL
		prop.setProperty("259", "13");

		//APPLE
		prop.setProperty("260", "2");

		//BOW
		prop.setProperty("261", "2");

		//ARROW
		prop.setProperty("262", "1");

		//COAL(0,1)
		prop.setProperty("263", "1");

		//DIAMOND
		prop.setProperty("264", "14");

		//IRON INGOT
		prop.setProperty("265", "8");

		//GOLD INGOT
		prop.setProperty("266", "32");

		//IRON SWORD
		prop.setProperty("267", "8.5");

		//WOOD SWORD
		prop.setProperty("268", "3");

		//WOOD SHOVEL
		prop.setProperty("269", "2");

		//WOOD PICKAXE
		prop.setProperty("270", "4");

		//WOOD AXE
		prop.setProperty("271", "4");

		//STONE SWORD
		prop.setProperty("272", "9");

		//STONE SHOVEL
		prop.setProperty("273", "5");

		//STONE PICKAXE
		prop.setProperty("274", "13");

		//STONE AXE
		prop.setProperty("275", "13");

		//DIAMOND SWORD
		prop.setProperty("276", "15");

		//DIAMOND SHOVEL
		prop.setProperty("277", "7");

		//DIAMOND PICKAXE
		prop.setProperty("278", "22");

		//DIAMOND AXE
		prop.setProperty("279", "22");

		//STICK
		prop.setProperty("280", "1");

		//BOWL
		prop.setProperty("281", "2");

		//BOWL OF SHIT
		prop.setProperty("282", "2");

		//GOLDEN SWORD
		prop.setProperty("283", "29");

		//GOLDEN SHOVEL
		prop.setProperty("284", "17");

		//GOLDEN PICKAXE
		prop.setProperty("285", "50");

		//GOLDEN AXE
		prop.setProperty("286", "50");

		//STRING
		prop.setProperty("287", "0.1");

		//FEATHER
		prop.setProperty("288", "0.1");

		//GUNPOWDER
		prop.setProperty("289", "0.1");

		//WOOD HOE
		prop.setProperty("290", "3");

		//STONE HOE
		prop.setProperty("291", "9");

		//IRON HOE
		prop.setProperty("292", "9");

		//DIAMOND HOE
		prop.setProperty("293", "15");

		//GOLD HOE
		prop.setProperty("294", "17");

		//SEEDS
		prop.setProperty("295", "0.1");

		//WHEAT
		prop.setProperty("296", "1");

		//BREAD
		prop.setProperty("297", "2");

		//LEATHER HELMET
		prop.setProperty("298", "3");

		//LEATHER CHEST
		prop.setProperty("299", "5");

		//LEATHER PANTS(Paaarrrttyyy!)
		prop.setProperty("300", "4");

		//LEATHER BOOTS(Not so party.)
		prop.setProperty("301", "2");

		//CHAINMAIL HELMET
		prop.setProperty("302", "5");

		//CHAINMAIL CHEST
		prop.setProperty("303", "8");

		//CHAINMAIL LEGS
		prop.setProperty("304", "7");

		//CHAINMAIL BOOTS
		prop.setProperty("305", "4");

		//IRON HELMET
		prop.setProperty("306", "20");

		//IRON CHEST
		prop.setProperty("307", "32");

		//IRON LEGS
		prop.setProperty("308", "28");

		//IRON BOOTS
		prop.setProperty("309", "16");

		//DIAMOND HELMET
		prop.setProperty("310", "35");

		//DIAMOND CHEST
		prop.setProperty("311", "46");

		//DIAMOND PANTS
		prop.setProperty("312", "49");

		//DIAMOND BOOTS
		prop.setProperty("313", "14");

		//GOLD HELMET
		prop.setProperty("314", "80");

		//GOLD CHEST
		prop.setProperty("315", "128");

		//GOLD PANTS
		prop.setProperty("316", "112");

		//GOLD BOOTS
		prop.setProperty("317", "64");

		//FLINT
		prop.setProperty("318", "1");

		//RAW PORKCHOP
		prop.setProperty("319", "2");

		//COOKED PORKCHOP
		prop.setProperty("320", "2");

		//PAINTING
		prop.setProperty("321", "1");

		//GOLDEN APPLE
		prop.setProperty("322", "72");

		//SIGN
		prop.setProperty("323", "7");

		//WOOD DOOR
		prop.setProperty("324", "6");

		//BUCKET (I haz a bucket)
		prop.setProperty("325", "18");

		//BUCKET OF WATER
		prop.setProperty("326", "23");

		//BUCKET OF LAVA (I haz a bucket. Of heat.)
		prop.setProperty("327", "25");

		//MINECART
		prop.setProperty("328", "42");

		//SADDLE
		prop.setProperty("329", "5");

		//IRON DOOR
		prop.setProperty("330", "24");

		//REDSTONE DUST
		prop.setProperty("331", "0.1");

		//SNOWBALL
		prop.setProperty("332", "1");

		//BOAT
		prop.setProperty("333", "5");

		//LEATHER
		prop.setProperty("334", "1");

		//BUCKET 'O' MILK
		prop.setProperty("335", "23");

		//BRICK
		prop.setProperty("336", "1");

		//CLAY
		prop.setProperty("337", "1");

		//REED
		prop.setProperty("338", "0.1");

		//PAPER
		prop.setProperty("339", "0.1");

		//BOOK
		prop.setProperty("340", "1");

		//SLIME BALL
		prop.setProperty("341", "1");

		//MINECART WITH CHEST
		prop.setProperty("342", "38");

		//MINECART WITH FURNACE
		prop.setProperty("343", "68");

		//EGG
		prop.setProperty("344", "1");

		//COMPASS
		prop.setProperty("345", "4");

		//FISHING ROD
		prop.setProperty("346", "2");

		//CLOCK
		prop.setProperty("347", "4");

		//GLOWSTONE DUST
		prop.setProperty("348", "0.1");

		//RAW FISH
		prop.setProperty("349", "4");

		//COOKED FISH
		prop.setProperty("350", "4");

		//DYES(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)
		prop.setProperty("351", "0.1");

		//BONE
		prop.setProperty("352", "1");

		//SUGAR
		prop.setProperty("353", "0.1");

		//CAKE
		prop.setProperty("354", "2");

		//BED
		prop.setProperty("355", "3");

		//REDSTONE REPEATER
		prop.setProperty("356", "4");

		//COOKIE
		prop.setProperty("357", "1");

		//MAP
		prop.setProperty("358", "2");

		//SHEARS
		prop.setProperty("359", "14");

		//MELON SLICE
		prop.setProperty("360", "1");

		//PUMPKIN SEEDS
		prop.setProperty("361", "0.1");

		//MELON SEEDS
		prop.setProperty("362", "0.1");

		//RAW STEAK
		prop.setProperty("363", "2");

		//COOKED STEAK (Yay steak!)
		prop.setProperty("364", "2");

		//RAW CHICKEN
		prop.setProperty("365", "2");

		//COOKED CHICKEN
		prop.setProperty("366", "2");

		//ZOMBIE FLESH (It has been proven that it is NOT jerky.)
		prop.setProperty("367", "0.1");

		//ENDER ORB
		prop.setProperty("368", "5");

		//BLAZE ROD
		prop.setProperty("369", "2");

		//GHAST TEAR (...Cry, bastard.. Cry.)
		prop.setProperty("370", "0.1");

		//GOLD INGOT
		prop.setProperty("371", "3");

		//BERRIES
		prop.setProperty("372", "0.1");

		//FULL BOTTLE
		prop.setProperty("373", "1");

		//EMPTY BOTTLE
		prop.setProperty("374", "0.5");

		//SPIDER EYE
		prop.setProperty("375", "0.1");

		//FERMENTED SPIDER EYE
		prop.setProperty("376", "0.1");

		//BLAZE POWDER
		prop.setProperty("377", "0.1");

		//MAGMA CREAM
		prop.setProperty("378", "0.1");

		//BREWING STATION
		prop.setProperty("379", "4");

		//CAULDRON
		prop.setProperty("380", "42");

		//EYE OF ENDER
		prop.setProperty("381", "0.1");

		//GLISTENING MELLON SLICE
		prop.setProperty("382", "0.1");

		//EGGS(So many eggs..)
		prop.setProperty("383", "0.1");

		//POTION OF ENCHANTMENT
		prop.setProperty("384", "1");

		//BURNED COOKIE
		prop.setProperty("385", "0.1");

		//BOOK AND QUILL
		prop.setProperty("386", "2");

		//SIGNED BOOK
		prop.setProperty("387", "2");

		//EMERALD
		prop.setProperty("388", "1");

		//IRON RING
		prop.setProperty(String.valueOf(RealismMod.itemIronRing.shiftedIndex), "1");

		//HAMMER
		prop.setProperty(String.valueOf(RealismMod.itemHammer.shiftedIndex), "1");
		
		//BACKPACK
		prop.setProperty(String.valueOf(RealismMod.itemBackpack.shiftedIndex), "3.5");
		
		if (!propertiesFile.exists()) {
			try {
				System.out.println("Realism Mod: WRITING CONFIG FILE");
				prop.store(new FileOutputStream(mcDir + "/weight.properties"), null);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void load()
    {
		Properties propRead = new Properties();
		
		if (propertiesFile.exists()) {
			try {
				System.out.println("Realism Mod: READING CONFIG FILE");
				propRead.load(new FileInputStream(mcDir + "/weight.properties"));
				
				Enumeration em = propRead.keys();
				while(em.hasMoreElements()){
					String str = em.nextElement().toString();
					int strInt = Integer.parseInt(str);
					double strDouble = Double.parseDouble(propRead.get(str).toString());
					add(strInt, strDouble);
					if (dmillerw.mods.realismmod.RealismMod.debug == true) {
						System.out.println("ID: " + strInt + " Weight: " + strDouble);
					}
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} else {
			System.out.println("Realism Mod: WEIGHT VALUE CONFIG NOT FOUND. RELOAD MINECRAFT");
		}
    }
	
	public static ArrayList IDs = new ArrayList(); //lookup table to weights
	public static ArrayList<Double> weights = new ArrayList<Double>(); //actual weight values
	
	public static void add(int id, double weight) {
		IDs.add(Integer.valueOf(id));
		weights.add(weight);
	}
	public static void remove(int id) {
		weights.remove(IDs.indexOf(id));
		IDs.remove(Integer.valueOf(id));
	}
}
