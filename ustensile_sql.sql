-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le :  lun. 21 déc. 2020 à 13:32
-- Version du serveur :  10.4.11-MariaDB
-- Version de PHP :  7.2.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `ustensile`
--

-- --------------------------------------------------------

--
-- Structure de la table `roundvessel`
--

CREATE TABLE `roundvessel` (
  `id` int(11) NOT NULL,
  `construction_year` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `radius` double NOT NULL,
  `surface` double NOT NULL,
  `price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `roundvessel`
--

INSERT INTO `roundvessel` (`id`, `construction_year`, `name`, `radius`, `surface`, `price`) VALUES
(1, 1987, 'vase', 18, 0, 0),
(2, 1964, 'vase', 12, 452.3893421169302, 6);

-- --------------------------------------------------------

--
-- Structure de la table `spoon`
--

CREATE TABLE `spoon` (
  `id` int(11) NOT NULL,
  `construction_year` int(11) NOT NULL,
  `length` double NOT NULL,
  `price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `squarevessel`
--

CREATE TABLE `squarevessel` (
  `id` int(11) NOT NULL,
  `construction_year` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `corner` double NOT NULL,
  `surface` double NOT NULL,
  `price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `squarevessel`
--

INSERT INTO `squarevessel` (`id`, `construction_year`, `name`, `corner`, `surface`, `price`) VALUES
(1, 1988, 'vasesoupiere', 23, 0, 0);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `roundvessel`
--
ALTER TABLE `roundvessel`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `spoon`
--
ALTER TABLE `spoon`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `squarevessel`
--
ALTER TABLE `squarevessel`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `roundvessel`
--
ALTER TABLE `roundvessel`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT pour la table `spoon`
--
ALTER TABLE `spoon`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `squarevessel`
--
ALTER TABLE `squarevessel`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
