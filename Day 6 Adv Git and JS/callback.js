let data = []
const fetchData = (callback) => {
    // Assume data fetching takes some time
    setTimeout(() => {
        data = [1, 2, 3, 4, 5, 6, 7]
        console.log("Data fetched successfully");
        callback(); // Trigger callback here
    }, 2000);
}

const displayData = () => {
    console.log("Display function: ", data);
}

fetchData(displayData); // passing function as argument i.e. a callback
// displayData();