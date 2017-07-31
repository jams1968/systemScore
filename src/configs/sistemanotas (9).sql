-- phpMyAdmin SQL Dump
-- version 4.4.14
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-08-2016 a las 00:11:32
-- Versión del servidor: 5.6.26
-- Versión de PHP: 5.5.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sistemanotas`
--
CREATE DATABASE IF NOT EXISTS `sistemanotas` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `sistemanotas`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `area`
--

CREATE TABLE IF NOT EXISTS `area` (
  `id` int(11) NOT NULL,
  `nombre` varchar(200) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `area`
--

INSERT INTO `area` (`id`, `nombre`) VALUES
(1, 'AREA DE INGENIERIA DE SISTEMAS');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asignaturas`
--

CREATE TABLE IF NOT EXISTS `asignaturas` (
  `id` int(11) NOT NULL,
  `codigo` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `nombre` varchar(200) COLLATE utf8_spanish_ci NOT NULL,
  `nivel` int(11) NOT NULL,
  `uc` int(11) NOT NULL,
  `teoria` int(11) NOT NULL,
  `practica` int(11) NOT NULL,
  `distancia` int(11) NOT NULL,
  `departamento_id` int(11) NOT NULL,
  `status` varchar(1) COLLATE utf8_spanish_ci NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `created` datetime DEFAULT NULL,
  `modified` datetime DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `asignaturas`
--

INSERT INTO `asignaturas` (`id`, `codigo`, `nombre`, `nivel`, `uc`, `teoria`, `practica`, `distancia`, `departamento_id`, `status`, `user_id`, `created`, `modified`) VALUES
(1, 'AC0001', 'ARTE Y CULTURA', 1, 2, 2, 0, 0, 2, 'A', 0, '2015-10-28 18:08:51', '2015-10-28 18:08:51'),
(2, 'DP0001', 'DEPORTES', 1, 2, 0, 2, 0, 2, 'A', 0, '2015-10-30 13:46:39', '2015-10-30 13:46:39'),
(3, 'EA', 'ELECTIVA DE AREA I', 8, 4, 2, 4, 0, 4, 'A', 0, '2015-10-30 13:19:25', '2015-10-30 13:19:25'),
(4, 'EA0244', 'ELECTIVA DE AREA III', 10, 4, 2, 4, 0, 4, 'A', 0, '2015-10-30 13:27:49', '2015-10-30 13:27:49'),
(5, 'EA9244', 'ELECTIVA DE AREA II', 9, 4, 2, 4, 0, 4, 'A', 0, '2015-10-30 13:23:28', '2015-10-30 13:23:28'),
(6, 'EA9325', 'ELECTIVA LIBRE I', 9, 3, 3, 2, 0, 4, 'A', 0, '2015-10-30 13:24:14', '2015-10-30 13:24:14'),
(7, 'EL', 'ELECTIVA LIBRE II', 10, 3, 3, 2, 0, 4, 'A', 0, '2015-10-30 13:28:24', '2015-10-30 13:28:24'),
(8, 'IB2322', 'FÍSICA I', 2, 4, 3, 2, 0, 1, 'A', 0, '2015-10-28 17:35:13', '2015-10-28 17:35:13'),
(9, 'IB3322', 'FÍSICA II', 3, 4, 3, 2, 0, 1, 'A', 0, '2015-10-28 17:41:20', '2015-10-28 17:41:20'),
(10, 'IC1222', 'FUNDAMENTOS DE LA INFORMÁTICA', 1, 3, 2, 0, 0, 3, 'A', 5, '2015-10-28 17:29:38', '2016-06-25 09:57:14'),
(11, 'IC2323', 'ALGORITMOS I', 2, 3, 3, 2, 0, 3, 'A', 0, '2015-10-28 17:36:09', '2015-10-28 17:36:09'),
(12, 'IC3244', 'PROGRAMACION I', 3, 4, 3, 3, 0, 3, 'A', 0, '2015-07-16 19:10:39', '2015-07-17 22:04:28'),
(13, 'IC3323', 'ALGORITMOS II', 3, 3, 2, 2, 0, 3, 'A', 0, '2015-10-28 17:42:10', '2015-10-28 17:42:10'),
(14, 'IC4244', 'PROGRAMACIÓN II', 4, 4, 3, 3, 0, 3, 'A', 0, '2015-10-28 17:48:27', '2015-10-28 18:22:38'),
(15, 'IC5244', 'PROGRAMACIÓN III', 5, 4, 3, 3, 0, 3, 'A', 5, '2015-10-28 18:27:22', '2016-03-22 21:25:03'),
(16, 'IC5422', 'ORGANIZACIÓN DEL COMPUTADOR', 5, 5, 4, 2, 0, 3, 'A', 0, '2015-10-28 17:50:49', '2015-10-28 17:50:49'),
(17, 'IC6322', 'ARQUITECTURA DEL COMPUTADOR', 6, 4, 2, 3, 0, 3, 'A', 0, '2015-10-30 13:06:25', '2015-10-30 13:06:25'),
(18, 'IC7322', 'SISTEMAS OPERATIVOS', 7, 4, 3, 2, 0, 3, 'A', 0, '2015-10-30 13:11:38', '2015-10-30 13:14:36'),
(19, 'ID0221', 'GERENCIA DE PROYECTOS', 10, 3, 4, 2, 2, 4, 'A', 0, '2015-10-30 13:26:29', '2015-10-30 13:26:29'),
(20, 'ID6124', 'INGENIERÍA ECONÓMICA', 6, 2, 1, 2, 0, 4, 'A', 0, '2015-10-30 13:08:42', '2015-10-30 13:08:42'),
(21, 'ID6241', 'INVESTIGACIÓN DE OPERACIONES', 6, 4, 2, 4, 0, 4, 'A', 0, '2015-10-30 13:08:01', '2015-10-30 13:08:01'),
(22, 'ID7322', 'CONTROL DE PROYECTOS', 7, 4, 3, 2, 0, 4, 'A', 0, '2015-10-30 13:12:21', '2015-10-30 13:14:06'),
(23, 'ID7323', 'ORGANIZACIÓN Y GESTION EMPRESARIAL', 7, 4, 3, 2, 0, 4, 'A', 0, '2015-10-30 13:13:09', '2015-10-30 13:13:09'),
(24, 'ID8082', 'PASANTÍAS', 8, 4, 0, 0, 0, 4, 'A', 0, '2015-10-30 13:18:36', '2015-10-30 13:18:36'),
(25, 'IH1124', 'LENGUAJE Y COMUNICACIÓN', 1, 2, 3, 0, 0, 2, 'A', 0, '2015-10-28 17:32:03', '2015-10-28 17:32:03'),
(26, 'IH1125', 'INGLES I', 1, 2, 4, 0, 0, 2, 'A', 0, '2015-10-28 17:32:46', '2015-10-28 17:32:46'),
(27, 'IH2124', 'PROBLEMÁTICA CIENTIFICA Y TECNOLÓGICA', 2, 2, 2, 0, 0, 2, 'A', 0, '2015-10-28 17:37:15', '2015-10-28 17:37:15'),
(28, 'IH2125', 'INGLES II', 2, 2, 1, 2, 0, 2, 'A', 0, '2015-10-28 17:37:53', '2015-10-28 17:37:53'),
(29, 'IH3125', 'METODOLOGÍA Y TECNICA DE LA INVESTIGACIÓN', 3, 2, 1, 2, 0, 2, 'A', 0, '2015-10-28 17:43:33', '2015-10-28 17:43:33'),
(30, 'IH9202', 'ÉTICA PROFESIONAL', 9, 2, 2, 0, 0, 4, 'A', 0, '2015-10-30 13:24:54', '2015-10-30 13:24:54'),
(31, 'IM1223', 'LÓGICA MATEMÁTICA', 1, 3, 2, 3, 0, 1, 'A', 0, '2015-10-28 17:30:45', '2015-10-28 17:30:45'),
(32, 'IM1421', 'MATEMÁTICA I', 1, 5, 3, 3, 0, 1, 'A', 0, '2015-10-28 17:27:35', '2015-10-28 17:27:35'),
(33, 'IM2421', 'MATEMÁTICA II', 2, 5, 0, 6, 0, 1, 'A', 0, '2015-10-28 17:34:19', '2015-10-28 17:34:19'),
(34, 'IM3421', 'MATEMÁTICA III', 3, 5, 2, 4, 0, 1, 'A', 0, '2015-10-28 17:40:18', '2015-10-28 18:13:58'),
(35, 'IM4323', 'ESTRUCTURAS DISCRETAS I', 4, 4, 3, 2, 0, 1, 'A', 0, '2015-10-28 17:47:49', '2015-10-28 17:47:49'),
(36, 'IM4421', 'MATEMÁTICA IV', 4, 5, 2, 4, 0, 1, 'A', 0, '2015-10-28 18:18:09', '2015-10-28 18:18:09'),
(37, 'IM5221', 'ALGEBRA BOOLEANA', 5, 3, 2, 2, 0, 1, 'A', 0, '2015-10-28 17:52:45', '2015-10-28 17:52:45'),
(38, 'IM5323', 'ESTRUCTURAS DISCRETAS II', 5, 4, 3, 2, 0, 1, 'A', 0, '2015-10-28 18:05:07', '2015-10-28 18:05:07'),
(39, 'IM5421', 'PROBABILIDAD Y ESTADÍSTICA', 4, 3, 2, 2, 0, 1, 'A', 0, '2015-10-28 17:46:56', '2015-10-28 17:46:56'),
(40, 'IM6243', 'MÉTODOS NUMÉRICOS', 6, 4, 2, 4, 0, 1, 'A', 0, '2015-10-30 13:07:14', '2015-10-30 13:07:14'),
(41, 'IME320', 'ELECTIVA I', 2, 2, 2, 0, 0, 2, 'A', 0, '2015-10-28 17:38:40', '2015-10-28 17:38:40'),
(42, 'IME520', 'ELECTIVA II', 3, 2, 0, 2, 0, 2, 'A', 0, '2015-10-28 17:44:16', '2015-10-28 17:44:16'),
(43, 'IME720', 'ELECTIVA III', 4, 2, 2, 0, 0, 3, 'A', 0, '2015-10-28 17:49:38', '2015-10-28 17:49:38'),
(44, 'IMEIV', 'ELECTIVA IV', 5, 2, 2, 0, 0, 3, 'A', 0, '2015-10-28 18:07:28', '2015-10-28 18:29:29'),
(45, 'IMEV', 'ELECTIVA V', 6, 2, 2, 0, 0, 3, 'A', 0, '2015-10-30 13:10:43', '2015-10-30 13:10:43'),
(46, 'IS0222', 'INFORMÁTICA EDUCATIVA', 10, 3, 2, 2, 0, 4, 'A', 0, '2015-10-30 13:29:11', '2015-10-30 13:29:11'),
(47, 'IS4225', 'BASE DE DATOS', 4, 3, 2, 2, 0, 4, 'A', 0, '2015-10-28 17:49:04', '2015-10-28 17:49:04'),
(48, 'IS5205', 'TEORIA GENERAL DE SISTEMAS', 5, 5, 4, 2, 0, 4, 'A', 0, '2015-10-28 18:06:56', '2015-10-28 18:06:56'),
(49, 'IS6425', 'SISTEMAS DE INFORMACIÓN I', 6, 5, 4, 2, 0, 4, 'A', 0, '2015-10-30 13:09:24', '2015-10-30 13:09:24'),
(50, 'IS7244', 'TRADUCTORES E INTERPRETES', 7, 4, 2, 4, 0, 3, 'A', 0, '2015-10-30 13:16:00', '2015-10-30 13:16:00'),
(51, 'IS7324S', 'SISTEMAS DE INFORMACIÓN II', 7, 5, 4, 2, 0, 4, 'A', 0, '2015-10-30 13:16:44', '2015-10-30 13:16:44'),
(52, 'IS8243', 'LENGUAJES DE PROGRAMACIÓN', 8, 4, 2, 4, 0, 3, 'A', 0, '2015-10-30 13:20:36', '2015-10-30 13:20:36'),
(53, 'IS8424', 'SISTEMAS DE INFORMACIÓN III', 8, 5, 4, 2, 0, 4, 'A', 0, '2015-10-30 13:17:54', '2015-10-30 13:21:15'),
(54, 'IT8241', 'REDES', 8, 4, 2, 3, 0, 4, 'A', 0, '2015-10-30 13:39:17', '2015-10-30 13:39:17'),
(55, 'IT9241', 'SISTEMAS DISTRIBUIDOS', 9, 4, 2, 4, 0, 4, 'A', 0, '2015-10-30 13:22:09', '2015-10-30 13:22:09'),
(56, 'PG0083', 'PROYECTO DE GRADO II', 10, 4, 3, 0, 3, 4, 'A', 0, '2015-10-30 13:27:05', '2015-10-30 13:27:05'),
(57, 'PG9083', 'PROYECTO DE GRADO I', 9, 4, 3, 0, 3, 4, 'A', 0, '2015-10-30 13:22:52', '2015-10-30 13:22:52'),
(58, 'ICED1', 'MATEMÁTICA I', 1, 4, 2, 2, 0, 5, 'A', 0, NULL, '0000-00-00 00:00:00'),
(60, 'ICEMC1', 'INTRODUCCIÓN A LA COMPUTACIÓN', 1, 4, 2, 2, 0, 6, 'A', NULL, NULL, NULL),
(61, 'LNGEI1', 'TÉCNICAS DE ESTUDIOS', 1, 2, 2, 0, 0, 7, 'A', NULL, NULL, NULL),
(62, 'EDT21', 'EDUCACIÓN PARA EL TRABAJO', 2, 3, 2, 1, 0, 8, 'A', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `carreras`
--

CREATE TABLE IF NOT EXISTS `carreras` (
  `id` int(11) NOT NULL,
  `codigo` int(11) NOT NULL,
  `nombre` varchar(200) NOT NULL,
  `status` varchar(1) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `carreras`
--

INSERT INTO `carreras` (`id`, `codigo`, `nombre`, `status`) VALUES
(1, 601, 'INGENIERIA EN INFORMATICA', 'A'),
(2, 603, 'LICENCIATURA EN EDUCACIÓN MENCIÓN COMPUTACIÓN', 'A'),
(3, 602, 'LICENCIATURA EN EDUCACIÓN INTEGRAL', 'A'),
(4, 745, 'sexo', 'R'),
(5, 750, 'otra', 'R'),
(6, 748, 'xxxyyy', 'R'),
(7, 760, 'qwqwqwqw', 'R'),
(8, 111, 'puerto', 'R'),
(10, 1111, 'aaaaaa qqq', 'R');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cursos`
--

CREATE TABLE IF NOT EXISTS `cursos` (
  `id` int(11) NOT NULL,
  `nombre` varchar(40) NOT NULL COMMENT 'Nombre de la sección o cualquier identificador que el docente quiera aplicar',
  `seccion_id` int(11) NOT NULL,
  `asignatura_id` int(11) NOT NULL,
  `periodo_id` int(11) NOT NULL,
  `usuario_id` int(11) NOT NULL,
  `status` varchar(1) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cursos`
--

INSERT INTO `cursos` (`id`, `nombre`, `seccion_id`, `asignatura_id`, `periodo_id`, `usuario_id`, `status`) VALUES
(1, 'Sección 1- Programación II', 1, 14, 1, 6, 'A'),
(3, 'Sección 2 - Programación II', 2, 14, 5, 6, 'A'),
(4, 'a1', 1, 11, 1, 6, 'A'),
(5, 'a22', 1, 31, 2, 6, 'A'),
(6, 'd1', 2, 1, 4, 6, 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `departamentos`
--

CREATE TABLE IF NOT EXISTS `departamentos` (
  `id` int(11) NOT NULL,
  `departamento` varchar(60) NOT NULL,
  `direccion_id` int(11) NOT NULL,
  `status` varchar(1) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `departamentos`
--

INSERT INTO `departamentos` (`id`, `departamento`, `direccion_id`, `status`) VALUES
(1, 'CIENCIAS BÁSICAS', 1, 'A'),
(2, 'ESTUDIOS GENERALES', 1, 'A'),
(3, 'CIENCIAS DE LA COMPUTACIÓN', 2, 'A'),
(4, 'FORMACIÓN PROFESIONAL', 2, 'A'),
(5, 'INFORMÁTICA Y MATEMÁTICA', 4, 'A'),
(6, 'COMPUTACIÓN', 4, 'A'),
(7, 'LENGUAJE', 3, 'A'),
(8, 'TRABAJO', 3, 'A'),
(11, 'aaa zzzz', 9, 'R');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `direcciones`
--

CREATE TABLE IF NOT EXISTS `direcciones` (
  `id` int(11) NOT NULL,
  `direccion` varchar(60) NOT NULL,
  `carrera_id` int(11) NOT NULL,
  `status` varchar(1) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `direcciones`
--

INSERT INTO `direcciones` (`id`, `direccion`, `carrera_id`, `status`) VALUES
(1, 'DIRECCIÓN ESTUDIOS BÁSICOS', 1, 'A'),
(2, 'DIRECCIÓN ING EN INFORMÁTICA', 1, 'A'),
(3, 'PROGRAMA EDUCACIÓN INTEGRAL', 3, 'A'),
(4, 'PROGRAMA EDUCACIÓN MENCIÓN COMPUTACIÓN', 2, 'A'),
(5, 'prueba', 1, 'R'),
(6, 'mas', 1, 'R'),
(7, 'otra', 1, 'R'),
(8, 'sigo', 1, 'R'),
(9, 'ffffffff gggg', 1, 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `evaluaciones`
--

CREATE TABLE IF NOT EXISTS `evaluaciones` (
  `id` int(11) NOT NULL,
  `tipo` varchar(50) NOT NULL COMMENT 'Prueba corta, parcial, exposicion, etc',
  `status` varchar(1) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `evaluaciones`
--

INSERT INTO `evaluaciones` (`id`, `tipo`, `status`) VALUES
(1, 'PRUEBA ESCRITA', 'A'),
(2, 'PRUEBA PRACTICA II', 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `notas`
--

CREATE TABLE IF NOT EXISTS `notas` (
  `id` int(11) NOT NULL,
  `persona_curso_id` int(11) NOT NULL,
  `planificacion_id` int(11) NOT NULL,
  `nota` double NOT NULL,
  `status` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `periodos`
--

CREATE TABLE IF NOT EXISTS `periodos` (
  `id` int(11) NOT NULL,
  `periodo` year(4) NOT NULL,
  `numero` int(11) NOT NULL,
  `status` varchar(1) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `periodos`
--

INSERT INTO `periodos` (`id`, `periodo`, `numero`, `status`) VALUES
(1, 2015, 1, 'A'),
(2, 2015, 2, 'A'),
(3, 2015, 3, 'A'),
(4, 2015, 4, 'A'),
(5, 2015, 5, 'A'),
(6, 2015, 6, 'A'),
(7, 2015, 7, 'A'),
(8, 2015, 8, 'A'),
(9, 2015, 9, 'A'),
(10, 2016, 1, 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personas`
--

CREATE TABLE IF NOT EXISTS `personas` (
  `id` int(11) NOT NULL,
  `cedula` int(11) NOT NULL,
  `nombres` varchar(30) NOT NULL,
  `apellidos` varchar(30) NOT NULL,
  `telefono` varchar(13) NOT NULL,
  `correo` varchar(50) NOT NULL,
  `status` varchar(1) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `personas`
--

INSERT INTO `personas` (`id`, `cedula`, `nombres`, `apellidos`, `telefono`, `correo`, `status`) VALUES
(1, 6331034, 'Jairo Antonio', 'Molina Salinas', '04169421212', 'profesor@jairomolina.com.ve', 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personas_cursos`
--

CREATE TABLE IF NOT EXISTS `personas_cursos` (
  `id` int(11) NOT NULL,
  `persona_id` int(11) NOT NULL,
  `curso_id` int(11) NOT NULL,
  `status` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `planificaciones`
--

CREATE TABLE IF NOT EXISTS `planificaciones` (
  `id` int(11) NOT NULL,
  `evaluacion_id` int(11) NOT NULL,
  `curso_id` int(11) NOT NULL,
  `porcentaje` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `status` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `secciones`
--

CREATE TABLE IF NOT EXISTS `secciones` (
  `id` int(11) NOT NULL,
  `seccion` varchar(5) NOT NULL,
  `status` varchar(1) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `secciones`
--

INSERT INTO `secciones` (`id`, `seccion`, `status`) VALUES
(1, '1', 'A'),
(2, '2', 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE IF NOT EXISTS `usuarios` (
  `id` int(11) NOT NULL,
  `persona_id` int(11) NOT NULL,
  `login` varchar(10) NOT NULL,
  `clave` varchar(10) NOT NULL,
  `status` varchar(1) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `persona_id`, `login`, `clave`, `status`) VALUES
(6, 1, 'jams', 'jams', 'A');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `area`
--
ALTER TABLE `area`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `asignaturas`
--
ALTER TABLE `asignaturas`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `carreras`
--
ALTER TABLE `carreras`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `codigo` (`codigo`);

--
-- Indices de la tabla `cursos`
--
ALTER TABLE `cursos`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `codigo` (`nombre`),
  ADD UNIQUE KEY `clave_curso` (`seccion_id`,`asignatura_id`,`periodo_id`,`usuario_id`) USING BTREE;

--
-- Indices de la tabla `departamentos`
--
ALTER TABLE `departamentos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `direcciones`
--
ALTER TABLE `direcciones`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `evaluaciones`
--
ALTER TABLE `evaluaciones`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `notas`
--
ALTER TABLE `notas`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `periodos`
--
ALTER TABLE `periodos`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `periodo_id` (`periodo`,`numero`) USING BTREE;

--
-- Indices de la tabla `personas`
--
ALTER TABLE `personas`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `cedula` (`cedula`);

--
-- Indices de la tabla `personas_cursos`
--
ALTER TABLE `personas_cursos`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `cedula` (`persona_id`);

--
-- Indices de la tabla `planificaciones`
--
ALTER TABLE `planificaciones`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `secciones`
--
ALTER TABLE `secciones`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `cedula` (`persona_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `area`
--
ALTER TABLE `area`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `asignaturas`
--
ALTER TABLE `asignaturas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=63;
--
-- AUTO_INCREMENT de la tabla `carreras`
--
ALTER TABLE `carreras`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT de la tabla `cursos`
--
ALTER TABLE `cursos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT de la tabla `departamentos`
--
ALTER TABLE `departamentos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT de la tabla `direcciones`
--
ALTER TABLE `direcciones`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT de la tabla `evaluaciones`
--
ALTER TABLE `evaluaciones`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `notas`
--
ALTER TABLE `notas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `periodos`
--
ALTER TABLE `periodos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT de la tabla `personas`
--
ALTER TABLE `personas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `personas_cursos`
--
ALTER TABLE `personas_cursos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `planificaciones`
--
ALTER TABLE `planificaciones`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `secciones`
--
ALTER TABLE `secciones`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD CONSTRAINT `usuarios_ibfk_1` FOREIGN KEY (`persona_id`) REFERENCES `personas` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
