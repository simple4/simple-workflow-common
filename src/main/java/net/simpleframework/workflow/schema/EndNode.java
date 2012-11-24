package net.simpleframework.workflow.schema;

import static net.simpleframework.common.I18n.$m;
import net.simpleframework.common.StringUtils;
import net.simpleframework.common.xml.XmlElement;

/**
 * 这是一个开源的软件，请在LGPLv3下合法使用、修改或重新发布。
 * 
 * @author 陈侃(cknet@126.com, 13910090885)
 *         http://code.google.com/p/simpleframework/
 *         http://www.simpleframework.net
 */
public class EndNode extends AbstractTaskNode {

	public EndNode(final XmlElement beanElement, final ProcessNode processNode) {
		super(beanElement == null ? addNode(processNode, "end-node") : beanElement, processNode);
	}

	@Override
	public short getTasknodeType() {
		return ENDNODE_TYPE;
	}

	@Override
	public String toString() {
		return StringUtils.text(super.toString(), $m("EndNode.0"));
	}
}
