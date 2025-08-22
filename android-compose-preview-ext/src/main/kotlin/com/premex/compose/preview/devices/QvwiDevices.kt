package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * QVWI device specifications for Android Compose previews.
 *
 * This extension provides QVWI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Qvwi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Qvwi: Any
  get() = object {
      /** QVWI YDA */
      val YDA = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
