package com.genuitec.piplug.tools.model;

import java.util.Date;

import com.genuitec.piplug.client.BundleDescriptor;

public class DeploymentStatus {

	private BundleDescriptor descriptor;

	public DeploymentStatus(BundleDescriptor descriptor) {
		this.descriptor = descriptor;
	}

	public DeploymentState getState() {
		return descriptor.getLastUpdatedOn() == null ? DeploymentState.DEPLOYED : DeploymentState.NEVER_DEPLOYED;
	}

	public Date getDate() {
		return descriptor.getLastUpdatedOn();
	}
}