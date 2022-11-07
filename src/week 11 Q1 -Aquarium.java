package genericsbasic;

import java.util.ArrayList;
import java.util.List;

class Fish {
}

class Goldfish extends Fish {
}

class Guppy extends Fish {
}

class Betta extends Fish {
}

public class Aquarium<T extends Fish> {
	private List<T> fish;

	public Aquarium() {
		this.fish = new ArrayList<>();
	}

	/*
	 * The addFish method should take a single generic parameter and add it to the
	 * fish List.
	 */
	void addFish(T f) {
		// if list is empty, insert any fish
		if (fish.size() == 0) {
			fish.add(f);
		}
		/*
		 * if fish to be added is Betta remove all other fish from list
		 */
		else if (f instanceof Betta) {
			fish.clear();
			fish.add(f);
		} else {
			/*
			 * if there exists a betta fish in the list dont add another fees, else add
			 * another fish in the list
			 */
			boolean conatins_Betta = false;
			for (int i = 0; i < fish.size(); i++) {
				if (fish.get(i) instanceof Betta) {
					conatins_Betta = true;
					break;
				}
			}
			if (!conatins_Betta) {
				fish.add(f);
			}
		}
	}

	/*
	 * To remove the fish from the list which is passed by the parameter
	 */
	void removeFish(T f) {
		fish.remove(f);
	}

	/*
	 * to return list of the fish
	 */
	List<T> getFish() {
		return fish;
	}
}