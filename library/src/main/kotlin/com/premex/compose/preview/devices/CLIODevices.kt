package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CLIO device specifications for Android Compose previews.
 *
 * This extension provides CLIO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CLIO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CLIO: Any
  get() = object {
      /** CLIO Neo_4_Plus */
      val NEO_4_PLUS = "spec:width=480,height=800,unit=px,dpi=220"

  }
