-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-10-2025 a las 01:18:27
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `culturarte`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `NOMBRE` varchar(255) NOT NULL,
  `CATPADRE_NOMBRE` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`NOMBRE`, `CATPADRE_NOMBRE`) VALUES
('Categoría', NULL),
('Humoristas', 'Carnaval'),
('Lubolos', 'Carnaval'),
('Murga', 'Carnaval'),
('Parodistas', 'Carnaval'),
('Revista', 'Carnaval'),
('Carnaval', 'Categoría'),
('Cine', 'Categoría'),
('Danza', 'Categoría'),
('Literatura', 'Categoría'),
('Música', 'Categoría'),
('Stand-up', 'Categoría'),
('Teatro', 'Categoría'),
('Cine a Pedal', 'Cine'),
('Cine al Aire Libre', 'Cine'),
('Ballet', 'Danza'),
('Flamenco', 'Danza'),
('Concierto', 'Música'),
('Festival', 'Música'),
('Comedia', 'Teatro'),
('Teatro Dramático', 'Teatro'),
('Teatro Musical', 'Teatro');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `colaboracion`
--

CREATE TABLE `colaboracion` (
  `ID` int(11) NOT NULL,
  `FECHA` datetime DEFAULT NULL,
  `MONTO` int(11) DEFAULT NULL,
  `RETORNO` varchar(255) DEFAULT NULL,
  `COLABORADOR_NICKNAME` varchar(255) DEFAULT NULL,
  `PROPUESTA_TITULO` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `colaboracion`
--

INSERT INTO `colaboracion` (`ID`, `FECHA`, `MONTO`, `RETORNO`, `COLABORADOR_NICKNAME`, `PROPUESTA_TITULO`) VALUES
(1, '2025-10-05 02:38:46', 50000, 'PORCENTAJE_GANANCIAS', 'novick', 'Cine en el Botánico'),
(2, '2025-10-05 02:38:46', 50000, 'PORCENTAJE_GANANCIAS', 'robinh', 'Cine en el Botánico'),
(3, '2025-10-05 02:38:46', 50000, 'PORCENTAJE_GANANCIAS', 'nicoj', 'Cine en el Botánico'),
(4, '2025-10-05 02:38:46', 200000, 'PORCENTAJE_GANANCIAS', 'marcelot', 'Religiosamente'),
(5, '2025-10-05 02:38:46', 500, 'ENTRADAS_GRATIS', 'Tiajaci', 'Religiosamente'),
(6, '2025-10-05 02:38:46', 600, 'ENTRADAS_GRATIS', 'Mengano', 'Religiosamente'),
(7, '2025-10-05 02:38:46', 50000, 'PORCENTAJE_GANANCIAS', 'novick', 'Religiosamente'),
(8, '2025-10-05 02:38:46', 50000, 'PORCENTAJE_GANANCIAS', 'sergiop', 'Religiosamente'),
(9, '2025-10-05 02:38:46', 200000, 'PORCENTAJE_GANANCIAS', 'marcelot', 'El Pimiento Indomable'),
(10, '2025-10-05 02:38:46', 80000, 'PORCENTAJE_GANANCIAS', 'sergiop', 'El Pimiento Indomable'),
(11, '2025-10-05 02:38:46', 50000, 'ENTRADAS_GRATIS', 'chino', 'Pilsen Rock'),
(12, '2025-10-05 02:38:46', 120000, 'PORCENTAJE_GANANCIAS', 'novick', 'Pilsen Rock'),
(13, '2025-10-05 02:38:46', 120000, 'ENTRADAS_GRATIS', 'tonyp', 'Pilsen Rock'),
(14, '2025-10-05 02:38:46', 100000, 'PORCENTAJE_GANANCIAS', 'sergiop', 'Romeo y Julieta'),
(15, '2025-10-05 02:38:46', 200000, 'PORCENTAJE_GANANCIAS', 'marcelot', 'Romeo y Julieta'),
(16, '2025-10-05 02:38:47', 30000, 'ENTRADAS_GRATIS', 'tonyp', 'Un día de Julio'),
(17, '2025-10-05 02:38:47', 150000, 'PORCENTAJE_GANANCIAS', 'marcelot', 'Un día de Julio');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `colaborador`
--

CREATE TABLE `colaborador` (
  `NICKNAME` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `colaborador`
--

INSERT INTO `colaborador` (`NICKNAME`) VALUES
('chino'),
('juanP'),
('marcelot'),
('Mengano'),
('nicoj'),
('novick'),
('Perengano'),
('robinh'),
('sergiop'),
('Tiajaci'),
('tonyp');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estado`
--

CREATE TABLE `estado` (
  `ID` bigint(20) NOT NULL,
  `FECHA` date DEFAULT NULL,
  `NOMBRE` varchar(255) NOT NULL,
  `PROPUESTA_TITULO` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `estado`
--

INSERT INTO `estado` (`ID`, `FECHA`, `NOMBRE`, `PROPUESTA_TITULO`) VALUES
(1, '2025-10-04', 'INGRESADA', 'Cine en el Botánico'),
(2, '2025-10-04', 'INGRESADA', 'Religiosamente'),
(3, '2025-10-04', 'INGRESADA', 'El Pimiento Indomable'),
(4, '2025-10-04', 'INGRESADA', 'Pilsen Rock'),
(5, '2025-10-04', 'INGRESADA', 'Romeo y Julieta'),
(6, '2025-10-04', 'INGRESADA', 'Un día de Julio'),
(7, '2025-10-04', 'INGRESADA', 'El Lazarillo de Tormes'),
(8, '2025-10-04', 'INGRESADA', 'Bardo en la FING'),
(9, '2017-05-15', 'INGRESADA', 'Cine en el Botánico'),
(10, '2017-05-17', 'PUBLICADA', 'Cine en el Botánico'),
(11, '2017-05-20', 'EN_FINANCIACION', 'Cine en el Botánico'),
(12, '2017-06-18', 'INGRESADA', 'Religiosamente'),
(13, '2017-06-20', 'PUBLICADA', 'Religiosamente'),
(14, '2017-06-30', 'EN_FINANCIACION', 'Religiosamente'),
(15, '2017-07-26', 'INGRESADA', 'El Pimiento Indomable'),
(16, '2017-07-31', 'PUBLICADA', 'El Pimiento Indomable'),
(17, '2017-08-01', 'EN_FINANCIACION', 'El Pimiento Indomable'),
(18, '2017-07-30', 'INGRESADA', 'Pilsen Rock'),
(19, '2017-08-01', 'PUBLICADA', 'Pilsen Rock'),
(20, '2017-08-05', 'EN_FINANCIACION', 'Pilsen Rock'),
(21, '2017-08-04', 'INGRESADA', 'Romeo y Julieta'),
(22, '2017-08-10', 'PUBLICADA', 'Romeo y Julieta'),
(23, '2017-08-13', 'EN_FINANCIACION', 'Romeo y Julieta'),
(24, '2017-08-06', 'INGRESADA', 'Un día de Julio'),
(25, '2017-08-12', 'PUBLICADA', 'Un día de Julio'),
(26, '2017-08-15', 'EN_FINANCIACION', 'Un día de Julio'),
(27, '2017-08-18', 'INGRESADA', 'El Lazarillo de Tormes'),
(28, '2017-08-20', 'PUBLICADA', 'El Lazarillo de Tormes'),
(29, '2017-08-23', 'INGRESADA', 'Bardo en la FING');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proponente`
--

CREATE TABLE `proponente` (
  `NICKNAME` varchar(255) NOT NULL,
  `BIOGRAFIA` longtext DEFAULT NULL,
  `DIRECCION` varchar(255) DEFAULT NULL,
  `LINK` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `proponente`
--

INSERT INTO `proponente` (`NICKNAME`, `BIOGRAFIA`, `DIRECCION`, `LINK`) VALUES
('cachilas', 'Nace en el año 1947 en el conventillo “Medio Mundo” ubicado en pleno Barrio Sur. Es heredero parcialmente- junto al resto de sus hermanos- de la Comparsa “Morenada” (inactiva desde el fallecimiento de Juan Ángel Silva), en 1999 forma su propia Comparsa de negros y lubolos “Cuareim 1080”. Director responsable, compositor y cantante de la misma.', 'Br. Artigas 4567', 'https://www.facebook.com/C1080?ref=br_rs'),
('diegop', '', 'Emilio Frugoni 1138 Ap. 02', 'http://www.efectocine.com'),
('hectorg', 'En 1972 ingresó a la Escuela de Arte Dramático del teatro El Galpón. Participó en más de treinta obras teatrales y varios largometrajes. Integró el elenco estable de Radioteatro del Sodre, y en 2006 fue asesor de su Consejo Directivo. Como actor recibió múltiples reconocimientos: cuatro premios Florencio, premio al mejor actor extranjero del Festival de Miami y premio Mejor Actor de Cine 2008. Durante varios períodos fue directivo del teatro El Galpón y dirigente de la Sociedad Uruguaya de Actores (SUA); integró también la Federación Uruguaya de Teatros Independientes (FUTI). Formó parte del equipo de gestión de la refacción de los teatros La Máscara, Astral y El Galpón, y del equipo de gestión en la construcción del teatro De la Candela y de la sala Atahualpa de El Galpón.', 'Gral. Flores 5645', ''),
('hrubino', 'Horacio Rubino Torres nace el 25 de febrero de 1962, es conductor, actor y libretista. Debuta en 1982 en carnaval en Los \"Klaper´s\", donde estuvo cuatro años, actuando y libretando. Luego para \"Gaby´s\" (6 años), escribió en categoría revistas y humoristas y desde el comienzo y hasta el presente en su propio conjunto Momosapiens. ', '18 de Julio 1234', 'https://twitter.com/horaciorubino'),
('juliob', '', 'Benito Blanco 4321', ''),
('kairoh', '', 'Paraguay 1423', ''),
('losBardo', 'Queremos ser vistos y reconocidos como una organización: referente en divulgación científica con un fuerte espíritu didáctico y divertido, a través de acciones coordinadas con otros divulgadores científicos, que permitan establecer puentes de comunicación. Impulsora en la generación de espacios de democratización y apropiación social del conocimiento científico.', '8 de Octubre 1429', 'https://bardocientifico.com/'),
('mbusca', 'Martín Buscaglia (Montevideo, 1972) es un artista, músico, compositor y productor uruguayo. Tanto con su banda (“Los Bochamakers”) como en su formato “Hombre orquesta”, o solo con su guitarra, ha recorrido el mundo tocando entre otros países en España, Estados Unidos, Inglaterra, Francia, Australia, Brasil, Colombia, Argentina, Chile, Paraguay, México y Uruguay. (Actualmente los Bochamakers son Matías Rada, Martín Ibarburu, Mateo Moreno, Herman Klang) Paralelamente, tiene proyectos a dúo con el español Kiko Veneno, la cubana Yusa, el argentino Lisandro Aristimuño, su compatriota Antolín, y a trío junto a los brasileros Os Mulheres Negras.', 'Colonia 4321', 'http://www.martinbuscaglia.com/'),
('tabarec', 'Tabaré Cardozo (Montevideo, 24 de julio de 1971) es un cantante, compositor y murguista uruguayo; conocido por su participación en la murga Agarrate Catalina, conjunto que fundó junto a su hermano Yamandú y Carlos Tanco en el año 2001', 'Santiago Rivas 1212', 'https://www.facebook.com/Tabar%C3%A9-Cardozo-55179094281/?ref=br_rs');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `propuesta`
--

CREATE TABLE `propuesta` (
  `TITULO` varchar(255) NOT NULL,
  `DESCRIPCION` longtext DEFAULT NULL,
  `FECHA` date DEFAULT NULL,
  `FECHAPUBLICACION` date DEFAULT NULL,
  `IMAGEN` varchar(255) DEFAULT NULL,
  `LUGAR` varchar(255) DEFAULT NULL,
  `MONTOAREUNIR` int(11) DEFAULT NULL,
  `PRECIOENTRADA` int(11) DEFAULT NULL,
  `CATEGORIA_NOMBRE` varchar(255) NOT NULL,
  `PROPONENTE_NICKNAME` varchar(255) DEFAULT NULL,
  `ESTADOACTUAL_ID` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `propuesta`
--

INSERT INTO `propuesta` (`TITULO`, `DESCRIPCION`, `FECHA`, `FECHAPUBLICACION`, `IMAGEN`, `LUGAR`, `MONTOAREUNIR`, `PRECIOENTRADA`, `CATEGORIA_NOMBRE`, `PROPONENTE_NICKNAME`, `ESTADOACTUAL_ID`) VALUES
('Bardo en la FING', 'El 10 de Diciembre se presentará Bardo Científico en la FING. El humor puede ser usado como una herramienta importante para el aprendizaje y la democratización de la ciencia, los monólogos científicos son una forma didáctica de apropiación del conocimiento científico y contribuyen a que el público aprenda ciencia de forma amena. Los invitamos a pasar un rato divertido, en un espacio en el cual aprenderán cosas de la ciencia que los sorprenderán. ¡Los esperamos!', '2017-12-10', '2025-10-04', '', 'Anfiteatro Edificio “José Luis Massera”', 100000, 200, 'Stand-up', 'losBardo', 29),
('Cine en el Botánico', 'El 16 de Diciembre a la hora 20 se proyectará la película \"Clever\", en el Jardín Botánico (Av. 19 de Abril 1181) en el marco de las actividades realizadas por el ciclo Cultura al Aire Libre. El largometraje uruguayo de ficción Clever es dirigido por Federico Borgia y Guillermo Madeiro. Es apto para mayores de 15 años.', '2017-09-16', '2025-10-04', '', 'Jardín Botánico', 150000, 200, 'Cine al Aire Libre', 'diegop', 11),
('El Lazarillo de Tormes', 'Vuelve unas de las producciones de El Galpón más aclamadas de los últimos tiempos. Esta obra se ha presentado en Miami, Nueva York, Washington, México, Guadalajara, Río de Janeiro y La Habana. En nuestro país, El Lazarillo de Tormes fue nominado en los rubros mejor espectáculo y mejor dirección a los Premios Florencio 1995, obteniendo su protagonista Héctor Guido el Florencio a Mejor actor de ese año.', '2017-12-03', '2025-10-04', '', 'Teatro el Galpón', 175000, 350, 'Teatro Dramático', 'hectorg', 28),
('El Pimiento Indomable', 'El Pimiento Indomable, formación compuesta por Kiko Veneno y el uruguayo Martín Buscaglia, presentará este 19 de Octubre, su primer trabajo. Bajo un título homónimo al del grupo, es un disco que según los propios protagonistas “no se parece al de ninguno de los dos por separado. Entre los títulos que se podrán escuchar se encuentran “Nadador salvador”, “América es más grande”, “Pescaito Enroscado” o “La reina del placer”.', '2017-10-19', '2025-10-04', '/imagenes/elPimientoIndomable.jpg', 'Teatro Solís', 400000, 400, 'Concierto', 'mbusca', 17),
('Pilsen Rock', 'La edición 2017 del Pilsen Rock se celebrará el 21 de Octubre en la Rural del Prado y contará con la participación de más de 15 bandas nacionales. Quienes no puedan trasladarse al lugar, tendrán la posibilidad de disfrutar los shows a través de Internet, así como entrevistas en vivo a los músicos una vez finalizados los conciertos.', '2017-10-21', '2025-10-04', '/imagenes/pilsenRock.jpg', 'Rural de Prado', 900000, 1000, 'Festival', 'kairoh', 20),
('Religiosamente', 'MOMOSAPIENS presenta \"Religiosamente\". Mediante dos parodias y un hilo conductor que aborda la temática de la religión Momosapiens, mediante el humor y la reflexión, hilvana una historia que muestra al hombre inmerso en el tema religioso. El libreto está escrito utilizando diferentes lenguajes de humor, dando una visión satírica y reflexiva desde distintos puntos de vista, logrando mediante situaciones paródicas armar una propuesta plena de arte carnavalero.', '2017-10-07', '2025-10-04', '/imagenes/404.png', 'Teatro de Verano', 300000, 300, 'Parodistas', 'hrubino', 14),
('Romeo y Julieta', 'Romeo y Julieta de Kenneth MacMillan, uno de los ballets favoritos del director artístico Julio Bocca, se presentará nuevamente el 5 de Noviembre en el Auditorio Nacional del Sodre. Basada en la obra homónima de William Shakespeare, Romeo y Julieta es considerada la coreografía maestra del MacMillan. La producción de vestuario y escenografía se realizó en los Talleres del Auditorio Adela Reta, sobre los diseños originales.', '2017-11-05', '2025-10-04', '/imagenes/404.png', 'Rural de Prado', 750000, 800, 'Ballet', 'juliob', 23),
('Un día de Julio', 'La Catalina presenta el espectáculo \"Un Día de Julio\" en Landia. Un hombre misterioso y solitario vive encerrado entre las cuatro paredes de su casa. Intenta, con sus teorías extravagantes, cambiar el mundo exterior que le resulta inhabitable. Un día de Julio sucederá algo que cambiará su vida y la de su entorno para siempre.', '2017-11-16', '2025-10-04', '/imagenes/unDiaDeJulio.jpg', 'Landia', 300000, 650, 'Murga', 'tabarec', 26);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `propuesta_ret`
--

CREATE TABLE `propuesta_ret` (
  `propuesta_titulo` varchar(255) DEFAULT NULL,
  `retorno` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `propuesta_ret`
--

INSERT INTO `propuesta_ret` (`propuesta_titulo`, `retorno`) VALUES
('Cine en el Botánico', 'PORCENTAJE_GANANCIAS'),
('Religiosamente', 'ENTRADAS_GRATIS'),
('Religiosamente', 'PORCENTAJE_GANANCIAS'),
('El Pimiento Indomable', 'PORCENTAJE_GANANCIAS'),
('Pilsen Rock', 'ENTRADAS_GRATIS'),
('Pilsen Rock', 'PORCENTAJE_GANANCIAS'),
('Romeo y Julieta', 'PORCENTAJE_GANANCIAS'),
('Un día de Julio', 'ENTRADAS_GRATIS'),
('Un día de Julio', 'PORCENTAJE_GANANCIAS'),
('El Lazarillo de Tormes', 'ENTRADAS_GRATIS'),
('Bardo en la FING', 'ENTRADAS_GRATIS');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `seguimiento`
--

CREATE TABLE `seguimiento` (
  `ID` int(11) NOT NULL,
  `USUARIOSEGUIDO` varchar(255) DEFAULT NULL,
  `USUARIOSEGUIDOR_NICKNAME` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `seguimiento`
--

INSERT INTO `seguimiento` (`ID`, `USUARIOSEGUIDO`, `USUARIOSEGUIDOR_NICKNAME`) VALUES
(1, 'hectorg', 'hrubino'),
(2, 'diegop', 'hrubino'),
(3, 'losBardo', 'hrubino'),
(4, 'tabarec', 'mbusca'),
(5, 'cachilas', 'mbusca'),
(6, 'kairoh', 'mbusca'),
(7, 'mbusca', 'hectorg'),
(8, 'juliob', 'hectorg'),
(9, 'hrubino', 'tabarec'),
(10, 'cachilas', 'tabarec'),
(11, 'hrubino', 'cachilas'),
(12, 'mbusca', 'juliob'),
(13, 'diegop', 'juliob'),
(14, 'hectorg', 'diegop'),
(15, 'losBardo', 'diegop'),
(16, 'sergiop', 'kairoh'),
(17, 'hrubino', 'losBardo'),
(18, 'nicoj', 'losBardo'),
(19, 'hectorg', 'robinh'),
(20, 'juliob', 'robinh'),
(21, 'diegop', 'robinh'),
(22, 'cachilas', 'marcelot'),
(23, 'juliob', 'marcelot'),
(24, 'kairoh', 'marcelot'),
(25, 'hrubino', 'novick'),
(26, 'tabarec', 'novick'),
(27, 'cachilas', 'novick'),
(28, 'mbusca', 'sergiop'),
(29, 'juliob', 'sergiop'),
(30, 'diegop', 'sergiop'),
(31, 'tonyp', 'chino'),
(32, 'chino', 'tonyp'),
(33, 'diegop', 'nicoj'),
(34, 'losBardo', 'nicoj'),
(35, 'tabarec', 'juanP'),
(36, 'cachilas', 'juanP'),
(37, 'kairoh', 'juanP'),
(38, 'hectorg', 'Mengano'),
(39, 'juliob', 'Mengano'),
(40, 'chino', 'Mengano'),
(41, 'diegop', 'Perengano'),
(42, 'tonyp', 'Perengano'),
(43, 'juliob', 'Tiajaci'),
(44, 'kairoh', 'Tiajaci'),
(45, 'sergiop', 'Tiajaci');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `NICKNAME` varchar(255) NOT NULL,
  `DTYPE` varchar(31) DEFAULT NULL,
  `APELLIDO` varchar(255) DEFAULT NULL,
  `CONTRASENIA` varchar(255) DEFAULT NULL,
  `CORREO` varchar(255) DEFAULT NULL,
  `DIRIMAGEN` varchar(255) DEFAULT NULL,
  `FECHANAC` date DEFAULT NULL,
  `NOMBRE` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`NICKNAME`, `DTYPE`, `APELLIDO`, `CONTRASENIA`, `CORREO`, `DIRIMAGEN`, `FECHANAC`, `NOMBRE`) VALUES
('cachilas', 'Proponente', 'Silva', 'Nada', 'Cachila.sil@c1080.org.uy', '/imagenes/404.png', '1947-01-01', 'Waldemar “Cachila”'),
('chino', 'Colaborador', 'Recoba', 'Nada', 'chino@trico.org.uy', '', '1976-03-17', 'Alvaro'),
('diegop', 'Proponente', 'Parodi', 'Nada', 'diego@efectocine.com', '', '1975-01-01', 'Diego'),
('hectorg', 'Proponente', 'Guido', 'Nada', 'hector.gui@elgalpon.org.uy', '/imagenes/404.png', '1954-01-07', 'Héctor'),
('hrubino', 'Proponente', 'Rubino', 'Nada', 'horacio.rubino@guambia.com.uy', '/imagenes/hrubino.JPG', '1962-02-25', 'Horacio'),
('juanP', 'Colaborador', 'Perez', 'Nada', 'juanp@elpueblo.com', '', '1970-01-01', 'Juan'),
('juliob', 'Proponente', 'Bocca', 'Nada', 'juliobocca@sodre.com.uy', '', '1967-03-16', 'Julio'),
('kairoh', 'Proponente', 'Herrera', 'Nada', 'kairoher@pilsenrock.com.uy', '/imagenes/404.png', '1840-04-25', 'Kairo'),
('losBardo', 'Proponente', 'Bardo', 'Nada', 'losbardo@bardocientifico.com', '/imagenes/losBardo.jpg', '1980-10-31', 'Los'),
('marcelot', 'Colaborador', 'Tinelli', 'Nada', 'marcelot@ideasdelsur.com.ar', '/imagenes/404.png', '1960-04-01', 'Marcelo'),
('mbusca', 'Proponente', 'Buscaglia', 'Nada', 'Martin.bus@agadu.org.uy', '/imagenes/mbusca.jpg', '1972-06-25', 'Martin'),
('Mengano', 'Colaborador', 'Gómez', 'Nada', 'menganog@elpueblo.com', '', '1982-02-02', 'Mengano'),
('nicoj', 'Colaborador', 'Jodal', 'Nada', 'jodal@artech.com.uy', '/imagenes/nicoj.jpg', '1960-08-09', 'Nicolás'),
('novick', 'Colaborador', 'Novick', 'Nada', 'edgardo@novick.com.uy', '/imagenes/404.png', '1952-07-17', 'Edgardo'),
('Perengano', 'Colaborador', 'López', 'Nada', 'pere@elpueblo.com', '', '1985-03-03', 'Perengano'),
('robinh', 'Colaborador', 'Henderson', 'Nada', 'Robin.h@tinglesa.com.uy', '', '1940-08-03', 'Robin'),
('sergiop', 'Colaborador', 'Puglia', 'Nada', 'puglia@alpanpan.com.uy', '/imagenes/sergiop.jpg', '1950-01-28', 'Sergio'),
('tabarec', 'Proponente', 'Cardozo', 'Nada', 'tabare.car@agadu.org.uy', '/imagenes/404.png', '1971-07-24', 'Tabaré'),
('Tiajaci', 'Colaborador', 'Jacinta', 'Nada', 'jacinta@elpueblo.com', '', '1990-04-04', 'Tía'),
('tonyp', 'Colaborador', 'Pacheco', 'Nada', 'eltony@manya.org.uy', '/imagenes/tonyp.jpg', '1955-02-14', 'Antonio');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`NOMBRE`),
  ADD KEY `FK_CATEGORIA_CATPADRE_NOMBRE` (`CATPADRE_NOMBRE`);

--
-- Indices de la tabla `colaboracion`
--
ALTER TABLE `colaboracion`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FK_COLABORACION_PROPUESTA_TITULO` (`PROPUESTA_TITULO`),
  ADD KEY `FK_COLABORACION_COLABORADOR_NICKNAME` (`COLABORADOR_NICKNAME`);

--
-- Indices de la tabla `colaborador`
--
ALTER TABLE `colaborador`
  ADD PRIMARY KEY (`NICKNAME`);

--
-- Indices de la tabla `estado`
--
ALTER TABLE `estado`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FK_ESTADO_PROPUESTA_TITULO` (`PROPUESTA_TITULO`);

--
-- Indices de la tabla `proponente`
--
ALTER TABLE `proponente`
  ADD PRIMARY KEY (`NICKNAME`);

--
-- Indices de la tabla `propuesta`
--
ALTER TABLE `propuesta`
  ADD PRIMARY KEY (`TITULO`),
  ADD UNIQUE KEY `UNQ_PROPUESTA_0` (`TITULO`),
  ADD KEY `FK_PROPUESTA_PROPONENTE_NICKNAME` (`PROPONENTE_NICKNAME`),
  ADD KEY `FK_PROPUESTA_ESTADOACTUAL_ID` (`ESTADOACTUAL_ID`),
  ADD KEY `FK_PROPUESTA_CATEGORIA_NOMBRE` (`CATEGORIA_NOMBRE`);

--
-- Indices de la tabla `propuesta_ret`
--
ALTER TABLE `propuesta_ret`
  ADD KEY `FK_PROPUESTA_RET_propuesta_titulo` (`propuesta_titulo`);

--
-- Indices de la tabla `seguimiento`
--
ALTER TABLE `seguimiento`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `UNQ_SEGUIMIENTO_0` (`ID`),
  ADD KEY `FK_SEGUIMIENTO_USUARIOSEGUIDOR_NICKNAME` (`USUARIOSEGUIDOR_NICKNAME`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`NICKNAME`),
  ADD UNIQUE KEY `UNQ_USUARIO_0` (`NICKNAME`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `colaboracion`
--
ALTER TABLE `colaboracion`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT de la tabla `estado`
--
ALTER TABLE `estado`
  MODIFY `ID` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- AUTO_INCREMENT de la tabla `seguimiento`
--
ALTER TABLE `seguimiento`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=46;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD CONSTRAINT `FK_CATEGORIA_CATPADRE_NOMBRE` FOREIGN KEY (`CATPADRE_NOMBRE`) REFERENCES `categoria` (`NOMBRE`);

--
-- Filtros para la tabla `colaboracion`
--
ALTER TABLE `colaboracion`
  ADD CONSTRAINT `FK_COLABORACION_COLABORADOR_NICKNAME` FOREIGN KEY (`COLABORADOR_NICKNAME`) REFERENCES `usuario` (`NICKNAME`),
  ADD CONSTRAINT `FK_COLABORACION_PROPUESTA_TITULO` FOREIGN KEY (`PROPUESTA_TITULO`) REFERENCES `propuesta` (`TITULO`);

--
-- Filtros para la tabla `colaborador`
--
ALTER TABLE `colaborador`
  ADD CONSTRAINT `FK_COLABORADOR_NICKNAME` FOREIGN KEY (`NICKNAME`) REFERENCES `usuario` (`NICKNAME`);

--
-- Filtros para la tabla `estado`
--
ALTER TABLE `estado`
  ADD CONSTRAINT `FK_ESTADO_PROPUESTA_TITULO` FOREIGN KEY (`PROPUESTA_TITULO`) REFERENCES `propuesta` (`TITULO`);

--
-- Filtros para la tabla `proponente`
--
ALTER TABLE `proponente`
  ADD CONSTRAINT `FK_PROPONENTE_NICKNAME` FOREIGN KEY (`NICKNAME`) REFERENCES `usuario` (`NICKNAME`);

--
-- Filtros para la tabla `propuesta`
--
ALTER TABLE `propuesta`
  ADD CONSTRAINT `FK_PROPUESTA_CATEGORIA_NOMBRE` FOREIGN KEY (`CATEGORIA_NOMBRE`) REFERENCES `categoria` (`NOMBRE`),
  ADD CONSTRAINT `FK_PROPUESTA_ESTADOACTUAL_ID` FOREIGN KEY (`ESTADOACTUAL_ID`) REFERENCES `estado` (`ID`),
  ADD CONSTRAINT `FK_PROPUESTA_PROPONENTE_NICKNAME` FOREIGN KEY (`PROPONENTE_NICKNAME`) REFERENCES `usuario` (`NICKNAME`);

--
-- Filtros para la tabla `propuesta_ret`
--
ALTER TABLE `propuesta_ret`
  ADD CONSTRAINT `FK_PROPUESTA_RET_propuesta_titulo` FOREIGN KEY (`propuesta_titulo`) REFERENCES `propuesta` (`TITULO`);

--
-- Filtros para la tabla `seguimiento`
--
ALTER TABLE `seguimiento`
  ADD CONSTRAINT `FK_SEGUIMIENTO_USUARIOSEGUIDOR_NICKNAME` FOREIGN KEY (`USUARIOSEGUIDOR_NICKNAME`) REFERENCES `usuario` (`NICKNAME`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
