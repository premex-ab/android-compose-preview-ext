package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FERO device specifications for Android Compose previews.
 *
 * This extension provides FERO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Fero.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Fero: Any
  get() = object {
      /** FERO Royale_X2 */
      val ROYALE_X2 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
