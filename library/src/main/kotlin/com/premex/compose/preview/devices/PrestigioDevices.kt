package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Prestigio device specifications for Android Compose previews.
 *
 * This extension provides Prestigio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Prestigio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Prestigio get() = object {
    /** Prestigio CD80A5G */
    val CD80A5G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Prestigio Grace 3118 3G */
    val GRACE_3118_3G = "spec:width=800,height=1280,unit=px,dpi=190"

    /** Prestigio Grace 3778 3G */
    val GRACE_3778_3G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Prestigio Grace 3878 4G */
    val GRACE_3878_4G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Prestigio GRACE P5 */
    val GRACE_P5 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Prestigio HP10A4L */
    val HP10A4L = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Prestigio HP10A5L */
    val HP10A5L = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Prestigio HP80A16G */
    val HP80A16G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Prestigio HP80A21G */
    val HP80A21G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Prestigio MultiPad Wize 3037 3G */
    val MULTIPAD_WIZE_3037_3G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Prestigio MULTIPAD WIZE 3121 */
    val MULTIPAD_WIZE_3121 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Prestigio Multipad Wize 3757 3G */
    val MULTIPAD_WIZE_3757_3G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Prestigio MultiPhone 5504 DUO */
    val MULTIPHONE_5504_DUO = "spec:width=540,height=960,unit=px,dpi=240"

    /** Prestigio MUZE E5 LTE */
    val MUZE_E5_LTE = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Prestigio MUZE V3 */
    val MUZE_V3 = "spec:width=480,height=960,unit=px,dpi=240"

    /** Prestigio PGPS7795 */
    val PGPS7795 = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Prestigio PMT1107_4G_D_RU */
    val PMT1107_4G_D_RU = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Prestigio PMT1177_3G */
    val PMT1177_3G = "spec:width=720,height=1280,unit=px,dpi=160"

    /** Prestigio PMT1177_ 4G */
    val PMT1177_4G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Prestigio PMT1196_3G */
    val PMT1196_3G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Prestigio PMT3031_3G */
    val PMT3031_3G = "spec:width=600,height=1024,unit=px,dpi=132"

    /** Prestigio PMT3104_Wi_D_RU */
    val PMT3104_WI_D_RU = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Prestigio PMT3151_3G_D_CIS */
    val PMT3151_3G_D_CIS = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Prestigio PMT3171_3G */
    val PMT3171_3G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Prestigio PMT3197_W_D_EU */
    val PMT3197_W_D_EU = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Prestigio PMT3197_W_EU */
    val PMT3197_W_EU = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Prestigio PMT3208_3G */
    val PMT3208_3G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Prestigio PMT3231_4G_D_EEA */
    val PMT3231_4G_D_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Prestigio PMT3277_3G */
    val PMT3277_3G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Prestigio PMT3287_3G */
    val PMT3287_3G = "spec:width=770,height=1024,unit=px,dpi=160"

    /** Prestigio PMT3301_4G */
    val PMT3301_4G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Prestigio PMT3351_3G */
    val PMT3351_3G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Prestigio PMT3418_4G */
    val PMT3418_4G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Prestigio PMT3607_4G */
    val PMT3607_4G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Prestigio PMT3608_4G */
    val PMT3608_4G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Prestigio PMT3718_3G */
    val PMT3718_3G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Prestigio PMT3797_3G */
    val PMT3797_3G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Prestigio PMT3851_4G */
    val PMT3851_4G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Prestigio PMT4111_3G */
    val PMT4111_3G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Prestigio PMT4117_3G_EEA */
    val PMT4117_3G_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Prestigio PMT4131_4G */
    val PMT4131_4G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Prestigio PMT4137_4G */
    val PMT4137_4G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Prestigio PMT4137_4G_EEA */
    val PMT4137_4G_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Prestigio PMT4138_4G_EEA */
    val PMT4138_4G_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Prestigio PMT4208_3G_EEA */
    val PMT4208_3G_EEA = "spec:width=800,height=1280,unit=px,dpi=240"

    /** Prestigio PMT4231_4G_D_RU */
    val PMT4231_4G_D_RU = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Prestigio PMT4238_4G_RU */
    val PMT4238_4G_RU = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Prestigio PMT4337_3G_RU */
    val PMT4337_3G_RU = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Prestigio PMT4511_4G_RU */
    val PMT4511_4G_RU = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Prestigio PMT4667_3G_RU */
    val PMT4667_3G_RU = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Prestigio PMT5002_Wi */
    val PMT5002_WI = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Prestigio PMT5011_3G */
    val PMT5011_3G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Prestigio PMT5018_3G */
    val PMT5018_3G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Prestigio PMT5287_4G */
    val PMT5287_4G = "spec:width=770,height=1024,unit=px,dpi=160"

    /** Prestigio PMT5487_3G */
    val PMT5487_3G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Prestigio PMT5771_4G */
    val PMT5771_4G = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Prestigio PMT5777_3G */
    val PMT5777_3G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Prestigio PMT5887_3G */
    val PMT5887_3G = "spec:width=800,height=1280,unit=px,dpi=213"

    /** Prestigio PMT7077_3G */
    val PMT7077_3G = "spec:width=768,height=1024,unit=px,dpi=160"

    /** Prestigio PMT7177_3G */
    val PMT7177_3G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Prestigio PMT7287_3G */
    val PMT7287_3G = "spec:width=768,height=1024,unit=px,dpi=160"

    /** Prestigio Prestigio X pro */
    val PRESTIGIO_X_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

    /** Prestigio PSP3471DUO */
    val PSP3471DUO = "spec:width=480,height=960,unit=px,dpi=240"

    /** Prestigio PSP3515DUO_RU */
    val PSP3515DUO_RU = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Prestigio PSP3517DUO */
    val PSP3517DUO = "spec:width=480,height=854,unit=px,dpi=213"

    /** Prestigio PSP3531DUO */
    val PSP3531DUO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Prestigio PSP3551 */
    val PSP3551 = "spec:width=480,height=854,unit=px,dpi=240"

    /** Prestigio PSP3552DUO */
    val PSP3552DUO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Prestigio PSP5511DUO */
    val PSP5511DUO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Prestigio PSP5516DUO */
    val PSP5516DUO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Prestigio PSP5519DUO */
    val PSP5519DUO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Prestigio PSP5521DUO */
    val PSP5521DUO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Prestigio PSP5522DUO */
    val PSP5522DUO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Prestigio PSP5531 */
    val PSP5531 = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Prestigio PSP5551DUO */
    val PSP5551DUO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Prestigio PSP5552DUO */
    val PSP5552DUO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Prestigio PSP7511DUO */
    val PSP7511DUO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Prestigio PSP7512DUO */
    val PSP7512DUO = "spec:width=640,height=1280,unit=px,dpi=320"

    /** Prestigio PSP7530DUO */
    val PSP7530DUO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Prestigio PSP7550DUO */
    val PSP7550DUO = "spec:width=720,height=1280,unit=px,dpi=320"

    /** Prestigio PSP7610DUO */
    val PSP7610DUO = "spec:width=720,height=1560,unit=px,dpi=320"

    /** Prestigio TC10A3L */
    val TC10A3L = "spec:width=1200,height=1920,unit=px,dpi=240"

    /** Prestigio TC70A1G */
    val TC70A1G = "spec:width=600,height=1024,unit=px,dpi=213"

    /** Prestigio Wize 3131 3G */
    val WIZE_3131_3G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Prestigio Wize 3147 3G */
    val WIZE_3147_3G = "spec:width=600,height=1024,unit=px,dpi=160"

    /** Prestigio Wize 3401 3G */
    val WIZE_3401_3G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Prestigio Wize 3731 3G */
    val WIZE_3731_3G = "spec:width=800,height=1280,unit=px,dpi=160"

    /** Prestigio WIZE YA3 */
    val WIZE_YA3 = "spec:width=480,height=800,unit=px,dpi=240"

}
