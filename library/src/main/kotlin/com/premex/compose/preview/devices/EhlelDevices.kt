package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Ehlel device specifications for Android Compose previews.
 *
 * This extension provides Ehlel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ehlel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ehlel: Any
  get() = object {
      /** Ehlel Ehlel-C7PRO */
      val EHLEL_C7PRO = "spec:width=720,height=1640,unit=px,dpi=320"

      /** Ehlel Ehlel_Defender_D23 */
      val EHLEL_DEFENDER_D23 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Ehlel Ehlel-Hulan21 */
      val EHLEL_HULAN21 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
