import { useCallback, useEffect, useState } from 'react';

export function connect(lobbyid: string, name: string) {
    const uri = `ws://localhost:8080?lobbyid=${lobbyid}&name=${name}`
    const ws = new WebSocket(uri);
    }