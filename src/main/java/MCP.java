import trafficlight.ctrl.TrafficLightCtrl;

/*
Github Repo Link: https://github.com/markus-posch/trafficlight2021Observer
 */
public class MCP {
    public static void main(String[] args) {
        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
        ctrl.run();
    }
}