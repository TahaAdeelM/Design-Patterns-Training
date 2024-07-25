package net.media.training.live.ocp;

public interface SlotManager {
    public void markSlotFree(int resourceId);
    public void markSlotBusy(int resourceId);
    public int findFreeSlot();
}
