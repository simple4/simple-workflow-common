package net.simpleframework.workflow.schema;

import static net.simpleframework.common.I18n.$m;

/**
 * 这是一个开源的软件，请在LGPLv3下合法使用、修改或重新发布。
 * 
 * @author 陈侃(cknet@126.com, 13910090885)
 *         http://code.google.com/p/simpleframework/
 *         http://www.simpleframework.net
 */
public enum ETransitionLogic {
	and {

		@Override
		public String toString() {
			return $m("ETransitionLogic.0");
		}
	},

	not {

		@Override
		public String toString() {
			return $m("ETransitionLogic.1");
		}
	}
}
