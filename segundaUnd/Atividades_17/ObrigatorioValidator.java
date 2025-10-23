package segundaUnd.Atividades_17;

import java.lang.reflect.Field;

public class ObrigatorioValidator {

	public static void validate(Object obj) throws IllegalAccessException {
        // Verifica se o objeto não é nulo
        if (obj == null) {
            throw new IllegalArgumentException("O objeto não pode ser nulo.");
        }

        // Obtém todos os campos da classe
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {
            // Verifica se o campo tem a anotação @NotNull
            if (field.isAnnotationPresent(Obrigatorio.class)) {
                field.setAccessible(true);  // Torna o campo acessível, mesmo que privado

                // Verifica se o valor do campo é null
                if (field.get(obj) == null) {
                    throw new RuntimeException("O campo " + field.getName() + " não pode ser nulo.");
                }
            }
        }
    }
}
