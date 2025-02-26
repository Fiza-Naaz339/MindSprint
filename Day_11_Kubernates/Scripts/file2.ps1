$source_dir = "D:\OneDrive - Olam International\Desktop\Training\Kubernates\Scripts"
$back_up = "D:\OneDrive - Olam International\Desktop\Training\Kubernates\Scripts\Backup"
$timestamp = Get-Date -Format "yy-MM-dd_HH-mm-ss"
$backup_file = "backup_$timestamp.tar.gz"

Write-Host "Source Directory: $source_dir"
Write-Host "Backup Directory: $back_up"
Write-Host "Timestamp: $timestamp"
Write-Host "Backup File: $backup_file"
