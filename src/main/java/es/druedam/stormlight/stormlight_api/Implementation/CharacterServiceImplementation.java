package es.druedam.stormlight.stormlight_api.Implementation;

import es.druedam.stormlight.stormlight_api.Repository.CharacterRepository;
import es.druedam.stormlight.stormlight_api.Service.CharacterService;
import es.druedam.stormlight.stormlight_api.model.Character;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterServiceImplementation implements CharacterService
{
    @Autowired
    CharacterRepository characterRepository;


    @Override
    public List<Character> getAllCharacters() {
        return characterRepository.findAll();
    }
}
