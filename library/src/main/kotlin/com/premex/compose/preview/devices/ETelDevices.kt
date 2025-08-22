package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * E_tel device specifications for Android Compose previews.
 *
 * This extension provides E_tel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ETel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ETel: Any
  get() = object {
      /** E_tel M4 */
      val M4 = "spec:width=480,height=854,unit=px,dpi=240"

  }
