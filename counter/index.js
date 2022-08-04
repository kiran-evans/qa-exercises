"use strict";

let histCount = 0;

function addHistory (action) {
    let newHist = document.createElement("div");
    newHist.id = `history${histCount}`;
    newHist.innerHTML = `<span>${action}</span><button id='hist${histCount}DelBtn'>✕</button>`;
    document.querySelector("#historyList").prepend(newHist);
    document.querySelector(`button#hist${histCount}DelBtn`).addEventListener("click", function () {
        let removed = document.createElement("div");
        removed.className = "removed";
        removed.innerHTML = `<span>REDACTED</span>`;
        document.querySelector(`div#${newHist.id}`).replaceWith(removed);
    });
    histCount++;
}

const counterInput = document.querySelector("input#counterInput");

// Reset
document.querySelector("button#reset").addEventListener("click", function () {
    counterInput.setAttribute("value", 0);
    addHistory("You reset the counter.");
});


document.querySelector("button#plusOne").addEventListener("click", function () {
    counterInput.setAttribute("value", Number.parseInt(counterInput.getAttribute("value"))+1);
    addHistory(`${Number.parseInt(counterInput.getAttribute("value"))-1} + 1 = ${Number.parseInt(counterInput.getAttribute("value"))}`);
});

document.querySelector("button#plusFive").addEventListener("click", function () {
    counterInput.setAttribute("value", Number.parseInt(counterInput.getAttribute("value"))+5);
    addHistory(`${Number.parseInt(counterInput.getAttribute("value"))-5} + 5 = ${Number.parseInt(counterInput.getAttribute("value"))}`);
});

document.querySelector("button#minusOne").addEventListener("click", function () {
    counterInput.setAttribute("value", Number.parseInt(counterInput.getAttribute("value"))-1);
    addHistory(`${Number.parseInt(counterInput.getAttribute("value"))+1} - 1 = ${Number.parseInt(counterInput.getAttribute("value"))}`);
});

document.querySelector("button#minusFive").addEventListener("click", function () {
    counterInput.setAttribute("value", Number.parseInt(counterInput.getAttribute("value"))-5);
    addHistory(`${Number.parseInt(counterInput.getAttribute("value"))+5} - 5 = ${Number.parseInt(counterInput.getAttribute("value"))}`);
});