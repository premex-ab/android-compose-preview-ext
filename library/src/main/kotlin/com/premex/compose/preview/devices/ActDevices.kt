package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ACT device specifications for Android Compose previews.
 *
 * This extension provides ACT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Act.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Act: Any
  get() = object {
      /** ACT IPBox */
      val IPBOX = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
