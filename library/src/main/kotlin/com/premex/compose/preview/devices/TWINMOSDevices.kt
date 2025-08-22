package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TWINMOS device specifications for Android Compose previews.
 *
 * This extension provides TWINMOS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TWINMOS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TWINMOS: Any
  get() = object {
      /** TWINMOS MQ703G */
      val MQ703G = "spec:width=600,height=1024,unit=px,dpi=160"

  }
