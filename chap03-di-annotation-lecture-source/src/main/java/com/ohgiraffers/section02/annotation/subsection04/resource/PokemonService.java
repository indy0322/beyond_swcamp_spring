package com.ohgiraffers.section02.annotation.subsection04.resource;

import com.ohgiraffers.section02.annotation.common.Pokemon;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("pokemonServiceResource")
public class PokemonService {

    /* 설명. @Resource를 활용한 DI */
    /* 설명. 1. bean을 1개만 주입받고 싶을 때 */
    @Resource(name = "pikachu")
    private Pokemon pokemon;


    /* 설명. 2. bean 여러개 주입받고 싶을 때 */
    @Resource
    private List<Pokemon> pokemonList;

    public void pokemonAttack() {
        pokemonList.forEach(pokemon -> pokemon.attack());
    }

}
