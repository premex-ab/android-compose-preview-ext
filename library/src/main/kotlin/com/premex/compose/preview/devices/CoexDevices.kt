package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * COEX device specifications for Android Compose previews.
 *
 * This extension provides COEX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Coex.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Coex: Any
  get() = object {
      /** COEX sunnyvale */
      val SUNNYVALE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** COEX SW6H */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
