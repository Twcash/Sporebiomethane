package javapod.content.blocks;

import arc.graphics.*;
import arc.math.*;
import arc.struct.*;
import mindustry.*;
import mindustry.entities.*;
import mindustry.entities.abilities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.DrawPart.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.type.unit.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.campaign.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.heat.*;
import mindustry.world.blocks.legacy.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;
//import javapod.content.JavapodAC;
import javapod.content.*;
import mindustry.content.*;

import static mindustry.Vars.*;
import static mindustry.type.ItemStack.*;
import static mindustry.content.Items.*;


public class JavapodProduction{
    public static Block
        Extractor,ZincExtractor,
        Nanoprocessor,Naniteinfuser,CCB,FR,Gaschamber;

        public static void load(){

        Nanoprocessor = new GenericCrafter("Nanoprocessor"){{
            requirements(Category.crafting, with(silicon, 75, graphite, 90));

            craftEffect = Fx.pulverizeMedium;
            outputItem = new ItemStack(JavapodItem.Biomass, 1);
            craftTime = 90f;
            size = 2;
            hasItems = true;
            hasPower = true;

            consumePower(1f);
            consumeItem(sporePod, 5);
        }};
        Naniteinfuser = new GenericCrafter("Naniteinfuser"){{
            requirements(Category.crafting, with(JavapodItem.BioSil,95,silicon, 325, graphite, 275));

            craftEffect = Fx.pulverizeMedium;
            outputItem = new ItemStack(JavapodItem.Nanitealloy, 1);
            craftTime = 90f;
            size = 2;
            hasPower = true;
            hasItems = true;

            consumePower(5f);
            consumeItems(with(JavapodItem.Biomass, 5,JavapodItem.BioSil,5,silicon,10));
        }};
        CCB = new GenericCrafter("Carbine-composite-smelter"){{
            requirements(Category.crafting, with(silicon, 75, graphite, 30));

            craftEffect = Fx.smeltsmoke;
            outputItem = new ItemStack(JavapodItem.Carbinecomposite, 1);
            craftTime = 90f;
            size = 2;
            drawer = new DrawMulti(new DrawDefault(), new DrawFlame(Color.valueOf("8B73C7")));
            hasPower = true;
            hasItems = true;

            consumePower(4f);
            consumeItems(with(JavapodItem.BioSil, 2,JavapodItem.Vanadium,4,JavapodItem.Nanitealloy, 3));
        }};
        FR = new GenericCrafter("Fluoresilt-refinery"){{
            requirements(Category.crafting, with(silicon, 75, graphite, 30));

            craftEffect = Fx.pulverizeMedium;
            outputItem = new ItemStack(JavapodItem.Fluorite, 1);
            craftTime = 90f;
            size = 2;
            hasPower = true;
            hasItems = true;

            consumePower(1f);
            consumeItem(JavapodItem.Fluoresilt, 5);
        }};
        Gaschamber = new GenericCrafter("Voltaicchamber"){{
            requirements(Category.crafting, with(silicon, 75, graphite, 90));

            craftEffect = Fx.pulverizeMedium;
            outputItem = new ItemStack(JavapodItem.Voltaicgas, 1);
            craftTime = 90f;
            size = 3;
            hasItems = true;
            hasPower = true;
            hasLiquids = true;

            consumePower(5f);
            consumeItem(sporePod, 5);
            consumeLiquid(Liquids.water, 15f / 60f);
        }};
        }};