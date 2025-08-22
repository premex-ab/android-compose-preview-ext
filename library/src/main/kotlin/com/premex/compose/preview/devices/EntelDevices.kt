package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Entel device specifications for Android Compose previews.
 *
 * This extension provides Entel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Entel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Entel: Any
  get() = object {
      /** Entel DIW585 */
      val DIW585 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Entel DV8957X-KCE */
      val DV8957X_KCE = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
