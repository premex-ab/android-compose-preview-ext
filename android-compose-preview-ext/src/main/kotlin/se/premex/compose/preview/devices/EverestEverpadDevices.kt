package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * EVEREST-EVERPAD device specifications for Android Compose previews.
 *
 * This extension provides EVEREST-EVERPAD device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EverestEverpad.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EverestEverpad: Any
  get() = object {
      /** EVEREST-EVERPAD DC-M700 */
      val DC_M700 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** EVEREST-EVERPAD mid1032_mk */
      val MID1032_MK = "spec:width=800,height=1280,unit=px,dpi=160"

      /** EVEREST-EVERPAD MID7015A-MK */
      val MID7015A_MK = "spec:width=600,height=1024,unit=px,dpi=160"

      /** EVEREST-EVERPAD mid7015_mk */
      val MID7015_MK = "spec:width=600,height=1024,unit=px,dpi=160"

  }
