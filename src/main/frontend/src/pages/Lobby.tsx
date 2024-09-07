import React, { useState } from "react";
import { Link } from "react-router-dom";


function LobbyPage() {
    //List of players
    const [players, setPlayers] = useState([
        {
            name: "test"
        },
        {
            name: "test2"
        }
    ]);
    
    const readyAction = () => {
        console.log("TODO: Send ready status for the player to the server")
    }

    return (
        <section id="lobby">
            <div id="lobby-container" className="h-screen mx-auto px-16 grid grid-cols-1 grid-rows-5 gap-1 justify-center">{/* Layout wrapper */}
                <div id="lobby-header" className="h-fit text-center">{/* Header Section for code */}
                    <div className="text-8xl p-4 border-b">
                        XSDH
                    </div>
                    <div className="flex justify-between my-5">
                        <button className="p-2 bg-gray-400 rounded-md">Copy Invite Link</button>
                        <button className="p-2 h-10 w-10 rounded-full bg-gray-400">i</button>
                    </div>
                </div>
                <div id="lobby-players-list" className="row-span-3 my-5">
                    {players.map(player => {
                        return (
                            <div key={player.name} className="text-md">
                                {player.name}
                            </div>
                        )
                    })}
                </div>
                <div id="lobby-footer-container" className="flex row-start-5 justify-evenly items-end my-2">
                    {/* Buttons */}
                    <Link to="/" id="lobby-button-leave" className="p-5 text-center bg-red-400 rounded-md h-fit w-72">Leave</Link>
                    <button onClick={readyAction} id="lobby-button-ready" className="p-5 bg-green-400 rounded-md h-fit w-72">Ready</button>
                </div>
            </div>
            {/* TODO: Side Nav component here */}
        </section>
    );
}

export default LobbyPage;