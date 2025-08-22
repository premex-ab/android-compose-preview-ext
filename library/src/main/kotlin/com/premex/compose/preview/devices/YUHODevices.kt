package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * YUHO device specifications for Android Compose previews.
 *
 * This extension provides YUHO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.YUHO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.YUHO: Any
  get() = object {
      /** YUHO A1332E */
      val A1332E = "spec:width=480,height=1014,unit=px,dpi=200"

      /** YUHO Netra */
      val NETRA = "spec:width=720,height=1560,unit=px,dpi=240"

      /** YUHO YUHO_Y1_StarS */
      val YUHO_Y1_STARS = "spec:width=412,height=502,unit=px,dpi=180"

  }
