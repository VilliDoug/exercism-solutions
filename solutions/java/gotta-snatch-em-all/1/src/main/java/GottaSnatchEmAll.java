import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
      Set<String> collection = new HashSet<>();
      for (String card : cards) {
        collection.add(card);
      }
      return collection;
    }

    static boolean addCard(String card, Set<String> collection) {
      return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
      boolean tradable = false;
      for (String myCard : myCollection) {
        if (!theirCollection.contains(myCard)) {
          for (String theirCard : theirCollection) {
            if (!myCollection.contains(theirCard)) {
              tradable = true;
            }
          }
        }
      }
      return tradable;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
//      dont forget the empty collection checker
      if (collections.isEmpty()) {
        return Collections.emptySet();
      }
      Set<String> common = new HashSet<>(collections.get(0));
      for (Set<String> collection : collections) {
        common.retainAll(collection);
      }
      return common;
    }

    static Set<String> allCards(List<Set<String>> collections) {
      if (collections.isEmpty()) {
        return Collections.emptySet();
      }
      Set<String> all = new HashSet<>(collections.get(0));
      for (Set<String> collection : collections) {
        all.addAll(collection);
      }
      return all;
    }
}
