def call(Map config = [:]) {
    bat """
    robocopy E:\\project\\ C:\\project_backup /MT /MIR"
    IF ERRORLEVEL 1 (echo ROBOCOPY STATUS = OK) ELSE (echo ROBOCOPY STATUS = FAILURE)
    exit /B 0
    """
}
