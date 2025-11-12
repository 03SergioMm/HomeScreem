package com.ecommerce.activityimages.ui.data


import com.ecommerce.activityimages.R


data class Team(
    val id: String,
    val name: String,
    val imageResId: Int,
    val description: String
)

object TeamRepository {


    private val teams = listOf(
        Team(
            id = "Messi",
            name = "TOP #1 MEJOR DEL MUNDO",
            imageResId = R.drawable.messi_mundial,
            description = "Lionel Messi es ampliamente considerado uno de los mejores jugadores de fútbol de todos los tiempos, con una carrera marcada por innumerables récords, títulos y reconocimientos, como ocho Balones de Oro. Su trayectoria, iniciada en Rosario, " +
                    "lo llevó a una trayectoria legendaria en el FC Barcelona, ganando múltiples títulos de la Champions League y superando estadísticas de otros grandes futbolistas en la historia. Su juego, una combinación de habilidad, visión y goles, le ha valido comparaciones constantes con leyendas como Pelé y Maradona, y su éxito se culminó con la Copa del Mundo que ganó con Argentina en 2022. A pesar de su estatus, él mismo ha demostrado humildad, sugiriendo que estar entre los mejores es un honor, pero el objetivo final siempre fue el éxito colectivo, como su deseo de ser campeón del mundo con su selección"
        ),
        Team(
            id = "Cristiano Ronaldo ",
            name = "TOP #2 MEJOR DEL MUNDO",
            imageResId = R.drawable.cr7,
            description = "Jugador completo: Ronaldo afirma que es el futbolista más completo que ha existido, ya que puede realizar todo bien en el campo: es bueno de cabeza, tiene buena técnica con el pie izquierdo, es fuerte, rápido y salta bien.\n" +
                    "Mentalidad ganadora: Se considera a sí mismo una máquina de matar, un robot dentro de la cancha, y atribuye su éxito a una mentalidad ganadora y al sacrificio.\n" +
                    "Respeto por los gustos ajenos: Aunque defiende su posición, reconoce que entiende y respeta que los aficionados puedan preferir a otros jugadores como Messi, Pelé o Maradona, pero insiste en que nadie ha demostrado ser más completo.\n" +
                    "Las estadísticas y logros: Se ha referido a los números y récords de su carrera, como ser el máximo goleador en la historia del fútbol masculino, para justificar su creencia."
        ),
        Team(
            id = "Neymar  Jr",
            name = " TOP #3 MEJOR DEL MUNDO",
            imageResId = R.drawable.ney,
            description = "Nacido en Mogi das Cruzes, Brasil, en 1992, desarrolló un estilo de juego basado en la magia, los regates y el \"jogo bonito\" desde la infancia.\n" +
                    "Debutó con el Santos FC a los 17 años y ganó la Copa Libertadores en 2011, devolviendo al club la gloria de la era Pelé.\n" +
                    "Formó parte del tridente \"MSN\" en el Barcelona, junto a Messi y Suárez, con quien ganó una Champions League, entre otros títulos."
        ),
        Team(
            id = "Kylian Mbappé",
            name = "TOP #4 MEJOR DEL MUNDO",
            imageResId = R.drawable.mbappe,
            description = "Kylian Mbappé, considerado uno de los mejores jugadores de su generación, ha demostrado su ambición de ser el mejor a través de sus logros, como ser el jugador más joven en marcar en dos finales de la Copa del Mundo y ser el máximo goleador del torneo de 2022. A pesar de su innegable talento, él enfoca su discurso en la humildad y la importancia del equipo, mencionando en su presentación con el" +
                    " Real Madrid que llega al \"mejor club del mundo\" para ganar títulos colectivos, no solo individuales"
        ),
        Team(
            id = "Lamine Yamal",
            name = "TOP #5 MEJOR DEL MUNDO",
            imageResId = R.drawable.yamal,
            description = "Lamine Yamal es un joven futbolista del FC Barcelona y de la selección española, nacido el 13 de julio de 2007, que ha generado un debate sobre si es el mejor jugador del mundo debido a su impresionante rendimiento a una edad temprana. Muchos lo consideran el mejor jugador joven de la historia por su velocidad, técnica y visión de juego, habiendo ganado ya títulos como la Eurocopa 2024 con España y la Liga con el Barcelona. "
        )
    )

    fun getTeams(): List<Team> = teams

    fun getTeam(id: String): Team? = teams.find { it.id == id }
}