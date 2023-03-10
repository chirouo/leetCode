import java.util.HashSet;
import java.util.Set;

class containsDuplicateSolution {
    public boolean containsDuplicate(int[] nums) {
        Set set = new HashSet<Integer>();
        for (int x : nums) {
            if (!set.add(x)) {
                return false;
            }
        }
        return true;
    }
}

