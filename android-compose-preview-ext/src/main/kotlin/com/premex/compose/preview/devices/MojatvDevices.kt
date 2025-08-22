package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MojaTV device specifications for Android Compose previews.
 *
 * This extension provides MojaTV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mojatv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mojatv: Any
  get() = object {
      /** MojaTV SEI530BHT */
      val SEI530BHT = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
