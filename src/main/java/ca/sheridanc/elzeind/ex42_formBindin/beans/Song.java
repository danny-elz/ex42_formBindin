    package ca.sheridanc.elzeind.ex42_formBindin.beans;

    import lombok.Data;
    import lombok.NoArgsConstructor;

    @Data
    @NoArgsConstructor
    public class Song {
        private Long id;
        private String title;
        private String artist;
        private String genre;

        private final String[] GENRES = {"Electronic", "Country", "Classical",
                "Indie"};

    }
