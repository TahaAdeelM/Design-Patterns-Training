package net.media.training.live.ocp;

/**
 * Created by autoopt/mayank.k
 */

public class SpaceSlotResource extends Resource{
    private SpaceSlotManager spaceSlotManager;
    protected void markSpaceSlotFree(SpaceSlotManager spaceSlotManager) {
        this.spaceSlotManager = spaceSlotManager;
    }

    @Override
    public int allocate() {
        int resourceId = spaceSlotManager.findFreeSlot();
        spaceSlotManager.markSlotBusy(resourceId);

        return resourceId;
    }

    @Override
    public void free(int resourceId) {
        spaceSlotManager.markSlotFree(resourceId);
    }
}
