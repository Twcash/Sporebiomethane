package jp.content.blocks;

import arc.graphics.g2d.TextureRegion;
import arc.struct.Seq;
import mindustry.type.Category;
import mindustry.type.PayloadSeq;
import mindustry.type.PayloadStack;
import mindustry.type.UnitType;
import mindustry.world.Block;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.units.Reconstructor;
import mindustry.world.blocks.units.UnitFactory;
import mindustry.type.*;
import jp.content.*;
import mindustry.content.*;

import static mindustry.Vars.*;
import static mindustry.type.ItemStack.*;
import static mindustry.content.Items.*;



public class JPUnitFactory{
    public static UnitFactory
        pool,Synapsetower,Assembler,Gestator;

        public static void load(){
        pool = new UnitFactory("pool"){{
            requirements(Category.units, with(silicon,150,JPItem.Biomass,45));
            plans = Seq.with(
                new UnitPlan( JPUnits.Zergling, 15 * 60f, with(silicon, 65,JPItem.Biomass,10)),
                new UnitPlan( JPUnits.Baneling, 10 * 60f, with(silicon, 45,JPItem.Biomass,5, coal, 30)),
                new UnitPlan( JPUnits.Roach, 20 * 60f, with(silicon, 95,JPItem.Biomass,25)),
                new UnitPlan( JPUnits.Purger, 25 * 60f, with(silicon, 115,JPItem.Biomass,45))
            );
            health = 500;
            size = 3;
            consumePower(1.5f);

        }};

        
        Synapsetower = new UnitFactory("Synapse-tower"){{
            requirements(Category.units, with(silicon,250,JPItem.Biomass,75));
            plans = Seq.with(
                new UnitPlan( JPUnits.Drone, 60f * 15, with(silicon, 15, JPItem.Biomass,10,lead, 25)),
                new UnitPlan( JPUnits.Interceptor, 60f * 10, with(silicon, 45, JPItem.Biomass,10)),
                new UnitPlan( JPUnits.Guardian, 60f * 40, with(silicon, 125, JPItem.Biomass,65))
            );
            health = 500;
            size = 3;
            consumePower(1.5f);

        }};
        Gestator = new UnitFactory("Gestator"){{
            requirements(Category.units, with(silicon,750,JPItem.Nanitealloy,500,JPItem.Biomass,250,JPItem.Neocells,75));
            plans = Seq.with(
                new UnitPlan( JPUnits.Carci, 60f * 25, with( silicon, 150, thorium, 75, JPItem.Neocells, 30)),
                new UnitPlan( JPUnits.Autus, 60f * 35, with( silicon, 200, JPItem.Biomass,75,pyratite,45, JPItem.Neocells, 75)),
                new UnitPlan( JPUnits.Thera, 60f * 25, with( silicon, 175, JPItem.Biomass,75, JPItem.Neocells, 75)),
                new UnitPlan( JPUnits.Imp, 60f * 15, with( silicon, 45, pyratite, 15, JPItem.Biomass,5, JPItem.Neocells, 15))
            );
            health = 2500;
            size = 3;
            consumePower(7f);
            consumeLiquid(Liquids.neoplasm, 15f / 60f);

        }};
        Assembler = new UnitFactory("Assembler"){{
            requirements(Category.units, with(silicon,250,JPItem.Biomass,75));
            plans = Seq.with(
                new UnitPlan( JPUnits.Breacher, 60f * 15, with( silicon, 350, JPItem.Biomass,75)),
                new UnitPlan( JPUnits.Guardian, 60f * 10, with( silicon, 300, JPItem.Biomass,75)),
                new UnitPlan( JPUnits.Behomoth, 60f * 40, with( silicon, 850, JPItem.Biomass,400, JPItem.Nanitealloy,400)),
                new UnitPlan( JPUnits.Scarabid, 60f * 40, with( silicon, 300, plastanium, 90, JPItem.Biomass,25))
            );
            health = 1750;
            size = 4;
            consumePower(1.2f);

        }};
}};