--
-- PostgreSQL database dump
--

-- Dumped from database version 14.5
-- Dumped by pg_dump version 14.5

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: alert; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.alert (
    idalert bigint NOT NULL,
    alert_date timestamp without time zone,
    anomaly character varying(255),
    machine character varying(255),
    sensor bigint,
    sound_clip character varying(255)
);


ALTER TABLE public.alert OWNER TO postgres;

--
-- Name: alert_idalert_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.alert_idalert_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.alert_idalert_seq OWNER TO postgres;

--
-- Name: hibernate_sequence; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.hibernate_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.hibernate_sequence OWNER TO postgres;

--
-- Data for Name: alert; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.alert (idalert, alert_date, anomaly, machine, sensor, sound_clip) FROM stdin;
1	2022-11-02 11:00:35.640186	Mild	CNC Machine	1234567890	1.wav
2	2022-11-02 11:04:05.814333	Moderate	CNC Machine	123456789	2.wav
3	2022-11-02 11:04:41.185195	Severe	CNC Machine	1234567890	3.wav
4	2022-11-02 11:05:27.849284	Mild	Milling Machine	1122334455	4.wav
5	2022-11-02 11:06:01.735591	Moderate	Milling Machine	2345678900	5.wav
6	2022-11-02 11:06:45.008065	Severe	Milling Machine	2345678900	6.wav
\.


--
-- Name: alert_idalert_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.alert_idalert_seq', 1, false);


--
-- Name: hibernate_sequence; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.hibernate_sequence', 1, false);


--
-- Name: alert alert_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.alert
    ADD CONSTRAINT alert_pkey PRIMARY KEY (idalert);


--
-- PostgreSQL database dump complete
--

