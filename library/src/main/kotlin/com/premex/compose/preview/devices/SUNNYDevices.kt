package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SUNNY device specifications for Android Compose previews.
 *
 * This extension provides SUNNY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SUNNY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SUNNY: Any
  get() = object {
      /** SUNNY TABLET */
      val TABLET = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** SUNNY YQB */
      val YQB = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
