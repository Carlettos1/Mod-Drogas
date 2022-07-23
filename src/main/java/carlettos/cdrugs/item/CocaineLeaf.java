package carlettos.cdrugs.item;

import java.util.List;

import carlettos.cdrugs.base.CocaineType;
import carlettos.cdrugs.lists.Effects;
import carlettos.cdrugs.lists.Items;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public class CocaineLeaf extends Item {
    private final CocaineType type;

    public CocaineLeaf(Settings settings, CocaineType type) {
        super(settings);
        this.type = type;
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 16;
    }

    public CocaineType getType() {
        return type;
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.EAT;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (user.getInventory().containsAny(s -> s.getItem().equals(Items.KINWA_ASH_BUN))) {
            ItemUsage.consumeHeldItem(world, user, hand);
        }
        return super.use(world, user, hand);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (world.isClient) {
            for (var par : Effects.COCA_LEAF_EFFECTS) {
                if (par.getSecond() > world.getRandom().nextFloat()) {
                    user.addStatusEffect(par.getFirst());
                }
            }
        }
        if (user instanceof PlayerEntity player) {
            stack.decrement(1);
            Inventories.remove(player.getInventory(), s -> s.getItem().equals(Items.KINWA_ASH_BUN), 1, false);
        }
        user.emitGameEvent(GameEvent.EAT);
        return stack;
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("cocaine_leaf.needs").formatted(Formatting.ITALIC).formatted(Formatting.GREEN));
        tooltip.add(Text.translatable("cocaine.percentage." + this.getType().name().toLowerCase()).formatted(Formatting.AQUA));
    }
}
