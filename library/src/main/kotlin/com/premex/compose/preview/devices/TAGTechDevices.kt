package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TAGTech device specifications for Android Compose previews.
 *
 * This extension provides TAGTech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TAGTech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TAGTech: Any
  get() = object {
      /** TAGTech TAGPhone */
      val TAGPHONE = "spec:width=720,height=1600,unit=px,dpi=320"

      /** TAGTech TAG_Phone */
      val TAG_PHONE = "spec:width=720,height=1520,unit=px,dpi=320"

  }
