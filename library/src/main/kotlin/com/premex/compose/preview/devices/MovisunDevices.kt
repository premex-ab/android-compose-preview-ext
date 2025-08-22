package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MOVISUN device specifications for Android Compose previews.
 *
 * This extension provides MOVISUN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Movisun.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Movisun: Any
  get() = object {
      /** MOVISUN ASTROA1 */
      val ASTROA1 = "spec:width=720,height=1560,unit=px,dpi=280"

      /** MOVISUN Astro_Pad10 */
      val ASTRO_PAD10 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** MOVISUN TAB-S1 */
      val TAB_S1 = "spec:width=600,height=1024,unit=px,dpi=213"

  }
