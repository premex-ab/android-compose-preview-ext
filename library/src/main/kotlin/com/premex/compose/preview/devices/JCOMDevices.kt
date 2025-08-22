package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * J-COM device specifications for Android Compose previews.
 *
 * This extension provides J-COM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.JCOM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.JCOM: Any
  get() = object {
      /** J-COM SC40 */
      val SC40 = "spec:width=480,height=800,unit=px,dpi=220"

  }
