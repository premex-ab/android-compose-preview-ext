package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WIKO device specifications for Android Compose previews.
 *
 * This extension provides WIKO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WIKO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WIKO: Any
  get() = object {
      /** DeviceSpec(manufacturer=WIKO, code=C210AE, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=C210AE, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val C210AE = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WIKO, code=DBA-AN00, width=720, height=1600, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=DBA-AN00, width=720,
      height=1600, dpi=480, isGoogleDevice=false).code */
      val DBA_AN00 = "spec:width=720,height=1600,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=WIKO, code=i9031, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=i9031, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val I9031 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=WIKO, code=L5221, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=L5221, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val L5221 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WIKO, code=L5227AC, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=L5227AC, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val L5227AC = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WIKO, code=L5251, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=L5251, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val L5251 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=l5261, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=l5261, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val L5261 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=l5320, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=l5320, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val L5320 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=l5421, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=l5421, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val L5421 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=l5460, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=l5460, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val L5460 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=WIKO, code=l5510, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=l5510, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val L5510 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=l5560ae, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=l5560ae, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val L5560AE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=l9010, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=l9010, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val L9010 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=P4601AN, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=P4601AN, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P4601AN = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=P4661AN, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=P4661AN, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P4661AN = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=P4901AC, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=P4901AC, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P4901AC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=P4903JP, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=P4903JP, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P4903JP = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=P4903LA, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=P4903LA, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P4903LA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=P6601AE, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=P6601AE, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P6601AE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=P6609BC, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=P6609BC, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P6609BC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=P6609BCD, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=P6609BCD, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P6609BCD = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=p6901, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=p6901, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val P6901 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=WIKO, code=p7201, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=p7201, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val P7201 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=WIKO, code=p7203, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=p7203, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val P7203 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=WIKO, code=s4050ap, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=s4050ap, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val S4050AP = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WIKO, code=s5030, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=s5030, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val S5030 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WIKO, code=S5030AP12H, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=S5030AP12H, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val S5030AP12H = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WIKO, code=s5201ap, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=s5201ap, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val S5201AP = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WIKO, code=s5222, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=s5222, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val S5222 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WIKO, code=s5250, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=s5250, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val S5250 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=s5254, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=s5254, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val S5254 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=S5260, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=S5260, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val S5260 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=S5420, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=S5420, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val S5420 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=s8515, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=s8515, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val S8515 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=T20, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=T20, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val T20 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=T2800AN, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=T2800AN, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val T2800AN = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WIKO, code=T3903BN, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=T3903BN, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val T3903BN = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WIKO, code=T3931AC, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=T3931AC, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val T3931AC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=T60, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=T60, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val T60 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=WIKO, code=T6901AC, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=T6901AC, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val T6901AC = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=WIKO, code=T9051AC, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=T9051AC, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val T9051AC = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=WIKO, code=U307AS, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=U307AS, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val U307AS = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=WIKO, code=U316AT, width=480, height=960, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=U316AT, width=480,
      height=960, dpi=220, isGoogleDevice=false).code */
      val U316AT = "spec:width=480,height=960,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=WIKO, code=U520AS, width=720, height=1440, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=U520AS, width=720,
      height=1440, dpi=300, isGoogleDevice=false).code */
      val U520AS = "spec:width=720,height=1440,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=WIKO, code=U614AS, width=720, height=1560, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=U614AS, width=720,
      height=1560, dpi=300, isGoogleDevice=false).code */
      val U614AS = "spec:width=720,height=1560,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=WIKO, code=U616AT, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=U616AT, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val U616AT = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=WIKO, code=v12bn, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=v12bn, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val V12BN = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=v12bnlite, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=v12bnlite, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val V12BNLITE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=v12dnlite, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=v12dnlite, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val V12DNLITE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=v12enlite, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=v12enlite, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val V12ENLITE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=V2502AN, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=V2502AN, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val V2502AN = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WIKO, code=v2508, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=v2508, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val V2508 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WIKO, code=v2510, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=v2510, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val V2510 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WIKO, code=v2520, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=v2520, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val V2520 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WIKO, code=v2600cn, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=v2600cn, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val V2600CN = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WIKO, code=v2610, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=v2610, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val V2610 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WIKO, code=V2800AN, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=V2800AN, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val V2800AN = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WIKO, code=V2802AN, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=V2802AN, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val V2802AN = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WIKO, code=v2806, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=v2806, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val V2806 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WIKO, code=V3610AN, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=V3610AN, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val V3610AN = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WIKO, code=V3702AN, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=V3702AN, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val V3702AN = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=v3720, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=v3720, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val V3720 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=v3740, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=v3740, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val V3740 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=V3750AN, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=V3750AN, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val V3750AN = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=V3802AN, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=V3802AN, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val V3802AN = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=V3903BN, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=V3903BN, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val V3903BN = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WIKO, code=v3913, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=v3913, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val V3913 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WIKO, code=V3913BN22I, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=V3913BN22I, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val V3913BN22I = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WIKO, code=V3921, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=V3921, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val V3921 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=V3931AC, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=V3931AC, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val V3931AC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=V3933AC, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=V3933AC, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val V3933AC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=v3941, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=v3941, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val V3941 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=v3953, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=v3953, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val V3953 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=V3953AN25K, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=V3953AN25K, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val V3953AN25K = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=v3961, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=v3961, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val V3961 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=v3971, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=v3971, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val V3971 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=V3991AN, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=V3991AN, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val V3991AN = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=VHEM, width=720, height=1600, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=VHEM, width=720,
      height=1600, dpi=260, isGoogleDevice=false).code */
      val VHEM = "spec:width=720,height=1600,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=WIKO, code=WC300, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=WC300, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val WC300 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=WC300SN, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=WC300SN, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val WC300SN = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=W_C200SN, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W_C200SN, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val W_C200SN = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WIKO, code=W_C201, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W_C201, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val W_C201 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WIKO, code=W_C800, width=720, height=1528, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W_C800, width=720,
      height=1528, dpi=280, isGoogleDevice=false).code */
      val W_C800 = "spec:width=720,height=1528,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=WIKO, code=W_C800S, width=720, height=1528, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W_C800S, width=720,
      height=1528, dpi=280, isGoogleDevice=false).code */
      val W_C800S = "spec:width=720,height=1528,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=WIKO, code=W_C860, width=720, height=1528, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W_C860, width=720,
      height=1528, dpi=280, isGoogleDevice=false).code */
      val W_C860 = "spec:width=720,height=1528,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=WIKO, code=W_K101, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W_K101, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val W_K101 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WIKO, code=W_K101S, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W_K101S, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val W_K101S = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WIKO, code=W_K120, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W_K120, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val W_K120 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WIKO, code=W-K130, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W-K130, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val W_K130 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WIKO, code=W-K200, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W-K200, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val W_K200 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WIKO, code=W-K211, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W-K211, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val W_K211 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=WIKO, code=W_K300, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W_K300, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val W_K300 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WIKO, code=W_K300S, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W_K300S, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val W_K300S = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WIKO, code=W-K360, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W-K360, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val W_K360 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=W-K380, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W-K380, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val W_K380 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** DeviceSpec(manufacturer=WIKO, code=W_K400, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W_K400, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val W_K400 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=W-K420, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W-K420, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val W_K420 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=W-K510, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W-K510, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val W_K510 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WIKO, code=W-K510DG, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W-K510DG, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val W_K510DG = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WIKO, code=W-K521, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W-K521, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val W_K521 = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=WIKO, code=W-K560, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W-K560, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val W_K560 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WIKO, code=W_K600, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W_K600, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val W_K600 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=WIKO, code=W-K610, width=720, height=1560, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W-K610, width=720,
      height=1560, dpi=280, isGoogleDevice=false).code */
      val W_K610 = "spec:width=720,height=1560,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=WIKO, code=W-K630, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W-K630, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val W_K630 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=W_P130, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W_P130, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val W_P130 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=W_P200, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W_P200, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val W_P200 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=W_P200CM, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W_P200CM, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val W_P200CM = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=W-P210, width=720, height=1512, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W-P210, width=720,
      height=1512, dpi=320, isGoogleDevice=false).code */
      val W_P210 = "spec:width=720,height=1512,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=W-P220, width=720, height=1512, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W-P220, width=720,
      height=1512, dpi=320, isGoogleDevice=false).code */
      val W_P220 = "spec:width=720,height=1512,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=W-P311, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W-P311, width=720,
      height=1520, dpi=280, isGoogleDevice=false).code */
      val W_P311 = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=WIKO, code=W-P611, width=1080, height=2340, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W-P611, width=1080,
      height=2340, dpi=420, isGoogleDevice=false).code */
      val W_P611 = "spec:width=1080,height=2340,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=WIKO, code=W-P861, width=1080, height=2400, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W-P861, width=1080,
      height=2400, dpi=400, isGoogleDevice=false).code */
      val W_P861 = "spec:width=1080,height=2400,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=WIKO, code=W-U300, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W-U300, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val W_U300 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=WIKO, code=W-V600, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W-V600, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val W_V600 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=W-V673, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W-V673, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val W_V673 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=WIKO, code=W-V680, width=720, height=1520, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W-V680, width=720,
      height=1520, dpi=280, isGoogleDevice=false).code */
      val W_V680 = "spec:width=720,height=1520,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=WIKO, code=W-V720, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W-V720, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val W_V720 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=W-V730, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W-V730, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val W_V730 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=WIKO, code=W-V745, width=720, height=1640, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W-V745, width=720,
      height=1640, dpi=280, isGoogleDevice=false).code */
      val W_V745 = "spec:width=720,height=1640,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=WIKO, code=W-V750BN, width=720, height=1640, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W-V750BN, width=720,
      height=1640, dpi=260, isGoogleDevice=false).code */
      val W_V750BN = "spec:width=720,height=1640,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=WIKO, code=W-V755, width=720, height=1640, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W-V755, width=720,
      height=1640, dpi=260, isGoogleDevice=false).code */
      val W_V755 = "spec:width=720,height=1640,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=WIKO, code=W-V770, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W-V770, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val W_V770 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=WIKO, code=W-V800, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W-V800, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val W_V800 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=WIKO, code=W-V830, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W-V830, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val W_V830 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=WIKO, code=W-V850, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W-V850, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val W_V850 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=WIKO, code=W-V851, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIKO, code=W-V851, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val W_V851 = "spec:width=720,height=1600,unit=px,dpi=280"

  }
