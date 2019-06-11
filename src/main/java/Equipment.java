import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY,property = "name")
@JsonSubTypes(value = {
        @JsonSubTypes.Type(value = Daedalus.class, name = "Daedalus"),
        @JsonSubTypes.Type(value = HugeDrink.class, name = "Huge drink"),
        @JsonSubTypes.Type(value = StarWand.class, name = "Star wand"),
})
public interface Equipment {
}
