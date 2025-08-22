package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * COSMOS device specifications for Android Compose previews.
 *
 * This extension provides COSMOS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.COSMOS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.COSMOS: Any
  get() = object {
      /** COSMOS Aries_8in */
      val ARIES_8IN = "spec:width=800,height=1280,unit=px,dpi=213"

      /** COSMOS Nova_10in */
      val NOVA_10IN = "spec:width=800,height=1280,unit=px,dpi=213"

  }
