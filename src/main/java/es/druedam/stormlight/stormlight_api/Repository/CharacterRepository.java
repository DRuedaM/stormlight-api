package es.druedam.stormlight.stormlight_api.Repository;

import es.druedam.stormlight.stormlight_api.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Character, Integer>
{

}
