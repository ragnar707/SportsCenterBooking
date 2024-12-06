package com.sportcenter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportcenter.model.Prenotazione;
import com.sportcenter.repository.CampoSportivoRepository;
import com.sportcenter.repository.PrenotazioneRepository;
import com.sportcenter.repository.UtenteRepository;

@Service
public class PrenotazioniService {

    @Autowired
    private CampoSportivoRepository campoSportivoRepository;
    @Autowired
    private UtenteRepository utenteRepository;
    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    public Prenotazione create(PrenotazioneRequest request){
        //logica necessaria per
        //1. recuperare l'utente dal repository UtenteRepository
        //2. recuperare il campoSportivo dal repository CampoSportivoRepository
        //3. settare i valori in un oggetto prenotazione
        //4. salvare

    }
    
}
