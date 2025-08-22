package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SKYHCN device specifications for Android Compose previews.
 *
 * This extension provides SKYHCN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SKYHCN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SKYHCN: Any
  get() = object {
      /** SKYHCN K1100UA */
      val K1100UA = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
