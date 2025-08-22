package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PLDTHOME device specifications for Android Compose previews.
 *
 * This extension provides PLDTHOME device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Pldthome.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Pldthome: Any
  get() = object {
      /** PLDTHOME DS8942-KPP */
      val DS8942_KPP = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
