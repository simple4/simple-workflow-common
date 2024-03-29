package net.simpleframework.workflow.schema;

import static net.simpleframework.common.I18n.$m;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import net.simpleframework.common.Convert;
import net.simpleframework.common.StringUtils;
import net.simpleframework.common.xml.XmlElement;

/**
 * 这是一个开源的软件，请在LGPLv3下合法使用、修改或重新发布。
 * 
 * @author 陈侃(cknet@126.com, 13910090885)
 *         http://code.google.com/p/simpleframework/
 *         http://www.simpleframework.net
 */
public class SubNode extends AbstractTaskNode {
	private String url;

	private String model;

	private boolean sync;

	private Set<VariableMapping> mappingSet;

	public SubNode(final XmlElement beanElement, final ProcessNode processNode) {
		super(beanElement == null ? addNode(processNode, "sub-node") : beanElement, processNode);
	}

	public String getUrl() {
		return url;
	}

	public SubNode setUrl(final String url) {
		this.url = url;
		return this;
	}

	public String getModel() {
		return model;
	}

	public SubNode setModel(final String model) {
		this.model = model;
		return this;
	}

	public boolean isSync() {
		return sync;
	}

	public SubNode setSync(final boolean sync) {
		this.sync = sync;
		return this;
	}

	public Set<VariableMapping> getMappingSet() {
		return mappingSet;
	}

	@Override
	public void syncElement() {
		super.syncElement();

		removeChildren("variable-mapping");
		final Set<VariableMapping> mappingSet = getMappingSet();
		if (mappingSet.size() > 0) {
			final XmlElement vMappingElement = addElement("variable-mapping");
			for (final VariableMapping vMapping : mappingSet) {
				addElement(vMappingElement, "value").setText(vMapping.toString());
			}
		}
	}

	@Override
	public void parseElement() {
		super.parseElement();

		mappingSet = new LinkedHashSet<VariableMapping>();
		final Iterator<?> it = children("variable-mapping");
		while (it.hasNext()) {
			final String[] arr = StringUtils.split(((XmlElement) it.next()).getText(), ";");
			if (arr != null && arr.length == 2) {
				mappingSet.add(new VariableMapping(arr[0], arr[1]));
			}
		}
	}

	@Override
	public short getTasknodeType() {
		return SUBNODE_TYPE;
	}

	@Override
	public String toString() {
		return StringUtils.text(super.toString(), $m("SubNode.0"));
	}

	public static class VariableMapping {
		public String variable, mapping;

		public VariableMapping(final String variable, final String mapping) {
			this.variable = variable;
			this.mapping = mapping;
		}

		@Override
		public int hashCode() {
			return toString().hashCode();
		}

		@Override
		public boolean equals(final Object obj) {
			return toString().equals(Convert.toString(obj));
		}

		@Override
		public String toString() {
			return variable + ";" + mapping;
		}
	}
}
