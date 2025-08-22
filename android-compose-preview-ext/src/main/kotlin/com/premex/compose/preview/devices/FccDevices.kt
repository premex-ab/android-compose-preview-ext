package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FCC device specifications for Android Compose previews.
 *
 * This extension provides FCC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Fcc.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Fcc: Any
  get() = object {
      /** FCC GK738_3G */
      val GK738_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** FCC GK788 */
      val GK788 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
