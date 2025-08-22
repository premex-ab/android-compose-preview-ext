package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MobiVista device specifications for Android Compose previews.
 *
 * This extension provides MobiVista device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MobiVista.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MobiVista: Any
  get() = object {
      /** MobiVista MVT_1001 */
      val MVT_1001 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
