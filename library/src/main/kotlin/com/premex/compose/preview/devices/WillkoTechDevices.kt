package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WillkoTech device specifications for Android Compose previews.
 *
 * This extension provides WillkoTech device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WillkoTech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WillkoTech: Any
  get() = object {
      /** WillkoTech Kishi-001 */
      val KISHI_001 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
