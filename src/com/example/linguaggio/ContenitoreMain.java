package com.example.linguaggio;

public class ContenitoreMain {

	public static void main(String[] args) {

		Double d = 12.78;
		String s = "Hello World";

		ContenitoreGenerico contenitore = new ContenitoreGenerico(d);

		Double doppio = (Double) /* cast */ contenitore.getObject();
		/* Uso del contenitore personalizzabile */
		/* java generics */
		ContenitorePersonalizzabile<String> cp = new ContenitorePersonalizzabile<>(s);
		String str = cp.getPayload();
	}

}
