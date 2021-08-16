package com.example.tv;

import java.util.ArrayList;
import java.util.List;

public final class MovieList {
    public static final String MOVIE_CATEGORY[] = {
            "Estrenos",
            "Tendencias",
            "Acción",
            "Clasicas",
            "Comedia",
            "Documentales",
    };

    private static List<Movie> list;
    private static long count = 0;

    public static List<Movie> getList() {
        if (list == null) {
            list = setupMovies();
        }
        return list;
    }

    public static List<Movie> setupMovies() {
        list = new ArrayList<>();
        String title[] = {
                "El Stand de los Besos 3",
                "Hotel Transilvania 3",
                "Becket",
                "VIVO",
                "El infierno"
        };

        String description [] = { "Decidida a aprovechar al máximo su último verano antes de irse a la universidad, Elle planifica su lista de deseos mientras resuelve qué rumbo tomar con Noah y Lee. ",
                "Drácula queda flechado al conocer a Ericka, la encantadora pero misteriosa capitana del crucero monstruoso que Mavis organiza para la familia.",
                "Un turista estadounidense se da a la fuga luego de que un trágico accidente en Grecia lo hunde en una conspiración política que lo convierte en el blanco de un asesinato.",
                "Un kinkajú que adora la música se embarca en un viaje increíble para cumplir su destino y entregar una canción de amor de parte de un viejo amigo.",
                "Para sobrevivir, un mexicano deportado no tiene más remedio que unirse al despiadado cártel que ha corrompido su ciudad natal"
        };
        String studio[] = {
                "Picture Loom Productions", "Sony Pictures Animation", "Frenesy Film", "Columbia Pictures", "Bandidos Films"
        };
        String videoUrl[] = {
                "https://www.finaltest.com.mx/Video-prueba-de-p/video-0043.htm",
                "https://www.youtube.com/watch?v=dQw4w9WgXcQ",
                "https://www.youtube.com/watch?v=dQw4w9WgXcQ",
                "https://www.youtube.com/watch?v=dQw4w9WgXcQ",
                "https://www.youtube.com/watch?v=dQw4w9WgXcQ"
        };
        String bgImageUrl[] = {
                "https://elbocon.pe/resizer/Tqi77BiU4EHUmJD0ACQiA1VWNgA=/580x330/smart/filters:format(jpeg):quality(75)/cloudfront-us-east-1.images.arcpublishing.com/elcomercio/WJWN4L3WEVFVLPCYFK6WX6XDBM.jpg",
                "https://lh3.googleusercontent.com/proxy/-wevUXcdHd2QKiTll2jX83vjGZQabMl6M5IwwGHiLhYuG2swUdS0EIKpDHW3qo0U37_r3yWjhCCQsk6TY5Gs0n5k-xXUCmVDKdccRSsKsR_3kSgNwLgboLawMkWprBwU33C2jA",
                "https://i0.wp.com/netfliteando.com/wp-content/uploads/2021/08/Beckett-Netflix-Pelicula-min.jpg",
                "https://www.pointmagazine.es/wp-content/uploads/2021/08/Vivo-%C2%BFQue-fecha-y-hora-de-lanzamiento-de-Netflix-Actores.jpg",
                "https://3.bp.blogspot.com/-e7qFjeZumIs/TnodpjqoBKI/AAAAAAAABGo/1ZVNnSUmtRs/s1600/elinfiernoposter.jpg"
                };
        String cardImageUrl[] = {
                "https://elbocon.pe/resizer/Tqi77BiU4EHUmJD0ACQiA1VWNgA=/580x330/smart/filters:format(jpeg):quality(75)/cloudfront-us-east-1.images.arcpublishing.com/elcomercio/WJWN4L3WEVFVLPCYFK6WX6XDBM.jpg",
                "https://lh3.googleusercontent.com/proxy/-wevUXcdHd2QKiTll2jX83vjGZQabMl6M5IwwGHiLhYuG2swUdS0EIKpDHW3qo0U37_r3yWjhCCQsk6TY5Gs0n5k-xXUCmVDKdccRSsKsR_3kSgNwLgboLawMkWprBwU33C2jA",
                "https://i0.wp.com/netfliteando.com/wp-content/uploads/2021/08/Beckett-Netflix-Pelicula-min.jpg",
                "https://www.pointmagazine.es/wp-content/uploads/2021/08/Vivo-%C2%BFQue-fecha-y-hora-de-lanzamiento-de-Netflix-Actores.jpg",
                "https://3.bp.blogspot.com/-e7qFjeZumIs/TnodpjqoBKI/AAAAAAAABGo/1ZVNnSUmtRs/s1600/elinfiernoposter.jpg"
        };

        for (int index = 0; index < title.length; ++index) {
            list.add(
                    buildMovieInfo(
                            title[index],
                            description[index],
                            studio[index],
                            videoUrl[index],
                            cardImageUrl[index],
                            bgImageUrl[index]));
        }

        return list;
    }

    private static Movie buildMovieInfo(
            String title,
            String description,
            String studio,
            String videoUrl,
            String cardImageUrl,
            String backgroundImageUrl) {
        Movie movie = new Movie();
        movie.setId(count++);
        movie.setTitle(title);
        movie.setDescription(description);
        movie.setStudio(studio);
        movie.setCardImageUrl(cardImageUrl);
        movie.setBackgroundImageUrl(backgroundImageUrl);
        movie.setVideoUrl(videoUrl);
        return movie;
    }
}