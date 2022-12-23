package parse;

public class Parse {
	
	public static void main (String[] args) {
		System.out.println(iteration("public class MyClass {\n"
				+ "    public static void main(String args[]) {\n"
				+ "      float x=10;\n"
				+ "      int y=25;\n"
				+ "      int z=x+y;\n"
				+ "      for (int i = 0; i < 10; i++) {\n"
				+ "          System.out.println(\"Sum of x+y = \" + z);\n"
				+ "      }\n"
				+ "      int s = 0;\n"
				+ "      while (s < 10) {\n"
				+ "          System.out.println(\"Sum of x+y = \" + z);\n"
				+ "          s++;\n"
				+ "      }\n"
				+ "      if (x > y) {\n"
				+ "          System.out.println(\"Sum of x+y = \" + z);\n"
				+ "      } else {\n"
				+ "          return;\n"
				+ "      }\n"
				+ "      System.out.println(\"Sum of x+y = \" + z);\n"
				+ "    }\n"
				+ "}", ""));
	}
	//changing all variables to higher data types
	public static String variable (String code, String output) {
		switch (code.length()) {
		case (0):
			return output;
		default:
			switch (code.charAt(0)) {
			default:
				output += "" + code.charAt(0);
				return variable(code.substring(1), output);
			case ('i'):
				switch (code.charAt(1)) {
				default:
					output += "" + code.charAt(0);
					return variable(code.substring(1), output);
				case ('n'):
					switch (code.charAt(2)) {
					default:
						output += "" + code.charAt(0);
						return variable(code.substring(1), output);
					case ('t'):
						switch (code.charAt(3)) {
						default:
							output += "" + code.charAt(0);
							return variable(code.substring(1), output);
						case (' '):
							output += "long";
						}
					break;
					}
				return variable(code.substring(3), output);
				}
			case ('f'):
				switch (code.charAt(1)) {
				default:
					output += "" + code.charAt(0);
					return variable(code.substring(1), output);
				case ('l'):
					switch (code.charAt(2)) {
					default:
						output += "" + code.charAt(0);
						return variable(code.substring(1), output);
					case ('o'):
						switch (code.charAt(3)) {
						default:
							output += "" + code.charAt(0);
							return variable(code.substring(1), output);
						case ('a'):
							switch (code.charAt(4)) {
							default:
								output += "" + code.charAt(0);
								return variable(code.substring(1), output);
							case ('t'):
								switch (code.charAt(5)) {
								default:
									output += "" + code.charAt(0);
									return variable(code.substring(1), output);
								case (' '):
									output += "double";
								}
							break;
							}
						break;
						}
					break;
					}
				return variable(code.substring(5), output);
				}
			case ('b'):
				switch (code.charAt(1)) {
				default:
					output += "" + code.charAt(0);
					return variable(code.substring(1), output);
				case ('y'):
					switch (code.charAt(2)) {
					default:
						output += "" + code.charAt(0);
						return variable(code.substring(1), output);
					case ('t'):
						switch (code.charAt(3)) {
						default:
							output += "" + code.charAt(0);
							return variable(code.substring(1), output);
						case ('e'):
							switch (code.charAt(4)) {
							default:
								output += "" + code.charAt(0);
								return variable(code.substring(1), output);
							case (' '):
								output += "long";
							break;
							}
						break;
						}
					break;
					}
				return variable(code.substring(5), output);
				}
			case ('s'):
				switch (code.charAt(1)) {
				default:
					output += "" + code.charAt(0);
					return variable(code.substring(1), output);
				case ('h'):
					switch (code.charAt(2)) {
					default:
						output += "" + code.charAt(0);
						return variable(code.substring(1), output);
					case ('o'):
						switch (code.charAt(3)) {
						default:
							output += "" + code.charAt(0);
							return variable(code.substring(1), output);
						case ('r'):
							switch (code.charAt(4)) {
							default:
								output += "" + code.charAt(0);
								return variable(code.substring(1), output);
							case ('t'):
								switch (code.charAt(5)) {
								default:
									output += "" + code.charAt(0);
									return variable(code.substring(1), output);
								case (' '):
									output += "long";
								}
							break;
							}
						break;
						}
					break;
					}
				return variable(code.substring(5), output);
				}
			}
		}
	}
	//changing logic comparisons
	public static String conditional (String code, String output) {
		return "";
	}
	//assembles new code
	public static String iteration (String code, String output) {
		return "";
	}
	//assembles new code
	public static String statement () {
		return "";
	}
}
