import React from "react";

function LandingPage() {
    return (
    <section id="landing">
        <div className="h-screen flex items-center justify-center">
            <div>
                <h1 className="p-72 py-80 h-96 border-2 border-black flex items-center justify-center text-2xl"><b>Two Rooms and a Boom</b></h1><br></br>
                <form className="flex justify-center items-center flex-col">
                    <label className="text-2xl">Enter Name</label>
                    <input
                        type="text"
                        required
                        className="border-2 border-black p-1 text-2xl"
                    />
                </form>
                <br></br>
                <div className="flex items-center justify-center justify-around text-2xl">
                    <div className="">
                        <div className="p-5">Create</div>
                        <button onClick={_ => window.location.href="/lobby"} className="bg-yellow-600 w-64 h-16 rounded">Create Game</button>
                    </div>
                    <div>
                        <div className="p-5">Join Room</div>
                        <div className="w-96 max-w-full relative">
                            <input
                            type="text"
                            className="border-2 border-black p-1 w-52 h-16"
                            maxLength={5}/>
                            <button className="bg-yellow-400 rounded aspect-square absolute right-48 top-4">
                                <svg 
                                    xmlns="http://www.w3.org/2000/svg" 
                                    width="28" 
                                    height="28" 
                                    viewBox="0 0 24 24" 
                                    fill="none" 
                                    stroke="#000000" 
                                    stroke-width="2" 
                                    stroke-linecap="round" 
                                    stroke-linejoin="round"><path d="M9 18l6-6-6-6"/>
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