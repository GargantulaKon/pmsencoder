// videofeed.Web,PCGames=http://videos.pcgames.de/rss/newest.php

script {
    profile ('PC Games') {
        pattern {
            domain 'pcgames.de'
        }

        action {
            $URI = $HTTP.target($URI)
            scrape '\\bcurrentposition\\s*=\\s*(?<currentPosition>\\d+)\\s*;'
            scrape "'(?<URI>http://\\w+\\.gamereport\\.de/videos/[^']+?/${currentPosition}/[^']+)'"
        }
    }
}
