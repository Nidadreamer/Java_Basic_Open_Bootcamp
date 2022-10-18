package Ejercicios.E06;

public class CocheCRUDImpl implements CocheCRUD {

    @Override
    public void save() {

    }

    @Override
    public void findAll() {

    }

    @Override
    public void delete() {

    }

    String save = "Guardando los coches";
    String findAll = "Buscando los coches";
    String delete = "Borrando los coches";

    @Override
    public String toString() {
        return "CocheCRUDImpl{" +
                "save='" + save + '\'' +
                ", findAll='" + findAll + '\'' +
                ", delete='" + delete + '\'' +
                '}';
    }
}




