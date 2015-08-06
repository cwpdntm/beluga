package org.opencloudengine.garuda.action.cluster;

import org.opencloudengine.garuda.action.ActionRequest;
import org.opencloudengine.garuda.action.RunnableAction;

/**
 * Created by swsong on 2015. 8. 6..
 */
public class DeployWebAppActionRequest extends ActionRequest {

    @Override
    public boolean compareUnique(ActionRequest other) {
        return false;
    }

    @Override
    public RunnableAction createAction() {
        return new DeployWebAppAction(this);
    }
}
