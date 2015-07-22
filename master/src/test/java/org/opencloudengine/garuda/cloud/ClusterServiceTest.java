package org.opencloudengine.garuda.cloud;

import org.jclouds.compute.RunNodesException;
import org.junit.Before;
import org.junit.Test;
import org.opencloudengine.garuda.env.Environment;
import org.opencloudengine.garuda.exception.GarudaException;
import org.opencloudengine.garuda.exception.UnknownIaasProviderException;
import org.opencloudengine.garuda.service.common.ServiceManager;

/**
 * Created by swsong on 2015. 7. 21..
 */
public class ClusterServiceTest {

    Environment environment;
    ServiceManager serviceManager;
    ClusterService clusterService;

    String clusterId = "test-cluster";

    @Before
    public void init() throws GarudaException {
        String home = "production";
        environment = new Environment(home);
        environment.init();
        serviceManager = new ServiceManager(environment);
        serviceManager.asSingleton();

        clusterService = serviceManager.createService("cluster", ClusterService.class);
        clusterService.start();
        System.out.println("Before finished.");
    }

    @Test
    public void testLaunch() throws GarudaException, UnknownIaasProviderException, RunNodesException {
        String iaasType = "ec2-ap";
        String definitionId = "ec2-real";
        clusterService.createCluster(clusterId, iaasType, definitionId);
    }

    @Test
    public void testLoad() {
        ClusterTopology clusterTopology = clusterService.getClusterTopology(clusterId);
        if(clusterTopology == null) {
            System.out.println(String.format("cluster %s is null", clusterId));
        } else {
            System.out.println(clusterId);
            System.out.println(clusterTopology.toString());
        }
    }

    @Test
    public void testDestroy() throws UnknownIaasProviderException {
        clusterService.destroyCluster(clusterId);
    }
}