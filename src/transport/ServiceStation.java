package transport;

import java.util.Queue;

public class ServiceStation {

    private Queue<Transport> queue;

    public ServiceStation(Queue<Transport> queue) {
        this.queue = queue;
    }

    public Queue<Transport> getQueue() {
        return queue;
    }

    public void setQueue(Queue<Transport> queue) {
        this.queue = queue;
    }


    public void addCarToQueue(Transport transport) {
        if (transport.checkNeedService())
            queue.add(transport);
    }

    public void checkQueue() {
        if (queue.isEmpty()) {
            Transport transport = queue.poll();
            transport.repair();
        }
    }

    public void сщтвгсеФтInspection(Queue <Transport> queue) {
        if (queue.isEmpty()) {
            System.out.println(" there are no mechanics for this transport");
        } else {
            for (int i = 0; i < queue.size(); i++) {
                Transport racer = queue.poll();

                Mechanic mechanic = (Mechanic) racer.getMechanicList().get(0);
                mechanic.carryOutMaintenance(racer);
            }
        }
    }


}
