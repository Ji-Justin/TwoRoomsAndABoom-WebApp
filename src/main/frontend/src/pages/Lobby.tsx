import React, { useState } from "react";


function LobbyPage() {
    //List of players
    const [players, setPlayers] = useState([]);



    return (
        <section id="lobby">
            <div id="lobby-container">{/* Layout wrapper */}
                <div id="lobby-header">{/* Header Section for code */}
                    <div>{/* Room Code (From Link)*/}
                    </div>
                    <div>
                        <div>{/* Invite Link */}
                        </div>
                        <div>{/* Info Button */}
                        </div>
                    </div>
                </div>
                <div id="lobby-players-list">{/* List out players */}</div>
                <div id="lobby-footer-container">
                    {/* Buttons */}
                    <button id="lobby-button-leave">Leave</button>
                    <button id="lobby-button-ready">Ready</button>
                </div>
            </div>
            {/* TODO: Side Nav component here */}
        </section>
    );
}

export default LobbyPage;