package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FAREASTONE device specifications for Android Compose previews.
 *
 * This extension provides FAREASTONE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FAREASTONE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FAREASTONE: Any
  get() = object {
      /** FAREASTONE Smart509 */
      val SMART509 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** FAREASTONE Smart550 */
      val SMART550 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
