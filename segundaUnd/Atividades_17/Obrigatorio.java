package segundaUnd.Atividades_17;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ FIELD, PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface Obrigatorio {

}
