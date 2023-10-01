    package ca.sheridanc.elzeind.ex42_formBindin.controller;

    import ca.sheridanc.elzeind.ex42_formBindin.beans.Song;
    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.ModelAttribute;
    import org.springframework.web.bind.annotation.PostMapping;

    import java.util.List;
    import java.util.concurrent.CopyOnWriteArrayList;

    @Controller
    public class SongsController {

        List<Song> songList = new CopyOnWriteArrayList<Song>();

        @GetMapping("/song")
        public String index (Model model){
            model.addAttribute("song", new Song());
            model.addAttribute("songList", songList);
            return "song";
        }

        @PostMapping("/addSong")
        public String addSong(Model model, @ModelAttribute Song song) {
            songList.add(song);
            model.addAttribute("song", new Song());
            model.addAttribute("songList", songList);
            return "song";
        }
    }
