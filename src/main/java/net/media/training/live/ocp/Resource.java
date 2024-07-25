package net.media.training.live.ocp;

/**
 * Created by autoopt/mayank.k
 */
public class Resource {
    protected SlotManager slotManager;

    protected Resource(SlotManager slotManager) {
        this.slotManager = slotManager;
    }

    public int allocate() {
        int resourceId = slotManager.findFreeSlot();
        slotManager.markSlotBusy(resourceId);
        return resourceId;
    }

    public void free(int resourceId) {
        slotManager.markSlotFree(resourceId);
    }
}
