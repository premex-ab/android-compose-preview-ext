package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Phoenix device specifications for Android Compose previews.
 *
 * This extension provides Phoenix device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Phoenix.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Phoenix: Any
  get() = object {
      /** Phoenix PHONETABPRO */
      val PHONETABPRO = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
