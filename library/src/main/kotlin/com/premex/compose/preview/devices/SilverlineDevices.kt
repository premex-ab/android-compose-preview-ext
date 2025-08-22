package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Silverline device specifications for Android Compose previews.
 *
 * This extension provides Silverline device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Silverline.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Silverline: Any
  get() = object {
      /** Silverline SL1046 */
      val SL1046 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Silverline SL868G */
      val SL868G = "spec:width=800,height=1280,unit=px,dpi=160"

  }
