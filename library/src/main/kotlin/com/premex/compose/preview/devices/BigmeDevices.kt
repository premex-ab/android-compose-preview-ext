package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Bigme device specifications for Android Compose previews.
 *
 * This extension provides Bigme device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bigme.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bigme: Any
  get() = object {
      /** Bigme Smartphone */
      val SMARTPHONE = "spec:width=824,height=1648,unit=px,dpi=300"

  }
