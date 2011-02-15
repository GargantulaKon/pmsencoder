script {
    // global variables available in all scripts
    // uncomment/adjust accordingly

    if ($PMS.get().isWindows()) {
        // GET_FLASH_VIDEOS = 'C:\\Perl\\Scripts\\get_flash_videos'
        // HLS_PLAYER = 'C:\\Python\\bin\\hls-player''
        // PERL = 'C:\\Perl\\bin\\perl'
        // PYTHON = 'C:\\Python\\bin\\python'
        // SOPCAST = 'C:\\Path\\To\\sopcast'
        // YOUTUBE_DL = 'C:\\Python\\Scripts\\youtube-dl'
    } else {
        // GET_FLASH_VIDEOS = '/usr/bin/get_flash_videos'
        // HLS_PLAYER = '/usr/bin/hls-player'
        // NOTIFY_SEND = '/usr/bin/notify-send'
        // PERL = '/usr/bin/perl'
        // PYTHON = '/usr/bin/python'
        // SOPCAST = '/path/to/sopcast'
        // YOUTUBE_DL = '/usr/bin/youtube-dl'
    }

    // see https://secure.wikimedia.org/wikipedia/en/wiki/YouTube#Quality_and_codecs
    YOUTUBE_DL_MAX_QUALITY = 22
}
