<h1>www.ciuris.com</h1>
Welcome to the repo for my personal website.
Routed through Cloudflare and hosted on my private linux server. Nginx and reactjs.
Http and Https.

<h1>how to run</h1>
If you have docker installed just got to frontend directory and use

``docker compose up`` AND create a file called .env if it doesn't already exits
add the lines:

port=3456

ipinfoToken=*enter token here*

without a valid IpInfo.io token an error will be caught and logged in console. It should still run.

That's it! It should be live on your localhost:3456 if it's unused. If that port is busy change the port in .env.