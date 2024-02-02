package javapod.content.blocks;

import arc.graphics.Color;
import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.content.Liquids;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.entities.bullet.LiquidBulletType;
import mindustry.gen.Sounds;
import mindustry.graphics.CacheLayer;
import mindustry.type.Category;
import mindustry.world.Block;
import mindustry.world.blocks.defense.Wall;
import mindustry.world.blocks.environment.*;
import mindustry.world.meta.Attribute;
import mindustry.world.meta.BuildVisibility;
import javapod.content.*;
import static mindustry.type.ItemStack.with;

public class Javapodenv {
    public static Block
    ZincOre, VanadiumOre,
    wall;

    public static void load() {

		ZincOre = new OreBlock("ZincOre"){{
			oreDefault = true;
			variants = 3;
			oreThreshold = 0.95F;
			oreScale = 20.380953F;
			itemDrop = JavapodItem.Zinc;
			attributes.set(Javapodattribute.Zinc, 1.5f);
			mapColor.set(itemDrop.color);
			useColor = true;
		}};

        VanadiumOre = new OreBlock("VanadiumOre") {{
        itemDrop = JavapodItem.Vanadium;
         }};

        wall = new StaticWall("wall"){{
			variants = 1;
		}};
    }

}