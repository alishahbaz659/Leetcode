import java.util.*;

public class RandomizedSetOptimized {

    List<Integer> list;
    HashMap<Integer, Integer> map;
    Random random;

    public RandomizedSetOptimized() {
        list = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        list.add(val);
        map.put(val,list.size()-1);
        return true;
    }

    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false; //value not present
        }
        //Get the index of the element to remove
        int index = map.get(val);
        int lastElement = list.get(list.size()-1);
        //we need to bring the element to the last of the list we don't need to re-index the whole list. We just swap the last index with the
        // element that needs to be removed
        list.set(index,lastElement);
        //we need to update the index in the Map as well because the last element is swapped with the position of the element to be removed
        map.put(lastElement,index);

        //remove the last element
        list.remove(list.size()-1);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        int randomIndex = random.nextInt(list.size());
        return list.get(randomIndex);
    }

    public static void main(String[] args) {
        RandomizedSetOptimized randomizedSet = new RandomizedSetOptimized();
        randomizedSet.insert(1); // Inserts 1 to the set. Returns true as 1 was inserted successfully.
        randomizedSet.remove(2); // Returns false as 2 does not exist in the set.
        randomizedSet.insert(2); // Inserts 2 to the set, returns true. Set now contains [1,2].
        randomizedSet.getRandom(); // getRandom() should return either 1 or 2 randomly.
        randomizedSet.remove(1); // Removes 1 from the set, returns true. Set now contains [2].
        randomizedSet.insert(2); // 2 was already in the set, so return false.
        System.out.printf("" + randomizedSet.getRandom()); // Since 2 is the only number in the set, getRandom() will always
    }
}
