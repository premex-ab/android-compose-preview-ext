package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Felux device specifications for Android Compose previews.
 *
 * This extension provides Felux device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Felux.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Felux: Any
  get() = object {
      /** Felux X_Pro */
      val X_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

  }
