package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * INFONE device specifications for Android Compose previews.
 *
 * This extension provides INFONE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.INFONE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.INFONE: Any
  get() = object {
      /** INFONE INFONE_XE */
      val INFONE_XE = "spec:width=480,height=960,unit=px,dpi=204"

  }
