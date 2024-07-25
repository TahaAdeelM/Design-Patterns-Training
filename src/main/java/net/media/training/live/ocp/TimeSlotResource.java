package net.media.training.live.ocp;/**
 * Created by autoopt/mayank.k
 */

public class TimeSlotResource extends Resource{
    private TimeSlotManager timeSlotManager;
    protected void markTimeSlotFree(TimeSlotManager timeSlotManager) {
        this.timeSlotManager = timeSlotManager;
    }

    @Override
    public int allocate() {
        int resourceId = timeSlotManager.findFreeSlot();
        timeSlotManager.markSlotBusy(resourceId);

        return resourceId;
    }

    @Override
    public void free(int resourceId) {
        timeSlotManager.markSlotFree(resourceId);
    }
}
