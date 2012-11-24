package net.simpleframework.workflow.schema;

/**
 * 这是一个开源的软件，请在LGPLv3下合法使用、修改或重新发布。
 * 
 * @author 陈侃(cknet@126.com, 13910090885)
 *         http://code.google.com/p/simpleframework/
 *         http://www.simpleframework.net
 */
public enum EVariableType {
	vtString {

		@Override
		public String toString() {
			return "java.lang.String";
		}
	},

	vtBoolean {

		@Override
		public String toString() {
			return "java.lang.Boolean";
		}
	},

	vtByte {

		@Override
		public String toString() {
			return "java.lang.Byte";
		}
	},

	vtShort {

		@Override
		public String toString() {
			return "java.lang.Short";
		}
	},

	vtInt {

		@Override
		public String toString() {
			return "java.lang.Integer";
		}
	},

	vtLong {

		@Override
		public String toString() {
			return "java.lang.Long";
		}
	},

	vtFloat {

		@Override
		public String toString() {
			return "java.lang.Float";
		}
	},

	vtDouble {

		@Override
		public String toString() {
			return "java.lang.Double";
		}
	},

	vtChar {

		@Override
		public String toString() {
			return "java.lang.Character";
		}
	},

	vtDate {

		@Override
		public String toString() {
			return "java.util.Date";
		}
	},

	vtCollection {

		@Override
		public String toString() {
			return "java.util.Collection";
		}
	},

	vtMap {

		@Override
		public String toString() {
			return "java.util.Map";
		}
	}
}
