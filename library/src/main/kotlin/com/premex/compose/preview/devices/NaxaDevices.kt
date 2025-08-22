package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * naxa device specifications for Android Compose previews.
 *
 * This extension provides naxa device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Naxa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Naxa: Any
  get() = object {
      /** naxa NID_1070 */
      val NID_1070 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
