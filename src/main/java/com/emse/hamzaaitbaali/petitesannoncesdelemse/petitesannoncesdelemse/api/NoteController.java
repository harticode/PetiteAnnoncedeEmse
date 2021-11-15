package com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.api;


import com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.dao.NoteDao;
import com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.dao.UserDao;
import com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.dto.NoteDto;
import com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.model.Note;
import com.emse.hamzaaitbaali.petitesannoncesdelemse.petitesannoncesdelemse.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin
@RestController // RestController is a Spring stereotype to mark a class as a rest service
@RequestMapping("/api/notes") // @RequestMapping is used to define a global URL prefix used to manage a resource (in our example all requests that start with /api/windows will be handle by this controller)
@Transactional
// @Transactional is used to delegate a transaction opening to Spring. Spring will initiate a transaction for each entry point of this controller. This is important because with Hibernate you cannot execute a query outside of a transaction.

public class NoteController {
    private final NoteDao noteDao;
    private final UserDao userDao;

    public NoteController(NoteDao noteDao, UserDao userDao) {
        this.noteDao = noteDao;
        this.userDao = userDao;
    }

    @GetMapping
    public List<NoteDto> findAll(){
        return noteDao.findAll().stream().map(NoteDto::new).collect(Collectors.toList());
    }

    @GetMapping(path = "/{type}")
    public List<NoteDto> findNotesbyType(@PathVariable Integer type){
        return noteDao.findNotesbyType(type).stream().map(NoteDto::new).collect(Collectors.toList());
    }

    @PostMapping
    public NoteDto create(@RequestBody NoteDto dto){
        User user = userDao.getUserByEmail(dto.getUser().getEmail());
        Note note = null;
        note = noteDao.save(new Note(dto.getDateofPost(), dto.getContentOfTheNote() , dto.getType(), user));
        return new NoteDto(note);
    }

    @PutMapping("/{id}")
    public NoteDto update(@PathVariable Long id, @RequestBody NoteDto dto){
        Note note = noteDao.findNotesById(id);
        note.setContentOfTheNote(dto.getContentOfTheNote());
        note.setDateofPost(dto.getDateofPost());
        return new NoteDto(note);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        noteDao.removeNoteById(id);
        return ResponseEntity.noContent().build();
    }

}
