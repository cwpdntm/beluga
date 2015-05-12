
package org.opencloudengine.garuda.controller.mesos.marathon.model.groups.getgroups.res;

import com.fasterxml.jackson.annotation.*;
import org.opencloudengine.garuda.controller.mesos.marathon.model.apps.getapps.res.App;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
	"apps",
	"dependencies",
	"groups",
	"id",
	"version"
})
public class GetGroups {

	@JsonProperty("apps")
	private List<App> apps;
	@JsonProperty("dependencies")
	private List<Object> dependencies;
	@JsonProperty("groups")
	private List<Group> groups;
	@JsonProperty("id")
	private String id;
	@JsonProperty("version")
	private String version;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("apps")
	public List<App> getApps() {
		return apps;
	}

	@JsonProperty("apps")
	public void setApps(List<App> apps) {
		this.apps = apps;
	}

	@JsonProperty("dependencies")
	public List<Object> getDependencies() {
		return dependencies;
	}

	@JsonProperty("dependencies")
	public void setDependencies(List<Object> dependencies) {
		this.dependencies = dependencies;
	}

	@JsonProperty("groups")
	public List<Group> getGroups() {
		return groups;
	}

	@JsonProperty("groups")
	public void setGroups(List<Group> groups) {
		this.groups = groups;
	}

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("version")
	public String getVersion() {
		return version;
	}

	@JsonProperty("version")
	public void setVersion(String version) {
		this.version = version;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		GetGroups getGroups = (GetGroups) o;

		if (apps != null ? !apps.equals(getGroups.apps) : getGroups.apps != null) return false;
		if (dependencies != null ? !dependencies.equals(getGroups.dependencies) : getGroups.dependencies != null)
			return false;
		if (groups != null ? !groups.equals(getGroups.groups) : getGroups.groups != null) return false;
		if (id != null ? !id.equals(getGroups.id) : getGroups.id != null) return false;
		if (version != null ? !version.equals(getGroups.version) : getGroups.version != null) return false;
		if (additionalProperties != null ? !additionalProperties.equals(getGroups.additionalProperties) : getGroups.additionalProperties != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = apps != null ? apps.hashCode() : 0;
		result = 31 * result + (dependencies != null ? dependencies.hashCode() : 0);
		result = 31 * result + (groups != null ? groups.hashCode() : 0);
		result = 31 * result + (id != null ? id.hashCode() : 0);
		result = 31 * result + (version != null ? version.hashCode() : 0);
		result = 31 * result + (additionalProperties != null ? additionalProperties.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "GetGroups{" +
			"apps=" + apps +
			", dependencies=" + dependencies +
			", groups=" + groups +
			", id='" + id + '\'' +
			", version='" + version + '\'' +
			", additionalProperties=" + additionalProperties +
			'}';
	}
}
