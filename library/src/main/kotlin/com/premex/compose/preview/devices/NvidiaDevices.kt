package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * nvidia device specifications for Android Compose previews.
 *
 * This extension provides nvidia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nvidia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nvidia: Any
  get() = object {
      /** nvidia roth */
      val ROTH = "spec:width=720,height=1280,unit=px,dpi=320"

      /** nvidia shieldtablet */
      val SHIELDTABLET = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** nvidia tegranote */
      val TEGRANOTE = "spec:width=800,height=1280,unit=px,dpi=213"

  }
