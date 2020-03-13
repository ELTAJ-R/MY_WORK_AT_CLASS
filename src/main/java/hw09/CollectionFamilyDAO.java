package hw09;



import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class CollectionFamilyDAO implements FamilyDAO<Family> {




    private List<Family>data=new ArrayList<>();
    @Override
    public Optional<Family> get(int index) {
        if(index>=0&&index<data.size()) return Optional.of(data.get(index));
        else return null;

    }
//    public Optional<Family>getByObject(Family search){
//        data.
//    }

    @Override
    public Collection<Family> getAll() {
        return data;
    }

    @Override
    public void create(Family obj) {


    }


    @Override
    public boolean saveFamily(Family obj) {
        if(!data.contains(obj)){
            data.add(data.size(),obj);
            return true;
        }
        else return false;

    }

    @Override
    public boolean delete(Family obj) {
        if(data.contains(obj)){
            data.remove(obj);
            return true;}
        else return false;


    }

    @Override
    public boolean delete(int index) {
        if(index>=0&&index<data.size()){
            data.remove(index);
            return true;
        }
        else return false;
    }

    @Override
    public void update(Family before) {
       data.remove(before);
       data.add(data.indexOf(before),before);

    }
}
