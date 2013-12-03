import java.util.Collection;

import Entities.Entity;




public class Combat implements Encounter {
	
	Collection<Card> defenderDamageStack;
	Collection<Card> attackerDamageStack;
	Collection<Card> combatStack;
	Collection<Card> defenderHand;
	Collection<Card> attackerHand;
	Collection<Card> attackerPlayedCards;
	Collection<Card> defenderPlayedCards;
	int state;
	int turn; 
	
	Entity attacker;
	Entity defender;
	
	
	public void playCard(Card card) {
		
	}
	
	public void counterAttack(Collection<Card> cards) {
		
	}
	
	public void resolveCombat() {
		
	}
	
	
}

