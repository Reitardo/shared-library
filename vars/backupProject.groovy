def call(Map config = [:]) {
    bat """
    robocopy E:\\szkolenie\\ F:\\project_backup /MT /MIR"
    IF ERRORLEVEL 1 (echo ROBOCOPY STATUS = OK) ELSE (echo ROBOCOPY STATUS = FAILURE)
    exit /B 0
    """
}
