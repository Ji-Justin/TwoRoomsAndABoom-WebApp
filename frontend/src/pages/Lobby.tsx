import React, { useState, useEffect } from "react";
import { Link, useParams } from "react-router-dom";
import { connect } from "../utils/websocketUtils.ts";

function LobbyPage() {
    //List of players
    const [players, setPlayers] = useState([
        {
            name: "test",
        },
        {
            name: "test2",
        },
    ]);

    const [ws, setWs] = useState<WebSocket | null>(); 

    let { lobbyid } = useParams();
    let name = localStorage.getItem("player_name");


    const copyLink = () => {
        console.log("TODO: Link copied to clip board");
    };

    const infoNavOpen = () => {
        console.log("TODO: Opens the Side Nav component");
    };

    const readyAction = () => {
        console.log("TODO: Send ready status for the player to the server");
    };

    useEffect(() => {
        if (lobbyid && name) {
            setWs(connect(lobbyid, name));
        }
    }, [lobbyid]);
    
    return (
        <section id="lobby">
            <div
                id="lobby-container"
                className="h-screen mx-auto px-16 grid grid-cols-1 grid-rows-5 gap-1 justify-center"
            >
                {/* Layout wrapper */}
                <div id="lobby-header" className="h-fit text-center">
                    {/* Header Section for code */}
                    <div className="text-8xl p-4 border-b">XSDH</div>
                    <div className="flex justify-between my-5">
                        <button
                            onClick={copyLink}
                            className="p-2 bg-gray-400 rounded-md"
                        >
                            Copy Invite Link
                        </button>
                        <button
                            onClick={infoNavOpen}
                            className="p-2 h-10 w-10 rounded-full bg-gray-400"
                        >
                            i
                        </button>
                    </div>
                </div>
                <div id="lobby-players-list" className="row-span-3 my-5">
                    {players.map((player) => {
                        return (
                            <div key={player.name} className="text-md">
                                {player.name}
                            </div>
                        );
                    })}
                </div>
                <div
                    id="lobby-footer-container"
                    className="flex row-start-5 justify-evenly items-end my-2"
                >
                    {/* Buttons */}
                    <Link
                        to="/"
                        id="lobby-button-leave"
                        className="p-5 text-center bg-red-400 rounded-md h-fit w-72"
                    >
                        Leave
                    </Link>
                    <button
                        onClick={readyAction}
                        id="lobby-button-ready"
                        className="p-5 bg-green-400 rounded-md h-fit w-72"
                    >
                        Ready
                    </button>
                </div>
            </div>
            {/* TODO: Side Nav component here */}
        </section>
    );
}

export default LobbyPage;
