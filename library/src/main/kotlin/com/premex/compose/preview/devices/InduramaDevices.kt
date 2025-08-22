package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * indurama device specifications for Android Compose previews.
 *
 * This extension provides indurama device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Indurama.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Indurama: Any
  get() = object {
      /** indurama shinjuku */
      val SHINJUKU = "spec:width=720,height=1280,unit=px,dpi=213"

      /** indurama sunnyvale */
      val SUNNYVALE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** indurama SW4H */
      val SW4H = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
