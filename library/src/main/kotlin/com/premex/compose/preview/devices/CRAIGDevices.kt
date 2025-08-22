package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CRAIG device specifications for Android Compose previews.
 *
 * This extension provides CRAIG device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CRAIG.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CRAIG: Any
  get() = object {
      /** CRAIG CMP846 */
      val CMP846 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
