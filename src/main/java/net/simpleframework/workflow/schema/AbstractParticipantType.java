package net.simpleframework.workflow.schema;

import net.simpleframework.common.xml.XmlElement;

/**
 * 这是一个开源的软件，请在LGPLv3下合法使用、修改或重新发布。
 * 
 * @author 陈侃(cknet@126.com, 13910090885)
 *         http://code.google.com/p/simpleframework/
 *         http://www.simpleframework.net
 */
public abstract class AbstractParticipantType extends AbstractNode {
	private String participant;

	public AbstractParticipantType(final XmlElement beanElement, final AbstractNode parent) {
		super(beanElement, parent);
	}

	public String getParticipant() {
		return participant;
	}

	public AbstractParticipantType setParticipant(final String participant) {
		this.participant = participant;
		return this;
	}

	public static class Role extends AbstractParticipantType {

		public Role(final XmlElement beanElement, final AbstractNode parent) {
			super(beanElement == null ? addParticipant(parent, "role") : beanElement, parent);
		}
	}

	public static class User extends AbstractParticipantType {

		public User(final XmlElement beanElement, final AbstractNode parent) {
			super(beanElement == null ? addParticipant(parent, "user") : beanElement, parent);
		}
	}

	static XmlElement addParticipant(final AbstractNode parent, final String name) {
		return parent.addChild("participant-type", name, true);
	}
}
