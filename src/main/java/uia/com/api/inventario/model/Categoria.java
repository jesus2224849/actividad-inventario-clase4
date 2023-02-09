package uia.com.api.inventario.model;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.ArrayList;

@Node("Categoria")
public class Categoria {
    @Id
    private String id;
    @Property("name")
    private String name;
    @Property ("clase")
    private String clase;

    @Relationship(type = "AGEGADO2")
    private ArrayList<Subpartida> subpartidas = new ArrayList<Subpartida>();

    public Categoria(String id, String name, String clase){
        this.id = id;
        this.name = name;
        this.clase = clase;
    }

    public Categoria(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public ArrayList<Subpartida> getSubpartidas() {
        return subpartidas;
    }

    public void setSubpartidas(ArrayList<Subpartida> subpartidas) {
        this.subpartidas = subpartidas;
    }
}
