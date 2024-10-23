import React, { useState } from "react";

function LandingPage() {
    const [inputCode, setCode] = useState("");
    const [inputName, setName] = useState("");
    
    const createLobby = () => {
        fetch("http://localhost:8080/create", {
            method: "POST",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify({ inputName }),
        })
            .then((response) => {
                if (response.ok) {
                    return response.json();
                }
            })
            .then((data) => {
                localStorage.setItem("player_name", inputName);
                window.location.href = `/lobby/${data.lobbyid}`;
            })
            .catch((error: any) => {
                console.log(error);
            });
    };

    const joinLobby = () => {
        fetch(`http://localhost:8080/check/${inputCode}`, {
            method: "GET",
            headers: { 'Content-Type': 'application/json'},
        })
            .then((response) => {
                if (response.ok) {
                    return response.json();
                }
            })
            .then((data) => {
                if (data) {
                    localStorage.setItem("player_name", inputName);
                    console.log(data);
                    window.location.href = `/lobby/${inputCode}`;
                }
            })
            .catch((error: any) => {
                console.log(error);
            });
    };



    return (
        <section id="landing">
            <div className="h-screen flex items-center justify-center">
                <div>
                    <h1 className="p-72 py-80 h-96 border-2 border-black flex items-center justify-center text-2xl">
                        <b>Two Rooms and a Boom</b>
                    </h1>
                    <br></br>
                    <form className="flex justify-center items-center flex-col">
                        <label className="text-2xl">Enter Name</label>
                        <input
                            type="text"
                            required
                            className="border-2 border-black p-1 text-2xl"
                            value={inputName}
                            onChange={(e) => setName(e.target.value)}
                        />
                    </form>
                    <br></br>
                    <div className="flex items-center justify-center justify-around text-2xl">
                        <div className="">
                            <div className="p-5">Create</div>
                            <button
                                onClick={(_) => createLobby()}
                                className="bg-yellow-600 w-64 h-16 rounded"
                            >
                                Create Game
                            </button>
                        </div>
                        <div>
                            <div className="p-5">Join Room</div>
                            <div className="w-96 max-w-full relative">
                                <input
                                    type="text"
                                    className="border-2 border-black p-1 w-52 h-16"
                                    maxLength={5}
                                    value={inputCode}
                                    onChange={(e) => setCode(e.target.value)}
                                />
                                <button
                                    onClick={() => joinLobby()}
                                    className="bg-yellow-400 rounded aspect-square absolute right-48 top-4"
                                >
                                    <svg
                                        xmlns="http://www.w3.org/2000/svg"
                                        width="28"
                                        height="28"
                                        viewBox="0 0 24 24"
                                        fill="none"
                                        stroke="#000000"
                                        strokeWidth="2"
                                        strokeLinecap="round"
                                        strokeLinejoin="round"
                                    >
                                        <path d="M9 18l6-6-6-6" />
                                    </svg>
                                </button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    );
}

export default LandingPage;