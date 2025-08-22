package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * XTREME device specifications for Android Compose previews.
 *
 * This extension provides XTREME device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.XTREME.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.XTREME: Any
  get() = object {
      /** XTREME R3 */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** XTREME R4 */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** XTREME shinjuku */
      val SHINJUKU = "spec:width=720,height=1280,unit=px,dpi=213"

      /** XTREME sunnyvale */
      val SUNNYVALE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** XTREME SW4H */
      val SW4H = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
