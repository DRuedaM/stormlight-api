package es.druedam.stormlight.stormlight_api.controller;

import es.druedam.stormlight.stormlight_api.Implementation.CharacterServiceImplementation;
import es.druedam.stormlight.stormlight_api.model.Character;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/characters")
public class CharacterController
{
    @Autowired
    CharacterServiceImplementation characterServiceImplementation;

    @GetMapping
    public List<Character> getAllCharacters()
    {
        return characterServiceImplementation.getAllCharacters();
    }
}
